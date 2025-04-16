package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCredents {
	
	@FindBy(name="email")
	WebElement emailName;
	
	@FindBy(name="password")
	WebElement passwordd;
	
	@FindBy(css="button.btn.btn-lg.btn-primary.pull-xs-right")
	WebElement Loginbtn;
	
	
	
	public LoginCredents(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Enterdetials(String email, String Pass)
	{
		emailName.sendKeys(email);
		passwordd.sendKeys(Pass);
	}
	
	public void loginclick()
	{
		Loginbtn.click();
	}
	

}