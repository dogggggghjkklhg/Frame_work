package locatars1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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

public class Facebook10 {

	public static void main(String[]args) throws InterruptedException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/31.html");
		 
		 WebElement ele =driver.findElement(By.id("maruthi hotel"));
		 Select s = new  Select( ele);
 TreeSet<String> l1=  new   TreeSet<String>();
//	 ArrayList<String> l1= new  ArrayList<String> ();
//		 s.selectByIndex(1);
//		 Thread.sleep(2000);
//		 s.selectByVisibleText("Chicken Kabab");
//		 Thread.sleep(2000);
//		 s.deselectAll();
	List<WebElement> l =s.getOptions();
//	int count = l.size();
//	System.out.print(count);
	for (WebElement b : l) {
	String t= b.getText();
		 l1.add(t);
	
		
	}
//for (String b1 : l1) {
		System.out.print( l1);
		
			
//		}
//	if (l1.contains("Chicken Kabab")) {
//		
//		System.out.print( "yes");
//	}
//	else {
//		System.out.print( "no");
//		
//	}
	
         
		 
	
	}

		
	
	}
		

		


