Feature: Directory Operations
	
	Scenario: Directory exists
		When I create the "./Test" folder
		And delete the "./Test1" folder
		Then I should see the "./Test" folder is available
		But the "./Test1" folder is missing