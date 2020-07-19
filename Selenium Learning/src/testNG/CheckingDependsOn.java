package testNG;

import org.testng.annotations.Test;

public class CheckingDependsOn {
	@Test(dependsOnMethods = {"methodTwo"},priority = 0)
	public void methodOne() {
		System.out.println("method1");
	}
	@Test(priority = 1,enabled = false)
	public void methodTwo() {
		System.out.println("method2");	
	}
}
