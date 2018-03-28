package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_97;
import jxl.Sheet;
import jxl.Workbook;

public class Upcmngmtng_in_ms_TS_97 {

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
	public void CRe4_224_226() throws Exception {

		TS_97 MSUpcoming = new TS_97();

		MSUpcoming.CRe4_224_226();

	}

	@Test
	public void CRe4_227() throws Exception {

		TS_97 MSUpcoming = new TS_97();

		MSUpcoming.CRe4_227();

	}

	@Test
	public void CRe4_228() throws Exception {

		TS_97 MSUpcoming = new TS_97();

		MSUpcoming.CRe4_228();

	}

	@Test
	public void CRe4_229() throws Exception {

		TS_97 MSUpcoming = new TS_97();

		MSUpcoming.CRe4_229();

	}

	@Test
	public void CRe4_237_238_239() throws Exception {

		TS_97 MSUpcoming = new TS_97();

		MSUpcoming.CRe4_237_238_239();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
