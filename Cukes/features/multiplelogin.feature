#usage of background keyword
Feature: Multiple Login
Background:
Given Invoke Leaftap application

@smoke @sanity
Scenario: Login into Leaftaps(Positive)
And Enter the user name as DemoSalesManager
And Enter the password crmsfa
When click on login button
Then Verify the login is success

@sanity
Scenario: Login into Leaftaps(Negative)
And Enter the user name as DemoSalesManager1
And Enter the password crmsfa
When click on login button
But Verify the login is fail