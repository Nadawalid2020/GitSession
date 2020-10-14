package PackMaven3.Frameworkworkshop3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	
	@BeforeTest
	public void openBrowser() {
		
		openChrome("http://testfire.net/login.jsp");
	}
	
	@Test
	public void testLogin() {
		LoginPage logobj = new LoginPage(driver);
		logobj.loignMethod("admin", "admin");
		
		
	}
	
}
