package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_104;
import jxl.Sheet;
import jxl.Workbook;

public class Upcmngmtng_inMem_TS_104 {

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
	public void CRe4_355_356() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_355_356();
	}

	@Test
	public void CRe4_357() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_357_358();
	}

	@Test
	public void CRe4_360() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_360();
	}

	@Test
	public void CRe4_361() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_361();
	}

	@Test
	public void CRe4_362() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_362();
	}

	@Test
	public void CRe4_367() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_367();
	}

	@Test
	public void CRe4_368() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_368();
	}

	@Test
	public void CRe4_369_373() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_369_370_371_373();
	}

	@Test
	public void CRe4_375_376() throws Exception {

		TS_104 IECMemMTNG = new TS_104();

		IECMemMTNG.IECMembersMtg_CRe4_375_376();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
