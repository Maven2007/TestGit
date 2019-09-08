package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechBoxTestRediff {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		
		System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		
		Thread.sleep(5000);
		if (driver.findElement(By.id("remember")).isSelected()) {
			
			driver.findElement(By.id("remember")).click();
			
			System.out.println(driver.findElement(By.id("remember")).getAttribute("checked"));
		}
	}

}
