package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginTest {
  
  @FindBy(name="email")
  WebElement userId;
  @FindBy(name="password")
  WebElement pswd;
  @FindBy(xpath="//button[@class='btn btn-lg btn-primary pull-xs-right']")
  WebElement LoginBtn;
  
  
  public LoginTest(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
  }
 public void  LoginIntoApp(String strUser,String strPswd)
 {
	 userId.sendKeys(strUser);
	 pswd.sendKeys(strPswd);
	 LoginBtn.click();
	 
 }
}
