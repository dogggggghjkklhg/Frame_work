package Testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook2 extends General_script {
	@Test
	public void demo1() {
		driver.findElement(By.id("email")).sendKeys("devikamgowda1998@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("devi@123");
		driver.findElement(By.name("login")).click();
  	  String  title	=driver.getTitle();
  	  System.out.print(title);
  	 Assert.assertEquals(title, "Log in to Facebook");
  	 System.out.print("1");
// 	 Assert.assertEquals(title, "Log "); title is not as actual result 
//	 System.out.print("devika"); this statement will not get executed
//  	 SoftAssert sa = new SoftAssert(); using this method
//  	 sa.assertEquals(title, "hello");title is not as actual result
//  	System.out.print("1");this statement will not get executed
//  	 
  	 
		
	
	}
}
