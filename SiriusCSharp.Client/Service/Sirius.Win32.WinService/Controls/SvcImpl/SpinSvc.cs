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
    [ServiceBehavior(Namespace = "http://spin.controls.win32lib.server.sirius.org/")]
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

        public double GetValue(int hwnd)
        {
            return spin.GetValue(hwnd);
        }

        public void SetValue(int hwnd, double pos)
        {
            spin.SetValue(hwnd, pos);
        }

        public double GetSmallStep(int hwnd)
        {
            return spin.GetSmallStep(hwnd);
        }

        public double GetLargeStep(int hwnd)
        {
            return spin.GetLargeStep(hwnd);
        }
    }
}
