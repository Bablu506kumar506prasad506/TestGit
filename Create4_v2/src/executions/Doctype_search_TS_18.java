package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_18;
import jxl.Sheet;
import jxl.Workbook;

public class Doctype_search_TS_18 {

	@BeforeMethod
	public void beforeMethod() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1, 0).getContents();
		String FirefoxBrowser = r1.getCell(1, 1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test(priority = 1)
	public void CRe4_932_933_934_935_936() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_932_933_934_935_936();
	}

	@Test(priority = 2)
	public void CRe4_937() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_937();
	}

	@Test(priority = 3)
	public void CRe4_938() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_938();
	}

	@Test(priority = 4)
	public void CRe4_939() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_939();
	}

	@Test(priority = 5)
	public void CRe4_940() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_940();
	}

	@Test(priority = 6)
	public void CRe4_941() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_941();
	}

	@Test(priority = 7)
	public void CRe4_942() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_942();
	}

	@Test(priority = 8)
	public void CRe4_943() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_943();
	}

	@Test(priority = 9)
	public void CRe4_944() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_944();
	}

	@Test(priority = 10)
	public void CRe4_945() throws Exception {

		TS_18 SearchDocType = new TS_18();

		SearchDocType.CRe4_945();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}
}
