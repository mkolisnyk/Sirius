using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;
using Sirius.Win32.Lib.Controls;

namespace SiriusCSharp.Client.Tests.Tests.Win32Lib
{
    public class EditControlTest : ControlTestsCommon
    {
        [Test]
        [Category("EditControl")]
        public void EnterTextTest()
        {
            int htab = tab.Find(mainHwnd, 0);
            tab.Select(htab, "Edit Page");

            Edit edt = new Edit();
            int hedit = edt.Find(mainHwnd, 0);

            edt.SetText(hedit, "Hello World!!!");

            Assert.AreEqual("Hello World!!!", edt.GetText(hedit));
        }
    }
}
