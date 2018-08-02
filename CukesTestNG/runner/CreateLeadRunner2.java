package runner;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="CukesTestNG/feature/createlead.feature", glue="steps" , monochrome=true)

//@Test
public class CreateLeadRunner2 extends AbstractTestNGCucumberTests
{
	
}


