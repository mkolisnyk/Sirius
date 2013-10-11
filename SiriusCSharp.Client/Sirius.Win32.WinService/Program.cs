using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceProcess;
using System.Text;
using log4net;
using log4net.Config;
using System.IO;
using System.ServiceModel;
using System.ServiceModel.Configuration;
using System.Configuration;

namespace Sirius.Win32.WinService
{
    static class Program
    {
        private static readonly ILog logger =
  LogManager.GetLogger(typeof(Program));

        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        static void Main()
        {
            XmlConfigurator.Configure();
            logger.Info("Starting service");

            String baseURL = "";
            Configuration appConfig = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
            logger.Info("Getting Base URL");

            try
            {
                baseURL = ConfigurationManager.AppSettings["baseURL"];
            }
            catch (Exception e)
            {
                logger.Fatal("Error while starting service", e);
                throw e;
            }
            logger.Info(String.Format("Base URL is: {0}",baseURL));

            UriBuilder builder = new UriBuilder(baseURL);
            builder.Path = "win32lib";
            String baseHost = builder.ToString();

            ServiceModelSectionGroup serviceModel = ServiceModelSectionGroup.GetSectionGroup(appConfig);

            ServicesSection services = serviceModel.Services;

            List<ServiceHost> hosts = new List<ServiceHost>();
            logger.Info("Initializing hosts");
            try
            {
                foreach (ServiceElement svc in services.Services)
                {
                    logger.Info("Getting configuration information");
                    //svc.Name
                    String svcName = svc.Name;
                    logger.Info(String.Format("Service Name: {0}", svcName));
                    
                    Type type = Type.GetType(svc.Name);

                    logger.Info(String.Format("Type: {0}", type));

                    String url = baseHost + "/" + type.Name.ToLower();
                    Uri[] URIs = {
                             new Uri( url )
                         };

                    //System.Console.WriteLine(String.Format("Initializing host for URL: {0}", url));
                    logger.Info(String.Format("Initializing host for URL: {0}", url) + "");

                    //Type type = Type.GetType(svc.Name);
                    ServiceHost host = new ServiceHost(type, URIs);
                    hosts.Add(host);
                }
            }
            catch (Exception e) 
            {
                logger.Fatal("Error while starting service", e);
                throw e;
            }
            logger.Info("Running Hosts");

            foreach (ServiceHost host in hosts)
            {
                host.Open();
            }
            logger.Info("Starting Windows Service");

            //while (Console.ReadKey(true).KeyChar != 'q') { ;}

            ServiceBase[] ServicesToRun;
            ServicesToRun = new ServiceBase[] 
			{ 
				new Win32Service() 
			};
            ServiceBase.Run(ServicesToRun);

            logger.Info("Stopping Service");
            foreach (ServiceHost host in hosts)
            {
                host.Close();
            }
            logger.Info("Service exit");            
        }
    }
}
