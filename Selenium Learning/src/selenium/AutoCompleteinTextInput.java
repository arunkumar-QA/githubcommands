package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteinTextInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		WebElement textBox=driver.findElement(By.id("tags"));
		System.out.println("textBox is"+textBox);
		textBox.sendKeys("s");
		Thread.sleep(5000);

		List<WebElement> optionsList=driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li")); // /li
		//		int length=optionsList.size()-1;
		System.out.println(optionsList.size());
		for (WebElement webElement : optionsList) {
			if(	webElement.getText().equals("Web Services"))
			{
				webElement.click();
				Thread.sleep(5000);
				break;
			}

		}
		driver.quit();
	}

}
