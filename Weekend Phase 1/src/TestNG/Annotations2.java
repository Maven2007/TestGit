package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {

	
@BeforeTest

public void applaunch() {
	System.out.println("AppLaunch Executed ");
	
}

@Test
public void applogin() {
	System.out.println("AppLogin Executed");
	
	
	
}
@Test
public void empcreation() {
	System.out.println("EmpCreation Executed");
	
	
}

@AfterTest
public void appclose() {
	
	System.out.println("Appclose Executed");
}
}
