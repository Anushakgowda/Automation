package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pumaPage
{
	public WebDriver driver;
	@FindBy(xpath="//a[@class='digimeg-nav-item']")
	private WebElement menu;
	
	@FindBy(xpath="//p[@class='category-title2']")
	private WebElement subMenu; 
	
	public pumaPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void getMenu()
{
	Actions a=new Actions(driver);
	a.moveToElement(menu);
	menu.getText();
	subMenu.getText();
	
	
	
	
}
	
	
	
	
	
	
}
