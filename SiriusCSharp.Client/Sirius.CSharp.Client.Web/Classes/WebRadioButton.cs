using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebRadioButton : WebButton
    {
        public WebRadioButton(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        {
            ;
        }

        public WebRadioButton(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public bool isChecked()
        {
            return this.client().isSelected(parentElement, locator);
        }

        public void check()
        {
            if (!isChecked())
            {
                click();
            }
        }
    }
}
