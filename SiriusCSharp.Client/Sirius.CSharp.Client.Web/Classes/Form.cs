using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class Form : Frame
    {
        public Form(WebClient client, String locator)
            : base(client, locator)
        {
            ;
        }

        public String name()
        {
            return this.client.getAttribute(null, locator, "name");
        }

        public String action()
        {
            return this.client.getAttribute(null, locator, "action");
        }

        public String method()
        {
            return this.client.getAttribute(null, locator, "method");
        }

        public void submit()
        {
            this.client.submit(null, locator);
        }
    }
}
