package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown1=driver.findElement(By.id("dropdown1"));
		// seperate Select class is available in selenium to handle dropdown
	
		Select select=new Select(dropdown1);
//		boolean mulipleOptions= select.get
		//1.selectByIndex2.selectByValue3.selectByVisibleText
		select.selectByIndex(4);
		//        Thread.sleep(5000);
		select.selectByValue("2");
		//        Thread.sleep(5000);
		select.selectByVisibleText("Selenium");
		
		//        Thread.sleep(5000);
		// <WebElement> Generics indicate type of data
		List<WebElement> list=select.getOptions();
		int numberOfOptions=list.size();
		System.out.println("size is"+numberOfOptions);
//		Thread.sleep(5000);
		dropdown1.sendKeys("Loadrunner");
		// multiple select in dropdown
		WebElement multiSelect=driver.findElement(By.
				xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiSelectBox=new Select(multiSelect);
		multiSelectBox.selectByIndex(1);
		multiSelectBox.selectByIndex(2);
		multiSelectBox.selectByIndex(3);
		driver.quit();
	}

}
