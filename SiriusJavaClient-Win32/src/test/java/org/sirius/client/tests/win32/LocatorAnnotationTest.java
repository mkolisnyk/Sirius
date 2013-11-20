/**
 * 
 */
package org.sirius.client.tests.win32;

import org.junit.Assert;

import org.junit.Test;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.annotations.Locator;
import org.sirius.client.win32.classes.DialogBox;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.Edit;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 *
 */
public class LocatorAnnotationTest {

    public class Test1LevelWindow extends MainWindow {

        @Locator(winClass="Edit",caption="Sample text",index=0)
        public Edit edtText;
        
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
    
    public class Test2LevelsWindow extends MainWindow {

        public class TestSubWindow extends DialogBox {
            @Locator(winClass="Edit",caption="Child Text",index=0)
            public Edit edtText;
            
            @Locator(winClass="Button",caption="Child Button",index=2)
            public Button btnTestButton;

            /**
             * @param client
             * @param locator
             */
            public TestSubWindow(Window parent, Win32Locator locator) {
                super(parent, locator);
            }
        }
        
        @Locator(winClass="#32770",caption="Child Dialog",index=0)
        public TestSubWindow dSubWindow;
        
        /**
         * @param client
         * @param locator
         */
        public Test2LevelsWindow(Win32Client client) {
            super(client, new Win32Locator("Test",0));
        }        
    }
    
    public class TestInterimLevelWindow extends MainWindow {

        public class SubClass {
            public class TestSubWindow extends DialogBox {
                @Locator(winClass="Edit",caption="Child Text",index=0)
                public Edit edtText;
                
                @Locator(winClass="Button",caption="Child Button",index=2)
                public Button btnTestButton;
    
                /**
                 * @param client
                 * @param locator
                 */
                public TestSubWindow(Window parent, Win32Locator locator) {
                    super(parent, locator);
                }
            }
        }
        
        @Locator(winClass="#32770",caption="Child Dialog",index=0)
        public SubClass.TestSubWindow dSubWindow;
        
        /**
         * @param client
         * @param locator
         */
        public TestInterimLevelWindow(Win32Client client) {
            super(client, new Win32Locator("Test",0));
        }        
    }
    
    @Test
    public void checkImmediateElements(){
        Win32Client client = new Win32Client();
        Test1LevelWindow win = new Test1LevelWindow(client);
        Assert.assertNotNull("Text field is unexpectly null", win.edtText);
        Win32Locator locator = win.edtText.getLocator();
        Assert.assertEquals("Edit", locator.getWinClass());
        Assert.assertEquals("Sample text", locator.getCaption());
        Assert.assertEquals(0, locator.getIndex());
        
        Assert.assertEquals(win,win.edtText.getParent());
        Assert.assertEquals(win.getClient(),win.edtText.getClient());
        
        Assert.assertNotNull("Button field is unexpectly null", win.btnTestButton);
    }
    
    @Test
    public void checkMultiLevelWindow(){
        Win32Client client = new Win32Client();
        Test2LevelsWindow win = new Test2LevelsWindow(client);
        Assert.assertNotNull("Dialog is empty", win.dSubWindow);        
        Assert.assertNotNull("Dialog text field is empty", win.dSubWindow.edtText);        
        Assert.assertNotNull("Dialog button field is empty", win.dSubWindow.btnTestButton);
        
        Win32Locator locator = win.dSubWindow.edtText.getLocator();
        Assert.assertEquals("Edit", locator.getWinClass());
        Assert.assertEquals("Child Text", locator.getCaption());
        Assert.assertEquals(0, locator.getIndex());
        
        Assert.assertEquals(win,win.dSubWindow.getParent());
        Assert.assertEquals(win.dSubWindow,win.dSubWindow.edtText.getParent());
        Assert.assertEquals(win.getClient(),win.dSubWindow.getClient());
        Assert.assertEquals(win.getClient(),win.dSubWindow.edtText.getClient());
    }
    
    /*@Test
    public void checkInterimLevelWindow(){
        Win32Client client = new Win32Client();
        TestInterimLevelWindow win = new TestInterimLevelWindow(client);
        Assert.assertNotNull("Dialog is empty", win.dSubWindow);        
        Assert.assertNotNull("Dialog text field is empty", win.dSubWindow.edtText);        
        Assert.assertNotNull("Dialog button field is empty", win.dSubWindow.btnTestButton);
        
        Win32Locator locator = win.dSubWindow.edtText.getLocator();
        Assert.assertEquals("Edit", locator.getWinClass());
        Assert.assertEquals("Child Text", locator.getCaption());
        Assert.assertEquals(0, locator.getIndex());
        
        Assert.assertEquals(win,win.dSubWindow.getParent());
        Assert.assertEquals(win.dSubWindow,win.dSubWindow.edtText.getParent());
        Assert.assertEquals(win.getClient(),win.dSubWindow.getClient());
        Assert.assertEquals(win.getClient(),win.dSubWindow.edtText.getClient());
    }*/
}
