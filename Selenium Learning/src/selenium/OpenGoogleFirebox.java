package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\firebox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		System.out.println("Arun SOftware Tester");
//		driver.close();
		//driver.quit();
		driver.findElement(By.name("q")).sendKeys("Agni"+Keys.ENTER);
		driver.quit();


	}

}
