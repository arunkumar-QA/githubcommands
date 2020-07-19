package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); // Move focus to first frame in HTML
		WebElement firstIframeButton=driver.findElement(By.id("Click"));
		firstIframeButton.click();

		String buttonText=firstIframeButton.getText();
		System.out.println("Changed Text in Button"+buttonText);

		driver.switchTo().defaultContent();

		//2.Moveto Second Frame 

		driver.switchTo().frame(1); // Move focus to second frame in HTML
		driver.switchTo().frame("frame2");
		WebElement nestedFrameButton=driver.findElement(By.id("Click1"));
		nestedFrameButton.click();
		driver.switchTo().defaultContent();

		//3.find the number of frames 
		List<WebElement> nooffframes= driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames in Html is"+nooffframes.size());









		driver.quit();


	}

}
