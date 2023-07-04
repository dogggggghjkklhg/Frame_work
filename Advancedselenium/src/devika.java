

package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class devika
{
	public static void main(String[]args)
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		webDriver driver= new chromeDriver();
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/a.html");
		driver.findelement(By.tagName("a")).click();
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/a.html");
		driver.findelement(By.id("a1")).click();
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/a.html");
		driver.findelement(By.className("c1")).click();
	}
}