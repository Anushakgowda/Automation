package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
//import java.sql.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility implements IAutoConstant
{
	public static String getPropertyValue(String path,String key)
	{
		String v="";
		try {
			Properties p=new Properties();
			p.load(new FileInputStream(path));
			v=p.getProperty(key);
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return v;
		
	}
	public static void writeResultToXl(String SUMMARY_Path,String sheet,int passcount,int failcount)
	{
	try 
	{
		FileInputStream fis=new FileInputStream(SUMMARY_Path);
		Workbook w = WorkbookFactory.create(fis);
		w.getSheet(sheet).getRow(1).getCell(0).setCellValue(passcount);
		w.getSheet(sheet).getRow(1).getCell(1).setCellValue(failcount);
		w.write(new FileOutputStream(SUMMARY_Path));
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	
	public static String getXlData(String path,String sheet ,int r ,int c)
	{

		String v="";
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			v=w.getSheet(sheet).getRow(r).getCell(c).toString();
			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return v;
		
	}
	public static int getXlRowCount(String path,String sheet)
	{
		int count=0;
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook w = WorkbookFactory.create(fis);
			count=w.getSheet(sheet).getLastRowNum();
			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		return count;
	}
	public static String getPhoto(WebDriver driver,String folder)
	{
		Date d= new Date();
		String dateTime = d.toString().replaceAll(":","_");
		String path =folder+"/"+dateTime+".png";
		
		try
		{
		TakesScreenshot t= (TakesScreenshot)driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest=new File(path);
		FileUtils.copyFile(src,dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return path;
		
	}

}
