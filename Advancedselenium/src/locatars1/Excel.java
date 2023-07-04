package locatars1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import javax.print.DocFlavor.STRING;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Excel{

	public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, IOException
	{ 
		
		FileInputStream fis = new FileInputStream("./excel/Book1.xlsx");
		 Workbook  book	=WorkbookFactory.create(fis);
	Sheet  sh	= book.getSheet("Sheet1");
	Row r=sh.getRow(0);
	Cell c	=r.getCell(0);
	String value = c.toString();
   System.out.print( value);
   Row r1=sh.getRow(1);
	Cell c1	=r.getCell(0);
	String value1 = c1.toString();
  System.out.print( value1);
   String key ="webdriver.gecko.driver";
	String value2="./softwares/GeckoDriver.exe";
	System.setProperty(key,value2);
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com");
   
    driver.findElement(By.id("email")).sendKeys(value);
	driver.findElement(By.id("pass")).sendKeys(value1);
	driver.findElement(By.name("login")).click();

		
	
	}
}
		

		


