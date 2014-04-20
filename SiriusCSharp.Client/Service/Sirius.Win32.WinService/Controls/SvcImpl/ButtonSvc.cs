using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Svc.Controls;
using Sirius.Win32.Lib.Controls;
using System.ServiceModel;
using log4net;

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://button.controls.win32lib.server.sirius.org/")]
    public class ButtonSvc : IButtonContract
    {
        private Button btn;
        private static readonly ILog logger = LogManager.GetLogger(typeof(ButtonSvc));

        public ButtonSvc()
        {
            logger.Debug("Initializing button service");
            btn = new Button();
        }

        public bool IsChecked(int hwnd) 
        {
            logger.Debug(String.Format("Calling IsChecked({0})",hwnd));
            return btn.IsChecked(hwnd);
        }

        public bool IsIntermediate(int hwnd)
        {
            logger.Debug(String.Format("Calling IsIntermediate({0})", hwnd));
            return btn.IsIntermediate(hwnd);
        }

        public bool IsPressed(int hwnd)
        {
            logger.Debug(String.Format("Calling IsPressed({0})", hwnd));
            return IsChecked(hwnd);
        }

        public void SetCheck(int hwnd, bool check)
        {
            logger.Debug(String.Format("Calling SetCheck({0}, {1})", hwnd, check));
            btn.SetCheck(hwnd, check);
        }

        public void Click(int hwnd)
        {
            logger.Debug(String.Format("Calling Click({0})", hwnd));
            btn.Click(hwnd);
        }
    }
}
