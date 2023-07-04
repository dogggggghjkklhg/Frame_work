package Explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[]args) throws InterruptedException
{
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver .findElement(By.xpath("//button[.='✕']")).click();	
		Thread.sleep(1000);
		driver .findElement(By.xpath("//span[.='Become a Seller']")).click();	
		Thread.sleep(1000);
		WebElement ele   =	driver .findElement(By.xpath("//span[.='How to Be a Seller?']"));

		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
ele.click();
}
}



