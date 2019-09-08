package krish;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParametrizationDataDrivenOrangeHRM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
        File srcfile=new File("C:\\Users\\kishu\\Desktop\\OrangeData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcfile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rcnt=ws.getLastRowNum();
		
		for (int i = 1; i < rcnt; i++) {
			
			String fname=ws.getRow(i).getCell(0).getStringCellValue();
			String lname=ws.getRow(i).getCell(1).getStringCellValue();
			
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Add Employee")).click();
			driver.findElement(By.id("firstName")).sendKeys(fname);
			driver.findElement(By.id("lastName")).sendKeys(lname);
			driver.findElement(By.id("btnSave")).click();
			
			if (driver.findElement(By.xpath("//*[@id=\"empPic\"]")).isDisplayed()) {
				ws.getRow(0).createCell(2).setCellValue("Status");
				ws.getRow(i).createCell(2).setCellValue("Pass");
				
			}else {
				ws.getRow(i).createCell(2).setCellValue("Fail");
			}
			
			FileOutputStream fos=new FileOutputStream(srcfile);
			
			wb.write(fos);
			
		
	}

		wb.close();
}
}