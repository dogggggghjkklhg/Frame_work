package locatars1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook3 {

	public static void main(String[]args)
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/26.html");
		
    
   WebElement ele =driver.findElement(By.xpath("//input[@name='uploadfile']"));
   ele.sendKeys("\"C:\\Users\\Devika M\\Desktop\\all assignment\"");
 
		
	}

		
	
	}
		

		


