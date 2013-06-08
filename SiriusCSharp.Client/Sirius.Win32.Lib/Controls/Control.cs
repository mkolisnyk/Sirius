using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls
{
    public class Control : Window
    {
        private ControlType controlType = null;

        public Control(ControlType type) 
        {
            controlType = type;
        }

        public int Find(int parent, int index)
        {
            AutomationElement baseElement = base.Find(parent);
            Condition locator = new PropertyCondition(AutomationElement.ControlTypeProperty, controlType);
            AutomationElementCollection elements = baseElement.FindAll(TreeScope.Subtree, locator);
            if (elements.Count <= index)
            {
                return 0;
            }
            return elements[index].Current.NativeWindowHandle;
        }

        public int Find(int parent, int id, int index)
        {
            AutomationElement baseElement = base.Find(parent);
            Condition[] conditions = 
            {
                new PropertyCondition(AutomationElement.ControlTypeProperty, controlType),
                new PropertyCondition(AutomationElement.RuntimeIdProperty,id)
            };

            Condition locator = new AndCondition(conditions);

            AutomationElementCollection elements = baseElement.FindAll(TreeScope.Subtree, locator);
            if (elements.Count <= index)
            {
                return 0;
            }
            return elements[index].Current.NativeWindowHandle;
        }

    }
}
