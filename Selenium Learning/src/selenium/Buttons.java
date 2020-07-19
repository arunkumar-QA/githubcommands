package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/home.html");
		//0.just cliked the button
		WebElement btnScreenClick=driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/h5"));
		btnScreenClick.click();
		WebElement backtoHome=driver.findElement(By.id("home"));
		backtoHome.click();
		
		//1.fing the x,y coordinate of a button
		WebElement getButtonPosition=driver.findElement(By.id("position"));
//		Point xypoint=getButtonPosition.getLocation();
		Point xypoint=getButtonPosition.getLocation();
		System.out.println("xypont is:"+xypoint);

		
		int xvalue=xypoint.getX();
		int yvalue=xypoint.getY();
		System.out.println("X value is:"+xvalue+"Y valueis"+yvalue);
		
		//2.find the color of button
		
		
		WebElement colorButton=driver.findElement(By.id("color"));
		String bgcolor=colorButton.getCssValue("background-color");
		System.out.println("Backroun color of button is:"+bgcolor);
		//3.find the element height and width
		WebElement buttonSize=driver.findElement(By.id("size"));
		Dimension full=buttonSize.getSize();
		int height=full.getHeight();
		int width=full.getWidth();
		System.out.println("The height is:"+height+"The Width is"+width);

	}

}
