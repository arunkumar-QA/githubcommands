package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		WebElement excelDownloadLink=driver.findElement(By.linkText("Download Excel"));
		excelDownloadLink.click();
		Thread.sleep(5000);
		File file=new File("C:\\Users\\Arun kumar M\\Downloads");
		File allFiles[]=file.listFiles();
		for (File file2 : allFiles) {
			if(file2.getName().equals("testleaf.xlsx"))
			{
				System.out.println("File Is Downloaded Successfully");
				break;
			}
			
		}
		driver.quit();
	}
}
