package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToDefaultContent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		//1.Click button to open home page in New Window
		// get the current window name
		String parentWindow=driver.getWindowHandle();
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();

		Set<String> allWindows=	driver.getWindowHandles();
		for (String newWindow : allWindows) {
			if(!parentWindow.equalsIgnoreCase(newWindow))
			{
				driver.switchTo().window(newWindow);
			}
		}
//		WebElement editButtonImage=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
//		editButtonImage.click();
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();


	}

}
