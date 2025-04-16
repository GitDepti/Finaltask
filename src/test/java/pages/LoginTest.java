package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest {
	
	
	@FindBy(linkText="Login")
	WebElement loginbutton;
	
	
	public LoginTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin()
	{
		loginbutton.click();
	}
	
	

}