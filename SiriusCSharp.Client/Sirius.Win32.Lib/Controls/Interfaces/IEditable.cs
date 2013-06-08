using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.Win32.Lib.Controls.Interfaces
{
    interface IEditable
    {
        String GetText();
        void SetText(String text);
    }
}
