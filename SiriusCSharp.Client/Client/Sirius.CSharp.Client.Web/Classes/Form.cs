//-----------------------------------------------------------------------
// <copyright file="Form.cs" company="Sirius">
//     Copyright (c) . All rights reserved.
// </copyright>
//-----------------------------------------------------------------------
// TODO: Add description.

namespace Sirius.CSharp.Client.Web.Classes
{
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;

    /// <summary>
    /// TODO: Add documentation.
    /// </summary>
    public class Form : Frame
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Form" /> class.
        /// </summary>
        /// <param name="client">TODO: Add documentation for client.</param>
        /// <param name="locator">TODO: Add documentation for locator.</param>
        public Form(WebClient client, string locator)
            : base(client, locator)
        {
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string Name()
        {
            return this.Client.GetAttribute(null, this.Locator, "name");
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string Action()
        {
            return this.Client.GetAttribute(null, this.Locator, "action");
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        /// <returns>TODO: Add documentation for return value.</returns>
        public string Method()
        {
            return this.Client.GetAttribute(null, this.Locator, "method");
        }

        /// <summary>
        /// TODO: Add documentation.
        /// </summary>
        public void Submit()
        {
            this.Client.Submit(null, this.Locator);
        }
    }
}
