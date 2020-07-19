package testNG;

import org.testng.annotations.Test;

@Test(enabled = false)
public class TestAtClassLevel {
	@Test(enabled = true)
	public void method1() {
		System.out.println("public method 1");

	}
	public void method2() {
		System.out.println("public method 2");

	}
	@Test(enabled = true)
	private void method3() {
		System.out.println("private method 1");
	}
	private void method4() {
		System.out.println("private method 2");
	}
	protected void method5() {
		System.out.println("protected method 1");
	}
	protected void method6() {
		System.out.println("protected method 2");
	}


}
