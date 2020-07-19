package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/tooltip.html");		
		driver.manage().window().maximize();
		WebElement inputToolTip=driver.findElement(By.id("age"));
		String tooltipText=inputToolTip.getAttribute("title");
		System.out.println("tooltip is:"+tooltipText);
		driver.quit();


	}

}
