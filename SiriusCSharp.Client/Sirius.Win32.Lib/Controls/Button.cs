using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;
using log4net;

namespace Sirius.Win32.Lib.Controls
{
    public class Button : Control
    {
        private static readonly ILog logger = LogManager.GetLogger(typeof(Button));

        public Button()
        {
            this.controlType = ControlType.Button;
        }

        public bool IsChecked(int hwnd) 
        {
            AutomationElement element = Find(hwnd);
            TogglePattern toggle = element.GetCurrentPattern(TogglePattern.Pattern) as TogglePattern;
            logger.Debug("");
            return toggle.Current.ToggleState.HasFlag(ToggleState.On);
        }

        public bool IsIntermediate(int hwnd)
        {
            AutomationElement element = Find(hwnd);
            TogglePattern toggle = element.GetCurrentPattern(TogglePattern.Pattern) as TogglePattern;
            logger.Debug("");
            return toggle.Current.ToggleState.HasFlag(ToggleState.Indeterminate);
        }

        public bool IsPressed(int hwnd)
        {
            logger.Debug("");
            return IsChecked(hwnd);
        }

        public void SetCheck(int hwnd, bool check)
        {
            if (IsChecked(hwnd) != check)
            {
                AutomationElement element = Find(hwnd);
                TogglePattern toggle = element.GetCurrentPattern(TogglePattern.Pattern) as TogglePattern;
                logger.Debug("");
                toggle.Toggle();
            }
        }

        public void Click(int hwnd)
        {
            AutomationElement win = Find(hwnd);
            InvokePattern invoke = win.GetCurrentPattern(InvokePattern.Pattern) as InvokePattern;
            logger.Debug("");
            invoke.Invoke();
        }
    }
}
