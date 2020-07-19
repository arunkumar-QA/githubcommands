package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		WebElement source=driver.findElement(By.xpath("//*[@id='sortable']/li[5]"));
		WebElement destination=driver.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		action.clickAndHold(source).moveToElement(destination).release(destination).build().perform();
		action.dragAndDrop(source, destination);
	}

}
