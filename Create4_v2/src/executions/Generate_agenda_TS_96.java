package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_96;
import jxl.Sheet;
import jxl.Workbook;

public class Generate_agenda_TS_96 {

	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}

	@Test(priority =0)
	public void CRe4_187() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_187();

	}

	@Test(priority =1)
	public void CRe4_191_192() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_191_192();

	}

	@Test(priority =2)
	public void CRe4_193_194() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_193_194();

	}

	@Test(priority =3)
	public void CRe4_204_209() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_204_209();

	}

	@Test(priority =4)
	public void CRe4_210_211_212() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_210_211_212();

	}

	@Test(priority =5)
	public void CRe4_213() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_213();

	}

	@Test(priority =6)
	public void CRe4_214() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_214();

	}

	@Test(priority =7)
	public void CRe4_215() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_215();

	}

	@Test(priority =8)
	public void CRe4_216() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_216();

	}

	@Test(priority =9)
	public void CRe4_217() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_217();

	}

	@Test(priority =10)
	public void CRe4_218() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_218();

	}

	@Test(priority =11)
	public void CRe4_219() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_219();

	}

	@Test(priority =12)
	public void CRe4_220() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_220();

	}

	@Test(priority =13)
	public void CRe4_221() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_221();

	}

	@Test(priority =14)
	public void CRe4_222() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_222();

	}

	@Test(priority =15)
	public void CRe4_223() throws Exception {

		TS_96 MSGA = new TS_96();

		MSGA.CRe4_223();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();

	}

}
