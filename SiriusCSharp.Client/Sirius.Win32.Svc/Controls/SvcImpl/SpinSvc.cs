using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using Sirius.Win32.Lib.Controls;
using Sirius.Win32.Svc.Controls;

namespace Sirius.Win32.SvcImpl.Controls
{
    public class SpinSvc : ISpinContract
    {
        private Spin spin;

        public SpinSvc() 
        {
            spin = new Spin();
        }

        public double GetLowerBound(int hwnd)
        {
            return spin.GetLowerBound(hwnd);
        }

        public double GetUpperBound(int hwnd)
        {
            return spin.GetUpperBound(hwnd);
        }

        public double GetPosition(int hwnd)
        {
            return spin.GetPosition(hwnd);
        }

        public void SetPosition(int hwnd, double pos)
        {
            spin.SetPosition(hwnd, pos);
        }

        public String GetText(int hwnd)
        {
            return spin.GetText(hwnd);
        }

        public void SetText(int hwnd, String text)
        {
            spin.SetText(hwnd, text);
        }
    }
}
