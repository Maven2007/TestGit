package TestNG;

import org.testng.annotations.Test;

public class TestNGTest {

	
	
	@Test(priority = 1)

	public void Test1() {
		
		System.out.println("A");
	}
	@Test(priority = 3)
	public void Test2() {
		
		System.out.println("B");
	}

	@Test(priority = 2)
	public void Test3() {
		
		System.out.println("C");
	}

	}


