package modi.amar.cucumber.testing.cucumber.stepImplementations;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="modi.amar.cucumber.testing.cucumber.stepImplementations",
		tags= {"@FunctionalTest"}
		)
public class LoginTestRunner {
	
}
