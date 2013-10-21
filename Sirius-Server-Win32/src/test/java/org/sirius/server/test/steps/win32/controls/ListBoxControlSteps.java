/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;

import org.sirius.server.win32.Win32Locator;
import org.sirius.server.win32.Win32Utils;
import org.sirius.server.win32.classes.controls.ListBox;
import org.sirius.server.win32.classes.controls.TabControl;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class ListBoxControlSteps {

    private HashMap<String,Win32Locator> listBoxMap = new HashMap<String,Win32Locator>();
    
    public ListBoxControlSteps(){
        listBoxMap.put("Basic List Box", new Win32Locator("ListBox","(.*)",2));
    }

    private long getControl(String fieldName) throws Exception{
        Win32Utils utils = new Win32Utils();
        Win32Locator locator;
        Win32Locator pageLocator;
        
        if(!listBoxMap.containsKey(fieldName)){
            locator = new Win32Locator("ListBox",fieldName,0);
        }
        else {
            locator = listBoxMap.get(fieldName);
        }
        long htab = CommonSteps.getMainTabControl();
        TabControl tab = new TabControl();
        
        pageLocator = new Win32Locator("#32770",tab.GetSelectedItem(htab),0);
        
        long hpage = utils.searchWindow(pageLocator);
        
        locator.setParent(hpage);
        long hctrl = utils.searchWindow(locator);
        return hctrl;
    }
    
    @When("^(?:I |)select item (\\d+) from the \"([^\"]*)\" list box$")
    public void selectItemByIndex(int index, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        listBox.selectByIndex((int)hctrl, index);        
    }

    @Then("^(?:I should see |)the item (\\d+) is selected in the \"([^\"]*)\" list box$")
    public void verifySelectedIndex(int index, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        Assert.assertEquals(
                "Unexpected item index was selected",
                index,
                listBox.getSelectedIndex((int)hctrl).intValue());       
    }

    @When("^(?:I |)select the \"([^\"]*)\" in the \"([^\"]*)\" list box$")
    public void selectByName(String text, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        listBox.selectByName((int)hctrl, text);
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" item is selected in the \"([^\"]*)\" list box$")
    public void verifySelectedName(String text, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        String actual = listBox.getSelectedItem((int)hctrl);
        Assert.assertEquals("Unexpected item was selected", text, actual);  
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" item is unselected in the \"([^\"]*)\" list box$")
    public void verifyUnselected(String itemName, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        
        String[] selectedItems = listBox.getSelectedItems((int)hctrl);
        for(String item:selectedItems){
            Assert.assertFalse("The item '" + itemName + "' is unexpectly selected",item.equals(itemName));
        }
    }

    @When("^add item (\\d+) from the \"([^\"]*)\" list box to selection$")
    public void addItemToSelectionByIndex(int index, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        
        listBox.addSelectionByIndex((int)hctrl, index);
    }

    @Then("^the item (\\d+) is selected in the \"([^\"]*)\" list box$")
    public void the_item_is_selected_in_the_list_box(int index, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        /*
        String[] selectedItems = listBox.getSelectedItems((int)hctrl);
        for(String item:selectedItems){
            Assert.assertFalse("The item '" + itemName + "' is unexpectly selected",item.equals(itemName));
        }*/
    }

    @When("^(?:I |)remove item (\\d+) from the \"([^\"]*)\" list box selection$")
    public void removeItemFromSelectionByIndex(int index, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        
        listBox.removeSelectionByIndex((int)hctrl, index);
    }

    @Then("^(?:I should see |)the item (\\d+) is unselected in the \"([^\"]*)\" list box$")
    public void I_should_see_the_item_is_unselected_in_the_list_box(int index, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        // TODO Add implementation
    }

    @When("^add the \"([^\"]*)\" item from the \"([^\"]*)\" list box to selection$")
    public void addItemToSelectionByName(String itemName, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        
        listBox.addSelectionByName((int)hctrl, itemName);
    }

    @Then("^the \"([^\"]*)\" item is selected in the \"([^\"]*)\" list box$")
    public void the_item_is_selected_in_the_list_box(String arg1, String arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^(?:I |)remove \"([^\"]*)\" item from the \"([^\"]*)\" list box selection$")
    public void I_remove_item_from_the_list_box_selection(String itemName, String fieldName) throws Throwable {
        long hctrl = getControl(fieldName);
        ListBox listBox = new ListBox();
        
        listBox.removeSelectionByName((int)hctrl, itemName);
    }
}
