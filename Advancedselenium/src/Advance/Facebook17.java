package Advance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook17 {
@Test

	public void disp() throws InterruptedException
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
		

		


