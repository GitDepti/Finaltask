package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditArticle {
@FindBy(xpath="(//*[@class='form-control'][1]")
WebElement txtArticleAbout;
@FindBy(xpath="//*[@name='body']")
WebElement txtArticleDescription;
@FindBy(xpath="//*[@name='tags']")
WebElement txtArticletags;

@FindBy(xpath="//button[@type='submit']")
WebElement btnPublishArticle;
@FindBy(xpath="//button[text()='Delete Article']")
WebElement btnDeleteArticle;

private WebDriver driver;
public EditArticle(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void deleteArticle() {

}}
