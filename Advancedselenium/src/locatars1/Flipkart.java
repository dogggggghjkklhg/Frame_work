package locatars1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {public static void main(String[]args)
{ 
	String key ="webdriver.chrome.driver";
	String value="./softwares/chromedriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@type ='text']")).sendKeys("titan watch");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.findElement(By.xpath("//a[@class='IRpwTa']")).click();
	//driver.findElement(By.xpath("//div[@data-id=SHOGJVM9GFGAAMHE']")).click();
	//driver.findElement(By.xpath("//div[@class='aMaAEs']")).click();
	driver.findElement(By.xpath("//div[@class='_312yBx SFzpgZ']")).click();
driver.findElement(By.xpath("//li[@class='col col-6-12']")).click();
//driver.findElement(By.xpath("//button[@type='']")).click();


}

}




