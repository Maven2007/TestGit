package krish;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).click();
		
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(3000);
		al.accept();
		//al.dismiss();// cancel
		//al.sendKeys("Krish"); Enter data
		
	}

}
