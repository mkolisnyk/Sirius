
Narrative:
In order to be able to perform various file system operations
As a library user
I want to make sure the directory operations work properly
	
Scenario: Directory exists
Given the "./Test" folder doesn't exist
And the "./Test1" folder doesn't exist
When I create the "./Test" folder
And delete the "./Test1" folder
Then I should see the "./Test" folder is available
And the "./Test1" folder is missing

Scenario: Create directory
Given the "./Test" folder doesn't exist
When I create the "./Test" folder
Then I should see the "./Test" folder is available
When I create the "./Test/test1/test2" folder
Then I should see the "./Test/test1/test2" folder is available

Scenario: Create directory (overwrite)
Given the "./Test" folder doesn't exist
When I create the "./Test" folder
Then I should see the "./Test" folder is available
When I create the "./Test/test1/test2" folder
And I create the "./Test/test1" folder (with overwrite)
Then I should see the "./Test/test1" folder is available
And the ".,Test/test1/test2" folder is missing
When I create the "./Test/test1/test2" folder
And I create the "./Test/test1" folder (without overwrite)
Then I should see the "./Test/test1" folder is available
And the "./Test/test1/test2" folder is available

Scenario: Copy directory
Given the "./Test" folder doesn't exist
And the "./Test1" folder doesn't exist
When I create the "./Test/copyTest" folder
And create the "./Test1" folder
And I copy the "./Test" folder to the "./Test1" path
Then I should see the "./Test" folder is available
And the "./Test1/copyTest" folder is available

Scenario: Delete directory
Given the "./Test" folder doesn't exist
When I create the "./Test/Test1/Test2" folder
Then I should see the "./Test/Test1/Test2" folder is available
When I delete the "./Test" folder
Then I should see the "./Test" folder is missing

Scenario: Move directory
Given the "./Test" folder doesn't exist
And the "./Test1" folder doesn't exist
When I create the "./Test/copyTest" folder
And create the "./Test1" folder
And I move the "./Test" folder to the "./Test1" path
Then I should see the "./Test" folder is missing
And the "./Test1/copyTest" folder is available