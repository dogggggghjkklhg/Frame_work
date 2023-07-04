package Advance;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class disp{
	@FindBy(id = "firstName")
	private WebElement firstname;
	@FindBy(id="lastName")
	private WebElement lastname;
	@FindBy(id="userEmail" )           
	private WebElement email;
	@FindBy (xpath = "//input[value='Female']")     
	private WebElement radio;
	@FindBy(id=" userNumber" )           
	private WebElement username;
	@FindBy(id="dateOfBirthInput" )           
	private WebElement dateofbirth;
	@FindBy(xpath = "//div[.='7']")           
	private WebElement date;
	@FindBy (id="subjectsContainer" )             
	private WebElement subject;
	@FindBy(id="hobbies-checkbox-3" )           
	private WebElement music;
	@FindBy(id="uploadPicture " )           
	private WebElement choose;
	@FindBy(id="currentAddress " )           
	private WebElement adress;
	
	public disp (WebDriver driver) 
	{
		PageFactory.initElements( driver, this);
		
	}
	public void firstname1 ()
	{
		firstname.sendKeys("devika");

}
	public void lastname1()
	{
		lastname.sendKeys("mgowda");

}
	public void email1()
	{
		email.sendKeys("devikamgowda1998@gmail.com");
	

}
	public void radio1()
	{
		radio.click();
	

}
	public void username1()
	{
		username.sendKeys("9449377158");
	

}
	public void dob()
	{
		dateofbirth	.click();
	

}
	public void dob1()
	{
		date.click();
	

}
	public void subject1()
	{
		subject.sendKeys("hellooooo");
	

}
	public void checkbox()
	{
		music.click();
	

}
	public void choose1()
	{
		choose.sendKeys("\"C:\\Users\\Devika M\\Desktop\\interface\"");
	

}
	public void adress1()
	{
		adress.sendKeys("\"C:\\Users\\Devika M\\Desktop\\interface\"");
	

}
	
}






}
