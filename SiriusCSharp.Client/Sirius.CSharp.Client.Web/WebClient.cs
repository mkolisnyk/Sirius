//-----------------------------------------------------------------------
// <copyright file="WebClient.cs" company="Sirius">
//     Copyright (c) . All rights reserved.
// </copyright>
//-----------------------------------------------------------------------
namespace Sirius.CSharp.Client.Web
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using Sirius.CSharp.Client.Web.Core;
    using Sirius.CSharp.Client.Web.Select;

    /// <summary>
    /// TODO: Add documentation text.
    /// </summary>
    public class WebClient
    {
        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        private WebCoreClient coreProxy = null;

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        private WebSelectClient selectProxy = null;

        /// <summary>
        ///  Initializes a new instance of the <see cref="WebClient" /> class.
        /// </summary>
        /// <param name="host">TODO: Add documentation text for host parameter.</param>
        /// <param name="port"> TODO: Add documentation text for port parameter.</param>
        public WebClient(string host, string port) 
        {
            this.coreProxy = new WebCoreClient("Webthis.coreProxyPortBinding", string.Format("http://{0}:{1}/web/this.coreProxy", host, port));
            this.selectProxy = new WebSelectClient("WebSelectPortBinding", string.Format("http://{0}:{1}/web/select", host, port));
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation text.
        /// </summary>
        private string Token { get; set; }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <returns>TODO: Add documentation text for return.</returns>
        public WebCoreClient Core()
        {
            return this.coreProxy;
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <returns>TODO: Add documentation text for return.</returns>
        public WebSelectClient Select() 
        {
            return this.selectProxy;
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        public void SelectAlert()
        {
            this.coreProxy.selectAlert(this.Token);
        }
        
        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1 parameter.</param>
        public void SelectWindow(string arg1)
        {
            this.coreProxy.selectWindow(this.Token, arg1);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        public void Forward()
        {
            this.coreProxy.forward(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="startFrom"> TODO: Add documentation text for startFrom.</param>
        /// <param name="locator"> TODO: Add documentation text for locator.</param>
        /// <param name="css"> TODO: Add documentation text for CSS.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetCssValue(string startFrom, string locator, string css)
        {
            return this.coreProxy.getCssValue(this.Token, startFrom, locator, css);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="startFrom"> TODO: Add documentation text for startFrom.</param>
        /// <param name="locator">TODO: Add documentation text for locator</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public bool IsDisplayed(string startFrom, string locator)
        {
            return this.coreProxy.isDisplayed(this.Token, startFrom, locator);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="startFrom">TODO: Add documentation text for startFrom.</param>
        /// <param name="locator">TODO: Add documentation text for locator.</param>
        /// <param name="keys">TODO: Add documentation text for keys.</param>
        public void SendKeys(string startFrom, string locator, string keys)
        {
            this.coreProxy.sendKeys(this.Token, startFrom, locator, keys);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="name">TODO: Add documentation text for name.</param>
        public void SelectFrameByName(string name)
        {
            this.coreProxy.selectFrameByName(this.Token, name);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetWindowHandle()
        {
            return this.coreProxy.getWindowHandle(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="index">TODO: Add documentation text for index.</param>
        public void SelectFrameByIndex(int index)
        {
            this.coreProxy.selectFrameByIndex(this.Token, index);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetPageSource()
        {
            return this.coreProxy.getPageSource(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        public void SelectDefaultContent()
        {
            this.coreProxy.selectDefaultContent(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        public void Back()
        {
            this.coreProxy.back(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2"> TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public Sirius.CSharp.Client.Web.Core.point GetLocation(string arg1, string arg2)
        {
            return this.coreProxy.getLocation(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetURL()
        {
            return this.coreProxy.getURL(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2"> TODO: Add documentation text for argument 2.</param>
        public void Clear(string arg1, string arg2)
        {
            this.coreProxy.clear(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="browser"> TODO: Add documentation text for browser.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string Start(string browser)
        {
            this.Token = this.coreProxy.start(browser);
            return this.Token;
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        public void Stop()
        {
            this.coreProxy.stop(this.Token);
            this.Token = null;
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2"> TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public Sirius.CSharp.Client.Web.Core.dimension GetSize(string arg1, string arg2)
        {
            return this.coreProxy.getSize(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1.</param>
        public void Open(string arg1)
        {
            this.coreProxy.open(this.Token, arg1);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        public void Refresh()
        {
            this.coreProxy.refresh(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetTitle()
        {
            return this.coreProxy.getTitle(this.Token);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2"> TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public bool IsEnabled(string arg1, string arg2)
        {
            return this.coreProxy.isEnabled(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1"> TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2"> TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetText(string arg1, string arg2)
        {
            return this.coreProxy.getText(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        public void Submit(string arg1, string arg2)
        {
            this.coreProxy.submit(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        public void Click(string arg1, string arg2)
        {
            this.coreProxy.click(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public bool IsSelected(string arg1, string arg2)
        {
            return this.coreProxy.isSelected(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetAttribute(string arg1, string arg2, string arg3)
        {
            return this.coreProxy.getAttribute(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetTagName(string arg1, string arg2)
        {
            return this.coreProxy.getTagName(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public bool IsMultiple(string arg1, string arg2)
        {
            return this.selectProxy.isMultiple(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        public void DeselectAll(string arg1, string arg2)
        {
            this.selectProxy.deselectAll(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        public void DeselectByVisibleText(string arg1, string arg2, string arg3)
        {
            this.selectProxy.deselectByVisibleText(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        public void DeselectByIndex(string arg1, string arg2, int arg3)
        {
            this.selectProxy.deselectByIndex(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        public void DeselectByValue(string arg1, string arg2, string arg3)
        {
            this.selectProxy.deselectByValue(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string[] GetAllOptions(string arg1, string arg2)
        {
            return this.selectProxy.getAllOptions(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        public void SelectByIndex(string arg1, string arg2, int arg3)
        {
            this.selectProxy.selectByIndex(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        public void SelectByValue(string arg1, string arg2, string arg3)
        {
            this.selectProxy.selectByValue(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <param name="arg3">TODO: Add documentation text for argument 3.</param>
        public void SelectByVisibleText(string arg1, string arg2, string arg3)
        {
            this.selectProxy.selectByVisibleText(this.Token, arg1, arg2, arg3);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string[] GetAllSelectedOptions(string arg1, string arg2)
        {
            return this.selectProxy.getAllSelectedOptions(this.Token, arg1, arg2);
        }

        /// <summary>
        ///  TODO: Add documentation text.
        /// </summary>
        /// <param name="arg1">TODO: Add documentation text for argument 1.</param>
        /// <param name="arg2">TODO: Add documentation text for argument 2.</param>
        /// <returns>TODO: Add documentation text for return.</returns>
        public string GetFirstSelectedOption(string arg1, string arg2)
        {
            return this.selectProxy.getFirstSelectedOption(this.Token, arg1, arg2);
        }
    }
}
