$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sayali.sunil.kankate/eclipse-workspace/CucumberDemo/src/test/java/features/login.feature");
formatter.feature({
  "name": "Login to ultimateqa site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to Dashboard",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have launched browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinition.i_have_launched_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am on homepage",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinition.i_am_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"Sayali K\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.i_enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "password as \"Abc@123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be navigated to Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinition.i_should_be_navigated_to_Dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "closes browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinition.closes_browser()"
});
formatter.result({
  "status": "passed"
});
});