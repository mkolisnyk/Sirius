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
public class ScrollBarControlSteps {

    @When("^(?:I |)set the \"(\\d+)\" position for the \"([^\"]*)\" scroll bar$")
    public void setPositionByIndex(int position, String fieldName) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" scroll bar is in \"(\\d+)\" position$")
    public void verifyPositionByIndex(String fieldName, int position) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
    
    @When("^(?:I |)add (\\d+) step (forward|backward) for the \"([^\"]*)\" scroll bar$")
    public void addStep(int step, String direction, String fieldName) throws Throwable {
        boolean forward = direction.equals("forward");
        throw new PendingException();
    }
}
