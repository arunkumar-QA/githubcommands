package selenium;

import java.time.DayOfWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");			
		driver.manage().window().maximize();
		WebElement dataPicker=driver.findElement(By.id("datepicker"));
		dataPicker.click();
//		dataPicker.sendKeys("10/06/1997"+Keys.ENTER);
//		driver.quit();
		// //*[@id="ui-datepicker-div"]/div/a[2]/span
		WebElement next=driver.findElement(By.xpath("//a[@title='Next']"));
		next.click();
		// //*[@id="ui-datepicker-div"]/table/tbody/tr[3]/td[2]/a
		WebElement date=driver.findElement(By.xpath("//a[contains(text(),10)]"));
		date.click();
		
	}

}
