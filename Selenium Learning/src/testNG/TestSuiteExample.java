package testNG;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
//1.open google,yahooo,bing

public class TestSuiteExample {
	WebDriver driver;
	long startTime,endTime,total;
	@BeforeSuite
	public void launchBrowser() {
		long startTime=	System.currentTimeMillis();
		System.out.println("start time is"+startTime);
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void openGoogle() {
		driver.get("http://www.google.co.in");

	}
	@Test
	public void openBing() {
		driver.get("http://www.bing.com");
	}
	@Test
	public void openYahoo() {
		driver.get("http://www.yahoo.com");


	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		long endTime=	System.currentTimeMillis();
		System.out.println("end time is"+endTime);
		long total=endTime-startTime;
		System.out.println("totol time "+total);
	}

}
