package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.en.Given;

public class ConduitStepdef {
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_home_page() {
	    driver = new ChromeDriver();
	    TestBase.openUrl(utils.getConfigProperties("url"));
	   
}
