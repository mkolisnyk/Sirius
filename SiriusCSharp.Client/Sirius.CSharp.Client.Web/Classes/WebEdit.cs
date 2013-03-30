using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebEdit : WebControl
    {
        public WebEdit(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        {
            ;
        }

        public WebEdit(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public void type(String text)
        {
            this.client().sendKeys(parentElement, locator, text);
        }

        public String getText()
        {
            return this.getValue();
        }
    }
}
