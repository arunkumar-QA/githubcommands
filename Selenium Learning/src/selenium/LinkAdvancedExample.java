package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkAdvancedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		//1.Go to Home Page
		WebElement homePageLink=driver.findElement(By.linkText("Go to Home Page"));
		homePageLink.click();
		driver.navigate().back();
		//2.Find where am supposed to go without clicking me?
		WebElement findeHrefofLink=driver.findElement(By.partialLinkText("Find where am"));
		String hrefValue=findeHrefofLink.getAttribute("href");
		System.out.println(hrefValue);

		//3.Verify am I broken?
		WebElement brokenLinkCheck=driver.findElement(By.linkText("Verify am I broken?"));
		brokenLinkCheck.click();
		String title=driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Link is broken");
		}
		driver.navigate().back();
		//4.Go to Home Page (Interact with same link name)
		WebElement homePageLinkNew=driver.findElement(By.linkText("Go to Home Page"));
		homePageLinkNew.click();
		driver.navigate().back();

		//5.How many links are available in this page?
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int noofLinks=list.size();
		System.out.println("no of links in web page:"+noofLinks);
		driver.quit();

	}

}
