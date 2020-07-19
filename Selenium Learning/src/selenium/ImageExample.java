package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		driver.manage().window().maximize();

		WebElement firstImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		firstImage.click();
		Thread.sleep(5000);
		driver.get("http://www.leafground.com/pages/Image.html");

		WebElement brokenImage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));

		// the naturalWidth property value of image is 0 it is broken image
		if(brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Broken Image");
		} else {
			System.out.println("NotBroken Image");

		}


	}

}
