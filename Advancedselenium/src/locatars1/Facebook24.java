package locatars1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook24 {

	public static void main(String[]args) throws InterruptedException
	{ jse.executeScript("arguments[0].scrollIntoView(true);", ele);
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in");
WebElement ele	=driver.findElement(By.id("twotabsearchtextbox"));
ele.sendKeys("puma shoes for men");
driver.findElement(By.id("nav-search-submit-button"));

driver.findElement(By.xpath("(//input[type='submit'])"));
Thread.sleep(2000);


driver.findElement(By.xpath("(//div[class='a-section a-spacing-small puis-padding-left-micro puis-padding-right-micro'])"));

Point loc=ele.getLocation();
System.out.print(ele.getLocation());
System.out.print(loc.getX());
System.out.print(loc.getY());



//	JavascriptExecutor jse = (JavascriptExecutor) driver;
// jse.executeScript("window.scrollBy(390,5544)");
	
		
		 
	
		


		
	
	}
}
		

		


