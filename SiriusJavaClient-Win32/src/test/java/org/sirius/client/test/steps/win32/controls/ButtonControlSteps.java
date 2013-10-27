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
public class ButtonControlSteps {

    @When("(?:I |)click on the \"(.*)\" (?:button|field)")
    public void clickOnTheButton(String buttonName){
        throw new PendingException();
    }
    
    @Then("(?:I should see |)the \"(.*)\" (?:field|button) is (enabled|disabled)")
    public void verifyCheckBoxState(String fieldName,String state){
        throw new PendingException();
    }
}
