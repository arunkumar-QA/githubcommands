package testNG;

import org.testng.annotations.Test;

public class SampleTestCase {
	@Test(enabled = false) // it is an annotation 
	public void firstTestCase() {
		System.out.println("First Test Case");

	}
	@Test()
	public void secondTestCase() {
		System.out.println("second Test Case");

	}
	@Test
	public void thirdTestCase() {
		System.out.println("third Test Case");

	}
	@Test
	public void fourthTestCase() {
		System.out.println("fourth Test Case");

	}


}
