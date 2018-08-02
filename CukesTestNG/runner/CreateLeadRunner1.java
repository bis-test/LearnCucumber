package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="CukesTestNG/feature/createlead.feature", glue="steps" , monochrome=true)

public class CreateLeadRunner1
{
	
}


