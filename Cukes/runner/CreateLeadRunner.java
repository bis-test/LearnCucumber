package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Cukes/features/createlead.feature", glue="stepdefs" , monochrome=true)

public class CreateLeadRunner
{
	
}


