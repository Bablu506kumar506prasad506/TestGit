package Scenario;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import GlobalMethod.GlobalMethods;
import GlobalMethod.GlobalWait;
import jxl.Sheet;
import jxl.Workbook;

//Check for Add Ethic Committee with valid/Invalid data/Active/Inactive
public class TS_22 {

	public TS_22() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}

	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(xpath = "html/body/div[3]/div/div[2]/ul/li[4]/a")
	WebElement manageiec;

	@FindBy(linkText = "Manage Ethics Committee")
	WebElement manage_ethic_committee;

	@FindBy(css = "div.bgand-border > h3")
	WebElement ethic_heading;

	@FindBy(linkText = "Add Ethics Committee")
	WebElement ethic_comm_add;

	@FindBy(xpath = "//span/a")
	WebElement logoutt;

	@FindBy(css = "img")
	WebElement logo;

	// add ethic committee form field elements

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div/label")
	WebElement title;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[2]/label")
	WebElement description;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[3]/label")
	WebElement type_of_commitee;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[4]/label")
	WebElement other_info;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[5]/label")
	WebElement date;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[6]/label")
	WebElement chairperson;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[7]/label")
	WebElement member_secretary;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[8]/label")
	WebElement member;

	// form[@id='ethic_committee_submission']/div/div[8]/label

	@FindBy(id = "save_ethic_committee_details")
	WebElement submit;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div/div/p")
	WebElement alert_1;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[3]/div/p")
	WebElement alert_2;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[6]/div/p")
	WebElement alert_3;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[7]/div/p")
	WebElement alert_4;

	@FindBy(xpath = "//form[@id='ethic_committee_submission']/div/div[8]/div[2]/div/p")
	WebElement alert_5;

	@FindBy(id = "save_ethic_committee_details")
	WebElement submit_ethic_comm;

	@FindBy(xpath = "html/body/div[3]/div/div[2]/ul/li[4]/ul/li[7]/a")
	WebElement manage_iec_comm;

	@FindBy(xpath = "html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a")
	WebElement add_iec_member;

	@FindBy(id = "add_iec_member_first_name")
	WebElement add_iec_firstname;

	@FindBy(id = "add_iec_member_last_name")
	WebElement add_iec_lastname;

	@FindBy(id = "add_iec_member_date_of_birth")
	WebElement add_iec_dob;

	@FindBy(id = "add_iec_member_email")
	WebElement add_iec_mail;

	@FindBy(id = "add_iec_member_details")
	WebElement add_iec_button;

	@FindBy(id = "ethic_committee_title")
	WebElement add_ethic_title;

	@FindBy(id = "ethic_committee_description")
	WebElement add_ethic_desc;

	@FindBy(id = "ethic_committee_type_select")
	WebElement add_ethic_comm;

	@FindBy(id = "ethic_committee_info")
	WebElement add_ethic_info;

	@FindBy(id = "ethic_committee_date")
	WebElement add_ethic_date;

	@FindBy(id = "ethic_committee_chair_person")
	WebElement add_ethic_cp;

	@FindBy(id = "ethic_committee_member_secretary")
	WebElement add_ethic_ms;

	@FindBy(id = "save_ethic_committee_details")
	WebElement add_ethic_button;

	@FindBy(css = ".col-sm-9.ms-right-scroll.margin-left-none")
	WebElement add_mem_check;

	@FindBy(xpath = "//th[3]/a/span[2]")
	WebElement name_list;

	@FindBy(xpath = "//th[4]/a/span[2]")
	WebElement type_list;

	@FindBy(xpath = "//th[5]/span")
	WebElement ms_list;

	@FindBy(xpath = "//th[6]/span")
	WebElement cp_list;

	@FindBy(xpath = "//th[7]/a/span[2]")
	WebElement status_list;

	@FindBy(xpath = "//th[8]/span")
	WebElement action_list;

	@FindBy(css = "span.fa.fa-check")
	WebElement active;

	@FindBy(css = "span.fa.fa-remove")
	WebElement deactive;

	@FindBy(xpath = "//html/body/div[2]/div/div[3]/div/ul/li[1]/a")
	WebElement First_Institute;

	@FindBy(xpath = "html/body/div[2]/div/div[3]/div/ul/li[2]/a")
	WebElement Second_Institute;

	// Principal investigator registration elements

	@FindBy(id = "firstname")
	WebElement register_firstname;

	@FindBy(id = "middlename")
	WebElement register_middlename;

	@FindBy(id = "lastname")
	WebElement register_lastname;

	@FindBy(name = "emp_id")
	WebElement register_emp_id;

	@FindBy(id = "dobs")
	WebElement register_dobs;

	@FindBy(id = "phno")
	WebElement register_phno;

	@FindBy(id = "email")
	WebElement register_email;

	@FindBy(id = "photos")
	WebElement register_photos;

	@FindBy(id = "dept")
	WebElement register_dept;

	@FindBy(id = "departmenttext")
	WebElement register_depttext;

	@FindBy(id = "designation")
	WebElement register_designation;

	@FindBy(id = "mrvalids")
	WebElement register_mrvalids;

	@FindBy(xpath = "//form[@id='registerform']/div[3]/div[2]/div[2]/span/input")
	WebElement register_mrdocs;

	@FindBy(xpath = "//div[@id='resumevalidreg']/input")
	WebElement register_resumevalid;

	@FindBy(id = "resume")
	WebElement register_resume;

	@FindBy(id = "field_terms")
	WebElement register_field_terms;

	@FindBy(id = "registration_submit")
	WebElement register_submit;

	@FindBy(linkText = "Home")
	WebElement Home_Link;

	@FindBy(linkText = "Register")
	WebElement register_institute;

	@FindBy(css = "Re")
	WebElement login_institute;

	// Check for 'Ethics Committee Requests List' tabular fields
	public void CRe4_1064_65() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String ethicheading = r1.getCell(2, 154).getContents();
		String ethiccommadd = r1.getCell(3, 154).getContents();

		String ethiccommadd_title = r1.getCell(4, 154).getContents();
		String ethiccommadd_descrp = r1.getCell(5, 154).getContents();
		String ethiccommadd_typecomm = r1.getCell(6, 154).getContents();
		String ethiccommadd_other = r1.getCell(7, 154).getContents();
		String ethiccommadd_date = r1.getCell(8, 154).getContents();
		String ethiccommadd_chairperson = r1.getCell(9, 154).getContents();
		String ethiccommadd_ms = r1.getCell(10, 154).getContents();
		String ethiccommadd_mem = r1.getCell(11, 154).getContents();
		String ethiccommadd_submit = r1.getCell(12, 154).getContents();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();

		WebElement ethic_heading = GWait.Wait_GetElementByCSS("div.bgand-border > h3");
		String ethic_heading_1 = ethic_heading.getText();
		ethicheading.equalsIgnoreCase(ethic_heading_1);
		System.out.println(ethic_heading_1);

		String ethic_com_add_1 = ethic_comm_add.getText();
		ethiccommadd.equalsIgnoreCase(ethic_com_add_1);
		System.out.println(ethic_com_add_1);
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();
		WebElement title = GWait.Wait_GetElementByXpath("//form[@id='ethic_committee_submission']/div/div/label");
		String title_1 = title.getText();
		ethiccommadd_title.equalsIgnoreCase(title_1);
		System.out.println(title_1);

		String description_1 = description.getText();
		ethiccommadd_descrp.equalsIgnoreCase(description_1);
		System.out.println(description_1);

		String type_of_commitee_1 = type_of_commitee.getText();
		ethiccommadd_typecomm.equalsIgnoreCase(type_of_commitee_1);
		System.out.println(type_of_commitee_1);

		String other_info_1 = other_info.getText();
		ethiccommadd_other.equalsIgnoreCase(other_info_1);
		System.out.println(other_info_1);

		String date_1 = date.getText();
		ethiccommadd_date.equalsIgnoreCase(date_1);
		System.out.println(date_1);

		String chaiperson_1 = chairperson.getText();
		ethiccommadd_chairperson.equalsIgnoreCase(chaiperson_1);
		System.out.println(chaiperson_1);

		String member_secretary_1 = member_secretary.getText();
		ethiccommadd_ms.equalsIgnoreCase(member_secretary_1);
		System.out.println(member_secretary_1);

		String member_1 = member.getText();
		ethiccommadd_mem.equalsIgnoreCase(member_1);
		System.out.println(member_1);

		String submit_1 = submit.getAttribute("value");
		ethiccommadd_submit.equalsIgnoreCase(submit_1);
		System.out.println(submit_1);
		WebElement logoutBTN = GWait.Wait_GetElementByCSS(".logout");
		logoutBTN.click();
	}

	// Check for mandatory fields in the add ethic committee form
	public void CRe4_1066_1067() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String name_alert = r1.getCell(2, 156).getContents();
		String type_of_comm_alert = r1.getCell(3, 156).getContents();
		String cp_alert = r1.getCell(4, 156).getContents();
		String ms_alert = r1.getCell(5, 156).getContents();
		String iec_mem_alert = r1.getCell(6, 156).getContents();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();

		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();
		WebElement submit_ethic_comm = GWait.Wait_GetElementById("save_ethic_committee_details");
		submit_ethic_comm.click();

		String alert1 = alert_1.getText();
		name_alert.equalsIgnoreCase(alert1);
		System.out.println(alert1);

		String alert2 = alert_2.getText();
		type_of_comm_alert.equalsIgnoreCase(alert2);
		System.out.println(alert2);

		String alert3 = alert_3.getText();
		cp_alert.equalsIgnoreCase(alert3);
		System.out.println(alert3);

		String alert4 = alert_4.getText();
		ms_alert.equalsIgnoreCase(alert4);
		System.out.println(alert4);

		String alert5 = alert_5.getText();
		iec_mem_alert.equalsIgnoreCase(alert5);
		System.out.println(alert5);

		WebElement logoutBTN = GWait.Wait_GetElementByCSS(".logout");
		logoutBTN.click();

	}

	@FindBy(xpath = "input[name='ethic_committee_iec_members[]']")
	List<WebElement> selectIECMem;

	// Check for add ethic committee with only one member
	public void CRe4_1070_71_1085_80_to_85() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String frstname_1 = r1.getCell(2, 158).getContents();
		String lstname_1 = r1.getCell(3, 158).getContents();
		String dob_1 = r1.getCell(4, 158).getContents();
		String email_1 = r1.getCell(5, 158).getContents();

		String frstname_2 = r1.getCell(6, 158).getContents();
		String lstname_2 = r1.getCell(7, 158).getContents();
		String dob_2 = r1.getCell(8, 158).getContents();
		String email_2 = r1.getCell(9, 158).getContents();

		String frstname_3 = r1.getCell(10, 158).getContents();
		String lstname_3 = r1.getCell(11, 158).getContents();
		String dob_3 = r1.getCell(12, 158).getContents();
		String email_3 = r1.getCell(13, 158).getContents();

		String frstname_4 = r1.getCell(14, 158).getContents();
		String lstname_4 = r1.getCell(15, 158).getContents();
		String dob_4 = r1.getCell(16, 158).getContents();
		String email_4 = r1.getCell(17, 158).getContents();

		String title = r1.getCell(18, 158).getContents();
		String description = r1.getCell(19, 158).getContents();
		String info = r1.getCell(20, 158).getContents();
		String date = r1.getCell(21, 158).getContents();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();
		WebElement manage_iec_comm = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/ul/li[7]/a");
		manage_iec_comm.click();
		WebElement add_iec_member = GWait
				.Wait_GetElementByXpath("html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a");
		add_iec_member.click();

		add_iec_firstname.sendKeys(frstname_1);
		add_iec_lastname.sendKeys(lstname_1);
		add_iec_dob.sendKeys(dob_1);
		add_iec_mail.sendKeys(email_1);
		WebElement add_iec_button = GWait.Wait_GetElementById("add_iec_member_details");
		add_iec_button.click();
		WebElement add_iec_member1 = GWait
				.Wait_GetElementByXpath("html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a");
		add_iec_member1.click();
		add_iec_firstname.clear();
		add_iec_firstname.sendKeys(frstname_2);
		add_iec_lastname.clear();
		add_iec_lastname.sendKeys(lstname_2);
		add_iec_dob.clear();
		add_iec_dob.sendKeys(dob_2);
		add_iec_mail.clear();
		add_iec_mail.sendKeys(email_2);
		WebElement add_iec_button1 = GWait.Wait_GetElementById("add_iec_member_details");
		add_iec_button1.click();
		WebElement add_iec_member2 = GWait
				.Wait_GetElementByXpath("html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a");
		add_iec_member2.click();

		add_iec_firstname.clear();
		add_iec_firstname.sendKeys(frstname_3);
		add_iec_lastname.clear();
		add_iec_lastname.sendKeys(lstname_3);
		add_iec_dob.clear();
		add_iec_dob.sendKeys(dob_3);
		add_iec_mail.clear();
		add_iec_mail.sendKeys(email_3);
		WebElement add_iec_button2 = GWait.Wait_GetElementById("add_iec_member_details");
		add_iec_button2.click();
		WebElement add_iec_member3 = GWait
				.Wait_GetElementByXpath("html/body/div[4]/div[1]/div/div[1]/div/li/div/ul/li[2]/div/a");
		add_iec_member3.click();

		add_iec_firstname.clear();
		add_iec_firstname.sendKeys(frstname_4);
		add_iec_lastname.clear();
		add_iec_lastname.sendKeys(lstname_4);
		add_iec_dob.clear();
		add_iec_dob.sendKeys(dob_4);
		add_iec_mail.clear();
		add_iec_mail.sendKeys(email_4);
		WebElement add_iec_button3 = GWait.Wait_GetElementById("add_iec_member_details");
		add_iec_button3.click();

		WebElement Manage_IEC1 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC1.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();

		String cp = frstname_1 + " " + lstname_1;
		String ms = frstname_2 + " " + lstname_2;

		add_ethic_title.sendKeys(title);
		add_ethic_desc.sendKeys(description);
		Select dropdown = new Select(add_ethic_comm);
		dropdown.selectByValue("1");
		add_ethic_info.sendKeys(info);
		add_ethic_date.sendKeys(date);
		// Select dropdown = new Select(add_ethic_info);
		// dropdown.selectByValue("1090");
		Select select1 = new Select(add_ethic_cp);
		select1.selectByVisibleText(cp);

		Select select2 = new Select(add_ethic_ms);
		select2.selectByVisibleText(ms);

		// for (WebElement checkbox : selectIECMem) {
		// if (checkbox.isSelected()) {
		// checkbox.click();
		// }
		// }

		add_mem_check.click();

		WebElement add_ethic_button = GWait.Wait_GetElementById("save_ethic_committee_details");
		add_ethic_button.click();
		WebElement logoutBTN = GWait.Wait_GetElementByCSS(".logout");
		logoutBTN.click();
		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();

		WebElement First_Institute = GWait.Wait_GetElementByXpath("//html/body/div[2]/div/div[3]/div/ul/li[1]/a");
		First_Institute.click();

		// PI Register data

		String PI_firstname = r1.getCell(22, 158).getContents();
		String PI_middlename = r1.getCell(23, 158).getContents();
		String PI_lastname = r1.getCell(24, 158).getContents();
		String PI_emdpid = r1.getCell(25, 158).getContents();
		String PI_dob = r1.getCell(26, 158).getContents();
		String PI_phnum = r1.getCell(27, 158).getContents();
		String PI_email = r1.getCell(28, 158).getContents();
		String PI_photo = r1.getCell(29, 158).getContents();

		WebElement register_institute = GWait.Wait_GetElementByLinkText("Register");
		register_institute.click();

		WebElement register_firstname = GWait.Wait_GetElementById("firstname");
		register_firstname.sendKeys(PI_firstname);

		WebElement register_middlename = GWait.Wait_GetElementById("middlename");
		register_middlename.sendKeys(PI_middlename);

		register_lastname.sendKeys(PI_lastname);
		register_emp_id.sendKeys(PI_emdpid);
		register_dobs.sendKeys(PI_dob);
		register_phno.sendKeys(PI_phnum);
		register_email.sendKeys(PI_email);
		register_photos.sendKeys(PI_photo);
		WebElement register_field_terms = GWait.Wait_GetElementById("field_terms");
		register_field_terms.click();
		WebElement register_submit = GWait.Wait_GetElementById("registration_submit");
		register_submit.click();

		WebElement Home_Link = GWait.Wait_GetElementByLinkText("Home");
		Home_Link.click();

		WebElement logo1 = GWait.Wait_GetElementByCSS("img");
		logo1.click();

		WebElement First_Institute1 = GWait.Wait_GetElementByXpath("//html/body/div[2]/div/div[3]/div/ul/li[1]/a");
		First_Institute1.click();
		// PI Register data

		String PI_firstname1 = r1.getCell(30, 158).getContents();
		String PI_middlename1 = r1.getCell(31, 158).getContents();
		String PI_lastname1 = r1.getCell(32, 158).getContents();
		String PI_emdpid1 = r1.getCell(33, 158).getContents();
		String PI_dob1 = r1.getCell(34, 158).getContents();
		String PI_phnum1 = r1.getCell(35, 158).getContents();
		String PI_emailID = r1.getCell(36, 158).getContents();
		String PI_photo1 = r1.getCell(37, 158).getContents();

		WebElement register_institute1 = GWait.Wait_GetElementByLinkText("Register");
		register_institute1.click();
		WebElement register_firstname1 = GWait.Wait_GetElementById("firstname");
		register_firstname1.clear();
		register_firstname1.sendKeys(PI_firstname1);
		WebElement register_middlename1 = GWait.Wait_GetElementById("middlename");
		register_middlename1.clear();
		register_middlename1.sendKeys(PI_middlename1);
		register_lastname.clear();
		register_lastname.sendKeys(PI_lastname1);
		register_emp_id.clear();
		register_emp_id.sendKeys(PI_emdpid1);
		register_dobs.clear();
		register_dobs.sendKeys(PI_dob1);
		register_phno.clear();
		register_phno.sendKeys(PI_phnum1);
		register_email.clear();
		register_email.sendKeys(PI_emailID);
		register_photos.sendKeys(PI_photo1);
		WebElement register_field_terms1 = GWait.Wait_GetElementById("field_terms");
		register_field_terms1.click();
		WebElement register_submit1 = GWait.Wait_GetElementById("registration_submit");
		register_submit1.click();
		WebElement Home_Link1 = GWait.Wait_GetElementByLinkText("Home");
		Home_Link1.click();
		WebElement logo2 = GWait.Wait_GetElementByCSS("img");
		logo2.click();

	}

	// Check for add ethic committee by selecting PI of same institute as MS
	public void CRe4_1077() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String ethicheading = r1.getCell(2, 160).getContents();
		String ethiccommadd = r1.getCell(3, 160).getContents();

		String ethiccommadd_title = r1.getCell(4, 160).getContents();
		String ethiccommadd_descrp = r1.getCell(5, 160).getContents();
		String ethiccommadd_typecomm = r1.getCell(6, 160).getContents();
		String ethiccommadd_other = r1.getCell(7, 160).getContents();
		String ethiccommadd_date = r1.getCell(8, 160).getContents();
		String ethiccommadd_chairperson = r1.getCell(9, 160).getContents();
		String ethiccommadd_ms = r1.getCell(10, 160).getContents();
		String ethiccommadd_mem = r1.getCell(11, 160).getContents();
		String ethiccommadd_submit = r1.getCell(12, 160).getContents();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();

		String ethic_heading_1 = ethic_heading.getText();
		ethicheading.equalsIgnoreCase(ethic_heading_1);
		System.out.println(ethic_heading_1);

		String ethic_com_add_1 = ethic_comm_add.getText();
		ethiccommadd.equalsIgnoreCase(ethic_com_add_1);
		System.out.println(ethic_com_add_1);
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();
		WebElement title = GWait.Wait_GetElementByXpath("//form[@id='ethic_committee_submission']/div/div/label");
		String title_1 = title.getText();
		ethiccommadd_title.equalsIgnoreCase(title_1);
		System.out.println(title_1);

		String description_1 = description.getText();
		ethiccommadd_descrp.equalsIgnoreCase(description_1);
		System.out.println(description_1);

		String type_of_commitee_1 = type_of_commitee.getText();
		ethiccommadd_typecomm.equalsIgnoreCase(type_of_commitee_1);
		System.out.println(type_of_commitee_1);

		String other_info_1 = other_info.getText();
		ethiccommadd_other.equalsIgnoreCase(other_info_1);
		System.out.println(other_info_1);

		String date_1 = date.getText();
		ethiccommadd_date.equalsIgnoreCase(date_1);
		System.out.println(date_1);

		String chaiperson_1 = chairperson.getText();
		ethiccommadd_chairperson.equalsIgnoreCase(chaiperson_1);
		System.out.println(chaiperson_1);

		String member_secretary_1 = member_secretary.getText();
		ethiccommadd_ms.equalsIgnoreCase(member_secretary_1);
		System.out.println(member_secretary_1);

		String member_1 = member.getText();
		ethiccommadd_mem.equalsIgnoreCase(member_1);
		System.out.println(member_1);

		String submit_1 = submit.getAttribute("value");
		ethiccommadd_submit.equalsIgnoreCase(submit_1);
		System.out.println(submit_1);
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

	}

	// Check for add ethic committee by selecting PI of same institute as CP
	public void CRe4_1078() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String ethicheading = r1.getCell(2, 162).getContents();
		String ethiccommadd = r1.getCell(3, 162).getContents();

		String ethiccommadd_title = r1.getCell(4, 162).getContents();
		String ethiccommadd_descrp = r1.getCell(5, 162).getContents();
		String ethiccommadd_typecomm = r1.getCell(6, 162).getContents();
		String ethiccommadd_other = r1.getCell(7, 162).getContents();
		String ethiccommadd_date = r1.getCell(8, 162).getContents();
		String ethiccommadd_chairperson = r1.getCell(9, 162).getContents();
		String ethiccommadd_ms = r1.getCell(10, 162).getContents();
		String ethiccommadd_mem = r1.getCell(11, 162).getContents();
		String ethiccommadd_submit = r1.getCell(12, 162).getContents();

		WebElement manageiec = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		manageiec.click();

		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();
		WebElement ethic_heading = GWait.Wait_GetElementByCSS("div.bgand-border > h3");
		String ethic_heading_1 = ethic_heading.getText();
		ethicheading.equalsIgnoreCase(ethic_heading_1);
		System.out.println(ethic_heading_1);

		String ethic_com_add_1 = ethic_comm_add.getText();
		ethiccommadd.equalsIgnoreCase(ethic_com_add_1);
		System.out.println(ethic_com_add_1);
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();

		WebElement title = GWait.Wait_GetElementByXpath("//form[@id='ethic_committee_submission']/div/div/label");
		String title_1 = title.getText();
		Assert.assertEquals(title_1, ethiccommadd_title);
		// ethiccommadd_title.equalsIgnoreCase(title_1);
		System.out.println(title_1);

		String description_1 = description.getText();
		Assert.assertEquals(description_1, ethiccommadd_descrp);
		// ethiccommadd_descrp.equalsIgnoreCase(description_1);
		System.out.println(description_1);

		String type_of_commitee_1 = type_of_commitee.getText();
		Assert.assertEquals(type_of_commitee_1, ethiccommadd_typecomm);
		// ethiccommadd_typecomm.equalsIgnoreCase(type_of_commitee_1);
		System.out.println(type_of_commitee_1);

		String other_info_1 = other_info.getText();
		ethiccommadd_other.equalsIgnoreCase(other_info_1);
		System.out.println(other_info_1);

		String date_1 = date.getText();
		ethiccommadd_date.equalsIgnoreCase(date_1);
		System.out.println(date_1);

		String chaiperson_1 = chairperson.getText();
		ethiccommadd_chairperson.equalsIgnoreCase(chaiperson_1);
		System.out.println(chaiperson_1);

		String member_secretary_1 = member_secretary.getText();
		ethiccommadd_ms.equalsIgnoreCase(member_secretary_1);
		System.out.println(member_secretary_1);

		String member_1 = member.getText();
		ethiccommadd_mem.equalsIgnoreCase(member_1);
		System.out.println(member_1);

		String submit_1 = submit.getAttribute("value");
		ethiccommadd_submit.equalsIgnoreCase(submit_1);
		System.out.println(submit_1);
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

	}

	// Check for add ethic committee by selecting PI of same institute as Member
	public void CRe4_1079() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String ethicheading = r1.getCell(2, 164).getContents();
		String ethiccommadd = r1.getCell(3, 164).getContents();

		String ethiccommadd_title = r1.getCell(4, 164).getContents();
		String ethiccommadd_descrp = r1.getCell(5, 164).getContents();
		String ethiccommadd_typecomm = r1.getCell(6, 164).getContents();
		String ethiccommadd_other = r1.getCell(7, 164).getContents();
		String ethiccommadd_date = r1.getCell(8, 164).getContents();
		String ethiccommadd_chairperson = r1.getCell(9, 164).getContents();
		String ethiccommadd_ms = r1.getCell(10, 164).getContents();
		String ethiccommadd_mem = r1.getCell(11, 164).getContents();
		String ethiccommadd_submit = r1.getCell(12, 164).getContents();

		WebElement manageiec = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		manageiec.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();
		WebElement ethic_heading = GWait.Wait_GetElementByCSS("div.bgand-border > h3");
		String ethic_heading_1 = ethic_heading.getText();
		ethicheading.equalsIgnoreCase(ethic_heading_1);
		System.out.println(ethic_heading_1);

		String ethic_com_add_1 = ethic_comm_add.getText();
		ethiccommadd.equalsIgnoreCase(ethic_com_add_1);
		System.out.println(ethic_com_add_1);
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();

		WebElement title = GWait.Wait_GetElementByXpath("//form[@id='ethic_committee_submission']/div/div/label");
		String title_1 = title.getText();
		ethiccommadd_title.equalsIgnoreCase(title_1);
		System.out.println(title_1);

		String description_1 = description.getText();
		ethiccommadd_descrp.equalsIgnoreCase(description_1);
		System.out.println(description_1);

		String type_of_commitee_1 = type_of_commitee.getText();
		ethiccommadd_typecomm.equalsIgnoreCase(type_of_commitee_1);
		System.out.println(type_of_commitee_1);

		String other_info_1 = other_info.getText();
		ethiccommadd_other.equalsIgnoreCase(other_info_1);
		System.out.println(other_info_1);

		String date_1 = date.getText();
		ethiccommadd_date.equalsIgnoreCase(date_1);
		System.out.println(date_1);

		String chaiperson_1 = chairperson.getText();
		ethiccommadd_chairperson.equalsIgnoreCase(chaiperson_1);
		System.out.println(chaiperson_1);

		String member_secretary_1 = member_secretary.getText();
		ethiccommadd_ms.equalsIgnoreCase(member_secretary_1);
		System.out.println(member_secretary_1);

		String member_1 = member.getText();
		ethiccommadd_mem.equalsIgnoreCase(member_1);
		System.out.println(member_1);

		String submit_1 = submit.getAttribute("value");
		ethiccommadd_submit.equalsIgnoreCase(submit_1);
		System.out.println(submit_1);
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

	}

	// Check for add ethic committee by conflict of interest members
	public void CRe4_1080() throws Exception {

		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Manage_IECS1");

		String ethicheading = r1.getCell(2, 166).getContents();
		String ethiccommadd = r1.getCell(3, 166).getContents();

		String ethiccommadd_title = r1.getCell(4, 166).getContents();
		String ethiccommadd_descrp = r1.getCell(5, 166).getContents();
		String ethiccommadd_typecomm = r1.getCell(6, 166).getContents();
		String ethiccommadd_other = r1.getCell(7, 166).getContents();
		String ethiccommadd_date = r1.getCell(8, 166).getContents();
		String ethiccommadd_chairperson = r1.getCell(9, 166).getContents();
		String ethiccommadd_ms = r1.getCell(10, 166).getContents();
		String ethiccommadd_mem = r1.getCell(11, 166).getContents();
		String ethiccommadd_submit = r1.getCell(12, 166).getContents();

		WebElement manageiec = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		manageiec.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();
		WebElement ethic_heading = GWait.Wait_GetElementByCSS("div.bgand-border > h3");
		String ethic_heading_1 = ethic_heading.getText();
		ethicheading.equalsIgnoreCase(ethic_heading_1);
		System.out.println(ethic_heading_1);

		String ethic_com_add_1 = ethic_comm_add.getText();
		ethiccommadd.equalsIgnoreCase(ethic_com_add_1);
		System.out.println(ethic_com_add_1);
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();
		WebElement title = GWait.Wait_GetElementByXpath("//div[2]/div[3]/div[1]/form/div[1]/div[1]/label");
		String title_1 = title.getText();
		ethiccommadd_title.equalsIgnoreCase(title_1);
		System.out.println(title_1);

		String description_1 = description.getText();
		ethiccommadd_descrp.equalsIgnoreCase(description_1);
		System.out.println(description_1);

		String type_of_commitee_1 = type_of_commitee.getText();
		ethiccommadd_typecomm.equalsIgnoreCase(type_of_commitee_1);
		System.out.println(type_of_commitee_1);

		String other_info_1 = other_info.getText();
		ethiccommadd_other.equalsIgnoreCase(other_info_1);
		System.out.println(other_info_1);

		String date_1 = date.getText();
		ethiccommadd_date.equalsIgnoreCase(date_1);
		System.out.println(date_1);

		String chaiperson_1 = chairperson.getText();
		ethiccommadd_chairperson.equalsIgnoreCase(chaiperson_1);
		System.out.println(chaiperson_1);

		String member_secretary_1 = member_secretary.getText();
		ethiccommadd_ms.equalsIgnoreCase(member_secretary_1);
		System.out.println(member_secretary_1);

		String member_1 = member.getText();
		ethiccommadd_mem.equalsIgnoreCase(member_1);
		System.out.println(member_1);

		String submit_1 = submit.getAttribute("value");
		ethiccommadd_submit.equalsIgnoreCase(submit_1);
		System.out.println(submit_1);
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

	}

	// Check for fields of list grid in manage IEC
	public void CRe4_1095_to_1100_1101_1102() throws Exception {

		GlobalMethods.Admin_Login();
		WebElement manageiec = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		manageiec.click();
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click();

		// Check for Table Header
		// GlobalMethods.driver.findElement(By.cssSelector(".table.table-striped>thead"));
		WebElement table_element = GWait.Wait_GetElementByCSS(".table.table-striped>thead");
		ArrayList<WebElement> rows = (ArrayList<WebElement>) table_element.findElements(By.tagName("tr"));
		for (WebElement row : rows) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//th"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}
		}

		// Check for Table Data name Test cases 1096
		WebElement table_element1 = GWait.Wait_GetElementByCSS(".table.table-striped>tbody");
		ArrayList<WebElement> rows1 = (ArrayList<WebElement>) table_element1.findElements(By.tagName("tr"));
		for (WebElement row : rows1) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//td[3]"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}break;
		}

		// Check for Table Data Type Test cases 1097
		WebElement table_element2 = GWait.Wait_GetElementByCSS(".table.table-striped>tbody");
		ArrayList<WebElement> rows2 = (ArrayList<WebElement>) table_element2.findElements(By.tagName("tr"));
		for (WebElement row : rows2) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//td[4]"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}break;
		}

		// Check for Table Data MS Test cases 1098
		WebElement table_element3 = GWait.Wait_GetElementByCSS(".table.table-striped>tbody");
		ArrayList<WebElement> rows3 = (ArrayList<WebElement>) table_element3.findElements(By.tagName("tr"));
		for (WebElement row : rows3) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//td[5]"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}break;
		}

		// Check for Table Data Chairperson Test cases 1099
		WebElement table_element4 = GWait.Wait_GetElementByCSS(".table.table-striped>tbody");
		ArrayList<WebElement> rows4 = (ArrayList<WebElement>) table_element4.findElements(By.tagName("tr"));
		for (WebElement row : rows4) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//td[6]"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}break;
		}

		// Check for Table Data Status Test cases 1100,1101,1102,1103
		WebElement table_element5 = GWait.Wait_GetElementByCSS(".table.table-striped>tbody");
		ArrayList<WebElement> rows5 = (ArrayList<WebElement>) table_element5.findElements(By.tagName("tr"));
		for (WebElement row : rows5) {
			ArrayList<WebElement> cells = (ArrayList<WebElement>) row.findElements(By.xpath("//td[7]"));
			for (WebElement cell : cells) {
				System.out.println(cell.getText());
			}break;
		}

		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();

	}

}
