package modi.amar.cucumber.testing.cucumber.stepImplementations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@First")
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    }	
	
	@Before("@Second")
    public void beforeScenario1(){
        System.out.println("This will run before the Scenario2");
    }	
	@Before("@Third")
    public void beforeScenario2(){
        System.out.println("This will run before the Scenario3");
    }	
	
	@After("@First")
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
	
	@After("@Second")
    public void afterScenario1(){
        System.out.println("This will run after the Scenario2");
    }
	
	@After("@Third")
    public void afterScenario2(){
        System.out.println("This will run after the Scenario3");
    }
	

}
