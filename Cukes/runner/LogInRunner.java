package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features="Cukes/features/login.feature", glue="stepdefs" , monochrome=true, plugin = {"pretty", "html:target/cucumber"})

//@CucumberOptions(features="Cukes/features/login.feature", glue="stepdefs" , dryRun= true)

@CucumberOptions(features="Cukes/features/login.feature", glue="stepdefs" , strict= false)

public class LogInRunner
{
	
}


