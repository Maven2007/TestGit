package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BCreationPrimus extends PrimusBankTestNG{

	
	@Test
	
	public void branchcreation() throws Exception {
		
		
		driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\'BtnNewBR\']")).click();
	
	
		driver.findElement(By.id("txtbName")).sendKeys("QaEdge1");
		driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
		driver.findElement(By.id("txtZip")).sendKeys("75964");
		
		Select country= new Select (driver.findElement(By.id("lst_counrtyU")));
		
		country.selectByIndex(1);
		Thread.sleep(3000);

		Select state= new Select (driver.findElement(By.id("lst_stateI")));
		
		state.selectByIndex(1);
		Thread.sleep(3000);

		Select City= new Select (driver.findElement(By.id("lst_cityI")));
		
		City.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.id("btn_insert")).click();

		Alert al=driver.switchTo().alert();
		String msg=al.getText();
		al.accept();

	}
}
