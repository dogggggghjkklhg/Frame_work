package selenium;

import org.openqa.selenium.By;

public class tagname {
	{
		public static void main(String[]args)
		{ 
			String key ="webdriver.chrome.driver";
			String value="./softwares/chromedriver.exe";
			System.setProperty(key,value);
			webDriver driver= new chromeDriver();
			driver.get("file:///C:/Users/Devika%20M/Desktop/requirements/a.html");
			driver.findelement(By.tagName("a")).click();
			
		}
	}
}
