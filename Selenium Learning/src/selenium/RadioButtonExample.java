package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		// 1.Relative x path (//) is starts from outer container
		//2.Absolute x path(/) is starts from root node(html/body/div...)
		WebElement unChecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[2]/input"));
		WebElement checked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean unCheckedStatus=unChecked.isSelected();
		boolean chekedStatus=checked.isSelected();
		System.out.println("unCheckedStatus is :"+unCheckedStatus);
		System.out.println("chekedStatu is :"+chekedStatus);
		
		WebElement below20=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[1]"));
		below20.click();
		Thread.sleep(5000);
		driver.close();// closes the current active window

	}

}
