package krish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Amazon.com");
		driver.manage().window().maximize();
		
		WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		Select sl= new Select (drop);
		sl.selectByIndex(23);
		sl.selectByVisibleText("Computers");
		
		sl.selectByValue("search-alias=aps");
		/*List<WebElement>droplist=sl.getOptions();
		
		System.out.println(droplist.size());
		
		for (int i = 0; i < droplist.size(); i++) {
			System.out.println(droplist.get(i).getText());*/
			
			System.out.println(sl.isMultiple());
			System.out.println(sl.getFirstSelectedOption().getText());
		
		// if multiple items selected ,get the size and print the selected names
			
		List	<WebElement>selectedList=sl.getAllSelectedOptions();
		for (WebElement items : selectedList) {
			System.out.println(items.getText());
		}
			
		}
	}


