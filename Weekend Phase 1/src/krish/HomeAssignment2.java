package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("txtuId")).sendKeys("Admin");
		//driver.findElement(By.id("txtPword")).sendKeys("Admin");
		//driver.findElement(By.id("login")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"txtuId\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"txtPword\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.close();
	
	}

}
