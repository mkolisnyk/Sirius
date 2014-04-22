using log4net;
using log4net.Config;
using System;
using System.Collections.Generic;
using System.Configuration;
using System.Linq;
using System.ServiceModel;
using System.ServiceModel.Configuration;
using System.ServiceProcess;
using System.Text;

namespace Sirius.Win32.WinService
{
    public class RunnerOptions 
    { 
        public String Host {get;set;}
        public String Port { get; set; }
        public bool IsService { get; set; }

        /*public RunnerOptions()
        {
            Host = null;
            Port = null;
            IsService = false;
        }*/
    }

    public class Runner
    {
        private static readonly ILog logger =
            LogManager.GetLogger(typeof(Program));

        public const String HOST_OPTION = "-host";
        public const String PORT_OPTION = "-port";
        public const String SVC_OPTION = "-service";
        public const String CONSOLE_OPTION = "-console";

        private List<ServiceHost> Hosts;
        private String BaseURL;
        private bool IsService;

        public RunnerOptions ParseArgs(string[] args)
        {
            RunnerOptions options = new RunnerOptions();
            for (int i = 0; i < args.Length; i++ )
            {
                if(args[i].Equals(HOST_OPTION))
                {
                    i++;
                    options.Host = args[i];
                }
                else if(args[i].Equals(PORT_OPTION))
                {
                    i++;
                    options.Port = args[i];
                }
                else if (args[i].Equals(SVC_OPTION)) 
                {
                    options.IsService = true;
                }
                else if (args[i].Equals(SVC_OPTION))
                {
                    options.IsService = false;
                }
            }
            return options;
        }

        public void Initialize(RunnerOptions options) 
        {
            XmlConfigurator.Configure();
            logger.Info("Starting service");

            logger.Info("Getting Base URL");

            try
            {
                if (options.Host != null && options.Port != null)
                {
                    BaseURL = String.Format("http://{0}:{1}", options.Host, options.Port);
                }
                else
                {
                    BaseURL = ConfigurationManager.AppSettings["baseURL"];
                }
            }
            catch (Exception e)
            {
                logger.Fatal("Error while starting service", e);
                throw e;
            }
            try
            {
                if (options.IsService != null)
                {
                    IsService = options.IsService;
                }
                else
                {
                    IsService = ConfigurationManager.AppSettings["runAsService"].ToLower().Equals("true");
                }
            }
            catch (Exception e)
            {
                logger.Fatal("Error while starting service", e);
                throw e;
            }
            logger.Info(String.Format("Base URL is: {0}", BaseURL));
        }

        public void StartServices() 
        {
            UriBuilder builder = new UriBuilder(BaseURL);
            builder.Path = "win32lib";
            String baseHost = builder.ToString();

            Configuration appConfig = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
            ServiceModelSectionGroup serviceModel = ServiceModelSectionGroup.GetSectionGroup(appConfig);

            ServicesSection services = serviceModel.Services;

            Hosts = new List<ServiceHost>();
            logger.Info("Initializing hosts");
            try
            {
                foreach (ServiceElement svc in services.Services)
                {
                    logger.Info("Getting configuration information");
                    String svcName = svc.Name;
                    logger.Info(String.Format("Service Name: {0}", svcName));

                    Type type = Type.GetType(svc.Name);

                    logger.Info(String.Format("Type: {0}", type));

                    String url = baseHost + "/" + type.Name.ToLower();
                    Uri[] URIs = {
                             new Uri( url )
                         };

                    logger.Info(String.Format("Initializing host for URL: {0}", url) + "");

                    ServiceHost host = new ServiceHost(type, URIs);
                    Hosts.Add(host);
                }
            }
            catch (Exception e)
            {
                logger.Fatal("Error while starting service", e);
                throw e;
            }
        }

        public void RunServices() 
        {
            logger.Info("Running Hosts");

            foreach (ServiceHost host in Hosts)
            {
                host.Open();
            }
            logger.Info("Starting Windows Service");
            if (IsService)
            {
                ServiceBase[] ServicesToRun;
                ServicesToRun = new ServiceBase[] 
			    { 
				    new Win32Service() 
			    };
                ServiceBase.Run(ServicesToRun);
            }
            else
            {
                while (Console.ReadKey(true).KeyChar != 'q') { ;}
            }            
        }

        public void StopServices() 
        {
            logger.Info("Stopping Service");
            foreach (ServiceHost host in Hosts)
            {
                host.Close();
            }
            logger.Info("Service exit");
        }
    }
}
