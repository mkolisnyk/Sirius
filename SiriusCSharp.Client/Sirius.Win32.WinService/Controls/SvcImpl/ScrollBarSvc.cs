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
    [ServiceBehavior(Namespace = "http://scrollbar.controls.win32lib.server.sirius.org/")]
    public class ScrollBarSvc : IScrollBarContract
    {
        private ScrollBar bar;

        public ScrollBarSvc() 
        {
            bar = new ScrollBar();
        }

        public double GetLowerBound(int hwnd)
        {
            return bar.GetLowerBound(hwnd);
        }

        public double GetUpperBound(int hwnd)
        {
            return bar.GetUpperBound(hwnd);
        }

        public double GetPosition(int hwnd)
        {
            return bar.GetPosition(hwnd);
        }

        public void SetPosition(int hwnd, double pos)
        {
            bar.SetPosition(hwnd, pos);
        }

        public double GetSmallStep(int hwnd)
        {
            return bar.GetSmallStep(hwnd);
        }

        public double GetLargeStep(int hwnd)
        {
            return bar.GetLargeStep(hwnd);
        }
    }
}
