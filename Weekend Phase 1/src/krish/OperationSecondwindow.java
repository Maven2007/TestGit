package krish;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationSecondwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows=driver.getWindowHandles();
		for (String child : windows) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/a")).click();
			}
		}
		
		
	}

}
