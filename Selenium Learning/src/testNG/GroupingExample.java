package testNG;

import org.testng.annotations.Test;

public class GroupingExample {

	// amazon has different types of mobile phones
	// execute testcases for only Realme and oppo
	@Test(groups = {"Apple"})
	public void apple1() {
		System.out.println("apple1 testing");
	}
	@Test(groups = {"Apple"})
	public void apple2() {
		System.out.println("apple2 testing");
	}
	@Test(groups ={"Moto"})
	public void moto1() {
		System.out.println("moto1 testing");
	}
	@Test(groups = {"Moto"})
	public void moto2() {
		System.out.println("moto2 testing");
	}
	@Test(groups = {"Vivo"})
	public void vivo1() {
		System.out.println("vivo1 testing");
	}
	@Test(groups = {"Vivo"})
	public void vivo2() {
		System.out.println("vivo2 testing");
	}
	@Test(groups = {"Lenovo"})
	public void lenovo1() {
		System.out.println("lenovo1 testing");
	}
	@Test(groups = {"Lenovo"})
	public void lenovo2() {
		System.out.println("lenovo2 testing");
	}










}
