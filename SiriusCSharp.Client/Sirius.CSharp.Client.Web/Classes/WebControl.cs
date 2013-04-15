//-----------------------------------------------------------------------
// <copyright file="WebControl.cs" company="Sirius">
//     Copyright (c) . All rights reserved.
// </copyright>
//-----------------------------------------------------------------------
namespace Sirius.CSharp.Client.Web.Classes
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using Sirius.CSharp.Client.Web.Core;

    /// <summary>
    /// TODO: Add documentation.
    /// </summary>
    public class WebControl
    {
        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        private WebClient clientProxy = null;

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        private Frame parent = null;

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        private string parentElement = null;

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        private string locator = null;

        /// <summary>
        /// Initializes a new instance of the <see cref="WebControl" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="parentElement">TODO: Add documentation for parent element.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebControl(Frame parent, string parentElement, string locator)
        {
            this.parent = parent;
            this.parentElement = parentElement;
            this.locator = locator;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="WebControl" /> class.
        /// </summary>
        /// <param name="parent">TODO: Add documentation for parent.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public WebControl(Frame parent, string locator)
            : this(parent, null, locator)
        {
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation.
        /// </summary>
        public WebClient ClientProxy
        {
            get
            {
                return this.clientProxy;
            }

            set
            {
                this.clientProxy = value;
            }
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation.
        /// </summary>
        public Frame Parent
        {
            get
            {
                return this.parent;
            }

            set
            {
                this.parent = value;
            }
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation.
        /// </summary>
        public string ParentElement
        {
            get
            {
                return this.parentElement;
            }

            set
            {
                this.parentElement = value;
            }
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation.
        /// </summary>
        public string Locator
        {
            get
            {
                return this.locator;
            }

            set
            {
                this.locator = value;
            }
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string InnerText()
        {
            return this.Client().GetAttribute(this.parentElement, this.locator, "innerText");
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string InnerHtml()
        {
            return this.Client().GetAttribute(this.parentElement, this.locator, "innerHTML");
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public point GetLocation()
        {
            return this.Client().GetLocation(this.parentElement, this.locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public dimension GetSize()
        {
            return this.Client().GetSize(this.parentElement, this.locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public bool IsFocused()
        {
            return false;
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Click()
        {
            this.Client().Click(this.parentElement, this.locator);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="attribute">TODO: Add documentation for attribute.</param>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string GetAttribute(string attribute)
        {
            return this.Client().GetAttribute(this.parentElement, this.locator, attribute);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string GetValue()
        {
            return this.GetAttribute("value");
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        protected WebClient Client()
        {
            if (this.clientProxy == null)
            {
                this.clientProxy = this.parent.GetClient();
            }

            return this.clientProxy;
        }
    }
}
