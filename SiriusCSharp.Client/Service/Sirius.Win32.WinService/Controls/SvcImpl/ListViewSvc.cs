using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using Sirius.Win32.Lib.Controls;
using Sirius.Win32.Svc.Controls;
using System.ServiceModel;


namespace Sirius.Win32.SvcImpl.Controls
{
    [ServiceBehavior(Namespace = "http://listview.controls.win32lib.server.sirius.org/")]
    class ListViewSvc: IListViewContract
    {
        private ListView list;

        public ListViewSvc() 
        {
            list = new ListView();
        }

        public int GetItemsCount(int hwnd)
        {
            return list.GetItemsCount(hwnd);
        }

        public int GetSelectedIndex(int hwnd)
        {
            return list.GetSelectedIndex(hwnd);
        }

        public String GetSelectedItem(int hwnd)
        {
            return list.GetSelectedItem(hwnd);
        }

        public String[] GetItemNames(int hwnd)
        {
            return list.GetItemNames(hwnd);
        }

        public void SelectByIndex(int hwnd, int index)
        {
            list.Select(hwnd, index);
        }

        public void SelectByName(int hwnd, String item)
        {
            list.Select(hwnd, item);
        }

        public void AddSelectionByName(int hwnd, string item)
        {
            list.AddSelection(hwnd, item);
        }

        public void AddSelectionByIndex(int hwnd, int index)
        {
            list.AddSelection(hwnd, index);
        }

        public void RemoveSelectionByName(int hwnd, string item)
        {
            list.RemoveSelection(hwnd, item);
        }

        public void RemoveSelectionByIndex(int hwnd, int index)
        {
            list.RemoveSelection(hwnd, index);
        }

        public void SelectAll(int hwnd)
        {
            list.SelectAll(hwnd);
        }

        public void DeselectAll(int hwnd)
        {
            list.DeselectAll(hwnd);
        }

        public string[] GetSelectedItems(int hwnd)
        {
            return list.GetSelectedItems(hwnd);
        }
    }
}
