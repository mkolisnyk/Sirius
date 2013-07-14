using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls
{
    public class Button : Control
    {
        public Button()
        {
            this.controlType = ControlType.Button;
        }

        public bool IsChecked(int hwnd) 
        {
            AutomationElement element = Find(hwnd);
            TogglePattern toggle = element.GetCurrentPattern(TogglePattern.Pattern) as TogglePattern;

            return toggle.Current.ToggleState.HasFlag(ToggleState.On);
        }

        public bool IsPressed(int hwnd)
        {
            return IsChecked(hwnd);
        }

        public void SetCheck(int hwnd, bool check)
        {
            if (IsChecked(hwnd) != check)
            {
                AutomationElement element = Find(hwnd);
                TogglePattern toggle = element.GetCurrentPattern(TogglePattern.Pattern) as TogglePattern;
                toggle.Toggle();
            }
        }
    }
}
