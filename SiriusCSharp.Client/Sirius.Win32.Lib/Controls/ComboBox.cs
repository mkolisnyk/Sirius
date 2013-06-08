using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls
{
    public class ComboBox : Control, ISelectable, IEditable
    {
        public ComboBox() : base(ControlType.ComboBox) { ;}


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

        public string GetText()
        {
            throw new NotImplementedException();
        }

        public void SetText(string text)
        {
            throw new NotImplementedException();
        }
    }
}
