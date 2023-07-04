package Lang;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube3
{
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("belakina kavithe");
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		driver.findElement(By.cssSelector("a[id='video-title']")).click();
		
		


	}
	
		
}
