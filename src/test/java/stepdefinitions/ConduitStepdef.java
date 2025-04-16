package stepdefinitions;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.api.internal.Utils;
import pages.CreateArticleTest;
import pages.EditArticle;
import pages.LoginTest;

public class ConduitStepdef {
	WebDriver driver;
	LoginTest login=new LoginTest(driver);
	CreateArticleTest  createarticletest=new CreateArticleTest(driver);
	EditArticle edit =new EditArticle(driver);

	@Given("User is on Login page to conduit")
	public void user_is_on_login_page_to_conduit() throws IOException{
		TestBase.openUrl(Utils.getConfigProperties("url"));
	}
@Given("User should be on New Article page")
public void user_should_be_on_new_article_page() {
    art.userClickOnCreateArticle();
}
@When("User enters  Article details")
public void user_enters_article_details(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    throw new io.cucumber.java.PendingException();
}
@Then("Article will be created")
public void article_will_be_created() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Given("Article details page will be displayed")
public void article_details_page_will_be_displayed() {
   global.verifyArticleDetails();
}
@When("User delete article")
public void user_delete_article() {
   edit.deleteArticle();
}
@Then("article will be deleted")
public void article_will_be_deleted() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

}
