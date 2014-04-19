/**
 * 
 */
package org.sirius.client.test.steps.system;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.sirius.client.core.CoreClient;
import org.sirius.client.core.system.file.FileOperationsProxy;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Myk Kolisnyk
 *
 */
public class FileSteps {
    
    private FileOperationsProxy fileOps;
    private CoreClient client;
    
    public FileSteps(){
        client = new CoreClient();
        fileOps = client.file();
    }
    
    @Given("^the \"([^\"]*)\" file doesn't exist$")
    public void the_file_doesn_t_exist(String fileName) throws Throwable {
        if(fileOps.fileExists(fileName)){
            fileOps.deleteFile(fileName);
        }
    }

    @When("^I create the \"([^\"]*)\" file$")
    public void I_create_the_file(String fileName) throws Throwable {
        fileOps.createFile(fileName);
    }

    @Then("^I should see the \"([^\"]*)\" file is available$")
    public void I_should_see_the_file_is_available(String fileName) throws Throwable {
        Assert.assertTrue("The file " + fileName + " wasn't found", 
            fileOps.fileExists(fileName));
    }

    @Then("^I should see the \"([^\"]*)\" file is missing$")
    public void I_should_see_the_file_is_missing(String fileName) throws Throwable {
        Assert.assertFalse("The file " + fileName + " is unexpectly available", 
                fileOps.fileExists(fileName));
    }

    @Given("^the \"([^\"]*)\" file already exists$")
    public void the_file_already_exists(String fileName) throws Throwable {
        if(!fileOps.fileExists(fileName)){
            fileOps.createFile(fileName);
        }
    }

    @When("^I fill the \"([^\"]*)\" file with the following lines:$")
    public void I_fill_the_file_with_the_following_lines(String fileName, DataTable table) throws Throwable {
        List<Map<String,String>> rows = table.asMaps();
        fileOps.writeEx(fileName, "");
        for(Map<String,String> row:rows){
            fileOps.appendEx(fileName, row.get("Line"));
        }
    }

    @Then("^(?:I should see |)the \"([^\"]*)\" file content is:$")
    public void I_should_see_the_file_content_is(String path, DataTable table) throws Throwable {
        String[] actual = fileOps.getFileContents(path);
        List<Map<String,String>> rows = table.asMaps();
        int count = 0;
        for(Map<String,String> row:rows){
            Assert.assertEquals("Text line " + count + "is incorrect",
                    row.get("Line"),
                    actual[count]);
            count++;
        }
    }

    @When("^I create the \"([^\"]*)\" file with overwriting$")
    public void I_create_the_file_with_overwriting(String fileName) throws Throwable {
        fileOps.createFileEx(fileName, true);
    }

    @When("^I delete the \"([^\"]*)\" file$")
    public void I_delete_the_file(String fileName) throws Throwable {
        fileOps.deleteFile(fileName);
    }

    @When("^I append the \"([^\"]*)\" file with the \"([^\"]*)\" text$")
    public void I_append_the_file_with_the_text(String fileName, String text) throws Throwable {
        fileOps.appendEx(fileName, text + System.lineSeparator());
    }

    @When("^I write the \"([^\"]*)\" text into \"([^\"]*)\" file$")
    public void I_write_the_text_into_file(String text, String fileName) throws Throwable {
        fileOps.writeEx(fileName, text);
    }

    @When("^I append the \"([^\"]*)\" file with the following lines:$")
    public void I_append_the_file_with_the_following_lines(String path, DataTable table) throws Throwable {
        List<Map<String,String>> rows = table.asMaps();
        for(Map<String,String> row:rows){
            fileOps.appendEx(path, row.get("Line") + System.lineSeparator());
        }
    }

    @Then("^I should see the first (\\d+) lines of the \"([^\"]*)\" file are:$")
    public void I_should_see_the_first_lines_of_the_file_are(int number, String path, DataTable table) throws Throwable {
        String[] actual = fileOps.head(path, number);
        List<Map<String,String>> rows = table.asMaps();
        int count = 0;
        for(Map<String,String> row:rows){
            Assert.assertEquals("Text line " + count + "is incorrect",
                    row.get("Line"),
                    actual[count]);
            count++;
        }
    }

    @Then("^the last (\\d+) lines of the \"([^\"]*)\" file are:$")
    public void the_last_lines_of_the_file_are(int number, String path, DataTable table) throws Throwable {
        String[] actual = fileOps.tail(path, number);
        List<Map<String,String>> rows = table.asMaps();
        int count = 0;
        for(Map<String,String> row:rows){
            Assert.assertEquals("Text line " + count + "is incorrect",
                    row.get("Line"),
                    actual[count]);
            count++;
        }
    }

    @Then("^the lines from (\\d+) of the \"([^\"]*)\" file are:$")
    public void the_lines_from_of_the_file_are(int start, String path, DataTable table) throws Throwable {
        String[] actual = fileOps.getFileContentsEx(path, start-1);
        List<Map<String,String>> rows = table.asMaps();
        int count = 0;
        for(Map<String,String> row:rows){
            Assert.assertEquals("Text line " + count + "is incorrect",
                    row.get("Line"),
                    actual[count]);
            count++;
        }
    }

    @Then("^the lines from (\\d+) to (\\d+) of the \"([^\"]*)\" file are:$")
    public void the_lines_from_to_of_the_file_are(int from, int to, String path, DataTable table) throws Throwable {
        String[] actual = fileOps.getFileContentsEx2(path, from-1, to-from+1);
        List<Map<String,String>> rows = table.asMaps();
        int count = 0;
        for(Map<String,String> row:rows){
            Assert.assertEquals("Text line " + count + "is incorrect",
                    row.get("Line"),
                    actual[count]);
            count++;
        }
    }

    @Then("^I should see the \"([^\"]*)\" file size is ([\\-0-9]+) bytes$")
    public void I_should_see_the_file_size_is_bytes(String fileName, int size) throws Throwable {
        Assert.assertEquals("Unexpected file of the file: " + fileName, size, fileOps.size(fileName));
    }

}
