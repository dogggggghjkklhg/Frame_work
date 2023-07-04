package locatars1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[]args)
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.com/");
		 driver.findElement(By.xpath("//span[.='10']")).click();
         driver.findElement(By.id("date-box")).click();
    }
}

		
		
		
		
		
		
		

		

		


