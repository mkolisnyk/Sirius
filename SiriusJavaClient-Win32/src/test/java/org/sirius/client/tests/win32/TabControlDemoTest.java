/**
 * 
 */
package org.sirius.client.tests.win32;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.DialogBox;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.PageList;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class TabControlDemoTest {
    Win32Client client = new Win32Client();

    public class ControlsExamplesDialog extends DialogBox {

        public PageList plstTabs = new PageList(this, new Win32Locator(
                                         "SysTabControl32", 0));
        public Button   btnClose = new Button(this, new Win32Locator("Button",
                                         "Close", 0));

        /**
         * @param client
         * @param locator
         */
        public ControlsExamplesDialog(Win32Client client) {
            super(client, new Win32Locator("(.*)", "Common Controls Examples",
                    0));
        }

        public void start() throws Exception {
            try {
                this.getClient()
                        .core()
                        .window()
                        .start(getHwnd(),
                                "D:/Work/SiriusDev/Sirius/TestApps/win32/Controls.exe",
                                "", "");
            } catch (Exception e) {
                e.printStackTrace();
                throw e;
            }
        }
    }

    ControlsExamplesDialog dControls = new ControlsExamplesDialog(this.client);

    /**
	 * 
	 */
    public TabControlDemoTest() {
        // TODO Auto-generated constructor stub
    }

    @Ignore
    @Test
    public void TabNavigateTest() throws Exception {
        dControls.start();
        Assert.assertTrue(dControls.exists(60000));
        Assert.assertTrue(dControls.plstTabs.exists(60000));
        String names[] = {};
        System.out.println("Tabs count: " + dControls.plstTabs.getTabsCount());
        try {
            names = dControls.plstTabs.getTabNames();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        for (String name : names) {
            System.out.println(name);
        }

        Assert.assertTrue(dControls.btnClose.exists(60000));
        dControls.btnClose.click();
        // Assert.assertTrue(dControls.disappears(60000));
    }
}
