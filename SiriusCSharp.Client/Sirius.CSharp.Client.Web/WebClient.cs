using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using Sirius.CSharp.Client.Web.Core;
using Sirius.CSharp.Client.Web.Select;
using Sirius.CSharp.Client.Web.Core;

namespace Sirius.CSharp.Client.Web
{
    class WebClient
    {
        private WebCoreClient coreProxy = null;
        private WebSelectClient selectProxy = null;

        private String token { get; set; }

        public WebClient(String host, String port) 
        {
            coreProxy = new WebCoreClient("WebcoreProxyPortBinding", String.Format("http://{0}:{1}/web/coreProxy",host,port));
            selectProxy = new WebSelectClient("WebSelectPortBinding", String.Format("http://{0}:{1}/web/select", host, port));
        }

        public WebCoreClient core() 
        { 
            return coreProxy; 
       }

        public WebSelectClient select() 
        {
            return selectProxy;
        }

        public void selectAlert()
        {
            coreProxy.selectAlert(token);
        }
        
        public void selectWindow(string arg1)
        {
            coreProxy.selectWindow(token,arg1);
        }

        public void forward()
        {
            coreProxy.forward(token);
        }

        public string getCssValue(string arg1, string arg2, string arg3)
        {
            return coreProxy.getCssValue(token,arg1, arg2, arg3);
        }

        public bool isDisplayed(string arg1, string arg2)
        {
            return coreProxy.isDisplayed(token,arg1, arg2);
        }

        public void sendKeys(string arg1, string arg2, string arg3)
        {
            coreProxy.sendKeys(token,arg1, arg2, arg3);
        }

        public void selectFrameByName(string arg1)
        {
            coreProxy.selectFrameByName(token,arg1);
        }

        public string getWindowHandle()
        {
            return coreProxy.getWindowHandle(token);
        }

        public void selectFrameByIndex(int arg1)
        {
            coreProxy.selectFrameByIndex(token, arg1);
        }

        public string getPageSource()
        {
            return coreProxy.getPageSource(token);
        }

        public void selectDefaultContent()
        {
            coreProxy.selectDefaultContent(token);
        }

        public void back()
        {
            coreProxy.back(token);
        }

        public Sirius.CSharp.Client.Web.Core.point getLocation(string arg1, string arg2)
        {
            return coreProxy.getLocation(token,arg1, arg2);
        }

        public string getURL()
        {
            return coreProxy.getURL(token);
        }

        public void clear(string arg1, string arg2)
        {
            coreProxy.clear(token, arg1, arg2);
        }

        public string start(string browser)
        {
            token = coreProxy.start(browser);
            return token;
        }

        public void stop()
        {
            coreProxy.stop(token);
            token = null;
        }

        public Sirius.CSharp.Client.Web.Core.dimension getSize(string arg1, string arg2)
        {
            return coreProxy.getSize(token, arg1, arg2);
        }

        public void open(string arg1)
        {
            coreProxy.open(token, arg1);
        }

        public void refresh()
        {
            coreProxy.refresh(token);
        }

        public string getTitle()
        {
            return coreProxy.getTitle(token);
        }

        public bool isEnabled(string arg1, string arg2)
        {
            return coreProxy.isEnabled(token, arg1, arg2);
        }

        public string getText(string arg1, string arg2)
        {
            return coreProxy.getText(token, arg1, arg2);
        }

        public void submit(string arg1, string arg2)
        {
            coreProxy.submit(token, arg1, arg2);
        }

        public void click(string arg1, string arg2)
        {
            coreProxy.click(token, arg1, arg2);
        }

        public bool isSelected(string arg1, string arg2)
        {
            return coreProxy.isSelected(token, arg1, arg2);
        }

        public string getAttribute(string arg1, string arg2, string arg3)
        {
            return coreProxy.getAttribute(token, arg1, arg2, arg3);
        }

        public string getTagName(string arg1, string arg2)
        {
            return coreProxy.getTagName(token, arg1, arg2);
        }

        // SELECT

        public bool isMultiple(string arg1, string arg2)
        {
            return selectProxy.isMultiple(token, arg1, arg2);
        }

        public void deselectAll(string arg1, string arg2)
        {
            selectProxy.deselectAll(token, arg1, arg2);
        }

        public void deselectByVisibleText(string arg1, string arg2, string arg3)
        {
            selectProxy.deselectByVisibleText(token, arg1, arg2, arg3);
        }

        public void deselectByIndex(string arg1, string arg2, int arg3)
        {
            selectProxy.deselectByIndex(token,arg1, arg2, arg3);
        }

        public void deselectByValue(string arg1, string arg2, string arg3)
        {
            selectProxy.deselectByValue(token, arg1, arg2, arg3);
        }

        public string[] getAllOptions(string arg1, string arg2)
        {
            return selectProxy.getAllOptions(token, arg1, arg2);
        }

        public void selectByIndex(string arg1, string arg2, int arg3)
        {
            selectProxy.selectByIndex(token,arg1, arg2, arg3);
        }

        public void selectByValue(string arg1, string arg2, string arg3)
        {
            selectProxy.selectByValue(token, arg1, arg2, arg3);
        }

        public void selectByVisibleText(string arg1, string arg2, string arg3)
        {
            selectProxy.selectByVisibleText(token,arg1,arg2,arg3);
        }

        public string[] getAllSelectedOptions(string arg1, string arg2)
        {
            return selectProxy.getAllSelectedOptions(token,arg1,arg2);
        }

        public string getFirstSelectedOption(string arg1, string arg2)
        {
            return selectProxy.getFirstSelectedOption(token,arg1,arg2);
        }

    }
}
