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

import GlobalMethod.GlobalMethods;
import GlobalMethod.GlobalWait;
import jxl.Sheet;
import jxl.Workbook;

/*
 * Check for Institute update functionality with valid/invalid data in Admin login (Updated details should replicate where ever it has to be)
 */

public class TS_03 {

	public TS_03() {
		// this.driver=driver;
		// driver = GlobalMethods.driver;
		PageFactory.initElements(GlobalMethods.driver, this);
	}
	
	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(xpath = "html/body/div[3]/div/div[2]/ul/li[4]/a")
	WebElement Manage_IEC;//s

	@FindBy(css = "h3")
	WebElement Page_heading;

	@FindBy(linkText = "Institution")
	WebElement Link_Inst;//s

	@FindBy(xpath = "html/body/div[3]/div/div[2]/ul/li[4]/ul/li[2]/a")
	WebElement Link_SOP;//s

	@FindBy(linkText = "External Links")
	WebElement Link_External;//s

	@FindBy(linkText = "Manage Departments")
	WebElement Link_Dept;

	@FindBy(linkText = "Manage Qualifications")
	WebElement Link_Qual;

	@FindBy(linkText = "Manage Document Type")
	WebElement Link_Doc;

	@FindBy(linkText = "Manage IEC Members")
	WebElement Link_Member;

	@FindBy(linkText = "Manage Ethics Committee")
	WebElement Link_Ethic;

	@FindBy(css = ".logout")
	WebElement logoutt;

	@FindBy(css = "img")
	WebElement logo;

	// ------------Institution details in view page-----------------//

	@FindBy(xpath = "//div[3]/div[2]/div")
	WebElement Inst_name_details;

	@FindBy(xpath = "//div[3]/div[3]/div")
	WebElement Inst_addr_detais;

	@FindBy(xpath = "//div[3]/div[4]/div")
	WebElement Inst_DCGI_Reg_num_details;

	@FindBy(xpath = "//div[6]/div")
	WebElement Inst_accrd_details;
	
	@FindBy(xpath = "//div[5]/div/a")
	WebElement dgci_file;
	
	@FindBy(xpath = "//div[7]/div/a")
	WebElement accri_file;
	
	@FindBy(xpath = "//div[8]/div/a")
	WebElement inst_logo;

	@FindBy(xpath = "//button[@onclick='javascript:history.back();return false;']")
	WebElement Inst_back_details;

	@FindBy(linkText = "Edit Institute")
	WebElement Edit_Inst;

	@FindBy(id = "inst_name")
	WebElement Inst_Title;

	@FindBy(id = "inst_address")
	WebElement Adds;

	@FindBy(id = "cgi_des")
	WebElement DCGI_Reg_Numr;

	@FindBy(id = "cgi_attach")
	WebElement DCGI_Reg_Letter_Upload_attachmnt;

	@FindBy(id = "accrediation_desc")
	WebElement Accredn;

	@FindBy(id = "acc_attach")
	WebElement Accredn_Attachmnt;

	@FindBy(id = "inst_logo")
	WebElement Ins_Logo;

	@FindBy(xpath = "//*[@id='createinstitute']/div[8]/div/input")
	WebElement Create_button;

	@FindBy(xpath = "//input[@value='Update']")
	WebElement Inst_edit_update_button;

	@FindBy(css = "label.error")
	WebElement Inst_title_edit_alert;

	@FindBy(xpath = "//form[@id='updateIECInstitute']/div[2]/div/label")
	WebElement Inst_addr_edit_alert;

	@FindBy(xpath = "//form[@id='createinstitute']/div[4]/div/label")
	WebElement Error_three;

	@FindBy(xpath = "//form[@id='createinstitute']/div[6]/div/label")
	WebElement Error_four;

	@FindBy(xpath = "//form[@id='createinstitute']/div[7]/div/label")
	WebElement Error_five;
	

	@FindBy(xpath="html/body/div[4]/div[1]/div/div[2]/div[3]/form/div[4]/div/label")
	WebElement Error_Upload;
	@FindBy(xpath="html/body/div[4]/div[1]/div/div[2]/div[3]/form/div[6]/div/label")
	WebElement Error_Upload_Accr;
	@FindBy(xpath="html/body/div[4]/div[1]/div/div[2]/div[3]/form/div[7]/div/label")
	WebElement Error_Upload_Insti;
	
