using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;

namespace Sirius.Win32.Lib
{
    public class CustomConditions
    {
        public static Condition ByHandle(int hwnd) 
        {
            return new PropertyCondition(AutomationElement.NativeWindowHandleProperty, hwnd);
        }

        public static Condition ByName(String name)
        {
            return new PropertyCondition(AutomationElement.NameProperty, name);
        }

        public static Condition ByTypeAndName(ControlType type, String name) 
        {
            Condition[] locators = 
            { 
                new PropertyCondition(AutomationElement.NameProperty, name),
                new PropertyCondition(AutomationElement.ControlTypeProperty, type)
            };

            return new AndCondition(locators);
        }
    }
}
