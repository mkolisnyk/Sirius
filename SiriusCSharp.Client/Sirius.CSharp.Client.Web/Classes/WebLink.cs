using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebLink : WebControl
    {
        public WebLink(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        {
            ;
        }

        public WebLink(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public String href
        {
            get
            {
                return client().getAttribute(parentElement, locator, "href");
            }
        }
    }
}
