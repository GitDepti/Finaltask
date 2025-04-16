package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;




	public class TestBase {
		String strBrowser="chrome";
		private static TestBase testbase;
		private static WebDriver driver;
		private TestBase() {
			String strBrowser= "chrome" ;
			ChromeOptions options= new ChromeOptions();
			if(strBrowser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver(options);
				
			}
			else if (strBrowser.equalsIgnoreCase("edge"))
			{
				driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}

		public static void initDriver() {
			if(testbase==null) {
				testbase = new TestBase();
			}
		}
		public static WebDriver getdriver(){
		
		return driver;
		}
		public static void openUrl(String url) {
			driver.get(url);
		}
		public static void teardown() {
		if(driver!=null) {
			driver.close();
		driver.quit();
		}}

}
