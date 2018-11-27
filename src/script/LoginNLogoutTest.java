package script;

import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class LoginNLogoutTest extends BaseTest
{
	@Test(priority=1,groups={"login","smoke"})
	public void testB()
	{
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);	
		String data=Utility.getXlData(INPUT_PATH, "LoginNLogoutTest", 1,0);
		String data1=Utility.getXlData(INPUT_PATH, "LoginNLogoutTest", 1,1);
		
		lp.enterUserName(data);
		lp.enterpPassword(data1);
		lp.ClickLogin();
		 
		hp.ClickLogout();
	}
}
