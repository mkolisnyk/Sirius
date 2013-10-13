using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;
using log4net;
using log4net.Config;

namespace Sirius.Win32.Lib
{
    public class Window
    {
        private static readonly ILog logger = LogManager.GetLogger(typeof(Window));

        public Window() 
        {
            XmlConfigurator.Configure();
        }

        public AutomationElement Root 
        {
            get 
            {
                return AutomationElement.RootElement;
            }
        }

        public AutomationElement Find(int hwnd) 
        {
            logger.Debug(String.Format("Find: Looking for {0} hwnd",hwnd));
            logger.Debug(String.Format("Root item handle: {0}", Root.Current.NativeWindowHandle));
            PropertyCondition condition = new PropertyCondition(AutomationElement.NativeWindowHandleProperty, hwnd);
            logger.Debug(
                String.Format(
                    "Setting condition for property: {0} . Value: {1}",
                    condition.Property.ProgrammaticName,
                    condition.Value
                )
            );
            return Root.FindFirst(TreeScope.Subtree, condition );
                //CustomConditions.ByHandle(hwnd));
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
