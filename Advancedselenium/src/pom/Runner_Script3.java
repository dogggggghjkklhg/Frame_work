package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Runner_Script3 {
	@Test
	public void login() throws InterruptedException
	 {
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://wwww.facebook.com");
		Pom2 p2=new Pom2(driver);
		 p2.email1("devikamgowda1998@gmail.com");
		 Thread.sleep(20000);
		 p2.email2("devi@9568");
		 Thread.sleep(20000);
		 p2.email3();
		 
}
}