package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidationsTestNG {

	@Test
	public void validation() {
		String data="Selenium";
		String data1="Krish";
		
		Assert.assertEquals(data1, data);
		
		
	}
}
