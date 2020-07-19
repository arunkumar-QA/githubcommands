package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementCheck {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");		
		driver.manage().window().maximize();
		WebElement first=driver.findElement(By.id("email"));
		first.sendKeys("arun@gmail.com");
		Actions action=new Actions(driver);
		WebElement targetMoveTo=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		Action sample=action.moveToElement(targetMoveTo).click().sendKeys("testing").build();
		sample.perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
