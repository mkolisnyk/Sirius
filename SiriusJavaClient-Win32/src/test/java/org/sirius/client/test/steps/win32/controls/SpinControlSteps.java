/**
 * 
 */
package org.sirius.client.test.steps.win32.controls;

import java.util.HashMap;

import cucumber.api.PendingException;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 * 
 */
public class SpinControlSteps {

    @When("^(?:I )increment \"([^\"]*)\" field value$")
    public void incrementSpinValue(String fieldName) throws Throwable {
        throw new PendingException();
    }

    @When("^(?:I |)decrement \"([^\"]*)\" field value$")
    public void decrementSpinValue(String fieldName) throws Throwable {
        throw new PendingException();
    }

}
