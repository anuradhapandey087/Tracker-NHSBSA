@NHS_EligibilityTracker
Feature: Eligibility Checker using NHS Costs Checker tool

  As a person from Wales
  I need to know what help I can get with my NHS costs
  So that I can get the treatment I need

  Scenario: Wales based individual eligibility checker using NHS Costs Checker tool
    Given I am a person from Wales
    When I put my circumstances into the Checker tool
      | BirthDay | BirthMonth | BirthYear | Partner | Benefits | Pregnant | Injury | Diabetes | Glaucoma | CareHome | Savings |
      | 21       | 05         | 1990      | Yes     | No       | Yes      | No     | Yes      | No       | No       | No      |
    Then I should get a result of whether I will get help or not
