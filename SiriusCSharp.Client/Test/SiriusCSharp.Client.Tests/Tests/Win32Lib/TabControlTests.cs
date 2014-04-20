using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;
using System.Diagnostics;
using Sirius.Win32.Lib;
using Sirius.Win32.Lib.Controls;

namespace SiriusCSharp.Client.Tests.Tests.Win32Lib
{
    public class TabControlTests : ControlTestsCommon
    {
        [Test]
        [Category("TabControl")]
        public void TestTabSwitch()
        {
            int htab = tab.Find(mainHwnd, 0);
            tab.Select(htab, 3);

            Assert.AreEqual(3, tab.GetSelectedIndex(htab));
        }

        [Test]
        [Category("TabControl")]
        public void TestTabNames() 
        {
            int htab = tab.Find(mainHwnd, 0);

            String[] names = tab.GetItemNames(htab);
            int index = 0;
            foreach(String name in names)
            {
                tab.Select(htab,name);
                Assert.AreEqual(index, tab.GetSelectedIndex(htab));
                Assert.AreEqual(name, tab.GetSelectedItem(htab));
                index++;
            }
        }
    }
}
