package generic_script;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_const1{
	public FirefoxDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		
		System.setProperty(geko_key,geko_value);
		 driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		driver.get(" base_url");

}
	@AfterMethod
	public void closeAppln(ITestResult res)
	
	{
		if(ITestResult.FAILURE=res.getStatus())
		
		{
			Screenshot.getPhoto(driver);
	}
	
		driver.close();
}

}	


