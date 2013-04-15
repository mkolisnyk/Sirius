//-----------------------------------------------------------------------
// <copyright file="WebLink.cs" company="Sirius">
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
    public class WebLink : WebControl
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WebLink" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="parentElement">TODO: Add documentation for parent element.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebLink(Frame parent, string parentElement, string locator)
            : base(parent, parentElement, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebLink" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebLink(Frame parent, string locator)
            : base(parent, locator)
        {
        }

        /// <summary>
        /// Gets TODO: Add documentation.
        /// </summary>
        public string Href
        {
            get
            {
                return Client().GetAttribute(this.ParentElement, this.Locator, "href");
            }
        }
    }
}
