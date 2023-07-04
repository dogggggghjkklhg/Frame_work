package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelogin
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("belakina kavithe");
		driver.findElement(By.cssSelector("button[aria-label='Search']")).click();
		driver.findElement(By.cssSelector("div[class='ytp-inline-preview-controls']")).click();
		
	}

}
