package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\firebox\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		WebElement uploadButton=driver.findElement(By.xpath("//*[@id=\'mydiv\']/input"));
		System.out.println("Before");
		uploadButton.click();
		System.out.println("After");
		Thread.sleep(2000);
		driver.quit();
		String fileLocation="C:\\Users\\Arun kumar M\\Downloads\\testleaf.xlsx";
		StringSelection selection=new StringSelection(fileLocation);
		// the StringSelection class converts the java string into plain text format
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
		Thread.sleep(2000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(7000);
		driver.quit();
	}

}
