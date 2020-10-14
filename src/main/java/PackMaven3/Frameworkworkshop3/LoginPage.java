package PackMaven3.Frameworkworkshop3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(id = "uid")
	WebElement UserTxt;
	
	@FindBy(id = "passw")
	WebElement passTxt;
	
@FindBy(xpath = "/html/body/table[2]/tbody/tr/td[2]/div/h1")
WebElement btn;


public void loignMethod (String user, String pass) {
	
	UserTxt.sendKeys(user);
	passTxt.sendKeys(pass);
	btn.click();
}
}