	// Form fields elements

		@FindBy(id = "add_iec_admin_first_name")
		WebElement iec_admin_first_name;// s

		@FindBy(id = "add_iec_admin_last_name")
		WebElement iec_admin_last_name;// s

		@FindBy(id = "add_iec_admin_date_of_birth")
		WebElement iec_admin_date_of_birth;// s

		@FindBy(id = "add_iec_admin_email")
		WebElement iec_admin_email;// s

		@FindBy(id = "add_iec_admin_contact_number")
		WebElement iec_admin_contact_number;// s

		@FindBy(id = "add_iec_admin_photo")
		WebElement iec_admin_photo;// s

		@FindBy(id = "add_iec_admin_department")
		WebElement iec_admin_department;// s

		@FindBy(id = "add_iec_admin_designation")
		WebElement iec_admin_designation;// s

		@FindBy(id = "add_iec_admin_qualifications")
		WebElement iec_admin_qualifications;// s

		@FindBy(id = "add_iec_admin_registration_number")
		WebElement iec_admin_registration_number;// s

		@FindBy(id = "add_iec_admin_appointment_letter")
		WebElement iec_admin_appointment_letter;// s

		@FindBy(id = "add_iec_admin_curriculum_vitae")
		WebElement iec_admin_curriculum_vitae;// s

		@FindBy(id = "add_iec_admin_institute")
		WebElement iec_admin_institute;// s

		@FindBy(xpath = "//form[@id='manageiecadmins']/div/p")
		WebElement Admin_Acknowledge;// s

