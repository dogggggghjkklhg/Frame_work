package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tagname 



{
	public static void main(String[]args)
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.getCurrentUrl()
		driver.findElement(By.tagName("a")).click();
		
	}
}
		
