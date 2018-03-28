package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import GlobalMethod.GlobalMethods;
import Scenario.TS_21;
import jxl.Sheet;
import jxl.Workbook;

public class Mem_search_TS_21 {

	@BeforeMethod
	public void beforeMethod() throws Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test(priority = 1)
	public void CRe4_970_971_972_973_977() throws Exception {

		TS_21 SearchIECMember = new TS_21();
		SearchIECMember.CRe4_970_971_972_973_977();

	}

	@Test(priority = 2)
	public void CRe4_974() throws Exception {

		TS_21 SearchIECMember = new TS_21();
		SearchIECMember.CRe4_974();

	}
	
	@Test(priority = 3)
	public void CRe4_975() throws Exception {

		TS_21 SearchIECMember = new TS_21();
		SearchIECMember.CRe4_975();

	}

	@Test(priority = 4)
	public void CRe4_976() throws Exception {

		TS_21 SearchIECMember = new TS_21();
		SearchIECMember.CRe4_976();

	}

	@Test(priority = 4)
	public void CRe4_978() throws Exception {

		TS_21 SearchIECMember = new TS_21();
		SearchIECMember.CRe4_978();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
