//-----------------------------------------------------------------------
// <copyright file="WebButton.cs" company="Sirius">
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
    public class WebButton : WebControl
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WebButton" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="parentElement">TODO: Add documentation for parentElement.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebButton(Frame parent, string parentElement, string locator)
            : base(parent, parentElement, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebButton" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebButton(Frame parent, string locator)
            : base(parent, locator)
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return.</returns>
        public string Text()
        {
            string text = Client().GetAttribute(ParentElement, Locator, "value");
            if (text.Equals(string.Empty))
            {
                text = this.InnerText();
            }

            return text;
        }
    }
}
