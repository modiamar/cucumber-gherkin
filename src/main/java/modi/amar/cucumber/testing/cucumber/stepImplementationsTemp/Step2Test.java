package modi.amar.cucumber.testing.cucumber.stepImplementationsTemp;

import static org.junit.Assert.assertEquals;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modi.amar.cucumber.testing.cucumber.utils.DriverFactory;

public class Step2Test {
	
	private static WebDriver webDriver;
	
	@Given("^User is on Home Page2$")
	public void homePage2() {
		System.out.println("On Home Page");
		Step2Test.webDriver = DriverFactory.getWebDriver("Firefox");
		webDriver.get("http://www.store.demoqa.com");
	}
	
	@When("^User Navigate to LogIn Page2$")
	public void loginPage() {
		webDriver.findElement(By.xpath(".//*[@id='account']/a")).click();
	}
	
	//DataTable is the table right below the statement
	@And("^User enters Credentials to LogIn$")
	public void passwordAndUsername(DataTable usercredentials) {
		//parses the raw dataTable in the feature file right AFTER the statement
		//converts this into a 2d List mapping to how you wrote it in feature file
		List<List<String>> data = usercredentials.raw();
		webDriver.findElement(By.id("log")).sendKeys(data.get(0).get(0)); 
	    webDriver.findElement(By.id("pwd")).sendKeys(data.get(0).get(1));
	    webDriver.findElement(By.id("login")).click();
	}
	
	@And("^User says Hello$")
	public void sayHello(DataTable dataTable) {
		List<List<String>> raw = dataTable.raw();
		String actualRawData = raw.get(0).get(0)+raw.get(0).get(1);
		System.out.println(actualRawData);
		assertEquals("wafflehello",actualRawData);
	}
	
	@Then("^Message displayed Login Successfully2$")
	public void loginSuccessful() {
		System.out.println("Success!");
	}
	
	
	@When("^User LogOut from the Application2$")
	public void logoutApplicationAction() {
		webDriver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	}
	
	@Then("^Message displayed LogOut Successfully2$")
	public void logoutMessageDisplayed() {
		webDriver.close();
		System.out.println("Success Logout");
	}
}
