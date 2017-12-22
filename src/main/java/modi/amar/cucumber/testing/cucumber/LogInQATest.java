package modi.amar.cucumber.testing.cucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modi.amar.cucumber.testing.cucumber.utils.DriverFactory;

public class LogInQATest {
	
	public static WebDriver driver;
	
	@Given("^User is at Home Page$")
	public void userHomePage(){
		this.driver = DriverFactory.getWebDriver("Firefox");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("http://www.store.demoqa.com");
	}
	
	@When("^User Navigates to LogIn page$")
	public void userNavigatesToLogInPage(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
	//Remember: When doing parameters like this go IN ORDER
	@And("^User enters (.*) and (.*)$")
	public void passwordAndUsername(String username, String password){
		driver.findElement(By.id("log")).sendKeys(username); 	 
	    driver.findElement(By.id("pwd")).sendKeys(password);
	    driver.findElement(By.id("login")).click();
	}

	@Then("^Message displayed LogIn Successfully$")
	public void messageDisplay(){
		
	}
	
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
 
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("LogOut Successfully");
	}
}
