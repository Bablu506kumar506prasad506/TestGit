package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_103;
import jxl.Sheet;
import jxl.Workbook;

public class Cmpltdmtng_inCP_TS_103 {

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
	public void CRe4_340() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_340();
	}

	@Test
	public void CRe4_342() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_342();
	}

	@Test
	public void CRe4_343() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_343();
	}

	@Test
	public void CRe4_344() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_344();
	}

	@Test
	public void CRe4_345() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_345();
	}

	@Test
	public void CRe4_346() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_346();
	}

	@Test
	public void CRe4_347() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_347();
	}

	@Test
	public void CRe4_349_350() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.IECChairpersonMtg_CRe4_349_350();
	}
	
	@Test
	public void CRe4_353_354() throws Exception {

		TS_103 IECChairMTNG = new TS_103();

		IECChairMTNG.CRe4_353_354();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
