using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.Win32.Lib.Controls.Interfaces;
using Sirius.Win32.Lib.Controls;
using Sirius.Win32.Svc.Controls;

namespace Sirius.Win32.SvcImpl.Controls
{
    public class SliderSvc : ISliderContract
    {
        private Slider slider;

        public SliderSvc() 
        {
            slider = new Slider();
        }

        public double GetLowerBound(int hwnd)
        {
            return slider.GetLowerBound(hwnd);
        }

        public double GetUpperBound(int hwnd)
        {
            return slider.GetUpperBound(hwnd);
        }

        public double GetPosition(int hwnd)
        {
            return slider.GetPosition(hwnd);
        }

        public void SetPosition(int hwnd, double pos)
        {
            slider.SetPosition(hwnd, pos);
        }

    }
}
