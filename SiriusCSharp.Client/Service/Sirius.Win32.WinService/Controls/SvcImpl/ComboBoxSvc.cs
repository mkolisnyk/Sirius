using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using Sirius.Win32.Lib.Controls;
using Sirius.Win32.Svc.Controls;
using System.ServiceModel;
using log4net;

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://combobox.controls.win32lib.server.sirius.org/")]
    public class ComboBoxSvc : IComboBoxContract
    {
        private ComboBox combo;
        private static readonly ILog logger = LogManager.GetLogger(typeof(ComboBoxSvc));

        public ComboBoxSvc()
        {
            combo = new ComboBox();
        }

        public int GetItemsCount(int hwnd)
        {
            return combo.GetItemsCount(hwnd);
        }

        public int GetSelectedIndex(int hwnd)
        {
            return combo.GetSelectedIndex(hwnd);
        }

        public String GetSelectedItem(int hwnd)
        {
            return GetItemNames(hwnd)[GetSelectedIndex(hwnd)];
        }

        public String[] GetItemNames(int hwnd)
        {
            return combo.GetItemNames(hwnd);
        }

        public void SelectByIndex(int hwnd, int index)
        {
            combo.Select(hwnd, index);
        }

        public void SelectByName(int hwnd, String item)
        {
            combo.Select(hwnd, item);
        }


        public String GetText(int hwnd)
        {
            return combo.GetText(hwnd);
        }

        public void SetText(int hwnd, String text)
        {
            combo.SetText(hwnd, text);
        }
    }
}
