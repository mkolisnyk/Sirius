using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls.Interfaces
{
    public interface IEditable
    {
        string GetText(int hwnd);
        /*{
            AutomationElement element = Find(hwnd);
            ValuePattern value = element.GetCurrentPattern(ValuePattern.Pattern) as ValuePattern;

            return value.Current.Value;
        }*/

        void SetText(int hwnd, string text);
        /*{
            AutomationElement element = Find(hwnd);
            ValuePattern value = element.GetCurrentPattern(ValuePattern.Pattern) as ValuePattern;

            value.SetValue(text);
        }*/
    }
}
