package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class InvalidLoginTest extends BaseTest
{
	@Test(priority=1,groups={"login","smoke"})
	public void testB() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
			
		String data=Utility.getXlData(INPUT_PATH, "InvalidLoginTest", 1,0);
		String data1=Utility.getXlData(INPUT_PATH, "InvalidLoginTest", 1,1);
		
		lp.enterUserName(data);
		lp.enterpPassword(data1);
		lp.ClickLogin();
		Thread.sleep(2000);
	}
}
