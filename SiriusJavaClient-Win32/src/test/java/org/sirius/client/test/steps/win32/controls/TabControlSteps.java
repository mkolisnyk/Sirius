/**
 * 
 */
package org.sirius.client.test.steps.win32.controls;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class TabControlSteps {
    public TabControlSteps(){
        ;
    }
    @Then("I should see the following tabs:")
    public void verifyTabs(DataTable tabs) throws InterruptedException, RemoteException{
        throw new PendingException();
    }
    
    @When("I select the \"(.*)\" tab")
    public void selectTabByName(String tabName) throws InterruptedException, RemoteException{
        throw new PendingException();
    }
    
    @Then("I should see the \"(.*)\" is selected")
    public void verifySelectedTab(String tabName) throws InterruptedException, RemoteException{
        throw new PendingException();
    }

    @When("I select the tab with the (\\d+) index")
    public void selectByIndex(int index) throws InterruptedException, RemoteException{
        throw new PendingException();
    }
    
    @Then("I should see the tab with (\\d+) index is selected")
    public void verifySelectionIndex(int index) throws InterruptedException, RemoteException{
        throw new PendingException();
    }
}
