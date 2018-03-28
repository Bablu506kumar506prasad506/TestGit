package executions;

import java.io.FileInputStream;


import org.junit.BeforeClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import GlobalMethod.GlobalMethods;
import Scenario.TS_07;
import jxl.Sheet;
import jxl.Workbook;

public class TS_07_Mem_mail {
	@BeforeMethod
	public void beforeMethod() throws Exception, Exception {
		GlobalMethods g = new GlobalMethods();
		
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Login");

		String URL = r1.getCell(1,0).getContents();
		String FirefoxBrowser = r1.getCell(1,1).getContents();
		GlobalMethods.LaunchBrowser(FirefoxBrowser, URL);

	}


	@Test
	public void CRe4_146_to_149() throws Exception {

		TS_07 i1 = new TS_07();
		i1.CRe4_146_to_149();

	}

	@AfterMethod
	public void tearDown() throws Exception {
		GlobalMethods.driver.close();
	

	}

}
