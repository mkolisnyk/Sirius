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
public class EditControlSteps {
    
    @When("^(?:I )enter the \"([^\"]*)\" text into the \"([^\"]*)\" field$")
    public void setText(String text, String controlName) throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" text in the \"([^\"]*)\" field$")
    public void verifyText(String text, String controlName) throws Throwable {
        throw new PendingException();
    }
}
