package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DependenciesManagement {

	// eg:amazon.in
	//problem1:Engineering admission
	//problem2:Higher secondary  admission
	@Test(enabled=false)
	public void highSchool() {
		System.out.println("10 th");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondary() {
		System.out.println("12 th");
	}
	@Test(dependsOnMethods = "higherSecondary")
	public void engineeringCollege() {
		System.out.println("college");
	}
}
