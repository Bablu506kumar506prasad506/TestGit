package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_22;
import jxl.Sheet;
import jxl.Workbook;

public class Ethic_add_TS_22 {

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
	public void CRe4_1064_65() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1064_65();

	}

	@Test
	public void CRe4_1066_1067() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1066_1067();

	}

	@Test
	public void CRe4_1070_71_1085_80_to_85() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1070_71_1085_80_to_85();

	}

	@Test
	public void CRe4_1077() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1077();

	}

	@Test
	public void CRe4_1078() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1078();

	}

	@Test
	public void CRe4_1079() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1079();

	}

	@Test
	public void CRe4_1080() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1080();

	}

	@Test
	public void CRe4_1095_to_1100_1101_1102() throws Exception {

		TS_22 IECEthicCom = new TS_22();

		IECEthicCom.CRe4_1095_to_1100_1101_1102();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
