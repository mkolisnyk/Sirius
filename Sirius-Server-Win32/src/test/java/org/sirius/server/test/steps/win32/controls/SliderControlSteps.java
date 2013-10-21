/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class SliderControlSteps {

    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" slider$")
    public void setSliderPosition(int position, String fieldName) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" slider is in \"(\\d+)\" position$")
    public void verifySliderPosition(String fieldName, String position) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
