package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableCTRLPLUSELEMNTSExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();

		List<WebElement> orderList=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		int listSize=orderList.size();
		System.out.println(listSize);
		//1.first method
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(orderList.get(0))
		.click(orderList.get(1))
		.click(orderList.get(2)).build().perform();
		action.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		// my shortcut
//		Actions action=new Actions(driver);
//		action.click(orderList.get(0));
//		action.keyDown(Keys.CONTROL)
////		.click(orderList.get(0))
//		.click(orderList.get(1))
//		.click(orderList.get(2)).build().perform();
//		action.keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(5000);

		//2.second method
//		Actions action1=new Actions(driver);
//		action1.clickAndHold(orderList.get(0));
//		action1.clickAndHold(orderList.get(1));
//		action1.clickAndHold(orderList.get(2));
//		action1.build().perform();
//		Thread.sleep(5000);

		

		driver.quit();

	}

}
