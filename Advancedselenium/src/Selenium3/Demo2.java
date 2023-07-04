package Selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
public void disp()
{
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		 
	WebElement src	 =driver.findElement(By.id("box4"));
	WebElement des	 =driver.findElement(By.id("box102"));
		 Actions a = new Actions(driver);
		 a.dragAndDrop( src, des).perform();
		
		
		
		
		
		
}

}
