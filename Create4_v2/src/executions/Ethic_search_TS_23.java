package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import GlobalMethod.GlobalMethods;
import Scenario.TS_23;
import jxl.Sheet;
import jxl.Workbook;

public class Ethic_search_TS_23 {
	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test(priority = 42)
	public void CRe4_1056() throws Exception {

		TS_23 IECEthicCom = new TS_23();

		IECEthicCom.CRe4_1056();
	}

	@Test(priority = 43)
	public void CRe4_1057() throws Exception {

		TS_23 IECEthicCom = new TS_23();

		IECEthicCom.CRe4_1057();
	}

	@Test(priority = 44)
	public void CRe4_1058() throws Exception {

		TS_23 IECEthicCom = new TS_23();

		IECEthicCom.CRe4_1058_1060_1061();
	}

	@Test(priority = 45)
	public void CRe4_1059() throws Exception {

		TS_23 IECEthicCom = new TS_23();

		IECEthicCom.CRe4_1059();
	}

	@Test(priority = 46)
	public void CRe4_1062() throws Exception {

		TS_23 IECEthicCom = new TS_23();

		IECEthicCom.CRe4_1062_1063();
	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
