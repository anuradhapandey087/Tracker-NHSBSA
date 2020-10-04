package stepDef;

import base.BasePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BasePage{

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("######## Now in Before Scenario ############");
        System.out.println("%%%%%%%%%%%%%%%%% Started Scenario: " + scenario.getName() + " %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    @After
    public void afterScenario(Scenario scenario) {

        System.out.println("######## Now in After Scenario ############");
        System.out.println("%%%%%%%%%%%%%%%%%%% End of Scenario: " + scenario.getName() + " %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        driver.quit();
    }
}

