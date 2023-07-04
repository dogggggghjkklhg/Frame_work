package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Runner {
	@Test
	public void test1()
	 {
	String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new FirefoxDriver();
	driver.get("url");
	 pom1 p = new  pom1(driver);
	 p.login();
	 driver.navigate().refresh();
	 p.login();


}
}
