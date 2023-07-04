package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import selenium2.webDriver;

public class General_script {
	public FirefoxDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		String key ="webdriver.gecko.driver";
		String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		 driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");

}
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
}
}