package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {
	
	// passing parameters or arguments to the test cases from testNG.xml file at runTime
	@Test
	@Parameters({"Name","Age"})
	public void printName(String Name,String Age) {
		System.out.println("Name is"+Name);
		System.out.println("Age is"+Age);

		
	}

}
