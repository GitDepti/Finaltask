
package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {
	
	 WebDriver driver;
	@Before
	public static void setupbrowser()
	{
		TestBase.initdriver();
	}
	
	@After
	public void attchScreenshots(Scenario sceanrio)
	{
		if(sceanrio.isFailed())
		{
			TakesScreenshot ts =(TakesScreenshot)driver;
			byte[] b =ts.getScreenshotAs(OutputType.BYTES);
			sceanrio.attach(b, "image/png", "failed scenario screenshot");
		}
	}
	
	

}