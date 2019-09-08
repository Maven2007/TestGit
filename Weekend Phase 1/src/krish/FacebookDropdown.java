package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		Select Day= new Select(driver.findElement(By.id("day")));
		
		Day.selectByIndex(1);
		

		Select Month= new Select(driver.findElement(By.id("month")));
		
		Month.selectByIndex(1);
		

		Select Year= new Select(driver.findElement(By.id("year")));
		
		Year.selectByIndex(1);
		
		
		
	}

}
