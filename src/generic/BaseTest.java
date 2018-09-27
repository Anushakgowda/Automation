package generic;

import java.io.File;
//import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
@Listeners(Result.class)
public abstract class BaseTest implements IAutoConstant
{
	public WebDriver driver;
	public String url=Utility.getPropertyValue(CONFIG_PATH, "URL");
	public long duration=Long.parseLong(Utility.getPropertyValue(CONFIG_PATH,"ITO"));
	static
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		System.setProperty(GECKO_KEY,GECKO_VALUE);
	}
	
	
	@BeforeMethod
	public void openApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.close();
	}


}
