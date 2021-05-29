package Runners;


import PageObjectModel.AbstractClass;
import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java"},
        glue = {"stepDefinition"},

        dryRun = false
)
public class a_TestRunner extends AbstractClass {


}
