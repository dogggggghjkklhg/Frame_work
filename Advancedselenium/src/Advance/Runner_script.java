package Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Runner_script 
{
	@Test
	public void login() throws InterruptedException 
	{
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoqa.com");
		Pom4 p=new Pom4(driver);
		p.firstname1();
		Thread.sleep(1000);
		p.lastname1();
		Thread.sleep(1000);
		p.email1();
		Thread.sleep(1000);
		p.radio1();
		Thread.sleep(1000);
		p.username1();
		Thread.sleep(1000);
		p.dob();
		Thread.sleep(1000);
		p.dob1();
		Thread.sleep(1000);
		p. subject1();
		Thread.sleep(1000);
		p. checkbox();
		Thread.sleep(1000);
		p. choose1();
		Thread.sleep(1000);
		p. adress1();

}
}
