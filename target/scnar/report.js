$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ELCOT/eclipse-workspace/Cucumber/src/test/resources/Fb.feature");
formatter.feature({
  "name": "Validate the login details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user login with diff credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can launch the url",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \"\u003cusername\u003e\" \"\u003cpassward\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "Validate the user login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "passward"
      ]
    },
    {
      "cells": [
        "malathi",
        "1243454"
      ]
    },
    {
      "cells": [
        "gobinath",
        "56789678"
      ]
    },
    {
      "cells": [
        "sudha",
        "765678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user login with diff credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_can_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"malathi\" \"1243454\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.validate_the_user_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user login with diff credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_can_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"gobinath\" \"56789678\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.validate_the_user_login()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user login with diff credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_can_launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter \"sudha\" \"765678\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the user login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.validate_the_user_login()"
});
formatter.result({
  "status": "passed"
});
});