package modi.amar.cucumber.testing.cucumber.stepImplementations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step6Hooks {
	
	@Given("^ this is the first step$")
	public void firstStep() {
		System.out.println("First");
	}
	@When("^ this is the second step$")
	public void secondStep() {
		System.out.println("Second");
	}
	@Then("^ this is the third step$") 
	public void thirdStep(){
		System.out.println("Third");
	}
}
