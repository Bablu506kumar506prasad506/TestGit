package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_105;
import jxl.Sheet;
import jxl.Workbook;

public class Cmpltdmtng_inMem_TS_105 {

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
	public void CRe4_378() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_378();
	}

	@Test
	public void CRe4_380() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_380();
	}

	@Test
	public void CRe4_381() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_381();
	}

	@Test
	public void CRe4_382() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_382();
	}

	@Test
	public void CRe4_383() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_383();
	}

	@Test
	public void CRe4_384() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_384();
	}

	@Test
	public void CRe4_387() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_387_388_389();
	}

	@Test
	public void CRe4_390() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_390();
	}

	@Test
	public void CRe4_391_392() throws Exception {

		TS_105 IECMemMTNG = new TS_105();

		IECMemMTNG.IECMembersMtg_CRe4_391_392();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
