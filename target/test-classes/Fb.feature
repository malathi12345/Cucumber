Feature: Validate the login details

Scenario Outline: user login with diff credentials
Given User can launch the url
When User enter "<username>" "<passward>"
And User click the login button
Then Validate the user login

Examples:
|username|passward|
|malathi|1243454|
|gobinath|56789678|
|sudha|765678|
