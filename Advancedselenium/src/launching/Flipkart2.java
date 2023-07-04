package launching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart2 {
	String key ="webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.cssSelector("input[type='text']")).sendKeys("titan watch");
driver.findElement(By.cssSelector("butto[class='L0Z3Pu']")).click();
driver.findElement(By.cssSelector("div[class='_3kidJX']")).click();

driver.findElement(By.cssSelector("button[name='login']")).click();

}
