package locatars1;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[]args) throws InterruptedException
	{ 
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		Dimension d = new Dimension(100,200);
		Thread.sleep(2000);
		driver.manage().window().setSize(d);
		Point p = new Point(100, 100);
		driver.manage().window().setPosition(p);
		Thread.sleep(2000);
//    driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc");
//    Thread.sleep(2000);
//    driver.findElement(By.xpath("//input[@name='submit']")).click();
//    Thread.sleep(2000);
//  Alert a  = driver.switchTo().alert();
//  Thread.sleep(2000);
//	System.out.println(a.getText());
//	Thread.sleep(2000);
//	 a.accept();
		
	}
	
		
		
		
		
		
		
		

		
	
	}
		

		


