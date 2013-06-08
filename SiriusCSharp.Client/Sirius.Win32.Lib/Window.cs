using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;

namespace Sirius.Win32.Lib
{
    public class Window
    {
        public AutomationElement Root 
        {
            get 
            {
                return AutomationElement.RootElement;
            }
        }

        public AutomationElement Find(int hwnd) 
        {
            return Root.FindFirst(TreeScope.Subtree, CustomConditions.ByHandle(hwnd));
        } 

        public int Find(String className,String name,int index) 
        {
            AutomationElementCollection elements = Root.FindAll(TreeScope.Children, CustomConditions.ByName(name));
            if (elements.Count <= index) 
            {
                return 0;
            }

            AutomationElement element = elements[index];

            return element.Current.NativeWindowHandle;
        }

        public int Find(int parent, String className, String name, int index) 
        {
            AutomationElement baseElement = Find(parent);
            if (baseElement == null) 
            {
                return 0;
            }

            AutomationElementCollection elements = baseElement.FindAll(TreeScope.Subtree, CustomConditions.ByName(name));
            if (elements.Count <= index)
            {
                return 0;
            }

            AutomationElement element = elements[index];

            return element.Current.NativeWindowHandle;
        }
    }
}
