package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateArticleTest {
@FindBy(css="//a[@href='#/editor']")
WebElement newArticle;
@FindBy(css="input[name='title']")
WebElement ArticleTitle;
@FindBy(css="input[name='description']")
WebElement ArticleDescrpt;
@FindBy(css="textarea[name='body']")
WebElement ArticleBody;
@FindBy(css="input[name='tags']")
WebElement ArticleTag;
@FindBy(css="button[type='submit']")
WebElement Articlepub;
@FindBy(xpath="//span[contains(text(), 'Title already exists..']")
WebElement existMsg;
public CreateArticleTest(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public void NewArticle(String strTitle, String strDescrpt, String strBody, String strTag) {
	newArticle.click();
	ArticleTitle.sendKeys(strTitle);
	ArticleDescrpt.sendKeys(strDescrpt);
	ArticleBody.sendKeys(strBody);
	ArticleBody.sendKeys(strTag);
	Articlepub.click();
	
}

public boolean isSubmitFails() {
	return existMsg.isDisplayed();
}

}
