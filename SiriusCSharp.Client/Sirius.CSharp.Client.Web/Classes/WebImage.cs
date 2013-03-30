using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebImage : WebControl
    {
        public WebImage(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        {
            ;
        }

        public WebImage(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public String src
        {
            get
            {
                return this.getAttribute("src");
            }
        }

        public String alt
        {
            get
            {
                return this.getAttribute("alt");
            }
        }
    }
}
