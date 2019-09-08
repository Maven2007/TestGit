package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://yahoo.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"uh-search-box\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"uh-search-button\"]")).click();
	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
