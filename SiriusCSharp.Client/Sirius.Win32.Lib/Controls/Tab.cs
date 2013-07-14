using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls
{
    public class Tab : Control,ISelectable
    {
        public Tab()
        {
            this.controlType = ControlType.Tab;
        }

        public int GetItemsCount(int hwnd) 
        {
            int count = 0;
            AutomationElement element = Find(hwnd);
            AutomationElement tabElement = TreeWalker.RawViewWalker.GetFirstChild(element);

            if (tabElement != null) { count++; }

            while (tabElement != null)
            {
                count++;
                tabElement = TreeWalker.RawViewWalker.GetNextSibling(tabElement);
            }

            return count;
        }

        public int GetSelectedIndex(int hwnd) 
        {
            int index = -1;

            AutomationElement element = Find(hwnd);
            AutomationElement tabElement = TreeWalker.RawViewWalker.GetFirstChild(element);

            while (tabElement != null)
            {
                index++;
                SelectionItemPattern changeTab_aeTabPage = tabElement.GetCurrentPattern(SelectionItemPattern.Pattern) as SelectionItemPattern;

                if (changeTab_aeTabPage.Current.IsSelected)
                { 
                    return index;
                }
                tabElement = TreeWalker.RawViewWalker.GetNextSibling(tabElement);
            }
            
            return -1;
        }

        public String GetSelectedItem(int hwnd)
        {
            return GetItemNames(hwnd)[GetSelectedIndex(hwnd)];
        }

        public String[] GetItemNames(int hwnd) 
        {
            List<String> elementNames = new List<String>();

            AutomationElement element = Find(hwnd);
            AutomationElement tabElement = TreeWalker.RawViewWalker.GetFirstChild(element);

            while (tabElement != null)
            {
                elementNames.Add(tabElement.Current.Name);
                tabElement = TreeWalker.RawViewWalker.GetNextSibling(tabElement);
            }

            return elementNames.ToArray();
        }

        public void Select(int hwnd,int index) 
        {
            int count = 0;

            AutomationElement element = Find(hwnd);
            AutomationElement tabElement = TreeWalker.RawViewWalker.GetFirstChild(element);

            while (tabElement != null)
            {
                if (count == index)
                {
                    SelectionItemPattern changeTab_aeTabPage = tabElement.GetCurrentPattern(SelectionItemPattern.Pattern) as SelectionItemPattern;

                    changeTab_aeTabPage.Select();
                    return;
                }
                else 
                {
                    count++;
                }
                tabElement = TreeWalker.RawViewWalker.GetNextSibling(tabElement);
            }
        }

        public void Select(int hwnd,String item) 
        {
            AutomationElement element = Find(hwnd);
            AutomationElement tabElement = TreeWalker.RawViewWalker.GetFirstChild(element);

            while (tabElement != null)
            {
                if (tabElement.Current.Name.Equals(item))
                {
                    SelectionItemPattern changeTab_aeTabPage = tabElement.GetCurrentPattern(SelectionItemPattern.Pattern) as SelectionItemPattern;
                    changeTab_aeTabPage.Select();
                    return;
                }

                tabElement = TreeWalker.RawViewWalker.GetNextSibling(tabElement);
            }
        }
    }
}
