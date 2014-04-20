using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;
using log4net;

namespace Sirius.Win32.Lib.Controls
{
    public class Edit : Control
    {
        private static readonly ILog logger = LogManager.GetLogger(typeof(Edit));

        public Edit()
        {
            this.controlType = ControlType.Edit;
        }

        public String GetText(int hwnd)
        {
            AutomationElement element = Find(hwnd);
            ValuePattern value = element.GetCurrentPattern(ValuePattern.Pattern) as ValuePattern;
            logger.Debug(String.Format("Current text is: {0}", value.Current.Value));
            return value.Current.Value;
        }

        public void SetText(int hwnd, String text) 
        {
            AutomationElement element = Find(hwnd);
            ValuePattern value = element.GetCurrentPattern(ValuePattern.Pattern) as ValuePattern;
            logger.Debug(String.Format("Setting text: {0}", text));
            value.SetValue(text);
        }

        public void TypeText(int hwnd, String text) 
        {
            ;
        }

        public void SetCursorPosition(int hwnd, int col, int row) 
        {
            AutomationElement element = Find(hwnd);
            TextPattern value = element.GetCurrentPattern(TextPattern.Pattern) as TextPattern;

            // TODO: Add implementation
        }

        public void SetSelection(int hwnd, int scol, int srow, int ecol, int erow) 
        {
            ;
        }

        public String GetSelectedText(int hwnd) 
        {
            AutomationElement element = Find(hwnd);
            TextPattern value = element.GetCurrentPattern(TextPattern.Pattern) as TextPattern;
            return "";
        }
    }
}
