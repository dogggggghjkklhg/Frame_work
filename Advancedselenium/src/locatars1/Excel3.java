package locatars1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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

public class Excel3{

	public static void main(String[]args) throws InterruptedException, EncryptedDocumentException, IOException
	{ 
		
		FileInputStream fis = new FileInputStream("./excel/Book3.xlsx");
		 Workbook  book	=WorkbookFactory.create(fis);
	Sheet  sh	= book.getSheet("Sheet1");
	String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.amazon.com/");
   List<WebElement>  ele = driver.findElements(By.xpath("(//a"));
   for(int i=0;i< ele.size();i++ )
	
   { 
	   Row r=sh.createRow(i);
		Cell c	=r.createCell(0);
		WebElement ele2 = ele.get(i);
		String urls= ele2.getAttribute("href");
		 c.setCellValue(urls);
   }
	
	 
	}
}
		

		


