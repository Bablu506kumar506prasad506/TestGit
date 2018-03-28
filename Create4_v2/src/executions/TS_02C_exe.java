package executions;

import java.io.FileInputStream;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.global.methods.GlobalMethods;

import Scenario.TS_02C;
import jxl.Sheet;
import jxl.Workbook;

public class TS_02C_exe extends GlobalMethods {

	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}


	@Test
	public void CRe4_112_to_124() throws Exception {

		TS_02C Institute = new TS_02C();

		Institute.CRe4_112_to_124();

	}
	
	


	
	/*@AfterMethod
	public void tearDown() throws Exception {
		driver.close();

	}*/

}
