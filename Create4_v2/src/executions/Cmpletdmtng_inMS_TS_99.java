package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_99;
import jxl.Sheet;
import jxl.Workbook;

public class Cmpletdmtng_inMS_TS_99 {

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
	public void CRe4_247() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_247();
	}

	@Test
	public void CRe4_249() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_249();
	}

	@Test
	public void CRe4_250() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_250();
	}

	@Test
	public void CRe4_252() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_252();
	}

	@Test
	public void CRe4_253() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_253_254();
	}

	@Test
	public void CRe4_256() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_256_257();
	}

	@Test
	public void CRe4_259() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_259_260();
	}

	@Test
	public void CRe4_262() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_262();
	}

	@Test
	public void CRe4_263() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_263();
	}

	@Test
	public void CRe4_264() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_264();
	}

	@Test
	public void CRe4_265() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_265();
	}

	@Test
	public void CRe4_266() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_266();
	}

	@Test
	public void CRe4_267() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_267();
	}

	@Test
	public void CRe4_268() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_268();
	}

	@Test
	public void CRe4_269() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_269();
	}

	@Test
	public void CRe4_270() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_270();
	}

	@Test
	public void CRe4_271() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_271();
	}

	@Test
	public void CRe4_272() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_272();
	}

	@Test
	public void CRe4_273() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_273();
	}

	@Test
	public void CRe4_274() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_274();
	}

	@Test
	public void CRe4_275() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_275();
	}

	@Test
	public void CRe4_276() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_276();
	}

	@Test
	public void CRe4_277() throws Exception {

		TS_99 MSMtngCompleted = new TS_99();

		MSMtngCompleted.IECMSMtgCompleted_CRe4_277_278();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
