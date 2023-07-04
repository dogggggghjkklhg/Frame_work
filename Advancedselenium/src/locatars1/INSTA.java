package locatars1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INSTA 
{

	String key ="webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("devikamgowda1998@gmail.com");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("devi@8659");
driver.findElement(By.xpath("//button[@name='login']")).click();

}
