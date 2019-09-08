package POM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTestPOM {
	ChromeDriver driver;
@Test
		public void login() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/dashboard");
	driver.manage().window().maximize();

    LoginPagePOM app=PageFactory.initElements(driver,LoginPagePOM.class );
    
    app.applogin();

}

}

