using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.Win32.Lib.Controls.Interfaces
{
    public interface IMultiSelect
    {
        void AddSelection(int hwnd, String item);
        void AddSelection(int hwnd, int index);
        void RemoveSelection(int hwnd, String item);
        void RemoveSelection(int hwnd, int index);
        void SelectAll(int hwnd);
        void DeselectAll(int hwnd);
        String[] GetSelectedItems(int hwnd);
    }
}
