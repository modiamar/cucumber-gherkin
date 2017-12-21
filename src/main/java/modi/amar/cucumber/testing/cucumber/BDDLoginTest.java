package modi.amar.cucumber.testing.cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modi.amar.cucumber.testing.cucumber.utils.DriverFactory;

/**
Given user is on the login page
When user enters correct username and correct password
Then user gets confirmation
**/
public class BDDLoginTest {
	
	WebDriver webDriver;
	//This binds to the login.feature file
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
		System.out.println("User is on the login page");
		this.webDriver = DriverFactory.getWebDriver("Firefox");
		webDriver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	}
	
	@When("^user enters correct username and correct password$")
	public void user_enters_correct_username_and_correct_password() {
		WebElement userName = webDriver.findElement(By.id("MainContent_txtUserName"));
		WebElement passWord = webDriver.findElement(By.id("MainContent_txtPassword"));
		WebElement loginButton = webDriver.findElement(By.id("MainContent_btnLogin"));
		userName.sendKeys("tim@testemail.com");
		passWord.sendKeys("trpass");
		loginButton.click();
		System.out.println("User typed in correct username and password");
	}
	
	@When("^user enters email (.*)$")
	public void user_enters_username(String username){
		System.out.println("username "+ username);
		WebElement userName = webDriver.findElement(By.id("MainContent_txtUserName"));
		userName.sendKeys(username);
		
	}
	
	@And("^user enters username (.*)$")
	public void user_enters_password(String password){
		System.out.println("password "+ password);
		WebElement passWord = webDriver.findElement(By.id("MainContent_txtPassword"));
		passWord.sendKeys(password);
		
	}
	
	@And("^user clicks login button$")
	public void user_clicks_login_button(String password){
		WebElement loginButton = webDriver.findElement(By.id("MainContent_btnLogin"));
		loginButton.click();
		
	}
	
	@Then("^user gets confirmation$")
	public void user_gets_confirmation() {
		String text = webDriver.findElement(By.id("conf_message")).getText();
		Assert.assertEquals("Logged in successfully", text);
		System.out.println("user got confirmed");
	}
	
	@After
	public void tearDown(){
		webDriver.quit();
	}

}
