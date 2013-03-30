using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Sirius.CSharp.Client.Web.Classes
{
    public class WebPopupList : WebControl
    {
        public WebPopupList(Frame parent, String parentElement, String locator)
            : base(parent, parentElement, locator)
        {
            ;
        }

        public WebPopupList(Frame parent, String locator)
            : base(parent, locator)
        {
            ;
        }

        public bool isMulti()
        {
            return this.client().isMultiple(parentElement, locator);
        }

        public void deselectAll()
        {
            this.client().deselectAll(parentElement, locator);
        }

        public void deselectByIndex(int arg3)
        {
            this.client().deselectByIndex(parentElement, locator, arg3);
        }

        public void deselectByValue(String arg3)
        {
            this.client().deselectByValue(parentElement, locator, arg3);
        }

        public void deselectByVisibleText(String arg3)
        {
            this.client().deselectByVisibleText(parentElement, locator, arg3);
        }

        public String[] getAllOptions()
        {
            return this.client().getAllOptions(parentElement, locator);
        }

        public void selectByIndex(int arg3)
        {
            this.client().selectByIndex(parentElement, locator, arg3);
        }

        public void selectByValue(String arg3)
        {
            this.client().selectByValue(parentElement, locator, arg3);
        }

        public void selectByVisibleText(String arg3)
        {
            this.client().selectByVisibleText(parentElement, locator, arg3);
        }

        public String[] getAllSelectedOptions()
        {
            return this.client().getAllSelectedOptions(parentElement, locator);
        }

        public String getFirstSelectedOption()
        {
            return this.client().getFirstSelectedOption(parentElement, locator);
        }
    }
}
