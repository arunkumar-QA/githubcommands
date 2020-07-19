package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxesExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//1.select the the java option
		driver.manage().window().maximize();
		WebElement langSelectJava=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		langSelectJava.click();
		Thread.sleep(5000);
		//2.confirm that selenium is selected
		WebElement seleniumCheckedConfirm=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/input"));
		boolean seleniumCheckedConfirmStatus= seleniumCheckedConfirm.isSelected();
		if(seleniumCheckedConfirmStatus==true)
		{
			System.out.println("selenium is selected");
			seleniumCheckedConfirm.click();
			Thread.sleep(5000);
		}
		else
		{
			System.out.println("selenium is Not selected");

		}
		//3.deselect the selected option
		WebElement first=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		boolean firstStatus=first.isSelected();
		System.out.println("firstStatus :"+firstStatus);
		if(firstStatus==true)
		{
			first.click();
		}
		WebElement second=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
		boolean secondStatus=second.isSelected();
		System.out.println("secondStatus :"+secondStatus);
//		if(second.isSelected())
//		{
//			second.click();
//			Thread.sleep(5000);
//		}
		if(secondStatus==true)
		{
			second.click();
			Thread.sleep(5000);
		}
		driver.close();
	}
}
