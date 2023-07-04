package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Runner_Script4 extends General_script {
	@Test
	public void login() throws InterruptedException
	 {
		
		Pom2 p2=new Pom2(driver);
		 p2.email1("devikamgowda1998@gmail.com");
		 Thread.sleep(20000);
		 p2.email2("devi@9568");
		 Thread.sleep(20000);
		 p2.email3();
		 
}
	
}