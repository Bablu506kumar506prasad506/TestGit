package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_16;
import jxl.Sheet;
import jxl.Workbook;



public class Doctype_add_TS_16 {

	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test(priority = 1)
	public void CRe4_959_960() throws Exception {

		TS_16 AddDocType = new TS_16();

		AddDocType.CRe4_959_960();
	}

	@Test(priority = 2)
	public void CRe4_960_a_961() throws Exception {

		TS_16 AddDocType = new TS_16();

		AddDocType.CRe4_960_a_961();
	}

	@Test(priority = 3)
	public void CRe4_961_a_962() throws Exception {

		TS_16 AddDocType = new TS_16();

		AddDocType.CRe4_961_a_962();
	}
	@Test(priority = 4)
	public void CRe4_961_b() throws Exception {

		TS_16 AddDocType = new TS_16();

		AddDocType.CRe4_961_b();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
