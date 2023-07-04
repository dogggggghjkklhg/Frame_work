package locatars1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook25 {

	public static void main(String[]args) throws InterruptedException
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		 
		 driver.findElement(By.name("cusid")).sendKeys("abc");
		 driver.findElement(By.name("submit")).click();
	Alert a	= driver.switchTo().alert();
	System.out.print(a.getText());
	a.accept();

		


		
	
	}
}
		

		


