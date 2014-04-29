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
using System.Windows.Automation;
using System.Windows.Automation.Peers;
using Sirius.Win32.Lib;
using Sirius.Win32.Lib.Controls;

namespace Sirius.Win32.WinService
{
    static class Program
    {
        /// <summary>
        /// Главная точка входа для приложения.
        /// </summary>
        static void Main(string[] args)
        {
            Runner runner = new Runner();
            RunnerOptions options = runner.ParseArgs(args);
            runner.Initialize(options);
            runner.StartServices();
            runner.RunServices();
            runner.StopServices();
        }
    }
}
