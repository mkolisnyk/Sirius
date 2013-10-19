/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.controls.Button;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

/**
 * @author Myk Kolisnyk
 *
 */
public class CheckBoxControlSteps {

    private HashMap<String,Win32Locator> buttonsMap = new HashMap<String,Win32Locator>();
    
    public CheckBoxControlSteps(){
        buttonsMap.put("Check Box Button", new Win32Locator("Button","Check Box Button",0));
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
    
    @When("(?:I |)(check|uncheck) the \"(.*)\" field")
    public void setCheckBoxState(String state,String fieldName){
        boolean checked = state.equals("check");
        Button btn = new Button();
        
        long hwndCtl = getControl(fieldName);
        btn.setCheck(hwndCtl, (checked)?(Button.BST_CHECKED):(Button.BST_UNCHECKED));
    }
    
    @Then("(?:I should see |)the \"(.*)\" (?:field|button) is (checked|unchecked|intermediate|pushed)")
    public void verifyCheckBoxState(String fieldName,String state){
        int btnState = 0;
        Button btn = new Button();
        long hwndCtl = getControl(fieldName);
        int currState = btn.getState(hwndCtl);
        
        if(state.equals("checked")){
            btnState = Button.BST_CHECKED;            
        }
        else if(state.equals("unchecked")){
            btnState = Button.BST_UNCHECKED;
        }
        else if(state.equals("intermediate")){
            btnState = Button.BST_INDETERMINATE;
        }
        else if(state.equals("pushed")){
            btnState = Button.BST_PUSHED;
        }
        
        Assert.assertEquals("The '" + fieldName + "' has unexpected check state",
                btnState, btnState &  currState );
    }
}
