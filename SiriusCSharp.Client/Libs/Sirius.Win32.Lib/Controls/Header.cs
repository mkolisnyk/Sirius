using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Automation;
using log4net;

namespace Sirius.Win32.Lib.Controls
{
    public class Header : Control
    {
        private static readonly ILog logger = LogManager.GetLogger(typeof(Header));

        public Header() 
        {
            this.controlType = ControlType.Header;
        }
    }
}
