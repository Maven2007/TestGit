package krish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMByMethodsCalling {

	ChromeDriver driver;
	String res;
	
	//app launch method
	public  String applaunch(String url) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
			
		if (driver.findElement(By.id("txtUsername")).isDisplayed()) {
			res="Pass";
			
			
		}else {
			
			res="Fail";
			
		}
		
		return res;
	}
	
	//app login method
	
	public String applogin(String userName,String Password) {
		
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		
		if (driver.findElement(By.id("welcome")).isDisplayed()) {
			res="Pass";
			
		}else {
			
			res="Fail";
		}
	
		return res;
	
	}
	
	
	//Employee creation
	
	
	public String empcreation(String fName,String lName) {
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys(fName);
		driver.findElement(By.id("lastName")).sendKeys(lName);
		driver.findElement(By.id("btnSave")).click();
		
		if (driver.findElement(By.xpath("//*[@id=\"empPic\"]")).isDisplayed()) {
			res="Pass";
			
			
			
		}else {
			
			res="Fail";
		}
		
		return res;
	}
	
	
	//app logout
	
	public String applogout() {
		
		driver.findElement(By.id("welcome")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a")).click();
		if (driver.findElement(By.id("txtUsername")).isDisplayed()) {
			res="Pass";
			
			
		}else {
			
			res="Fail";
		}
	
	
		return res;
	}
	
	// app close
	
	public void appclose() {
		
		driver.close();
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrangeHRMByMethodsCalling app= new OrangeHRMByMethodsCalling();
		
		app.applaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.applogin("Admin", "Qedge123!@#");
		app.empcreation("Test12", "Test56");
		app.applogout();
		app.appclose();
		
	}

}
