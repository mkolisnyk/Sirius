//-----------------------------------------------------------------------
// <copyright file="WebPopupList.cs" company="Sirius">
//     Copyright (c) . All rights reserved.
// </copyright>
//-----------------------------------------------------------------------
namespace Sirius.CSharp.Client.Web.Classes
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;

    /// <summary>
    /// TODO: Add documentation.
    /// </summary>
    public class WebPopupList : WebControl
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WebPopupList" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="parentElement">TODO: Add documentation for parent element.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebPopupList(Frame parent, string parentElement, string locator)
            : base(parent, parentElement, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebPopupList" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebPopupList(Frame parent, string locator)
            : base(parent, locator)
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public bool IsMulti()
        {
            return this.Client().IsMultiple(this.ParentElement, this.Locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void DeselectAll()
        {
            this.Client().DeselectAll(this.ParentElement, this.Locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="arg3">TODO: Add documentation for argument.</param>
        public void DeselectByIndex(int arg3)
        {
            this.Client().DeselectByIndex(this.ParentElement, this.Locator, arg3);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="arg3">TODO: Add documentation for argument.</param>
        public void DeselectByValue(string arg3)
        {
            this.Client().DeselectByValue(this.ParentElement, this.Locator, arg3);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="arg3">TODO: Add documentation for argument.</param>
        public void DeselectByVisibleText(string arg3)
        {
            this.Client().DeselectByVisibleText(this.ParentElement, this.Locator, arg3);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string[] GetAllOptions()
        {
            return this.Client().GetAllOptions(this.ParentElement, this.Locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="arg3">TODO: Add documentation for argument.</param>
        public void SelectByIndex(int arg3)
        {
            this.Client().SelectByIndex(this.ParentElement, this.Locator, arg3);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="arg3">TODO: Add documentation for argument.</param>
        public void SelectByValue(string arg3)
        {
            this.Client().SelectByValue(this.ParentElement, this.Locator, arg3);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="arg3">TODO: Add documentation for argument.</param>
        public void SelectByVisibleText(string arg3)
        {
            this.Client().SelectByVisibleText(this.ParentElement, this.Locator, arg3);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string[] GetAllSelectedOptions()
        {
            return this.Client().GetAllSelectedOptions(this.ParentElement, this.Locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string GetFirstSelectedOption()
        {
            return this.Client().GetFirstSelectedOption(this.ParentElement, this.Locator);
        }
    }
}
