package locatars1;

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
import org.openqa.selenium.support.FindBy;



public class DDT1  {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	String key ="webdriver.gecko.driver";
	String value="./softwares/GeckoDriver.exe";
	System.setProperty(key,value);
	WebDriver driver= new FirefoxDriver();
		FileInputStream file = new	FileInputStream("./Excel/Book1.xlsx");
		Workbook book	= WorkbookFactory.create(file);
		Sheet sheet = book.getSheet("Sheet1");
		Row row=sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.print(cell.toString());
	
		

	}

}
