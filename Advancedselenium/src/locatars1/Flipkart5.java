package locatars1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Flipkart5 {
	public static void main(String[]args)
	 {
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		List<WebElement> links= driver.findElements(By.xpath("//input[@type='checkbox']|//input[@type='radio']"));
	int	count =links.size();
	System.out.print("count");

	 
	 
	 } 
}