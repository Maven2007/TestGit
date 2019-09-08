package krish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOnSpecificArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Amazon.com");
		driver.manage().window().maximize();

		WebElement header=driver.findElement(By.id("nav-xshop-container"));
		List <WebElement> headerlinks=header.findElements(By.tagName("a"));
		System.out.println(headerlinks.size());
		for (int i = 0; i < headerlinks.size(); i++) {
			System.out.println(headerlinks.get(i).getText());
			if (headerlinks.get(i).getText().equals("Sell")) {
				headerlinks.get(i).click();
			}
		}
	}

}
