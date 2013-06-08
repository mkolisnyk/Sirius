using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls
{
    class ListView: Control,ISelectable,IMultiSelect
    {
        public ListView() : base(ControlType.List) { }

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
