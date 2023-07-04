package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Demo1 {
	public static void main(String[]args) 
	{
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		WebDriverWait w = new WebDriverWait(driver, 10);
	WebElement ele1	=driver.findElement(By.xpath("//button[.='✕']"));
	w.until(ExpectedConditions.visibilityOf(ele1));
	ele1.click();
	String title	= driver.getTitle();
	Assert.assertEquals(title, "hello");
	
		
	}

}
