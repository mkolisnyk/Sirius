using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.Win32.Lib.Controls.Interfaces
{
    public interface IRange
    {
        double GetLowerBound(int hwnd);
        double GetUpperBound(int hwnd);
        double GetPosition(int hwnd);
        void SetPosition(int hwnd, double pos);
    }
}
