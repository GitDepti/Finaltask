package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement HomeButton;
	
	@FindBy(xpath="//button[@class='nav-link active']")
	WebElement YourFeedBuuton;
	
//	@FindBy(xpath="//a[@class='nav-link ']/i")
//	WebElement ArticleButton;
	
	@FindBy(xpath="//a[text()='New Article']")
	WebElement ArticleButton;
	
	@FindBy(xpath="//button[text()='Global Feed']")
	WebElement GlobalFeedButton;
	
	
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	public boolean displayhome()
	{
		return HomeButton.isDisplayed();
	}
	
	public boolean DisplayYourFeed()
	{
		return YourFeedBuuton.isDisplayed();
	}
	
	public void clickonArticlebutton()
	{
		ArticleButton.click();
	}
	
	public void clickonHomebutton()
	{
		HomeButton.click();
	}
	
	public boolean DisplayHomebutton()
	{
		return HomeButton.isDisplayed();
	}
	
	public void ClickingOnGlobalFeed()
	{
		GlobalFeedButton.click();
	}
	
		
}