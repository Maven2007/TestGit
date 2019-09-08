package krish;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	

		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.close();
	}

}
