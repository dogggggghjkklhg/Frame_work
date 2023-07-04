package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Runner_Script5 extends General_script {
	@Test
	public void login1() throws InterruptedException
	 {
		driver.get("http://www.facebook.com");
		Pom2 p2=new Pom2(driver);
		 p2.email1("devikamgowda1998@gmail.com");
		 Thread.sleep(20000);
		 p2.email2("devi@9568");
		 Thread.sleep(20000);
		 p2.email3();
		 
		 
}
	 @Test
	public void flipkart() throws InterruptedException
	 {
		 driver.get("http://www.flipkart.com");
		Pom4 p4=new Pom4(driver);
		 p4.loginbtn();
		 Thread.sleep(20000);
		 p4.searchtextfield("realme mobile 5g");
		 Thread.sleep(20000);
		p4.button1();
		
		 
}
	
}