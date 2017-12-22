package modi.amar.cucumber.testing.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver getWebDriver(String browser) {
		if (browser.equals("Firefox")) {
		 System.setProperty("webdriver.gecko.driver", "geckodriver");
         FirefoxDriver firefoxDriver = new FirefoxDriver();
         //firefoxDriver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
         return firefoxDriver;
		}
		return null;
	}
}
