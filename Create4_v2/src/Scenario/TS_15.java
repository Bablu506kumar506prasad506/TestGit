package Scenario;

import java.io.FileInputStream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GlobalMethod.GlobalMethods;
import GlobalMethod.GlobalWait;
import jxl.Sheet;
import jxl.Workbook;

public class TS_15 {
	public TS_15() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}

	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(css = ".col-sm-10.col-xs-12.main-right>h3")
	WebElement Verify_QualificationName;

	@FindBy(id = "add_qualification_name")
	WebElement AddQualifiTextbox;

	@FindBy(css = ".help-block")
	WebElement BlankAlert;

	@FindBy(css = ".bg-success.text-success.col-sm-12.text-center")
	WebElement UpdateQualifiPopuptext;

	@FindBy(css = ".logout")
	WebElement LogOut;

	public void CRe4_924_925_926() throws Exception {
		// ----------IEC Admin Login------------//
		GlobalMethods.Admin_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r = wb.getSheet("Manage_IECS1");

		String ManageQualifi_text = r.getCell(2, 198).getContents();
		String MaxDepart_text = r.getCell(3, 198).getContents();

		WebElement ManageIEC = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		ManageIEC.click();
		WebElement Manage_Qualifi = GWait.Wait_GetElementByXpath("//li[4]/ul/li[5]/a");
		Manage_Qualifi.click();

		System.out.println("Test cases == CRe4_924");
		System.out.println(Verify_QualificationName.getText());
		System.out.println(ManageQualifi_text);
		System.out.println(Verify_QualificationName.getText().equalsIgnoreCase(ManageQualifi_text));
		WebElement EditLink = GWait.Wait_GetElementByCSS(".fa.fa-edit");
		EditLink.click();

		// ----------Check for 'Edit' with blank data------//
		System.out.println("Test cases == CRe4_925");
		AddQualifiTextbox.clear();

		WebElement Update_AddQualifi = GWait.Wait_GetElementById("addQualificationButton");
		Update_AddQualifi.click();
		System.out.println(BlankAlert.getText());

		// -------Check for 'Edit' with maximum data--------//
		System.out.println("Test cases == CRe4_926");
		AddQualifiTextbox.sendKeys(MaxDepart_text);
		WebElement Update_AddQualifi1 = GWait.Wait_GetElementById("addQualificationButton");
		Update_AddQualifi1.click();

		WebElement LogOut = GWait.Wait_GetElementByCSS(".logout");
		LogOut.click();
	}

	public void CRe4_927() throws Exception {
		// ----------IEC Admin Login------------//
		System.out.println("Test cases == CRe4_927");
		GlobalMethods.Admin_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r = wb.getSheet("Manage_IECS1");

		String QualificationData_text = r.getCell(2, 200).getContents();

		WebElement ManageIEC = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		ManageIEC.click();
		WebElement Manage_Qualifi = GWait.Wait_GetElementByXpath("//li[4]/ul/li[5]/a");
		Manage_Qualifi.click();

		WebElement EditLink = GWait.Wait_GetElementByCSS(".fa.fa-edit");
		EditLink.click();

		// -------Check for update Qualification--//
		System.out.println("Check for update Qualification");
		AddQualifiTextbox.clear();
		AddQualifiTextbox.sendKeys(QualificationData_text);
		
		WebElement Update_AddQualifi2 = GWait.Wait_GetElementById("addQualificationButton");
		Update_AddQualifi2.click();
		System.out.println(UpdateQualifiPopuptext.getText());
		WebElement LogOut = GWait.Wait_GetElementByCSS(".logout");
		LogOut.click();

	}

}
