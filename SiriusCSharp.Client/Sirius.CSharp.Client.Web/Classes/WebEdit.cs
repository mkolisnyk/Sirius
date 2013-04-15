//-----------------------------------------------------------------------
// <copyright file="WebEdit.cs" company="Sirius">
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
    public class WebEdit : WebControl
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WebEdit" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="parentElement">TODO: Add documentation for parent element.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebEdit(Frame parent, string parentElement, string locator)
            : base(parent, parentElement, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebEdit" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebEdit(Frame parent, string locator)
            : base(parent, locator)
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="text">TODO: Add documentation for text.</param>
        public void Type(string text)
        {
            this.Client().SendKeys(this.ParentElement, this.Locator, text);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string GetText()
        {
            return this.GetValue();
        }
    }
}
