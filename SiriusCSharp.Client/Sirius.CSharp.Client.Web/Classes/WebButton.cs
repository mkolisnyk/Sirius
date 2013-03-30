using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebButton : WebControl
    {
        public WebButton(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        {
            ;
        }

        public WebButton(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public String text()
        {
            String text = client().getAttribute(parentElement, locator, "value");
            if (text.Equals(""))
            {
                text = this.innerText();
            }
            return text;
        }
    }
}
