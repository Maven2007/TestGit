package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagePOM {

	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public void applogin() {
		
		username.sendKeys("Admin");
		password.sendKeys("Qedge123!@#");
		login.click();
	}
	
}
