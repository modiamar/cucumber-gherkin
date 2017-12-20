package modi.amar.cucumber.testing.cucumber;

import org.openqa.selenium.firefox.FirefoxDriver;

public class App {
	
    public static void main( String[] args ) {
        System.setProperty("webdriver.gecko.driver", "/home/amarmodi/Desktop/geckodriver");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        
        firefoxDriver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
    }
}
