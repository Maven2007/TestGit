package krish;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//giving the focus to the particular frame index
		//driver.switchTo().frame(0);
		
		//by string
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		
		//webelement
		
		//WebElement frame1= driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/iframe"));
		
		//driver.switchTo().frame(frame1);
		
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable"));
		
		Actions dAd= new Actions(driver);
		dAd.dragAndDrop(drg, drp).build().perform();
		
		// give the control to the default windows
		
		driver.switchTo().defaultContent();
		
	}

}
