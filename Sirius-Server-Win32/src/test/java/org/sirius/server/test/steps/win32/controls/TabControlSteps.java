/**
 * 
 */
package org.sirius.server.test.steps.win32.controls;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
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
    
    @When("I start GUI tests application")
    public void test1(){;}
    
    @Then("I should see the following tabs:")
    public void test2(DataTable tabs){;}
    
    @Given("the test GUI application is started")
    public void test3(){;}
    
    @When("I select the \"(.*)\" tab")
    public void test4(String tabName){;}
    
    @Then("I should see the \"(.*)\" is selected")
    public void test5(String tabName){;}

    @When("I select the tab with the (\\d+) index")
    public void test6(int index){;}
    
    @Then("I should see the tab with (\\d+) index is selected")
    public void test7(int index){;}
}
