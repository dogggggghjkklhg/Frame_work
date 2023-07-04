package locatars1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[]args)
	 {
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
//	List<WebElement> links	= driver.findElements(By.xpath("//a"));
//	int Count=links.size();
//	System.out.print("count");
	
		List<WebElement> image	= driver.findElements(By.xpath("//img"));
		int count  = image .size();
	System.out.print("count");
	 
	 
	 }
}