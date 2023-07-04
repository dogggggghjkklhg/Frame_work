package DATAPROVIDERRRR;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import selenium2.webDriver;

public class Demo {
//	@Test(dataProvider = "testData,testData1")
	@Test(dataProvider = "testData")
	public void demo(String fn,String ln) {
		System.setProperty("webdriver.gecko.driver", ".softwares/GeckoDriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id(fn)).sendKeys(fn);
		driver.findElement(By.id(ln)).sendKeys(ln);
//		driver.findElement(By.id("email")).sendKeys("devikamgowda@gmail.com");
//		driver.findElement(By.id("un")).sendKeys("devi");
		
		}
	@DataProvider(name = "testData")
	
	public Object[][] createData1() {
	 return new Object[][] {
	   { "devika", "mgowda" },
	   { "devikamgowda98@gmail.com", "8764537650"},
//	   { "devika", "mgowda" },
//	   { "devikamgowda98@gmail.com", "8764537650"},
  
	  
	 };
	 }
//			 @DataProvider(name = "testData1")
//		
//		public Object[][] createData2() {
//		 return new Object[][] {
//		   { "devika", "mgowda" },
//		   { "devikamgowda98@gmail.com", "8764537650"},
////		   { "devika", "mgowda" },
////		   { "devikamgowda98@gmail.com", "8764537650"},
		   
		  
//		 };

	}

