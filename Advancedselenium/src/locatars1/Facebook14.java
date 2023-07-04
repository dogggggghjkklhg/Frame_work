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

public class Facebook14 {

	public static void main(String[]args) throws InterruptedException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 
		 WebElement ele = driver.findElement(By.xpath("(//button[.='Double-Click Me To See Alert'])"));
	      Actions a = new Actions(driver);
		 a.doubleClick( ele).perform();
		 Thread.sleep(3000);
	Alert act =driver.switchTo().alert();
	Thread.sleep(3000);
	String t= act.getText();
	Thread.sleep(3000);
	System.out.print(t);
	Thread.sleep(3000);
	act.accept();
	
		 
	
		


		
	
	}
}
		

		


