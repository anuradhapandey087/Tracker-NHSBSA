package stepDef;

import base.BasePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.EligibilityCheckerPage;

import java.util.Map;

public class EligibilityCheckerStepDef {

    @Given("^I am a person from Wales$")
    public void i_am_a_person_from_wales() throws Throwable
    {
        BasePage.navigate_To_URL();
        EligibilityCheckerPage.click_Start_Button();

        EligibilityCheckerPage.click_Wales_Radio_Button();
        EligibilityCheckerPage.click_Next_Button();
    }

    @When("^I put my circumstances into the Checker tool$")
    public void i_put_my_circumstances_into_the_checker_tool(DataTable testData) throws Throwable
    {
        for(Map<String, String> data : testData.asMaps(String.class, String.class))
        {
            EligibilityCheckerPage.enter_DoB_Day(data.get("BirthDay"));
            EligibilityCheckerPage.enter_DoB_Month(data.get("BirthMonth"));
            EligibilityCheckerPage.enter_DoB_Year(data.get("BirthYear"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Partner"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Benefits"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Pregnant"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Injury"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Diabetes"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Glaucoma"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("CareHome"));
            EligibilityCheckerPage.click_Next_Button();

            EligibilityCheckerPage.select_Option(data.get("Savings"));
            EligibilityCheckerPage.click_Next_Button();
        }
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void i_should_get_a_result_of_whether_i_will_get_help_or_not()
    {
        EligibilityCheckerPage.verify_ResultPage();
    }

}