	// Check for 'Manage IECs'
	public void CRe4_846() throws Exception {




		GlobalMethods.Admin_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		String Inst_heading = r1.getCell(2,43).getContents();
		String SOP_heading = r1.getCell(3,43).getContents();
		String External_heading = r1.getCell(4,43).getContents();
		String Dept_heading = r1.getCell(5,43).getContents();
		String Qual_heading = r1.getCell(6,43).getContents();
		String Doc_heading = r1.getCell(7,43).getContents();
		String Mem_heading = r1.getCell(8,43).getContents();
		String Ethic_heading = r1.getCell(9,43).getContents();

		
		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();
		

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();
		
		
		
		
		//String Page_heading_1 = Page_heading.getText();
		Assert.assertEquals(Page_heading.getText().trim(), Inst_heading);
		
		WebElement Manage_IEC1 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC1.click();

		WebElement Link_SOP = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/ul/li[2]/a");
		Link_SOP.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), SOP_heading);
		
		WebElement Manage_IEC2 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC2.click();

		WebElement Link_External = GWait.Wait_GetElementByLinkText("External Links");
		Link_External.click();
		
		
		
		Assert.assertEquals(Page_heading.getText().trim(), External_heading);
		
		WebElement Manage_IEC4 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC4.click();

		WebElement Link_Dept = GWait.Wait_GetElementByLinkText("Manage Departments");
		Link_Dept.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), Dept_heading);
		
		WebElement Manage_IEC5 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC5.click();

		WebElement Link_Qual = GWait.Wait_GetElementByLinkText("Manage Qualifications");
		Link_Qual.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), Qual_heading);
		
		WebElement Manage_IEC6 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC6.click();

		WebElement Link_Doc = GWait.Wait_GetElementByLinkText("Manage Document Type");
		Link_Doc.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), Doc_heading);
		
		WebElement Manage_IEC7 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC7.click();

		WebElement Link_Member = GWait.Wait_GetElementByLinkText("Manage IEC Members");
		Link_Member.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), Mem_heading);
		
		WebElement Manage_IEC8 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC8.click();

		WebElement Link_Ethic = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		Link_Ethic.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), Ethic_heading);
		

		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
		
	}

	// Check for 'Insitution' link
	public void CRe4_847() throws Exception {


		GlobalMethods.Admin_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		String Inst_heading = r1.getCell(2,45).getContents();
		

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();

		Assert.assertEquals(Page_heading.getText().trim(), Inst_heading);
		

		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
	}

	// Check for 'View Institute' details
	public void CRe4_848() throws Exception {

		GlobalMethods.Super_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);

		Sheet r1 = wb.getSheet("Emails_Data");

		WebElement Manage_Items = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[2]/a");
		Manage_Items.click();
				
		WebElement Insts = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[2]/ul/li[1]/a");
		Insts.click();
		
		WebElement createins = GWait.Wait_GetElementByXpath("//*[@id='accordion']/li[2]/div/a");
		createins.click();

		String Inst_tite = r1.getCell(0, 2).getContents();
		String Inst_address = r1.getCell(1, 2).getContents();
		String Inst_number = r1.getCell(2, 2).getContents();
		String Inst_attachment = r1.getCell(3, 2).getContents();
		String Inst_accredtion = r1.getCell(4, 2).getContents();
		String Inst_accreattachment = r1.getCell(5, 2).getContents();
		String Inst_logo = r1.getCell(6, 2).getContents();

		Inst_Title.sendKeys(Inst_tite);
		Thread.sleep(2000);
		Adds.sendKeys(Inst_address);
		Thread.sleep(2000);
		DCGI_Reg_Numr.sendKeys(Inst_number);
		Thread.sleep(2000);

		DCGI_Reg_Letter_Upload_attachmnt.sendKeys(Inst_attachment);
		Thread.sleep(1000);

		Accredn.sendKeys(Inst_accredtion);
		Thread.sleep(1000);

		Thread.sleep(1000);
		Accredn_Attachmnt.sendKeys(Inst_accreattachment);
		Thread.sleep(1000);

		Ins_Logo.sendKeys(Inst_logo);
		Create_button.click();
		Thread.sleep(2000);
		

		
		
		WebElement Manage_Items1 = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[2]/a");
		Manage_Items1.click();
		

		WebElement Manage_Inst_admin = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage Institute Admins')]");
		Manage_Inst_admin.click();
		
		WebElement add_inst_admin = GWait.Wait_GetElementByLinkText("Add IEC Admin");
		add_inst_admin.click();
		
		
		Thread.sleep(6000);

		String admin_first_name = r1.getCell(7, 2).getContents();

		String admin_last_name = r1.getCell(8, 2).getContents();
		String admin_dob = r1.getCell(9, 2).getContents();

		String admin_email = r1.getCell(10, 2).getContents();

		String admin_contact_number = r1.getCell(11, 2).getContents();

		String admin_department = r1.getCell(12, 2).getContents();

		String admin_designation = r1.getCell(13, 2).getContents();

		String admin_qualifications = r1.getCell(14, 2).getContents();

		String admin_registration_number = r1.getCell(15, 2).getContents();

		String admin_photo = r1.getCell(16, 2).getContents();

		String admin_appointment_letter = r1.getCell(17, 2).getContents();

		String admin_curriculum_vitae = r1.getCell(18, 2).getContents();
		
		String Admin_Role = r1.getCell(3, 1).getContents();

		Thread.sleep(6000);

		Select select = new Select(iec_admin_institute);
		select.selectByVisibleText(Inst_tite);

		iec_admin_first_name.sendKeys(admin_first_name);
		Thread.sleep(1000);
		iec_admin_last_name.sendKeys(admin_last_name);
		Thread.sleep(1000);
		iec_admin_date_of_birth.sendKeys(admin_dob);
		Thread.sleep(1000);
		iec_admin_email.sendKeys(admin_email);
		Thread.sleep(1000);
		iec_admin_contact_number.sendKeys(admin_contact_number);
		Thread.sleep(1000);
		iec_admin_photo.sendKeys(admin_photo);
		Thread.sleep(1000);
		Select select1 = new Select(iec_admin_department);
		select1.selectByVisibleText(admin_department);
		Thread.sleep(1000);
		Select select_1 = new Select(iec_admin_designation);

		select_1.selectByVisibleText(admin_designation);
		Thread.sleep(1000);
		iec_admin_qualifications.sendKeys(admin_qualifications);
		Thread.sleep(1000);
		iec_admin_registration_number.sendKeys(admin_registration_number);
		Thread.sleep(1000);
		iec_admin_appointment_letter.sendKeys(admin_appointment_letter);
		Thread.sleep(1000);
		iec_admin_curriculum_vitae.sendKeys(admin_curriculum_vitae);
		
		WebElement Submit_button = GWait.Wait_GetElementById("add_iec_admin_details");
		Submit_button.click();
		

		
		GlobalMethods.AdminMail(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin",
				"qualeetee602@gmail.com", "qa123456");
		


		GlobalMethods.Admin_Login_update();

		
	
		Sheet r2 = wb.getSheet("Institute_Creation1");
		String Inst_heading = r2.getCell(2,47).getContents();
		
		
		/*String Institute_Title1 = r1.getCell(3,47).getContents();
		String Address1 = r1.getCell(4,47).getContents();
		String DCGI_Registration_Number1 = r1.getCell(5,47).getContents();
		
		String Accreditation1 = r1.getCell(6,47).getContents();*/
		
		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();

		Assert.assertEquals(Page_heading.getText().trim(), Inst_heading);
		

		Assert.assertEquals(Inst_name_details.getText().trim(), Inst_tite);
		/*String Inst_name_details_1 = Inst_name_details.getText();
		Inst_tite.equalsIgnoreCase(Inst_name_details_1);
		System.out.println(Inst_name_details_1);*/

		Assert.assertEquals(Inst_addr_detais.getText().trim(), Inst_address);
		/*String Inst_addr_details_1 = Inst_addr_detais.getText();
		Inst_address.equalsIgnoreCase(Inst_addr_details_1);
		System.out.println(Inst_addr_details_1);*/

		Assert.assertEquals(Inst_DCGI_Reg_num_details.getText().trim(), Inst_number);
		/*String Inst_DCGI_Reg_num_details_1 = Inst_DCGI_Reg_num_details.getText();
		Inst_number.equalsIgnoreCase(Inst_DCGI_Reg_num_details_1);
		System.out.println(Inst_DCGI_Reg_num_details_1);
*/
		Assert.assertEquals(Inst_accrd_details.getText().trim(), Inst_accredtion);
		/*String Inst_accrd_details_1 = Inst_accrd_details.getText();
		Inst_accredtion.equalsIgnoreCase(Inst_accrd_details_1);
		System.out.println(Inst_accrd_details_1);*/

		String dcgifile = dgci_file.getText();
		System.out.println(dcgifile);
		String accrifile = accri_file.getText();
		System.out.println(accrifile);
		String instlogo = inst_logo.getText();
		System.out.println(instlogo);

		
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

	}

	// Check for 'Edit Institute' link functionality
	public void CRe4_849() throws Exception {



		GlobalMethods.Admin_Login_update();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		
		Sheet r1 = wb.getSheet("Institute_Creation1");
		
		String Inst_heading = r1.getCell(2,49).getContents();
		String Inst_edit_heading = r1.getCell(3,49).getContents();
		

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();

		WebElement Edit_Inst = GWait.Wait_GetElementByLinkText("Edit Institute");
		Edit_Inst.click();
		
		

		Assert.assertEquals(Page_heading.getText().trim(), Inst_edit_heading);
		
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

	}

	// Check for 'Edit institute' with blank data
	public void CRe4_850() throws Exception {



		GlobalMethods.Admin_Login_update();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");
		
		String Inst_alert = r1.getCell(15,53).getContents();
		String addrs_alert = r1.getCell(16,53).getContents();
		
	
		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();

		WebElement Edit_Inst = GWait.Wait_GetElementByLinkText("Edit Institute");
		Edit_Inst.click();

		String Institute_edit_1 = r1.getCell(6,51).getContents();

		Assert.assertEquals(Page_heading.getText().trim(), Institute_edit_1);
		

		Inst_Title.clear();
		Thread.sleep(1000);
		Adds.clear();
		Thread.sleep(1000);
		DCGI_Reg_Numr.clear();
		Thread.sleep(1000);

		DCGI_Reg_Letter_Upload_attachmnt.clear();
		Thread.sleep(1000);

		Accredn.clear();
		Thread.sleep(1000);

		
		Accredn_Attachmnt.clear();
		Thread.sleep(1000);

		Ins_Logo.clear();
		
		
		WebElement Inst_edit_update_button = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button.click();
		Thread.sleep(5000);
		
		Assert.assertEquals(Inst_title_edit_alert.getText().trim(), Inst_alert);
		Assert.assertEquals(Inst_addr_edit_alert.getText().trim(), addrs_alert);
		
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();

	}

	// Check for 'Edit institute' with invalid data & Check for update
	// institution form with invalid file uploads
	public void CRe4_851_852() throws Exception {



		GlobalMethods.Admin_Login_update();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		String Institute_Title_1 = r1.getCell(2,53).getContents();
		String Address_1 = r1.getCell(3,53).getContents();
		
		String DCGI_Registration_Letter_Upload_attachment_1 = r1.getCell(4,53).getContents();
		String DCGI_Registration_Letter_Upload_attachment_2 = r1.getCell(5,53).getContents();
		String DCGI_Registration_Letter_Upload_attachment_3 = r1.getCell(6,53).getContents();
		String Accrediation_Attachment_1 = r1.getCell(7,53).getContents();
		String Accrediation_Attachment_2 = r1.getCell(8,53).getContents();
		String Accrediation_Attachment_3 = r1.getCell(9,53).getContents();
		
		String Institute_Logo_1 = r1.getCell(10,53).getContents();
		String Institute_Logo_2 = r1.getCell(11,53).getContents();
		String Institute_Logo_3 = r1.getCell(12,53).getContents();

		String DCGI_msg = r1.getCell(13,53).getContents();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();

		WebElement Edit_Inst = GWait.Wait_GetElementByLinkText("Edit Institute");
		Edit_Inst.click();

		

		
		WebElement Inst_Title = GWait.Wait_GetElementById("inst_name");

		Inst_Title.clear();
		
		WebElement Inst_edit_update_button = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button.click();

		Thread.sleep(4000);

		String errorone = r1.getCell(15,53).getContents();
		String errortwo = r1.getCell(16,53).getContents();

		
		Assert.assertEquals(Inst_title_edit_alert.getText().trim(), errorone);
		
		Thread.sleep(2000);

		Inst_Title.sendKeys(Institute_Title_1);

		Adds.clear();
		
		WebElement Inst_edit_update_button1 = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button1.click();
		Assert.assertEquals(Inst_addr_edit_alert.getText().trim(), errortwo);
		
		Thread.sleep(2000);
		Adds.sendKeys(Address_1);

		DCGI_Reg_Letter_Upload_attachmnt.sendKeys(DCGI_Registration_Letter_Upload_attachment_1);

		WebElement Inst_edit_update_button2 = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button2.click();

		//String message1 = Error_Upload.getText();
		Assert.assertEquals(Error_Upload.getText().trim(), DCGI_msg);
		//message1.equalsIgnoreCase(DCGI_msg);
		// assertEquals(DCGI_msg,message1);
		//System.out.println(message1);

		DCGI_Reg_Letter_Upload_attachmnt.sendKeys(DCGI_Registration_Letter_Upload_attachment_2);

		//String message3 = Error_Upload.getText();
		Assert.assertEquals(Error_Upload.getText().trim(), DCGI_msg);
		//message3.equalsIgnoreCase(DCGI_msg);
		// assertEquals(DCGI_msg,message3);
		//System.out.println(message3);

		DCGI_Reg_Letter_Upload_attachmnt.sendKeys(DCGI_Registration_Letter_Upload_attachment_3);

		Assert.assertEquals(Error_Upload.getText().trim(), DCGI_msg);
		/*String message4 = Error_Upload.getText();
		message4.equalsIgnoreCase(DCGI_msg);
		// assertEquals(DCGI_msg,message4);
		System.out.println(message4);*/
		Thread.sleep(2000);

		Thread.sleep(2000);
		Accredn_Attachmnt.sendKeys(Accrediation_Attachment_1);
		WebElement Inst_edit_update_button3 = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button3.click();
		Thread.sleep(2000);

		String Acc_msg = r1.getCell(17,53).getContents();
		Assert.assertEquals(Error_Upload_Accr.getText().trim(), Acc_msg);
		//String message_1 = Error_Upload_Accr.getText();
		//message_1.equalsIgnoreCase(Acc_msg);

		

		Accredn_Attachmnt.sendKeys(Accrediation_Attachment_2);
		Assert.assertEquals(Error_Upload_Accr.getText().trim(), Acc_msg);
		/*String message_3 = Error_Upload_Accr.getText();
		message_3.equalsIgnoreCase(Acc_msg);

		System.out.println(message3);*/

		Accredn_Attachmnt.sendKeys(Accrediation_Attachment_3);
		Assert.assertEquals(Error_Upload_Accr.getText().trim(), Acc_msg);
		
		

		Ins_Logo.sendKeys(Institute_Logo_1);
		WebElement Inst_edit_update_button4 = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button4.click();

		String logo_msg = r1.getCell(18,53).getContents();
		Assert.assertEquals(Error_Upload_Insti.getText().trim(), logo_msg);
		

		Ins_Logo.sendKeys(Institute_Logo_2);
		Assert.assertEquals(Error_Upload_Insti.getText().trim(), logo_msg);
		

		Ins_Logo.sendKeys(Institute_Logo_3);
		Assert.assertEquals(Error_Upload_Insti.getText().trim(), logo_msg);
		

		
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
		
	}

	// Check for update institution information with valid data
	public void CRe4_853() throws Exception {


       GlobalMethods.Admin_Login_update();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute");
		Sheet r2 = wb.getSheet("Institute_Creation1");
		Sheet r3 = wb.getSheet("Emails_Data");
		String Inst_tite = r3.getCell(0, 2).getContents();
		/*String Admin_Institute = r1.getCell(0, 16).getContents();
		String Adminemail = r1.getCell(1, 16).getContents();
		String Admin_Password = r1.getCell(2, 16).getContents();
		String Admin_Role = r1.getCell(3, 16).getContents();
		Thread.sleep(4000);
		
		
		GlobalMethods.driver.findElement(By.linkText(Admin_Institute)).click();
		Thread.sleep(4000);
		GlobalMethods.driver.findElement(By.id("register_email")).sendKeys(Adminemail);
		
		GlobalMethods.driver.findElement(By.id("register_password")).sendKeys(Admin_Password);
		Select dropdown = new Select(GlobalMethods.driver.findElement(By.id("register_role")));
		dropdown.selectByValue("3");
		GlobalMethods.driver.findElement(By.id("login_institute")).click();*/


		String Institute_Title_2 = r2.getCell(2,55).getContents();
		String Address_2 = r2.getCell(3,55).getContents();
		String DCGI_Registration_Number_2 = r2.getCell(4,55).getContents();

		String Accreditation_2 = r2.getCell(5,55).getContents();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/a");
		Manage_IEC.click();

		WebElement Link_Inst = GWait.Wait_GetElementByLinkText("Institution");
		Link_Inst.click();

		WebElement Edit_Inst = GWait.Wait_GetElementByLinkText("Edit Institute");
		Edit_Inst.click();

		String Institute_edit_1 = r2.getCell(6,55).getContents();

		String Page_heading_edit = Page_heading.getText();
		Institute_edit_1.equalsIgnoreCase(Page_heading_edit);

		System.out.println(Page_heading_edit);

		WebElement Inst_Title = GWait.Wait_GetElementById("inst_name");

		Inst_Title.clear();
		Inst_Title.sendKeys(Institute_Title_2);

		Thread.sleep(1000);
		Adds.clear();
		Adds.sendKeys(Address_2);

		Thread.sleep(1000);
		DCGI_Reg_Numr.clear();
		DCGI_Reg_Numr.sendKeys(DCGI_Registration_Number_2);

		Thread.sleep(1000);
		Accredn.clear();
		Accredn.sendKeys(Accreditation_2);
		WebElement Inst_edit_update_button1 = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button1.click();
		Thread.sleep(3000);
		
		WebElement Edit_Inst1 = GWait.Wait_GetElementByLinkText("Edit Institute");
		Edit_Inst1.click();
		
		
		WebElement Inst_Title1 = GWait.Wait_GetElementById("inst_name");
		Inst_Title1.clear();
		WebElement Inst_Title2 = GWait.Wait_GetElementById("inst_name");
		Inst_Title2.sendKeys(Inst_tite);
		WebElement Inst_edit_update_button = GWait.Wait_GetElementByXpath("//input[@value='Update']");
		Inst_edit_update_button.click();
		
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();
		

	}

}
