package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class id
{
	public static void main(String[]args)
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/abc3.html");
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.className("C1")).click();
		//driver.findElement(By.tagName("a")).click();
		
		
	}
}