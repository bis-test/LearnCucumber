Feature: Login to Leaftaps
Scenario: Login into Leaftaps(Positive)
Given Invoke Leaftap application
And Enter the user name as DemoSalesManager
And Enter the password crmsfa
When click on login button
Then Verify the login is success






