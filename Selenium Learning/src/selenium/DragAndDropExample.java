package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.id("droppable"));
		Actions mouseAction=new Actions(driver);
//		mouseAction.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).build().perform();
		mouseAction.dragAndDrop(dragElement, dropElement).build().perform();
		Thread.sleep(5000);
		driver.close();
		
	}

}
