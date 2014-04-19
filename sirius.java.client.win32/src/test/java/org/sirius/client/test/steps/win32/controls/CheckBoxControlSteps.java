/**
 * 
 */
package org.sirius.client.test.steps.win32.controls;

import java.util.HashMap;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

/**
 * @author Myk Kolisnyk
 *
 */
public class CheckBoxControlSteps {

    @When("(?:I |)(check|uncheck) the \"(.*)\" field")
    public void setCheckBoxState(String state,String fieldName){
        throw new PendingException();
    }
    
    @Then("(?:I should see |)the \"(.*)\" (?:field|button) is (checked|unchecked|intermediate|pushed)")
    public void verifyCheckBoxState(String fieldName,String state){
        throw new PendingException();
    }
}
