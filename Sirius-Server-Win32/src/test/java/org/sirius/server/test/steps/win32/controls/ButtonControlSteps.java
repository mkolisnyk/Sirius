/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;
import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.Window;
import org.sirius.server.win32.classes.controls.Button;

import com.sun.jna.platform.win32.WinDef.RECT;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class ButtonControlSteps {

    private HashMap<String,Win32Locator> buttonsMap = new HashMap<String,Win32Locator>();
    
    public ButtonControlSteps(){
        buttonsMap.put("Close", new Win32Locator("Button","Close",0));
        buttonsMap.put("Check Box Button", new Win32Locator("Button","Check Box(.*)Button",0));
    }
    
    private long getControl(String fieldName){
        Win32Utils utils = new Win32Utils();
        Win32Locator locator;
        if(!buttonsMap.containsKey(fieldName)){
            locator = new Win32Locator("Button",fieldName,0);
        }
        else {
            locator = buttonsMap.get(fieldName);
        }
        long mainHwnd = CommonSteps.getMainWindow();
        locator.setParent(mainHwnd);
        
        long hctrl = utils.searchWindow(locator);
        return hctrl;
    }
    
    @When("(?:I |)click on the \"(.*)\" (?:button|field)")
    public void clickOnTheButton(String buttonName){
        Window win = new Window();
        
        long hctrl = getControl(buttonName);
        RECT rc = win.getClientRect(hctrl);
        win.click(hctrl, 0, (rc.right+rc.left)/2, (rc.bottom+rc.top)/2, false, false, false);
    }
    
    @Then("(?:I should see |)the \"(.*)\" (?:field|button) is (enabled|disabled)")
    public void verifyCheckBoxState(String fieldName,String state){
        boolean enabled = state.equals("enabled");
        //Window win = new Window();
        
        Button btn = new Button();
        
        long hwndCtl = getControl(fieldName);
        Assert.assertEquals("The '" + fieldName + "' has unexpected enable state",
                enabled, //win.isEnabled(hwndCtl)
                btn.isIntermediate(hwndCtl)
                );
    }
}
