using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;
using Sirius.Win32.Lib.Controls.Interfaces;

namespace Sirius.Win32.Lib.Controls
{
    public class ListBox : Control,ISelectable,IMultiSelect
    {
        public ListBox() : base(ControlType.List) { }

        public void Select(String item) {;}

        public void Select(int index) {;}

        public void AddSelection(String item) {;}

        public void AddSelection(int index) {;}

        public void RemoveSelection(String item) {;}

        public void RemoveSelection(int index) {;}

        public void SelectAll() {;}

        public void DeselectAll() {;}

        public String[] GetAllItems() 
        {
            return null;
        }

        public String[] GetSelectedItems()
        {
            return null;
        }

        public void Select(int hwnd, string item)
        {
            throw new NotImplementedException();
        }

        public void Select(int hwnd, int index)
        {
            throw new NotImplementedException();
        }

        public int GetItemsCount(int hwnd)
        {
            throw new NotImplementedException();
        }

        public string[] GetItemNames(int hwnd)
        {
            throw new NotImplementedException();
        }

        public void AddSelection(int hwnd, string item)
        {
            throw new NotImplementedException();
        }

        public void AddSelection(int hwnd, int index)
        {
            throw new NotImplementedException();
        }

        public void RemoveSelection(int hwnd, string item)
        {
            throw new NotImplementedException();
        }

        public void RemoveSelection(int hwnd, int index)
        {
            throw new NotImplementedException();
        }

        public void SelectAll(int hwnd)
        {
            throw new NotImplementedException();
        }

        public void DeselectAll(int hwnd)
        {
            throw new NotImplementedException();
        }

        public string[] GetSelectedItems(int hwnd)
        {
            throw new NotImplementedException();
        }
    }
}
