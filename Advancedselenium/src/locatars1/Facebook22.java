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

public class Facebook22 {

	public static void main(String[]args) throws InterruptedException, AWTException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://vtu.ac.in/");
          driver.findElement(By.xpath("(//span[.='Online Fee Payment'])")).click();
          driver.findElement(By.xpath("(//span[.='SSP'])")).click();
          driver.findElement(By.xpath("(//span[.='eDDTS'])")).click();
          driver.findElement(By.xpath("(//span[.='NIRF'])")).click();

        String p_id	= driver.getWindowHandle();
	      System.out.print( p_id);
	Set<String> s	= driver.getWindowHandles();
	ArrayList<String> t = new ArrayList<String>( s);
    driver.switchTo().window(t.get(2));
    driver.findElement(By.name("username")).sendKeys("4RA16CV031");



		 
		 
	
		


		
	
	}
}
		

		


