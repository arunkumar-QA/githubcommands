package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		//1.only give a value to the text field using id
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("arun@gmail.com");



		//		driver.findElement(By.id("email")).sendKeys("arun@gmail.com"+Keys.TAB);
		//2.append the value using x path
		WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("text"+Keys.TAB);	
		// //*[@id=\'contentblock\']/section/div[2]/div/div/input" relative x path
		// double slash relative single slash absolute

		// 3.get default value in text field
		WebElement getTextBox=driver.findElement(By.name("username"));
		String result=getTextBox.getAttribute("value");
		System.out.println(result);

		// 4.clear the default value
		WebElement clearBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearBox.clear();
		WebElement disabledBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean enabled=disabledBox.isEnabled();
		System.out.println(enabled);
	}

}
