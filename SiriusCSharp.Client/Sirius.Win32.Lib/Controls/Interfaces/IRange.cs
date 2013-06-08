using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.Win32.Lib.Controls.Interfaces
{
    interface IRange
    {
        int GetLowerBound();
        int GetUpperBound();
        int GetPosition();
        void SetPosition(int pos);
    }
}
