/**
 * 
 */
package org.sirius.client.test.steps.win32.controls;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class CommonSteps {

    @Given("the test GUI application is started")
    @When("I start GUI tests application")
    public void startGuiTestApp() throws InterruptedException{
        throw new PendingException();
    }
    
    @Then("^(?:I should see |)GUI application window is closed$")
    public void vefiryAppIsClosed() throws InterruptedException{
        throw new PendingException();
    }
}
