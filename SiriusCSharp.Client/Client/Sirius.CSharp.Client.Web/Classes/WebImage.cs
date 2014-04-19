//-----------------------------------------------------------------------
// <copyright file="WebImage.cs" company="Sirius">
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
    public class WebImage : WebControl
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="WebImage" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent parameter.</param>
        /// <param name="parentElement">TODO: Add documentation for parent element.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebImage(Frame parent, string parentElement, string locator)
            : base(parent, parentElement, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebImage" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebImage(Frame parent, string locator)
            : base(parent, locator)
        {
        }

        /// <summary>
        /// Gets TODO: Add documentation.
        /// </summary>
        public string Src
        {
            get
            {
                return this.GetAttribute("src");
            }
        }

        /// <summary>
        /// Gets TODO: Add documentation.
        /// </summary>
        public string Alt
        {
            get
            {
                return this.GetAttribute("alt");
            }
        }
    }
}
