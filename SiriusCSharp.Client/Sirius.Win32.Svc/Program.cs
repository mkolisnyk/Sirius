using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel;
using Sirius.Win32.Svc.Controls;
using System.ServiceModel.Description;
using Sirius.Win32.SvcImpl.Controls;
using System.ServiceModel.Channels;
using System.ServiceModel.Configuration;
using System.Configuration;

namespace Sirius.Win32.Svc
{
    class Program
    {
        static void Main(string[] args)
        {
            UriBuilder builder = new UriBuilder(args[0]);
            builder.Path = "win32lib";
            String baseHost = builder.ToString();

            Configuration appConfig = ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
            ServiceModelSectionGroup serviceModel = ServiceModelSectionGroup.GetSectionGroup(appConfig);

            ServicesSection services = serviceModel.Services;

            List<ServiceHost> hosts = new List<ServiceHost>();

            foreach (ServiceElement svc in services.Services) 
            { 
                //svc.Name
                String svcName = svc.Name;
                String url = baseHost + "/" + Type.GetType(svcName).Name.ToLower();
                Uri[] URIs = {
                             new Uri( url )
                         };

                System.Console.WriteLine( String.Format( "Initializing host for URL: {0}", url ) );

                Type type = Type.GetType(svc.Name);
                ServiceHost host = new ServiceHost(type,URIs);
                hosts.Add(host);
            }

            foreach (ServiceHost host in hosts) 
            {
                host.Open();
            }

            while (Console.ReadKey(true).KeyChar != 'q') { ;}

            foreach (ServiceHost host in hosts)
            {
                host.Close();
            }
        }
    }
}
