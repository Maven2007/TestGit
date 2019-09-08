package krish;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiplewindowTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		// driver.findElement(By.xpath("//*[@id=\"parentdiv\"]/img")).click();
		
		String parent= driver.getWindowHandle(); // first window
		
		System.out.println(parent);// capture first window id
		
		driver.findElement(By.id("loginsubmit")).click();
		
		Set<String> windows =driver.getWindowHandles();// code for second window
		
		System.out.println(windows.size());
		
		for (String child : windows) {
		
			System.out.println(child); //capture second window id
			
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
			
			if (!driver.getTitle().equals("NetBanking")) {
			
				Thread.sleep(3000);
				driver.close();
			}
			
		}
	}

}
