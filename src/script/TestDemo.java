package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.LoginPage;

public class TestDemo extends BaseTest
{
	@Test
	public void testA()
	{
		String data=Utility.getXlData(INPUT_PATH, "sheet1", 0,0);
		Reporter.log("Data:"+data,true);
		
		int r=Utility.getXlRowCount(INPUT_PATH, "sheet1");
		Reporter.log("Row:"+r,true);
		
		
		
	}

}
