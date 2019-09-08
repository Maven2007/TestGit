package Kishu;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest{
	ChromeDriver driver;
	@BeforeTest

	public void applaunch() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Assert.assertTrue(driver.findElement(By.id("txtuId")).isDisplayed());//Validation
	}

	@Test
	public void applogin() {
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		
		
	}
	
	  @Test public void empcreation() throws Exception {
	  driver.findElement(By.xpath(
	  "//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\'BtnNewBR\']")).click();
	  
	  
	  driver.findElement(By.id("txtbName")).sendKeys("QaEdge1");
	  driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
	  driver.findElement(By.id("txtZip")).sendKeys("75964");
	  
	  Select country= new Select (driver.findElement(By.id("lst_counrtyU")));
	  
	  country.selectByIndex(1); Thread.sleep(3000);
	  
	  Select state= new Select (driver.findElement(By.id("lst_stateI")));
	  
	  state.selectByIndex(1); Thread.sleep(3000);
	  
	  Select City= new Select (driver.findElement(By.id("lst_cityI")));
	  
	  City.selectByIndex(1); Thread.sleep(3000);
	  driver.findElement(By.id("btn_insert")).click();
	  
	  Alert al=driver.switchTo().alert(); String msg=al.getText(); al.accept();
	 
		
		
	}

	@AfterTest
	public void appclose() {
		
		driver.close();
	}
	}
