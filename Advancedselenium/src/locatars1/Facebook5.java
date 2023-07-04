package locatars1;

import java.awt.AWTException;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class Facebook5 {

	public static void main(String[]args) throws AWTException, InterruptedException
	{ 

		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
//	 jse.executeScript("window.scrollBy(0,500)");
//	 jse.executeScript("window.scrollBy(0,-500)");
	 WebElement ele =driver.findElement(By.xpath("(//a[.='Amazon Ignite'])"));
	  jse.executeScript("arguments[0].scrollIntoView(true)", ele);
     
	
	
		 
		 
}

		
	
	}
		

		


