package Tesng2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


	
	public class demo extends General_script
	{
		@Test
	
		
		public void login2() 
		{
			driver.findElement(By.id("email")).sendKeys("devikamgowda1998@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("devi@123");
			driver.findElement(By.name("login")).click();

}
	
}