package pom_script;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic_script.Base_Test;

public class Runnerclass extends Base_Test{
	@Test(dataProvider = "testData")
	public void disp( String d,String e)
	{
		driver.get("https://www.facebook.com");
		Login l = new Login(driver);
		l.email1(d);
		l.email2(e);
		l.email3();
		}
	@DataProvider(name = "testData")
	
	public Object[][] createData1() {
	 return new Object[][] {
	   { "devika", "mgowda" },
	   { "devikamgowda98@gmail.com", "8764537650"}

  
	  
	 };
}
}