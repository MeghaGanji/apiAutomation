package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/Features", glue= {"src/javaSubfolder/StepDefinitions.java"}, monochrome = true,  plugin = { "pretty",  "html:Reports/cucumber-pretty" }, dryRun = true)
public class testRunner extends AbstractTestNGCucumberTests {

}