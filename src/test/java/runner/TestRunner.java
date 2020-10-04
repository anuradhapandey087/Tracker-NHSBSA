package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (features = "src/test/resources/features", // Folder location of 'feature' files
        glue = {"stepDef"},                        // Folder location containing 'stepsDef' files
        tags = {"@NHS_EligibilityTracker"},
        plugin = { "html:target/cucumber-html-report" }
        )
public class TestRunner {

}
