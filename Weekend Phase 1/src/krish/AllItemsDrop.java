package krish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllItemsDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Amazon.com");
		driver.manage().window().maximize();
		
		 WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		 List<WebElement> droplinks=drop.findElements(By.tagName("option"));
		 System.out.println(droplinks.size());
		 

		 for (WebElement webElement : droplinks) {
			System.out.println(webElement.getText());
			//webElement.click();
			
			if (webElement.getText().equals	("Books")) {
				webElement.click();
				if (webElement.isSelected()) {
					System.out.println(webElement.getText() + ":Is selected");
				} else {

					System.out.println(webElement.getText() + ":Is not selected");
				}
			}
		}
	}

}
