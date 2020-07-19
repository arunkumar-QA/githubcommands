package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
//		//1.Alert Box(Ob button only)
//		WebElement alertBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
//		alertBox.click();
//		// Moving control from window(driver) to alertBox
//		Alert alert=driver.switchTo().alert();
//		Thread.sleep(5000);
//		alert.accept();
//		//2.Confirm Box(OK and CANCEL)
//		WebElement confirmBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
//		confirmBox.click();
//		// Moving control from window to alertBox
//		Alert confirmAlert=driver.switchTo().alert();
//		Thread.sleep(5000);
//		confirmAlert.dismiss();
//		//3.Propmpt Box
//		WebElement promptBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
//		promptBox.click();
//		Alert propmptBoxAlert=driver.switchTo().alert();
//		propmptBoxAlert.sendKeys("Arun kumar");
//		Thread.sleep(5000);
//		propmptBoxAlert.accept();
//		Thread.sleep(5000);
		WebElement diffokbutton=driver.findElement(By.id("btn"));
		diffokbutton.click();
		Thread.sleep(5000);
		Alert diff=driver.switchTo().alert();
		diff.accept();
		driver.quit();
		

		


	}

}
