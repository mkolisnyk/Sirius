using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.Win32.Lib.Controls.Interfaces
{
    public interface ISelectable
    {
        void Select(int hwnd, String item);
        void Select(int hwnd, int index);
        int GetItemsCount(int hwnd);
        String[] GetItemNames(int hwnd);
    }
}
