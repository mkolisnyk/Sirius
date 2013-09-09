using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.ServiceModel;
using Sirius.Win32.Svc.Controls;
using Sirius.Win32.Lib.Controls;

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior]
    public class TabSvc : ITabContract
    {
        private Tab tab;

        public TabSvc() {
            tab = new Tab();
        }

        public int GetItemsCount(int hwnd) 
        { 
            return tab.GetItemsCount(hwnd);
        }
        public int GetSelectedIndex(int hwnd) 
        { 
            return tab.GetSelectedIndex(hwnd);
        }

        public String GetSelectedItem(int hwnd) 
        { 
            return tab.GetSelectedItem(hwnd);
        }

        public String[] GetItemNames(int hwnd) 
        { 
            return tab.GetItemNames(hwnd);
        }

        public void SelectByIndex(int hwnd, int index) 
        { 
            tab.Select(hwnd,index);
        }

        public void SelectByName(int hwnd, String item) 
        {
            tab.Select(hwnd, item);
        } 
    }
}
