package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowserWindowsHandleExample {

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
		WebElement editButtonImage=	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
		editButtonImage.click();
		driver.close();
		
		System.out.println("Before");
		// the defaultContent() method move the focus to the Parent window(first window created by the driver)
//		driver.switchTo().defaultContent();
//		System.out.println("After");
		Thread.sleep(5000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);

		


		//2.no of windows including parent window
		WebElement secondButton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		secondButton.click();
		int numOfOpenedWIndows=driver.getWindowHandles().size();
		System.out.println("no of windows including parent window:"+numOfOpenedWIndows);

		//3.close all the windows except [arent window
		WebElement thirdButton=driver.findElement(By.id("color"));
		thirdButton.click();
		Set<String> allTheWindows=driver.getWindowHandles();
		for (String window : allTheWindows) {
			if(!parentWindow.equalsIgnoreCase(window))
			{
				driver.switchTo().window(window);
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.quit();
	}

}
