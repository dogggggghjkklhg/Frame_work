package locatars1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

public class Cbox {
	public static void main (String[] args)
	{
		String key ="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/12.html");
      List<WebElement> cbox	= driver.findElements(By.xpath("input[@type='checkbox']"));
   int  count = cbox.size();
   System.out.print(count);
   for (WebElement webElement : cbox) 
  {
   webElement.click();
}
//   for(int i=count;i>0;i--)
//   {
//	   WebElement webElement = cbox.get(i); 
//	   webElement.click(); 
//	   
//   }
	  
   
	}                              
}