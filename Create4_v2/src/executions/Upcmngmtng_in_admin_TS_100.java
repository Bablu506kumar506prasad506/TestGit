package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.create4.scenarios.TS_100;
import com.global.methods.GlobalMethods;

import jxl.Sheet;
import jxl.Workbook;

public class Upcmngmtng_in_admin_TS_100 {

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
	public void CRe4_279_280_281() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_279_280_281();
	}

	@Test
	public void CRe4_283() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_283();
	}

	@Test
	public void CRe4_284() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_284();
	}

	@Test
	public void CRe4_285() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_285();
	}

	@Test
	public void CRe4_286() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_286();
	}

	@Test
	public void CRe4_293_294_295() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_293_294_295();
	}

	@Test
	public void CRe4_296() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_296();
	}

	@Test
	public void CRe4_298_299_300() throws Exception {

		TS_100 IECUpcomingMTNG = new TS_100();

		IECUpcomingMTNG.CRe4_298_299_300();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
