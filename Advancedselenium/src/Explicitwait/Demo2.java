package Explicitwait;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pom.pom1;

public class Demo2 {
	public static void main(String[]args) throws InterruptedException, IOException
{
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
//		WebDriverWait w = new WebDriverWait(driver,10);
	driver.get("https://www.flipkart.com");
//	Thread.sleep(1000);
// WebElement	 ele1 =driver .findElement(By.xpath("//button[.='✕']"));
//	w.until(ExpectedConditions.visibilityOf(ele1));
//	 ele1.click();
// w.until(ExpectedConditions.titleContains("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
//	String  title	=  driver.getTitle();
//System.out.print( title);
//WebElement	 ele2 =driver .findElement(By.name("q"));
//ele2.getAttribute("placeholder");
//System.out.print(ele2.getAttribute("placeholder"));
//Point locn =ele2.getLocation();
//System.out.print( locn);
//int x=locn.getX();
//System.out.print(x);
//int y=locn.getY();
//System.out.print(y);
//System.out.print( driver.getTitle());

//w.until(ExpectedConditions.visibilityOf(ele2));
//ele2.sendKeys("realme mobile 5g13000");
//WebElement	 ele3 =driver .findElement(By.xpath("//button"));
//w.until(ExpectedConditions.visibilityOf(ele3));
//ele3.click();
////WebElement  ele4 =driver.findElement(By.xpath("//div[.='realme 10 Pro 5G (Nebula Blue, 128 GB)']"));
////w.until(ExpectedConditions.visibilityOf(ele4));
////ele4.click();
////w.until(ExpectedConditions.urlContains(""));
//// String ele5 =driver.getCurrentUrl();
//TakesScreenshot ts = (TakesScreenshot) driver;
//File src=ts.getScreenshotAs(OutputType.FILE);
//File dst = new File(".\\screenshot\\.jpeg");
////File dst = new File(".//screenshot//.jpeg");
//FileHandler.copy(src, dst);

}
}