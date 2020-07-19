package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority = 0)
	public void startTheCar() {
		System.out.println("Car started");
	}
	@Test(priority = 5,enabled = false)
	public void startMusic() {
		System.out.println("tamil music  started");

	}
	@Test(priority = 1)// default enabled=true
	public void FirstGear() {
		System.out.println("First Gear started");
	}
	@Test(priority = 2)
	public void secondGear() {
		System.out.println("second Gear started");
	}
	@Test(priority = 3)
	public void thirdGear() {
		System.out.println("third Gear started");
	}
	@Test(priority = 4)
	public void fourthGear() {
		System.out.println("fourth Gear started");
	}

}
