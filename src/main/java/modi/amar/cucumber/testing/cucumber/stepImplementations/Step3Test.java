package modi.amar.cucumber.testing.cucumber.stepImplementations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modi.amar.cucumber.testing.cucumber.utils.DriverFactory;

public class Step3Test {
	
	private WebDriver driver;
	
	@Given("^User is on Home Page3$")
	public void goToHomePage() {
		driver = DriverFactory.getWebDriver("Firefox");
		driver.get("http://www.store.demoqa.com");
	}
	
	@When("^User Navigate to LogIn Page3$")
	public void LoginToPage() {
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
	@And("^User enters Credentials to LogIn3$")
	public void enterValidationInfo(List<Credentials> credentials) {
		//Gives it as maps
		//List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		for (Credentials credential : credentials) {
			driver.findElement(By.id("log")).sendKeys(credential.getUsername()); 
		    driver.findElement(By.id("pwd")).sendKeys(credential.getPasword());
		    driver.findElement(By.id("login")).click();
		    driver.findElement(By.id("log")).clear(); 
		    driver.findElement(By.id("pwd")).clear();
		}
		
	}
	
	@Then("^Message displayed Login Successfully3$")
	public void successfulLogin() {
		driver.close();
		System.out.println("Login!");
	}
}
