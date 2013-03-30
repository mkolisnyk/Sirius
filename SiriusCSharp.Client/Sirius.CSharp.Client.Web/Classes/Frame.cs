using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.CSharp.Client.Web.Core;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class Frame
    {
        protected WebClient client = null;
        protected String locator = "";

        /**
         * 
         */
        public Frame(WebClient client, String locator)
        {
            this.client = client;
            this.locator = locator;
        }

        public WebClient getClient()
        {
            return client;
        }

        public bool exists()
        {
            return false;
        }

        public String getURL()
        {
            return this.client.getURL();
        }

        public String getLocator()
        {
            return this.locator;
        }

        public point getLocation()
        {
            return this.client.getLocation(null, locator);
        }

        public dimension getSize()
        {
            return this.client.getSize(null, locator);
        }

        public String innerHtml()
        {
            return this.client.getAttribute(null, locator, "innerHTML");
        }

        public void switchTo(Frame frame)
        {
            this.client.selectFrameByName(frame.getLocator());
        }
    }
}
