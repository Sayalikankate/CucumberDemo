$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sayali.sunil.kankate/eclipse-workspace/CucumberDemo/src/test/java/features/dealsCount.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Deal Count Feature",
  "description": "",
  "id": "free-crm-deal-count-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 39981110900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Count number of deals",
  "description": "",
  "id": "free-crm-deal-count-feature;count-number-of-deals",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "navigate to Deals Page and take deal count",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "navigate to home Page and compare deal count",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_opens_browser()"
});
formatter.result({
  "duration": 2659537100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.navigate_to_Deals_Page_and_take_deal_count()"
});
formatter.result({
  "duration": 3563672300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.navigate_to_home_Page_and_compare_deal_count()"
});
formatter.result({
  "duration": 16084061401,
  "status": "passed"
});
formatter.after({
  "duration": 1571170300,
  "status": "passed"
});
});