package locatars1;





import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook7 {

	public static void main(String[]args) throws InterruptedException 
	{ 
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("http://uitestpractice.com/Students/Form");
//        driver.findElement(By.xpath("//input[@placeholder='Enter FirstName ']")).sendKeys("Devika");
//        driver.findElement(By.id("lastname")).sendKeys("Gowda");
//       driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
//	driver.findElement(By.xpath("(//input[@value='read']")).click();
	WebElement ele= driver.findElement(By.xpath("//select[@class='form-control dropdown-header']"));
//	WebElement e= driver.findElement(By.id("sel1"));
//	Select s = new Select(ele);
//	s.selectByValue("Bangladesh");
//	s.selectByIndex(2);

//  driver.findElement(By.id("datepicker")).sendKeys("05/08/2023");
// driver.findElement(By.id("datepicker")).click();
// driver.findElement(By.xpath("//a[.='8']")).click();
	 
//	 driver.findElement(By.xpath("//input[@class='form-control hasDatepicker']"));
//	 driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9449377158");
//	 driver.findElement(By.id("username")).sendKeys("devi");
//	 driver.findElement(By.xpath("//input[@type='email']")).sendKeys("devikamgowda1998@gmail.com");
	 driver.findElement(By.id("pwd")).sendKeys("devi");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[.='submit']")).click();
	 
	
	 
	
	

	}
}
	
		
		
		
		

		

		


