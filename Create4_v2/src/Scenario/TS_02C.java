package Scenario;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.global.methods.GlobalMethods;
import com.global.methods.GlobalWait;

import jxl.Sheet;
import jxl.Workbook;

//Check for forgot password functionality
public class TS_02C {

	public TS_02C() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	// study team members

	@FindBy(linkText = "Study Team Member")
	WebElement studyteammember;

	@FindBy(id = "study_member_name")
	WebElement studyteammember_name;

	@FindBy(css = ".ui-corner-all")
	List<WebElement> studyteammember_selectname;

	@FindBy(xpath = "//*[@id='forward_submission']/div/div[1]/div[3]/div/select")
	WebElement studyteammember_role;

	@FindBy(id = "study_member_email")
	WebElement studyteammember_email;

	@FindBy(id = "savedoc")
	WebElement studyteammember_authorize;

	@FindBy(xpath = "//td[3]")
	WebElement studyteammember_name_inlist;

	@FindBy(xpath = "//td[4]")
	WebElement studyteammember_email_inlist;

	@FindBy(xpath = "//td[5]")
	WebElement studyteammember_role_inlist;

	@FindBy(linkText = "My Projects")
	WebElement PI_project_menu;

	@FindBy(css = "span.fa.fa-eye")
	WebElement overview;

	@FindBy(xpath = "//span/a")
	WebElement logoutt;

	@FindBy(css = "img")
	WebElement logo;

	@FindBy(xpath = "//span[2]/a")
	WebElement delegate;

	@FindBy(xpath = "//td[7]/span/a")
	WebElement status;

	@FindBy(xpath = "//div[@id='deactivatingStudyTeamMmeber']/div[2]/div/div[2]/button")
	WebElement ok;

	@FindBy(xpath = "//div[@id='deactivatingStudyTeamMmeber']/div[2]/div/div[2]/button[2]")
	WebElement cancel;

	@FindBy(css = "span.fa.fa-edit")
	WebElement query_tab_edit;

	@FindBy(id = "nextidedit")
	WebElement next_button;

	@FindBy(id = "submitid")
	WebElement submit_to_IEC;

	@FindBy(xpath = "//*[@id='conflictsubmit']/div[1]/div[1]/div[1]/div/input[2]")
	WebElement no;

	@FindBy(xpath = "//*[@id='submit_for_iec_review_confirm']")
	WebElement conflictsubmit;

	@FindBy(xpath = "//div[8]/div/h3")
	WebElement studyteamheading;

	@FindBy(xpath = "//div[8]/div/div/table/thead/tr/th")
	WebElement studyteamheading_name;

	@FindBy(xpath = "//div[8]/div/div/table/thead/tr/th[2]")
	WebElement studyteamheading_email;

	@FindBy(xpath = "//div[8]/div/div/table/thead/tr/th[3]")
	WebElement studyteamheading_date;

	@FindBy(linkText = "View all")
	WebElement studyteamheading_viewall;

	@FindBy(css = "h3")
	WebElement studyteamheading_heading;

	@FindBy(linkText = "Manage Users")
	WebElement admin_manage_users;

	@FindBy(linkText = "View Invitee Requests")
	WebElement view_invitee_requests;

	@FindBy(css = "div.bgand-border > h3")
	WebElement view_text1;

	@FindBy(xpath = "//th[3]/a/span[2]")
	WebElement view_text2;

	@FindBy(xpath = "//th[4]/a/span[2]")
	WebElement view_text3;

	@FindBy(xpath = "//th[5]/a/span[2]")
	WebElement view_text4;

	@FindBy(xpath = "//th[6]/a/span[2]")
	WebElement view_text5;

	@FindBy(xpath = "//th[7]/a/span[2]")
	WebElement view_text6;

	@FindBy(xpath = "//th[8]/span")
	WebElement view_text7;

	@FindBy(xpath = "//td[4]")
	WebElement view_table_1;

	@FindBy(xpath = "//td[5]")
	WebElement view_table_2;

	@FindBy(xpath = "//td[6]")
	WebElement view_table_3;

	@FindBy(xpath = "//td[8]")
	WebElement view_table_4;

	@FindBy(id = "register_email")
	WebElement email;

	@FindBy(id = "register_password")
	WebElement pwd;

	@FindBy(id = "register_role")
	WebElement rol;

	@FindBy(id = "login_institute")
	WebElement login;

	@FindBy(linkText = "Rainbow Hospitals")//Research approval institute
	WebElement Instlink;


	@FindBy(linkText = "Forgot Password ?")
	WebElement forgotlink;

	@FindBy(xpath = "//h3")
	WebElement forgotheading;

	@FindBy(css = "label.col-md-4")
	WebElement forgotemailfield;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement forgotbutton;

	@FindBy(css = "p.error-msg")
	WebElement forgotemailalert;

	@FindBy(name = "email")
	WebElement emailaddress;

	@FindBy(css = "div.alert.alert-success")
	WebElement successalert;

	/*
	 * Check for the Forgot password functionality with valid/Invalid data in institution home page.
	 */
	public void CRe4_112_to_124() throws Exception {


//		Instlink.click();

		Thread.sleep(6000);

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		String heading = r1.getCell(1, 101).getContents();
		String formemail = r1.getCell(2, 101).getContents();
		String formbutton = r1.getCell(3, 101).getContents();
		String formalert = r1.getCell(4, 101).getContents();
		
		String emailvalid = r1.getCell(5, 101).getContents();
		String passwd = r1.getCell(6, 101).getContents();
		
		
		WebElement forgotlink = GWait.Wait_GetElementByLinkText("Forgot Password ?");

		forgotlink.click();
		
		Assert.assertEquals(forgotheading.getText().trim(), heading);
		Assert.assertEquals(forgotemailfield.getText().trim(), formemail);
		Assert.assertEquals(forgotbutton.getText().trim(), formbutton);
		
		WebElement forgotbutton = GWait.Wait_GetElementByXpath("//button[@type='submit']");
		forgotbutton.click();
		
		Assert.assertEquals(forgotemailalert.getText().trim(), formalert);
		
		

		emailaddress.sendKeys(emailvalid);
		
		WebElement forgotbutton1 = GWait.Wait_GetElementByXpath("//button[@type='submit']");
		forgotbutton1.click();

		

		GlobalMethods.forgotMail("https://accounts.google.com/signin",
				"qualeetee77@gmail.com", "qa123456");
		Thread.sleep(6000);

		Instlink.click();
		Thread.sleep(6000);
		email.sendKeys(emailvalid);
		pwd.sendKeys(passwd);
		Select dropdown = new Select(rol);
		dropdown.selectByValue("1");
		Thread.sleep(6000);
		login.click();
		Thread.sleep(6000);
		logoutt.click();

	}

	
}
