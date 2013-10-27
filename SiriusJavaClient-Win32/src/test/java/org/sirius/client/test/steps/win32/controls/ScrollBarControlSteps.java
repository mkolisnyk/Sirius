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
public class ScrollBarControlSteps {
    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" scroll bar$")
    public void setPositionByIndex(int position, String fieldName) throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" scroll bar is in \"(\\d+)\" position$")
    public void verifyPosition(String fieldName, int position) throws Throwable {
        throw new PendingException();
    }
    
    @When("^(?:I |)add (\\d+) step (forward|backward) for the \"([^\"]*)\" scroll bar$")
    public void addStep(int step, String direction, String fieldName) throws Throwable {
        throw new PendingException();
    }
}
