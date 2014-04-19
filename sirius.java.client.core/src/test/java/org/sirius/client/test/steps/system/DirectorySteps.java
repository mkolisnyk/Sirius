/**
 * 
 */
package org.sirius.client.test.steps.system;

import org.junit.Assert;
import org.sirius.client.core.CoreClient;
import org.sirius.client.core.system.dir.DirectoryOperationsProxy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class DirectorySteps {
    
    private DirectoryOperationsProxy dirOps;
    private CoreClient client;
    
    public DirectorySteps(){
        client = new CoreClient();
        dirOps = client.dir();
    }
    
    @Given("^the \"([^\"]*)\" folder doesn't exist$")
    public void the_folder_doesn_t_exist(String path) throws Throwable {
        if(dirOps.exists(path)){
            dirOps.delete(path);
        }
    }
    
    @When("^(?:I |)create the \"([^\"]*)\" folder$")
    public void I_create_the_folder(String path) throws Throwable {
        dirOps.create(path);
    }

    @When("^(?:I |)delete the \"([^\"]*)\" folder$")
    public void delete_the_folder(String path) throws Throwable {
        dirOps.delete(path);
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" folder is available$")
    public void I_should_see_the_folder_is_available(String path) throws Throwable {
        Assert.assertTrue("Folder " + path + " wasn't found",dirOps.exists(path));
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" folder is missing$")
    public void the_folder_is_missing(String path) throws Throwable {
        Assert.assertFalse("Folder " + path + " was unexpectly found",dirOps.exists(path));
    }

    @When("^I create the \"([^\"]*)\" folder \\(with overwrite\\)$")
    public void I_create_the_folder_with_overwrite(String path) throws Throwable {
        dirOps.createEx(path,true);
    }

    @When("^I create the \"([^\"]*)\" folder \\(without overwrite\\)$")
    public void I_create_the_folder_without_overwrite(String path) throws Throwable {
        dirOps.createEx(path,false);
    }

    @When("^I copy the \"([^\"]*)\" folder to the \"([^\"]*)\" path$")
    public void I_copy_the_folder_to_the_path(String source, String destination) throws Throwable {
        dirOps.copy(source, destination);
    }

    @When("^I move the \"([^\"]*)\" folder to the \"([^\"]*)\" path$")
    public void I_move_the_folder_to_the_path(String source, String destination) throws Throwable {
        dirOps.moveDirectory(source, destination);
    }

}
