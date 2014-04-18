using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel;
using Sirius.Win32.Svc.Controls;
using Sirius.Win32.Lib.Controls;
using System.Runtime.Serialization;
using log4net;
using log4net.Config;

//[assembly: ContractNamespace("http://system.server.sirius.org/", ClrNamespace = "Sirius.Win32.SvcImpl.Controls")]

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://tab.controls.win32lib.server.sirius.org/",
        IncludeExceptionDetailInFaults=true)]
    public class TabSvc : ITabContract
    {
        private Tab tab;
        private static readonly ILog logger = LogManager.GetLogger(typeof(TabSvc));

        public TabSvc() {
            tab = new Tab();
            XmlConfigurator.Configure();
        }

        public int GetItemsCount(int hwnd) 
        {
            logger.Debug(String.Format("Calling GetItemsCount({0})", hwnd));
            return tab.GetItemsCount(hwnd);
        }
        public int GetSelectedIndex(int hwnd) 
        {
            logger.Debug(String.Format("Calling GetSelectedIndex({0})", hwnd));
            return tab.GetSelectedIndex(hwnd);
        }

        public String GetSelectedItem(int hwnd) 
        {
            logger.Debug(String.Format("Calling GetSelectedItem({0})", hwnd));
            return tab.GetSelectedItem(hwnd);
        }

        public String[] GetItemNames(int hwnd) 
        {
            logger.Debug(String.Format("Calling GetItemNames({0})", hwnd));
            return tab.GetItemNames(hwnd);
        }

        public void SelectByIndex(int hwnd, int index) 
        {
            logger.Debug(String.Format("Calling SelectByIndex({0})", hwnd));
            tab.Select(hwnd, index);
        }

        public void SelectByName(int hwnd, String item) 
        {
            logger.Debug(String.Format("Calling SelectByName({0})", hwnd));
            tab.Select(hwnd, item);
        } 
    }
}
