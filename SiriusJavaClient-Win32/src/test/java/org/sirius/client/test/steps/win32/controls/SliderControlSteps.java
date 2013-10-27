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
public class SliderControlSteps {

    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" slider$")
    public void setSliderPosition(int position, String fieldName)
            throws Throwable {
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" slider is in \"(\\d+)\" position$")
    public void verifySliderPosition(String fieldName, double position)
            throws Throwable {
        throw new PendingException();
    }
}
