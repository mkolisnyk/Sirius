/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.controls.Edit;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class EditControlSteps {
    
    private HashMap<String,Win32Locator> editMap = new HashMap<String,Win32Locator>();
    
    public EditControlSteps(){
        editMap.put("Edit Control", new Win32Locator("Edit","(.*)",0));
        editMap.put("Buddy Control", new Win32Locator("Edit","(.*)",0));
        editMap.put("Lower Spin Range", new Win32Locator("Edit","(.*)",1));
        editMap.put("Upper Spin Range", new Win32Locator("Edit","(.*)",2));
    }

    private long getControl(String fieldName) throws Exception{
        Win32Utils utils = new Win32Utils();
        Win32Locator locator;
        Win32Locator pageLocator;
        
        if(!editMap.containsKey(fieldName)){
            locator = new Win32Locator("Edit",fieldName,0);
        }
        else {
            locator = editMap.get(fieldName);
        }
        long htab = CommonSteps.getMainTabControl();
        TabControl tab = new TabControl();
        
        pageLocator = new Win32Locator("#32770",tab.GetSelectedItem(htab),0);
        pageLocator.setParent(CommonSteps.getMainWindow());
        long hpage = utils.searchWindow(pageLocator);
        
        locator.setParent(hpage);
        long hctrl = utils.searchWindow(locator);
        return hctrl;
    }
    
    @When("^(?:I |)enter the \"([^\"]*)\" text into the \"([^\"]*)\" field$")
    public void setText(String text, String controlName) throws Throwable {
        long hedit = getControl(controlName);
        Edit edit = new Edit();
        edit.setText(hedit, text);
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" text in the \"([^\"]*)\" field$")
    public void verifyText(String text, String controlName) throws Throwable {
        long hedit = getControl(controlName);
        Edit edit = new Edit();
        String actualValue = edit.getText(hedit);
        Assert.assertEquals("Text field '" + controlName + "' contains ",text, actualValue);
    }
}
