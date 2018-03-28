package executions;

import java.io.FileInputStream;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_15;
import jxl.Sheet;
import jxl.Workbook;

public class Qual_Update_TS_15 {
	
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
	public void CRe4_924_925_926() throws Exception {

		TS_15 UpdateQualifi = new TS_15();

		UpdateQualifi.CRe4_924_925_926();
	}
	
	@Test(priority = 2)
	public void CRe4_927() throws Exception {

		TS_15 UpdateQualifi = new TS_15();

		UpdateQualifi.CRe4_927();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.quit();

	}

}
