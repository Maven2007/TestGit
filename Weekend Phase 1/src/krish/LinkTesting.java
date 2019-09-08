package krish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		      List<WebElement>  links= driver.findElements(By.tagName("a"));
		       System.out.println(links.size()); // Print the size 
		       for (WebElement webElement : links) {
				System.out.println(webElement.getText());
			}
			}
			}
		       
			
			
	


