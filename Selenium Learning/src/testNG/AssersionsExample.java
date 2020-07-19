package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssersionsExample {
	// String name="Arun";
	// Assersions are used for conditions checking
	@Test
	public void checkName() {
		String name="Arun";
		//		if(name.equals("Arun"))
		//		{
		//			System.out.println("Equal");
		//		}
		Assert.assertNotEquals(name, "Arin1");
		Assert.assertTrue(false
				, "Arun kumar QA Engineer at infosys");
		
	}
}
