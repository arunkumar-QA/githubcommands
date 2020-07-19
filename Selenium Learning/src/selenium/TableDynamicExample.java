package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamicExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");			
		driver.manage().window().maximize();
//		driver.quit();
		//1.Get the count of number of columns in table
        List<WebElement> Columns=driver.findElements(By.tagName("th")); 
        int columnSize=Columns.size();
        System.out.println("Number of columns:"+columnSize);
		//1.Get the count of number of rows in table 
        List<WebElement> rows=driver.findElements(By.tagName("tr")); 
        int rowsSize=rows.size();
        System.out.println("Number of rows:"+rowsSize);
        //3.Get the progress value of 'Learn to interact with Elements'
        WebElement getPercent=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
        String percent=getPercent.getText();
        System.out.println("Percentage is"+percent);
//      4.Check the vital task for the least completed progress.
        List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
        List<Integer> numberList=new ArrayList<Integer>();
        for (WebElement webElement : allProgress) {
        String individual=webElement.getText().replace("%", "");
//        Integer.parseInt(individual);
        numberList.add(Integer.parseInt(individual));
		}
        System.out.println("Number List"+numberList);
        int smallValue=Collections.min(numberList);
        System.out.println(smallValue);
        String strvalue=Integer.toString(smallValue)+"%";
        
        String finalXpath="//td[normalize-space()="+"\""+strvalue+"\""+"]"+"//following::td[1]";
        System.out.println(finalXpath);
        WebElement check=driver.findElement(By.xpath("//td[normalize-space()="+"\""+strvalue+"\""+"]"+"//following::td[1]"));
//        System.out.println(check.getText());
        check.click();
        
//        Thread.sleep(5000);
//        driver.quit();

	}

}
