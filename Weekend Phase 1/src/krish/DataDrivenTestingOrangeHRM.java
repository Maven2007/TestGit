package krish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingOrangeHRM {
	ChromeDriver driver;
	
	String res;
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
		driver.findElement(By.linkText("Logout")).click();
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

	
	
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		DataDrivenTestingOrangeHRM app=new DataDrivenTestingOrangeHRM();
		
		app.applaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.applogin("Admin", "Qedge123!@#");
		
		File srcfile =new File("C:\\Users\\kishu\\Desktop\\DataDrivenExample.xlsx");
		FileInputStream fis=new FileInputStream(srcfile);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet ws= wb.getSheet("Sheet1");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i < rcnt; i++) {
			
			String fName=ws.getRow(i).getCell(0).getStringCellValue();
			String lName=ws.getRow(i).getCell(0).getStringCellValue();
			
			String results= app.empcreation(fName, lName);
			
			ws.getRow(i).createCell(2).setCellValue("results");
			
			FileOutputStream fos=new FileOutputStream(srcfile);
			wb.write(fos);
		}
		wb.close();
		app.applogout();
		app.appclose();
	}

}
