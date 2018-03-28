package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_102;
import jxl.Sheet;
import jxl.Workbook;

public class Upcmngmtng_in_CP_TS_102 {
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
	public void CRe4_317_318_319() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_317_318_319();
	}

	@Test
	public void CRe4_320() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_320();
	}

	@Test
	public void CRe4_321() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_321();
	}

	@Test
	public void CRe4_322() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_322();
	}

	@Test
	public void CRe4_323() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_323();
	}

	@Test
	public void CRe4_324() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_324();
	}

	@Test
	public void CRe4_333_334() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_333_334();
	}

	@Test
	public void CRe4_337_338() throws Exception {

		TS_102 IECMTNG = new TS_102();

		IECMTNG.IECMSMtg_CRe4_337_338();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
