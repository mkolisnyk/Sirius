//-----------------------------------------------------------------------
// <copyright file="Page.cs" company="Sirius">
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
    public class Page : Frame
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Page" /> class.
        /// </summary>
        /// <param name="client">TODO: Add documentation for client.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public Page(WebClient client, string locator)
            : base(client, locator)
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Page" /> class.
        /// </summary>
        /// <param name="client">TODO: Add documentation for client.</param>
        public Page(WebClient client)
            : base(client, null)
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return.</returns>
        public string Title()
        {
            return Client.GetTitle();
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Back()
        {
            Client.Back();
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Forward()
        {
            Client.Forward();
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Refresh()
        {
            Client.Refresh();
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="url">TODO: Add documentation for URL.</param>
        public void Open(string url)
        {
            Client.Open(url);
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Home()
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <param name="page">TODO: Add documentation for page.</param>
        public void SwitchTo(Page page)
        {
            Client.SelectWindow(page.GetLocator());
        }
    }
}
