package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChainActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		WebElement shop=driver.findElement(By.id("nav-link-shopall"));

		WebElement apv=driver.findElement(By.xpath("//*[@id=\'nav-flyout-shopAll\']/div[2]/span[4]/span")); 
		
		WebElement tvs=driver.findElement(By.xpath("//*[@id=\'nav-flyout-shopAll\']/div[3]/div[4]/a[3]/span[1]"));
		
		Actions chain= new Actions(driver); 
		
		chain.moveToElement(shop).moveToElement(apv).pause(2000).moveToElement(tvs).click().build().perform();
		
	}

}
