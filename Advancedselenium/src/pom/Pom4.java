package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom4 {
	@FindBy(xpath = "//button[.='✕']")
	private WebElement login;
	@FindBy(name="q")
	private WebElement search;
	@FindBy(xpath ="//button[@type='submit']" )
	private WebElement button;
	
	
	public Pom4 (WebDriver driver) 
	{
		PageFactory.initElements( driver, this);
		
	}
	public void loginbtn()
	{
		login.click();

}
	public void searchtextfield(String search1)
	{
		search.sendKeys(search1);

}
	public void button1()
	{
		button.click();
	

}
}




