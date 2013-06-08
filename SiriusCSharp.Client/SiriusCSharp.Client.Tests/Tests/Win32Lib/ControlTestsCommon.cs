using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics;
using NUnit.Framework;
using Sirius.Win32.Lib;
using Sirius.Win32.Lib.Controls;

namespace SiriusCSharp.Client.Tests.Tests.Win32Lib
{
    public class ControlTestsCommon
    {
        protected Process controlsApp = null;
        protected Window win;
        protected Tab tab;
        protected int mainHwnd;

        [SetUp]
        public void Before()
        {
            controlsApp = Process.Start( @"D:\Work\SiriusDev\Sirius\TestApps\win32\Controls.exe");
            win = new Window();
            mainHwnd = win.Find("", "Common Controls Examples", 0);

            tab = new Tab();

        }

        [TearDown]
        public void After()
        {
            controlsApp.Kill();
        }

    }
}
