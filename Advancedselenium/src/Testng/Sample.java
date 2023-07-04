package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Sample extends General_script {
	@Test
	public void drag()
	 {
		 WebElement src	 =driver.findElement(By.id("box4"));
		WebElement des	 =driver.findElement(By.id("box102"));
			 Actions a = new Actions(driver);
			 a.dragAndDrop( src, des).perform();
			 
		 }
	@Test
	public void drag1()
	 {
		 WebElement src	 =driver.findElement(By.id("box4"));
		WebElement des	 =driver.findElement(By.id("box102"));
			 Actions a = new Actions(driver);
			 a.dragAndDrop( src, des).perform();
			 
		 }
		
	 }


