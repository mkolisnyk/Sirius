/**
 * 
 */
package org.sirius.client.tests.win32;

import org.junit.Assert;

import org.junit.Test;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.annotations.Alias;
import org.sirius.client.win32.annotations.Locator;
import org.sirius.client.win32.classes.Aliases;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.Edit;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class AliasAnnotationTest {

    public class Test1LevelWindow extends MainWindow {

        @Alias(name="Sample Text")
        @Locator(winClass="Edit",caption="Sample text",index=0)
        public Edit edtText;
        
        @Alias(name="Sample Button")
        @Locator(winClass="Button",caption="Test Button",index=2)
        public Button btnTestButton;
        
        /**
         * @param client
         * @param locator
         */
        public Test1LevelWindow(Win32Client client) {
            super(client, new Win32Locator("Test",0));
        }
        
    }

    @Test
    public void checkSingleLevelWindow(){
        Win32Client client = new Win32Client();
        Test1LevelWindow win = new Test1LevelWindow(client);
        
        Assert.assertNotNull(Aliases.get("Sample Text"));
        Assert.assertEquals(win.edtText, Aliases.get("Sample Text"));
        Assert.assertNotNull(Aliases.get("Sample Button"));
        Assert.assertEquals(win.btnTestButton, Aliases.get("Sample Button"));
    }
}
