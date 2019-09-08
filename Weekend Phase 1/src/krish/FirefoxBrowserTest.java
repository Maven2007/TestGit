package krish;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		

		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.close();
	}

}
