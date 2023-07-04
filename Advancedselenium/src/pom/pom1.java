package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 {
	@FindBy(xpath = "//a[.='login']")
	private WebElement login;
	
	public pom1 (WebDriver driver) {
		PageFactory.initElements( driver, this);
		
	}
	 public void login() {
		 login.click();
		 
	 }
	

}
