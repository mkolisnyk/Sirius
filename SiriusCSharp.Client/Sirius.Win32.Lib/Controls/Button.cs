using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;

namespace Sirius.Win32.Lib.Controls
{
    public class Button : Control
    {
        public Button() : base(ControlType.Button) { ;}

        public Boolean IsChecked(int hwnd) 
        {
            return false;
        }

        public Boolean IsPressed(int hwnd)
        {
            return false;
        }

        public void SetCheck(int hwnd, Boolean check)
        {
            ;
        }
    }
}
