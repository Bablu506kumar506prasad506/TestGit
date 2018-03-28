package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_24;
import jxl.Sheet;
import jxl.Workbook;

public class Ethic_Update_TS_24 {

	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test
	public void CRe4_1105() throws Exception {

		TS_24 IECEthicComEdit = new TS_24();

		IECEthicComEdit.CRe4_1105();
	}

	@Test
	public void CRe4_1106() throws Exception {

		TS_24 IECEthicComEdit = new TS_24();

		IECEthicComEdit.CRe4_1106();
	}

	@Test
	public void CRe4_1108() throws Exception {

		TS_24 IECEthicComEdit = new TS_24();

		IECEthicComEdit.CRe4_1108();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
