package com.mindtree.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = { "Features" }, glue = { "com.mindtree.StepDefinition" }, monochrome = true, dryRun = false)

public class TestRunner extends AbstractTestNGCucumberTests {

}
