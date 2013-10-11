using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Linq;
using System.ServiceProcess;
using System.Text;
using System.Configuration;
using System.ServiceModel.Configuration;
using System.ServiceModel;
using log4net;
using log4net.Config;
using System.Threading;
using System.IO;

namespace Sirius.Win32.WinService
{
    public partial class Win32Service : ServiceBase
    {
        private static readonly ILog logger =
          LogManager.GetLogger(typeof(Win32Service));
    

        private bool stopping = false;
        private List<ServiceHost> hosts;

        public Win32Service()
        {
            InitializeComponent();
            this.ServiceName = "Sirius.Win32.Lib.Service";
            this.CanStop = true;
            this.CanPauseAndContinue = true;
            this.AutoLog = true;
            XmlConfigurator.Configure();
            
        }

        protected override void OnStart(string[] args)
        {
            /*logger.Info("Starting the service");
            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Starting the Service\r\n");

            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Initializing base URL\r\n");
            String baseURL = "http://localhost:31313";

            Configuration appConfig = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);

            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Initializing Builder\r\n");
            UriBuilder builder = new UriBuilder(baseURL);
            builder.Path = "win32lib";
            String baseHost = builder.ToString();

            logger.Info("Reading configuration");
            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Reading Configuration\r\n");
            
            ServiceModelSectionGroup serviceModel = ServiceModelSectionGroup.GetSectionGroup(appConfig);

            ServicesSection services = serviceModel.Services;

            hosts = new List<ServiceHost>();

            logger.Info("Initializing hosts");
            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Initializing hosts\r\n");

            foreach (ServiceElement svc in services.Services)
            {
                //svc.Name
                String svcName = svc.Name;
                String url = baseHost + "/" + Type.GetType(svcName).Name.ToLower();
                Uri[] URIs = {
                             new Uri( url )
                         };

                //System.Console.WriteLine(String.Format("Initializing host for URL: {0}", url));

                Type type = Type.GetType(svc.Name);
                ServiceHost host = new ServiceHost(type, URIs);
                hosts.Add(host);
            }

            logger.Info("Starting hosts");
            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Starting hosts\r\n");

            foreach (ServiceHost host in hosts)
            {
                host.Open();
            }

            ThreadPool.QueueUserWorkItem(new WaitCallback(ServiceWorkerThread)); */
        }

        protected override void OnStop()
        {
            /*logger.Info("Closing hosts");
            File.AppendAllText(@"D:\Work\SiriusDev\Sirius\Publish\Server.Win32\log.txt", "Closing hosts\r\n");

            foreach (ServiceHost host in hosts)
            {
                host.Close();
            }*/
        }
        
        private void ServiceWorkerThread(object state)
        {
            // Periodically check if the service is stopping. 
            while (!this.stopping)
            {
                ; 
            }
        }
    }
}
