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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook16 {

	public static void main(String[]args) throws InterruptedException, AWTException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
         WebElement ele = driver.findElement(By.xpath("(//a[.='ಕನ್ನಡ'])"));
         Actions a = new Actions(driver);
         a.contextClick(ele).perform();
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_T);
		 r.keyRelease(KeyEvent.VK_T);
        
	String p_id	= driver.getWindowHandle();
	System.out.print( p_id);
	Set<String> s	= driver.getWindowHandles();

	System.out.print(s) ;
	for(String s1:s)
	{
	driver.switchTo().window(s1);

	
String t	=driver.getTitle();
System.out.print( s);
	}
	
	
//	THIS IS ANOTHER METHOD
	
	
	ArrayList<String> t = new ArrayList<String>( s);
	driver.switchTo().window(t.get(1));

//	for (String s1 : s) 
//	{
//	driver.switchTo().window(t.get(1));
	
//		System.out.print( s);
//		driver.switchTo().window(s1);
//		if ( s.equals( p_id)) 
//		{
//			driver.close();
//		
//		}
//		
		
//	t}

		 
		 
	
		


		
	
	}
}
		

		


