Feature: Validate the login details
@Smoke
Scenario: user login with diff credentials
Given User can launch the url
When User enter validid and invalidpwd
|malathi|34543|
And User click the login button
Then Validate the user login
@smoke
Scenario: user login with diff credentials
Given User can launch the url
When User enter validid and validpwd
|username|passward|
|54654|54645645|
And User click the login button
Then Validate the user login
@sanity
Scenario: user login with diff credentials
Given User can launch the url
When User enter invalidid and invalidpwd
|malathi|
|45645654|
And User click the login button
Then Validate the user login
@Regression
Scenario: user login with diff credentials
Given User can launch the url
When User enter invalidid and validpwd
|username|passward|
|54654|54645645|
|malathi|cddsf|
|dbdsfds|dsfbhdsf|
And User click the login button
Then Validate the user login

