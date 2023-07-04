package locatars1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube2 {


	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("span[id='video-title']")).click();
		


	}
	
		
}