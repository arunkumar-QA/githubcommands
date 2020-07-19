package testNG;

import org.testng.annotations.Test;

public class DriveACar {
	// controlling the order of test case execution using priority
	@Test(priority = 0,invocationCount = 5,invocationTimeOut = 5000)
	public void startTheCar() {
		System.out.println(" actual test case Car started");
	}
//	@Test(priority = 1)
//	public void FirstGear() {
//		System.out.println("First Gear started");
//	}
//	@Test(priority = 2)
//	public void secondGear() {
//		System.out.println("second Gear started");
//	}
//	@Test()
//	public void thirdGear() {
//		System.out.println("third Gear started");
//	}
//	@Test
//	public void fourthGear() {
//		System.out.println("fourth Gear started");
//	}



	


}
