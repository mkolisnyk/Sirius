/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.Window;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class TabControlSteps {
    public TabControlSteps(){
        ;
    }
    
    private long getTabHwnd(){
        Window win = new Window();
        Win32Utils utils = new Win32Utils();
        Win32Locator locator = new Win32Locator();
        locator.setCaption("Common Controls Examples");
        
        long hwnd = utils.searchWindow(locator);
        
        Win32Locator tabLocator = new Win32Locator();
        tabLocator.setParent(hwnd);
        tabLocator.setWinClass("SysTabControl32");
        tabLocator.setCaption("");
        
        long htab = utils.searchWindow(tabLocator);
        return htab;
    }
    
    @Then("I should see the following tabs:")
    public void verifyTabs(DataTable tabs){
        //Tab Name
        long htab = getTabHwnd();
        TabControl control = new TabControl();
        
        String[] names = control.GetItemNames(htab);
        List<Map<String,String>> data = tabs.asMaps();
        
        int count = 0;
        for(Map<String,String> row:data){
            Assert.assertEquals(
                    "Unexpected tab name found",
                    row.get("Tab Name"),
                    names[count]);
            count++;
        }
    }
    
    @When("I select the \"(.*)\" tab")
    public void selectTabByName(String tabName){
        long htab = getTabHwnd();
        TabControl control = new TabControl();
        
        control.Select(htab, tabName);
    }
    
    @Then("I should see the \"(.*)\" is selected")
    public void verifySelectedTab(String tabName){
        long htab = getTabHwnd();
        TabControl control = new TabControl();
        
        String name = control.GetSelectedItem(htab);
        Assert.assertEquals("Unexpected tab selected", tabName, name);
    }

    @When("I select the tab with the (\\d+) index")
    public void selectByIndex(int index){
        long htab = getTabHwnd();
        TabControl control = new TabControl();
        
        control.SelectByIndex(htab, index);
    }
    
    @Then("I should see the tab with (\\d+) index is selected")
    public void verifySelectionIndex(int index){
        long htab = getTabHwnd();
        TabControl control = new TabControl();
        
        int selected = control.GetCurSel(htab);
        Assert.assertEquals("Unexpected tab selected", index, selected);
    }
}
