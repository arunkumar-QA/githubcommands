package testNG;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExpectedExceptionAttribute {
	//1.base class has more strength
	//2.derived class has less strength
    @Test(expectedExceptions = { Exception.class })  
    public void exceptionTestOne() throws Exception {
        throw new IOException();
    }
 
    @Test(expectedExceptions = { IOException.class, NullPointerException.class })
    public void exceptionTestTwo() throws Exception {
        throw new Exception();
    }


}
