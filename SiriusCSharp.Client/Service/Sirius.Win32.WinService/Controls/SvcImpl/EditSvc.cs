using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls;
using Sirius.Win32.Svc.Controls;
using System.ServiceModel;
using log4net;

namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://edit.controls.win32lib.server.sirius.org/")]
    public class EditSvc : IEditContract
    {
        private Edit edit;
        private static readonly ILog logger = LogManager.GetLogger(typeof(EditSvc));

        public EditSvc()
        {
            edit = new Edit();
        }

        public String GetText(int hwnd)
        {
            return edit.GetText(hwnd);
        }

        public void SetText(int hwnd, String text) 
        {
            edit.SetText(hwnd, text);
        }

        public void TypeText(int hwnd, String text) 
        {
            edit.TypeText(hwnd, text);
        }

        public void SetCursorPosition(int hwnd, int col, int row) 
        {
            edit.SetCursorPosition(hwnd, col, row);
        }

        public void SetSelection(int hwnd, int scol, int srow, int ecol, int erow) 
        {
            edit.SetSelection(hwnd, scol, srow, ecol, erow);
        }

        public String GetSelectedText(int hwnd) 
        {
            return edit.GetSelectedText(hwnd);
        }
    }
}
