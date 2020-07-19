package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.co.in");
		driver.manage().window().maximize();
		// Added implicit wait of 10 seconds
		//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		String pageSource=driver.getPageSource();
		System.out.println("page url is"+url);
		System.out.println("page title is"+title);
		System.out.println("page source is"+pageSource);
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
		String elemType=searchBox.getTagName();
		System.out.println("tag name is"+elemType);

		//		System.exit(0);
		driver.quit();

	}

}
