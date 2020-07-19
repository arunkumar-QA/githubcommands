package guru99assesement;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FileUploadUsingSendKeys {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("E:\\html\\sample.html");
        Thread.sleep(5000);

        // check the "I accept the terms of service" check box
        driver.findElement(By.id("terms")).click();
        Thread.sleep(5000);


        // click the "UploadFile" button
        driver.findElement(By.name("send")).click();
        driver.quit();
        
        }
}
