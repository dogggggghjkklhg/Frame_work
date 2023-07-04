package DATAPROVIDERS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook13 {
//	@Test(dataProvider = "testData")
//
//	public void disp(String fn,String ln,String email,String mobile, String subject,String adress)throws AWTException, InterruptedException 
//	{ 
//		String key ="webdriver.gecko.driver";
//		String value="./softwares/GeckoDriver.exe";
//		System.setProperty(key,value);
//		WebDriver driver= new FirefoxDriver();
//		driver.get("https://demoqa.com/");
//driver.findElement(By.id("firstName")).sendKeys(fn);
//Thread.sleep(1000);
//driver.findElement(By.id("lastName")).sendKeys(ln);
//Thread.sleep(1000);
//driver.findElement(By.id("userEmail")).sendKeys(email);
//Thread.sleep(1000);
//driver.findElement(By.id("userNumber")).sendKeys(mobile);
//Thread.sleep(1000);
//driver.findElement(By.id("currentAddress")).sendKeys("devika");	
//Thread.sleep(1000);
//
//}
//	@DataProvider(name = "testData")
//	
//	public Object[][] createData1() {
//	 return new Object[][] {
//	   { "devika", "mgowda" },
//	   { "devikamgowda98@gmail.com", "8764537650"},
//	  
//	 };
//	}
//		@DataProvider(name = "test2")
//		public Object[][] createData2() {
//		 return new Object[][] {
//	   { "saraswathi", "mgowda" },
//		   { "devikamgowda98@gmail.com", "8764537650"},
//	 };
//}
//}
@Test
public void disp2() {
	String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(null)
	
	
	
}
	
}
	
		


