using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using NUnit.Framework;
using Sirius.Win32.Lib.Controls;

namespace SiriusCSharp.Client.Tests.Tests.Win32Lib
{
    public class ButtonControlTest : ControlTestsCommon
    {
        const String btnButtonButton = "Button Button";
        const String btnCheckBoxButton = "Check Box  Button";
        const String cbCheckBox = "Check Box";
        const String rbUnchecked = "Unchecked";
        const String rbChecked = "Checked";
        const String rbIntermediate = "Indeterminate";
        const String btnButton = "Button";
        const String btnUncheck = "Uncheck";
        const String cbIcon = "Icon";
        const String cbText = "Text";
        const String cbBitmap = "Bitmap";
        const String cbPushLike = "Push Like";
        const String cbMultiline = "Multiline";
        const String cbFlat = "Flat";
        const String cbEnable = "Enable";
        const String cbRadio = "Radio";
        const String cbCheck = "Check";
        const String rbRadioButton1 = "Radio Button 1";
        const String rbRadioButton2 = "Radio Button 2";
        const String rbRadioButton3 = "Radio Button 3";
        const String rbRadioTool1 = "Radio Tool 1";
        const String rbRadioTool2 = "Radio Tool 2";
        const String rbRadioTool3 = "Radio Tool 3";
        const String rbGroupBox = "Group Box";

        protected int htab = 0;

        [SetUp]
        public void Before()
        {
            base.Before();
            int htab = tab.Find(mainHwnd, 0);
            tab.Select(htab, "Buttons");
        }

        [Test]
        [Category("ButtonControl")]
        public void ButtonElementTest()
        {
            Button btn = new Button();
            int hbtn = btn.Find(mainHwnd, "Button", btnButtonButton, 0);
            btn.Click(hbtn);
            Assert.AreEqual(false,btn.IsPressed(hbtn));

            hbtn = btn.Find(mainHwnd, "Button", btnCheckBoxButton, 0);
            btn.Click(hbtn);
            Assert.AreEqual(true, btn.IsPressed(hbtn));

            btn.Click(hbtn);
            Assert.AreEqual(false, btn.IsPressed(hbtn));
        }

        [Test, Sequential]
        [Category("ButtonControl")]
        public void CheckBoxElementTest(
            [Values(rbUnchecked, rbChecked, rbIntermediate)] String input,
            [Values(false,true,null)] bool state)
        {
            Button btn = new Button();
            int hbtn = btn.Find(mainHwnd, "Button", cbCheckBox, 0);
            int hstate = btn.Find(mainHwnd, "Button", input, 0);

            btn.Click(hstate);

            if (state == null) 
            { 
                Assert.IsTrue(btn.IsIntermediate(hbtn));
            }
            else
            {
                Assert.AreEqual(state,btn.IsChecked(hbtn));    
            }
        }

        [Test]
        [Category("ButtonControl")]
        public void ButtonStylesTest()
        {
        }

        [Test]
        [Category("ButtonControl")]
        public void RadioButtonsTest()
        {
        }

        [Test]
        [Category("ButtonControl")]
        public void GroupBoxTest()
        {
        }
    }
}
