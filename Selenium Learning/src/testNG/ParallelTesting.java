package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	//WebDriver driver;
	@Test
	public void openGoogle() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		driver.quit();


	}
	@Test
	public void openBing() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver	driver=new ChromeDriver();
		driver.get("http://www.bing.com");
		Thread.sleep(5000);
		driver.quit();
	}

}
