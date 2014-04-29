using System;
using System.Collections.Generic;
using System.Configuration;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sirius.Service.Starter
{
    class Program
    {
        private static List<Process> Processes = new List<Process>();

        static void Main(string[] args)
        {
            Configuration configuration = System.Configuration.ConfigurationManager.OpenExeConfiguration(ConfigurationUserLevel.None);
            CommandSection config = (CommandSection)configuration.GetSection("CommandLines");
            foreach(CommandElement command in config.Commands)
            {
                Process process = new Process();
                process.StartInfo.FileName = command.Executable;
                process.StartInfo.WorkingDirectory = command.WorkingDir;
                process.StartInfo.Arguments = String.Format("-host {0} -port {1}",command.Host,command.Port);
                process.Start();
                Processes.Add(process);
            }

            while (Processes.Count > 0 && (Console.ReadKey(true).KeyChar != 'q'))
            {
                foreach (Process process in Processes)
                {
                    if (process.HasExited)
                    {
                        Processes.Remove(process);
                    }
                }
            }
        }

        static void OnProcessExit(object sender, EventArgs e)
        {
            Console.WriteLine("I'm out of here");
            foreach (Process process in Processes) 
            {
                if (!process.HasExited) 
                {
                    process.Kill();
                }
            }
        }
    }
}
