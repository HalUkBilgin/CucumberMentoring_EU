package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(


        tags = {"@SmokeTest"},
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false
)





public class c_SmokeTest  extends AbstractTestNGCucumberTests {
}
