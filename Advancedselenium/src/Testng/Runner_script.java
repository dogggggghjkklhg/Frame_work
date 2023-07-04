package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Runner_script extends General_script
{
	@Test
	public void login() 
	{
		driver.findElement(By.id("email")).sendKeys("devikamgowda1998@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("devi@123");
		driver.findElement(By.name("login")).click();

}
}
