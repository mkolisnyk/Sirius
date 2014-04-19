using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;
using Sirius.Win32.Lib.Controls;

namespace SiriusCSharp.Client.Tests.Tests.Win32Lib
{
    public class ComboBoxControlTest : ControlTestsCommon
    {
        protected int htab = 0;

        [SetUp]
        public void Before()
        {
            base.Before();
            int htab = tab.Find(mainHwnd, 0);
            tab.Select(htab, "Combo Box");
        }

        [Test]
        [Category("ComboBoxControl")]
        public void TextEntryTest()
        {
            ComboBox combo = new ComboBox();
            int hcombo = combo.Find(mainHwnd, "ComboBox", "*", 0);
        }

    }
}
