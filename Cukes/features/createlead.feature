Feature: Create Lead (Positive)
Scenario Outline: Create Lead
Given Navigate to create lead Page
And Enter the Company Name <compname>
And Enter the First Name <firstname>
And Enter the Last Name <lastname>
When click on create lead
Then Verify the create lead is success
Examples:
|compname|firstname|lastname|
|TCS|Trisha|Kanan|
|CTS|Kajol|Agarwal|
|Alight|Biswajit|Sundara|