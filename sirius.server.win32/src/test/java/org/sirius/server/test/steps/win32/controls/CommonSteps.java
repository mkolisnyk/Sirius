/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import org.junit.Assert;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.Window;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class CommonSteps {

    public static long getMainWindow(){
        Win32Utils utils = new Win32Utils();
        Win32Locator locator = new Win32Locator();
        locator.setCaption("Common Controls Examples");
        
        long hwnd = utils.searchWindow(locator);
        return hwnd;
    }
    
    public static long getMainTabControl() throws Exception {
        Win32Utils utils = new Win32Utils();
        Win32Locator locator = new Win32Locator();
        locator.setCaption("Common Controls Examples");
        
        long hwnd = utils.searchWindow(locator);
        
        Win32Locator tabLocator = new Win32Locator();
        tabLocator.setParent(hwnd);
        tabLocator.setWinClass("SysTabControl32");
        tabLocator.setCaption("");
        
        long htab = utils.searchWindow(tabLocator);
        TabControl control = new TabControl();
        
        int timeout = 30;
        do {
            Thread.sleep(1000);
            if(timeout--==0){
                break;
            }
        }
        while(control.GetItemCount(hwnd) <= 0);
        
        return htab;
    }
    
    @Given("the test GUI application is started")
    @When("I start GUI tests application")
    public void startGuiTestApp() throws InterruptedException{
        Window win = new Window();
                
        long hwnd = getMainWindow();
        int timeout = 30;
        if(hwnd==0){
            win.start(0, 
                    "D:\\Work\\SiriusDev\\Sirius\\TestApps\\win32\\Controls.exe", 
                    "", 
                    "D:\\Work\\SiriusDev\\Sirius\\TestApps\\win32\\");
            do {
                hwnd = getMainWindow();
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
    
    @Then("^(?:I should see |)GUI application window is closed$")
    public void vefiryAppIsClosed() throws InterruptedException{
        long hwnd = getMainWindow();
        int timeout = 30;
        do {
            hwnd = getMainWindow();
            if(timeout--==0){
                break;
            }
            else {
                Thread.sleep(1000);
            }
        }
        while(hwnd != 0);
        Assert.assertEquals("Main window wasn't closed",0, hwnd);
    }
}
