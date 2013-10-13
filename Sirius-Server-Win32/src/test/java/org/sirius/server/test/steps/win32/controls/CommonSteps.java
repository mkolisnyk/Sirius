/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.Window;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class CommonSteps {

    @Given("the test GUI application is started")
    @When("I start GUI tests application")
    public void startGuiTestApp() throws InterruptedException{
        Window win = new Window();
        Win32Utils utils = new Win32Utils();
        Win32Locator locator = new Win32Locator();
        locator.setCaption("Common Controls Examples");
        
        long hwnd = utils.searchWindow(locator);
        int timeout = 30;
        if(hwnd==0){
            win.start(0, 
                    "D:\\Work\\SiriusDev\\Sirius\\TestApps\\win32\\Controls.exe", 
                    "", 
                    "D:\\Work\\SiriusDev\\Sirius\\TestApps\\win32\\");
            do {
                hwnd = utils.searchWindow(locator);
                if(timeout--==0){
                    break;
                }
                else {
                    Thread.sleep(1000);
                }
            }
            while(hwnd == 0);
        }
        win.activate(hwnd);
    }
}
