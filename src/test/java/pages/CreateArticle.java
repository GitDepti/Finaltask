

import base.TestBase;


public class CreateArticle() {
	TestBase.initDriver();
	driver=TestBase.getdriver();
	LoginTest  = new LoginTest(driver);
}
@BeforeTest
public void setup() {
	TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/#/login");
	
}
@Test
public void validLoginTest() {
	LoginTest.LoginIntoApp("deepthiraoappana@gmail.com", "conduit12345");
}
