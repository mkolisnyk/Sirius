using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.CSharp.Client.Web.Core;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebControl
    {
        protected WebClient clientProxy = null;
        protected Frame parent = null;
        protected String parentElement = null;
        protected String locator = null;

        protected WebClient client()
        {
            if (clientProxy == null)
            {
                clientProxy = parent.getClient();
            }
            return clientProxy;
        }

        /**
         * 
         */
        public WebControl(Frame parent, String parentElement, String locator)
        {
            this.parent = parent;
            this.parentElement = parentElement;
            this.locator = locator;
        }

        public WebControl(Frame parent, String locator)
            : this(parent, null, locator)
        {
            ;
        }

        public String innerText()
        {
            return client().getAttribute(parentElement, locator, "innerText");
        }

        public String innerHtml()
        {
            return client().getAttribute(parentElement, locator, "innerHTML");
        }

        public point getLocation()
        {
            return client().getLocation(parentElement, locator);
        }

        public dimension getSize()
        {
            return client().getSize(parentElement, locator);
        }

        public bool isFocused()
        {
            return false;
        }

        public void click()
        {
            client().click(parentElement, locator);
        }

        public String getAttribute(String attribute)
        {
            return client().getAttribute(parentElement, locator, attribute);
        }

        public String getValue()
        {
            return getAttribute("value");
        }
    }
}
