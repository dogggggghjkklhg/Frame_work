package locatars1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	String key ="webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	
driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='submit']")).click();

Alert a  =driver.switchTo().alert();

System.out.println(a.getText());

 a.accept();

}
