using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Svc.Controls;
using Sirius.Win32.Lib.Controls;
using System.ServiceModel;

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://button.controls.win32lib.server.sirius.org/")]
    public class ButtonSvc : IButtonContract
    {
        private Button btn;

        public ButtonSvc()
        {
            btn = new Button();
        }

        public bool IsChecked(int hwnd) 
        {
            return btn.IsChecked(hwnd);
        }

        public bool IsIntermediate(int hwnd)
        {
            return btn.IsIntermediate(hwnd);
        }

        public bool IsPressed(int hwnd)
        {
            return IsChecked(hwnd);
        }

        public void SetCheck(int hwnd, bool check)
        {
            btn.SetCheck(hwnd,check);
        }

        public void Click(int hwnd)
        {
            btn.Click(hwnd);
        }
    }
}
