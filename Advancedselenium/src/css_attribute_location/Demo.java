package css_attribute_location;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

SCRIPT IS CORRECT

public class Demo {
	String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new FirefoxDriver();

driver.get("https://www.flipkart.com");
	WebElement	 ele2 =driver .findElement(By.name("q"));
	//ele2.getAttribute("placeholder");
	//System.out.print(ele2.getAttribute("placeholder"));
	Point locn =ele2.getLocation();
	System.out.print( locn);
	int x=locn.getX();
	System.out.print(x);
	int y=locn.getY();
	System.out.print(y);

}
