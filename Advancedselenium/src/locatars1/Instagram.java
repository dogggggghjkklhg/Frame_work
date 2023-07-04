package locatars1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[]args)
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("devikamgowda1998@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("devi@8659");
driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}

}
