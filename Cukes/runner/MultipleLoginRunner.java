package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cukes/features/multiplelogin.feature", glue="stepdefs" , 
monochrome=true, tags= {"@smoke and @sanity"})

public class MultipleLoginRunner
{
	
}


