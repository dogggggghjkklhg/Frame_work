package locatars1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

import selenium2.webDriver;

public class Facebook9{

public static void main(String[]args) throws AWTException, IOException
{ 
		String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
		System.setProperty(key,value);
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.com");
		TakesScreenshot ts=(TakesScreenshot) driver;
	File src =ts.getScreenshotAs(OutputType.FILE);
	File dst= new File("\"C:\\Users\\Devika M\\Desktop\\screenshot\".jpeg");
FileHandler.copy(src,dst);
	
}
}



		

		


