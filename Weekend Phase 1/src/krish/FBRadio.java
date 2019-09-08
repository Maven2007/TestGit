package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBRadio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\'u_0_5\']")).click();
		
		
	}
}

		