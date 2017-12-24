package modi.amar.cucumber.testing.cucumber.stepImplementations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Hooks_Steps {
	@Given("^this is the first step$")
	public void firstStep() {
		System.out.println("First Step");
	}
	
	@When("^this is the second step$")
	public void secondStep() {
		System.out.println("Second Step");
	}
	
	@Then("^this is the third step$")
	public void thirdStep() {
		System.out.println("This is the third step");
	}
	
	@Given("^this is the first user (.*)$")
	public void firstStepEx2(String username) {
		System.out.println(username);
	}
}
