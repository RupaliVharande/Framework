package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\testCases",
		glue="stepDef",
		monochrome=false,
		plugin = { "pretty", "html:target/cucumber-reports" },
		tags= {"@ff"},
		dryRun =false
		
		)
public class Runner 
{
	

}
