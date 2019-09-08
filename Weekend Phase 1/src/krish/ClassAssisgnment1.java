package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class ClassAssisgnment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_e")).click();
		// Reference for getting tile  
		System.out.println(driver.getTitle());
		//Reference for getting URL
		System.out.println(driver.getCurrentUrl());
		//Reference for getting page source 
		System.out.println(driver.getPageSource());
		driver.close();
	}

}
