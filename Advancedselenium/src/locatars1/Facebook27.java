package locatars1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Facebook27 {

	public static void main(String[]args) throws InterruptedException, AWTException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("realme mobile 5g");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
	WebElement ele	=driver.findElement(By.xpath("//div[contains(@class, '_30jeq3')]"));
	Thread.sleep(1000);
String price	=ele.getText();
Thread.sleep(1000);
System.out.println("Price: " + price);
//		driver.findElement(By.xpath("//div[.='realme 10 Pro 5G (Nebula Blue, 128 GB)']")).click();
//		Thread.sleep(1000);
//		String p_id	= driver.getWindowHandle();
//		Thread.sleep(1000);
//		System.out.print( p_id);
//		Set<String> c_id=driver.getWindowHandles();
//		Thread.sleep(1000);   //div[contains(@class, '_30jeq3')]
//		System.out.print(c_id);
//		for (String s : c_id)
//		{
//			driver.switchTo().window(s);
//			Thread.sleep(1000);
//		driver.findElement(By.xpath("//button[@type='button']")).click();
//		
//			
//			
//			
//		}
//		ArrayList<String> a = new ArrayList<String>(c_id);
//		driver.switchTo().window(a.get(1));
//		driver.findElement(By.cssSelector("button[type='button']")).click();
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("8762109610");



	
		
		
		
		
         

		 
		 
	
		


		
	
	}
}
		

		


