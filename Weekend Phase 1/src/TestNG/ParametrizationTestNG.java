package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametrizationTestNG {
	
	@Test(dataProvider="getData")
	
	public void applogin(String uid,String pwd) {
		
		System.out.println("Username is:+ uid");
		System.out.println("Password is:+ pwd");
		
	}
@DataProvider
public Object [][] getData(){
	
	Object[][] data=new Object[2][2];
	data[0][0]="Selenium 1";
	data[0][1]="Test1";
	
	data[1][0]="Selenium 2";
	data[1][1]="Test2";
	return data;

	
}
}
