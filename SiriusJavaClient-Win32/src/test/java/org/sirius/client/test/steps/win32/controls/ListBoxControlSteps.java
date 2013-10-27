/**
 * 
 */
package org.sirius.client.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class ListBoxControlSteps {

    @When("^(?:I |)select item (\\d+) from the \"([^\"]*)\" list box$")
    public void selectItemByIndex(int index, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the item (\\d+) is selected in the \"([^\"]*)\" list box$")
    public void verifySelectedIndex(int index, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @When("^(?:I |)select the \"([^\"]*)\" in the \"([^\"]*)\" list box$")
    public void selectByName(String text, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" item is selected in the \"([^\"]*)\" list box$")
    public void verifySelectedName(String text, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" item is unselected in the \"([^\"]*)\" list box$")
    public void verifyUnselected(String itemName, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @When("^add item (\\d+) from the \"([^\"]*)\" list box to selection$")
    public void addItemToSelectionByIndex(int index, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^the item (\\d+) is selected in the \"([^\"]*)\" list box$")
    public void the_item_is_selected_in_the_list_box(int index, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @When("^(?:I |)remove item (\\d+) from the \"([^\"]*)\" list box selection$")
    public void removeItemFromSelectionByIndex(int index, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the item (\\d+) is unselected in the \"([^\"]*)\" list box$")
    public void I_should_see_the_item_is_unselected_in_the_list_box(int index, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @When("^add the \"([^\"]*)\" item from the \"([^\"]*)\" list box to selection$")
    public void addItemToSelectionByName(String itemName, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^the \"([^\"]*)\" item is selected in the \"([^\"]*)\" list box$")
    public void the_item_is_selected_in_the_list_box(String arg1, String arg2) throws Throwable {
        throw new PendingException();
    }

    @When("^(?:I |)remove \"([^\"]*)\" item from the \"([^\"]*)\" list box selection$")
    public void I_remove_item_from_the_list_box_selection(String itemName, String fieldName) throws Throwable {
        throw new PendingException();
    }
}
