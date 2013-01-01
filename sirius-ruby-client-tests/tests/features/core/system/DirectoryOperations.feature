Feature: Directory Operations
	
	Scenario: Directory exists
		Given the "./Test" folder doesn't exist
		And the "./Test1" folder doesn't exist
		When I create the "./Test" folder
		And delete the "./Test1" folder
		Then I should see the "./Test" folder is available
		And the "./Test1" folder is missing