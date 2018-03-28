package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_142;
import jxl.Sheet;
import jxl.Workbook;

public class Schedule_meeting_mail_TS_142 {
	
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}


	@Test
	public void CRe4_150_151() throws Exception {

		TS_142 i1 = new TS_142();
		i1.CRe4_150_151();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
