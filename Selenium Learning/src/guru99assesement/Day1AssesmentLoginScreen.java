package guru99assesement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1AssesmentLoginScreen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		user.sendKeys("mngr272453");
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		password.sendKeys("ErarYpe");
		WebElement loginButton=driver.findElement(By.xpath("//input[@name='btnLogin']"));
		loginButton.click();
		String screenTitle=driver.getTitle();
		System.out.println("title is"+screenTitle);
		Thread.sleep(5000);
		driver.quit();

	}

}
