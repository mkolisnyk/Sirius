//-----------------------------------------------------------------------
// <copyright file="Frame.cs" company="Sirius">
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
    /// TODO: Add documentation description.
    /// </summary>
    public class Frame
    {
        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        private WebClient client = null;

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        private string locator = string.Empty;

        /// <summary>
        /// Initializes a new instance of the <see cref="Frame" /> class.
        /// </summary>
        /// <param name="client">TODO: Add documentation description for client parameter.</param>
        /// <param name="locator">TODO: Add documentation description for locator parameter.</param>
        public Frame(WebClient client, string locator)
        {
            this.client = client;
            this.locator = locator;
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation description.
        /// </summary>
        protected WebClient Client
        {
            get
            {
                return this.client;
            }

            set
            {
                this.client = value;
            }
        }

        /// <summary>
        /// Gets or sets TODO: Add documentation description.
        /// </summary>
        protected string Locator
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
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return statement.</returns>
        public WebClient GetClient()
        {
            return this.client;
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return statement.</returns>
        public bool Exists()
        {
            return false;
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return value.</returns>
        public string GetURL()
        {
            return this.client.GetURL();
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return statement.</returns>
        public string GetLocator()
        {
            return this.locator;
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return statement.</returns>
        public point GetLocation()
        {
            return this.client.GetLocation(null, this.locator);
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return statement.</returns>
        public dimension GetSize()
        {
            return this.client.GetSize(null, this.locator);
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <returns>TODO: Add documentation description for return statement.</returns>
        public string InnerHtml()
        {
            return this.client.GetAttribute(null, this.locator, "innerHTML");
        }

        /// <summary>
        /// TODO: Add documentation description.
        /// </summary>
        /// <param name="frame">TODO: Add documentation description for the frame parameter.</param>
        public void SwitchTo(Frame frame)
        {
            this.client.SelectFrameByName(frame.GetLocator());
        }
    }
}
