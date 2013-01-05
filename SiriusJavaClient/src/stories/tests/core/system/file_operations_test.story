
Narrative:
In order to be able to perform various file system operations
As a library user
I want to make sure the file operations work properly

Scenario: Create file
Given the "<File Name>" file doesn't exist
And the "<Folder>" folder doesn't exist
When I create the "<File Name>" file
Then I should see the "<File Name>" file is <Availability>

Examples:
| File Name | Folder | Availability |
| ./Test.txt | nop |available |
| ./T e s t.txt | nop |available |
| ./Test1/Test.txt | ./Test1 | available |
| ./T@#%^^.. | nop | missing |
| a:\Test.txt | nop | missing |

Scenario: Create file (overwrite)
Given the "./Test.txt" file already exists
When I fill the "./Test.txt" file with the following lines:
|Line|
|Test1|
And I create the "./Test.txt" file
Then I should see the "./Test.txt" file content is:
|Line|
|Test1|
When I create the "./Test.txt" file with overwriting
Then I should see the "./Test.txt" file size is 0 bytes

Scenario: Append text to file
Given the "./Test.txt" file doesn't exist
When I append the "./Test.txt" file with the "test line" text
Then I should see the "./Test.txt" file is available
And the "./Test.txt" file content is:
|Line|
|test line|
When I append the "./Test.txt" file with the "test line 2" text
Then I should see the "./Test.txt" file content is:
|Line|
|test line|
|test line 2|

Scenario: Write text to file
Given the "./Test.txt" file doesn't exist
When I write the "test line" text into "./Test.txt" file
Then I should see the "./Test.txt" file is available
And the "./Test.txt" file content is:
|Line|
|test line|
When I write the "test line 2" text into "./Test.txt" file
Then I should see the "./Test.txt" file content is:
|Line|
|test line 2|

Scenario: Get contents, head and tail
Given the "./Test.txt" file doesn't exist
When I append the "./Test.txt" file with the following lines:
|Line|
|test line 1|
|test line 2|
|test line 3|
|test line 4|
|test line 5|
Then I should see the first 3 lines of the "./Test.txt" file are:
|Line|
|test line 1|
|test line 2|
|test line 3|
And the last 2 lines of the "./Test.txt" file are:
|Line|
|test line 4|
|test line 5|
And the lines from 2 of the "./Test.txt" file are:
|Line|
|test line 2|
|test line 3|
|test line 4|
|test line 5|
And the lines from 2 to 4 of the "./Test.txt" file are:
|Line|
|test line 2|
|test line 3|
|test line 4|

Scenario: Copy file

Scenario: Move file

Scenario: Delete file
Given the "./Test.txt" file already exists
When I delete the "./Test.txt" file
Then I should see the "./Test.txt" file is missing
When I delete the "./Test.txt" file
Then I should see the "./Test.txt" file is missing

Scenario: File size
Given the "./Test.txt" file doesn't exist
When I append the "./Test.txt" file with the "test line" text
Then I should see the "./Test.txt" file size is 9 bytes
When I append the "./Test.txt" file with the "test line2" text
Then I should see the "./Test.txt" file size is 21 bytes
When I delete the "./Test.txt" file
Then I should see the "./Test.txt" file size is -1 bytes
