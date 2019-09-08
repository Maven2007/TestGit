package krish;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
		WebElement hello =driver.findElement(By.id("nav-link-accountList"));
		
		WebElement yl =driver.findElement(By.xpath("//*[@id=\'nav-al-your-account\']/a[3]/span"));


		Actions mouse = new Actions(driver);
		
		mouse.moveToElement(hello).moveToElement(yl).click().build().perform();
	}

}
