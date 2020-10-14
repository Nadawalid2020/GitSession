package PackMaven3.Frameworkworkshop3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	protected WebDriver driver;
	
		public void openChrome (String url) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.navigate().to(url);
			
		}
}
