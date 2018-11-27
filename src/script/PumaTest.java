package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import page.pumaPage;

public class PumaTest extends BaseTest {
	@Test
	public void test()
	{
		pumaPage puma=new pumaPage(driver);
		puma.getMenu();
		
	}

}
