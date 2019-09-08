package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTest {

	
@BeforeMethod
public void beforeMethod() {
		
System.out.println("Before Method Executed");
		
}
@Test

public void testMethod1() {
	
System.out.println("TestMethod1 Executed");	
	
}

@AfterMethod

public void afterMethod() {
	
	System.out.println("After Method Executed");
}
}
