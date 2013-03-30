using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebCheckBox : WebRadioButton
    {
        public WebCheckBox(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        { 
            ;
        }

        public WebCheckBox(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public void uncheck()
        {
            if (isChecked())
            {
                click();
            }
        }
    }
}
