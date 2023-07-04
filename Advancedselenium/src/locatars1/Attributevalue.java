package locatars1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Attributevalue {
	String key ="webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	List<WebElement> links= driver.findElements(By.xpath("//a"));
int	count =links.size();
System.out.print(count);

}
