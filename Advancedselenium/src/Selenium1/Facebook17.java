package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test(groups ="launch" )
public class Facebook17 {

	public static void main(String[]args) throws InterruptedException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		 
		 WebElement ele = driver.findElement(By.xpath("(//span[.='right click me'])"));
	      Actions a = new Actions(driver);
		 a.contextClick(ele).perform();
		 
	
		


		
	
	}
}
		

		


