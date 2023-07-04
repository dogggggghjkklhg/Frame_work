package Advance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(id="email")
	private WebElement un;
	@FindBy(id="pass")
	private WebElement pwd;
	@FindBy(name="login")
	private WebElement button;
	public Login (WebDriver driver) 
	{
		PageFactory.initElements( driver, this);
		
	}
	public void email1(String un1)
	{
		un.sendKeys(un1);
	
	}

public void email2(String pwd1)
{
	pwd.sendKeys(pwd1);

}
public void email3()
{
	 button	.click();
}
}


