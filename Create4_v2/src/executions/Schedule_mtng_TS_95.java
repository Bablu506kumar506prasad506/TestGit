package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_95;
import jxl.Sheet;
import jxl.Workbook;

public class Schedule_mtng_TS_95 {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1, 0).getContents();
		String FirefoxBrowser = r1.getCell(1, 1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_162_164() throws Exception {

		TS_95 MSMetting = new TS_95();

		MSMetting.CRe4_162_164();

	}

	@Test
	public void CRe4_165_166_171() throws Exception {

		TS_95 MSMetting = new TS_95();

		MSMetting.CRe4_165_166_171();

	}

	@Test
	public void CRe4_167_168_169() throws Exception {

		TS_95 MSMetting = new TS_95();

		MSMetting.CRe4_167_168_169();

	}

	@Test
	public void CRe4_170() throws Exception {

		TS_95 MSMetting = new TS_95();

		MSMetting.CRe4_170();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
