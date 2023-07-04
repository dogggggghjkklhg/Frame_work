package locatars1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook4 {

	public static void main(String[]args)
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();	
	    driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button[.='✕'])")).click();
		 WebElement ele =driver.findElement(By.xpath("(//div[.='Fashion'])[2]"));
         Actions act = new Actions(driver);
         act.moveToElement(ele).perform();
		
	}

		
	
	}
		

		


