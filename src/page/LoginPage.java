package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBTN;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterpPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void ClickLogin()
	{
		LoginBTN.click();
	}


}
