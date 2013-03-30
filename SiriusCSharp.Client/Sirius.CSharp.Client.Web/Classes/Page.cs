using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class Page : Frame
    {
        public Page(WebClient client, String locator)
            : base(client, locator)
        {
            ;
        }

        public Page(WebClient client)
            : base(client, null)
        {
            ;
        }

        public String title()
        {
            return client.getTitle();
        }

        public void back()
        {
            client.back();
        }

        public void forward()
        {
            client.forward();
        }

        public void refresh()
        {
            client.refresh();
        }

        public void open(String URL)
        {
            client.open(URL);
        }

        public void home()
        {
            ;
        }

        public void switchTo(Page page)
        {
            client.selectWindow(page.getLocator());
        }
    }
}
