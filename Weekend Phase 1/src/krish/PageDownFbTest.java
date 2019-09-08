package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDownFbTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.linkText("Create a Page")).click();
		
	}

}
