package locatars1;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DDT
{
public static void main(String[]args) throws InterruptedException, AWTException, EncryptedDocumentException, IOException
{ 
	String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new FirefoxDriver();
	FileInputStream file = new	FileInputStream("./Excel/Book1.xlsx");
Workbook book	= WorkbookFactory.create(file);
Sheet sheet = book.getSheet("Sheet1");
Row row=sheet.getRow(0);
Cell cell = row.getCell(0);
 String res1=cell.toString();
 Row row1=sheet.getRow(1);
 Cell cell1 = row.getCell(0);
  String res2=cell.toString();
	WebElement un =driver.findElement(By.id("email"));
	un.sendKeys(res1);
	WebElement pwd =driver.findElement(By.id("pass"));
	un.sendKeys(res2);
	WebElement button =driver.findElement(By.name("login"));
	button.click();
	
	
	
  
  

}
}