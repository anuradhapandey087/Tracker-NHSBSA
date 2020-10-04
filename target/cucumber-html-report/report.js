$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/eligibilityChecker.feature");
formatter.feature({
  "name": "Eligibility Checker using NHS Costs Checker tool",
  "description": "  As a person from Wales\n  I need to know what help I can get with my NHS costs\n  So that I can get the treatment I need",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@NHS_EligibilityTracker"
    }
  ]
});
formatter.scenario({
  "name": "Wales based individual eligibility checker using NHS Costs Checker tool",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NHS_EligibilityTracker"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am a person from Wales",
  "keyword": "Given "
});
formatter.match({
  "location": "EligibilityCheckerStepDef.i_am_a_person_from_wales()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I put my circumstances into the Checker tool",
  "rows": [
    {
      "cells": [
        "BirthDay",
        "BirthMonth",
        "BirthYear",
        "Partner",
        "Benefits",
        "Pregnant",
        "Injury",
        "Diabetes",
        "Glaucoma",
        "CareHome",
        "Savings"
      ]
    },
    {
      "cells": [
        "21",
        "05",
        "1990",
        "Yes",
        "No",
        "Yes",
        "No",
        "Yes",
        "No",
        "No",
        "No"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "EligibilityCheckerStepDef.i_put_my_circumstances_into_the_checker_tool(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "EligibilityCheckerStepDef.i_should_get_a_result_of_whether_i_will_get_help_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});