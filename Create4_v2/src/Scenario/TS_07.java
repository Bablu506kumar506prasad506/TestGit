package Scenario;

import java.io.FileInputStream;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import GlobalMethod.GlobalMethods;
import GlobalMethod.GlobalWait;
import jxl.Sheet;
import jxl.Workbook;

//Check for member registration mail functionality
public class TS_07 {
	
	public TS_07() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}
	
	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);
	
	
	@FindBy(xpath="//a[contains(text(),'Manage Items')]")
	private WebElement Manage_Items;	
	
	@FindBy(linkText="Manage IEC Members")
	WebElement Manage_IEC_Mem;
	
	@FindBy(linkText="Add IEC member")
	WebElement add_iec_mem;
	
	@FindBy(id="add_iec_member_first_name")
	WebElement add_iec_first_name;
	
	@FindBy(id="add_iec_member_last_name")
	WebElement add_iec_last_name;
	
	@FindBy(id="add_iec_member_emp_id")
	WebElement add_iec_emp_id;
	
	@FindBy(id="add_iec_member_date_of_birth")
	WebElement add_iec_dob;
	
	@FindBy(id="add_iec_member_email")
	WebElement add_iec_email;
	
	@FindBy(id="add_iec_member_contact_number")
	WebElement add_iec_contact_number;
	
	@FindBy(id="add_iec_member_photo")
	WebElement add_iec_mem_photo;
	
	@FindBy(id="add_iec_member_department")
	WebElement add_iec_dept;
	
	@FindBy(id="add_iec_member_designation")
	WebElement add_iec_desg;
	
	@FindBy(id="add_iec_member_curriculum_vitae")
	WebElement add_iec_cv;
	
	@FindBy(id="add_iec_member_invitation_letter")
	WebElement add_iec_inv_letter;
	
	@FindBy(id="add_iec_member_acceptance_letter")
	WebElement add_iec_accp_letter;
	
	@FindBy(id="add_iec_member_appointment_letter")
	WebElement add_iec_accpnt_letter;
	
	@FindBy(id="add_iec_member_conflict_of_interest")
	WebElement add_iec_conflict_interest;
	
	@FindBy(id="add_iec_member_confident")
	WebElement add_iec_mem_confident;
	
	@FindBy(id="add_iec_member_add_certificate_date_of_training_sop")
	WebElement add_iec_training_sop;
	
	@FindBy(id="add_iec_member_upload_document_sop")
	WebElement add_iec_upload_doc;
	
	@FindBy(id="add_iec_member_add_certificate_date_of_gcp")
	WebElement add_iec_certificate_gcp;
	
	@FindBy(id="add_iec_member_upload_document_gcp")
	WebElement add_iec_upload_gcp;
	
	@FindBy(id="add_iec_member_add_certificate_title_ethics")
	WebElement add_iec_certificate_ethics;
	
	@FindBy(id="add_iec_member_add_certificate_date_of_training_ethics")
	WebElement add_iec_certificate_training;
	
	@FindBy(id="add_iec_member_upload_document_ethics")
	WebElement add_iec_upload_ethic;
	
	@FindBy(id="add_iec_member_details")
	WebElement add_iec_member_details;
	
	//
	
	@FindBy(xpath="html/body/div[3]/div/div[2]/ul/li[4]/a")
	private WebElement manageiec;
	
	@FindBy(linkText="Manage Ethics Committee")
	WebElement manage_ethic_committee;
	
	@FindBy(css="div.bgand-border > h3")
	WebElement ethic_heading;
	
	@FindBy(linkText="Add Ethics Committee")
	WebElement ethic_comm_add;
	
	@FindBy(xpath = "//span/a")
	WebElement logoutt;
	
	@FindBy(css="img")
	WebElement logo;
	
	//add ethic committee form field elements
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div/label")
	WebElement title;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[2]/label")
	WebElement description;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[3]/label")
	WebElement type_of_commitee;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[4]/label")
	WebElement other_info;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[5]/label")
	WebElement date;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[6]/label")
	WebElement chairperson;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[7]/label")
	WebElement member_secretary;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[8]/label")
	WebElement member;
	
	//form[@id='ethic_committee_submission']/div/div[8]/label
	
	@FindBy(id="save_ethic_committee_details")
	WebElement submit;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div/div/p")
	WebElement alert_1;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[3]/div/p")
	WebElement alert_2;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[6]/div/p")
	WebElement alert_3;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[7]/div/p")
	WebElement alert_4;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[8]/div[2]/div/p")
	WebElement alert_5;
	
	@FindBy(id="save_ethic_committee_details")
	WebElement submit_ethic_comm;
	
	@FindBy(xpath="html/body/div[3]/div/div[2]/ul/li[4]/ul/li[7]/a")
	WebElement manage_iec_comm;
	
	@FindBy(linkText="Add IEC member")
	WebElement add_iec_member;
	
	@FindBy(id="add_iec_member_first_name")
	WebElement add_iec_firstname;
	
	@FindBy(id="add_iec_member_last_name")
	WebElement add_iec_lastname;
	
	
	
	@FindBy(id="add_iec_member_email")
	WebElement add_iec_mail;
	
	@FindBy(id="add_iec_member_details")
	WebElement add_iec_button;
	
	@FindBy(id="ethic_committee_title")
	WebElement add_ethic_title;
	
	@FindBy(id="ethic_committee_description")
	WebElement add_ethic_desc;
	
	@FindBy(id="ethic_committee_type_select")
	WebElement add_ethic_comm;
	
	@FindBy(id="ethic_committee_info")
	WebElement add_ethic_info;
	
	@FindBy(id="ethic_committee_date")
	WebElement add_ethic_date;
	
	@FindBy(id="ethic_committee_chair_person")
	WebElement add_ethic_cp;
	
	@FindBy(id="ethic_committee_member_secretary")
	WebElement add_ethic_ms;
	
	@FindBy(xpath="//form[@id='ethic_committee_submission']/div/div[8]/div/div[5]/input")
	WebElement add_ethic_button;
	
	@FindBy(id="ethic_committee_iec_member_id")
	WebElement add_mem_check;
	
	@FindBy(xpath="//th[3]/a/span[2]")
	WebElement name_list;
	
	@FindBy(xpath="//th[4]/a/span[2]")
	WebElement type_list;
	
	@FindBy(xpath="//th[5]/span")
	WebElement ms_list;
	
	@FindBy(xpath="//th[6]/span")
	WebElement cp_list;
	
	@FindBy(xpath="//th[7]/a/span[2]")
	WebElement status_list;
	
	@FindBy(xpath="//th[8]/span")
	WebElement action_list;
	
	@FindBy(css="span.fa.fa-check")
	WebElement active;
	
	@FindBy(css="span.fa.fa-remove")
	WebElement deactive;
	
	@FindBy(xpath="//html/body/div[2]/div/div[3]/div/ul/li[1]/a")
	WebElement First_Institute;
	
	@FindBy(xpath="html/body/div[2]/div/div[3]/div/ul/li[2]/a")
	WebElement Second_Institute;
	
	//Principal investigator registration elements
	
			@FindBy(id = "firstname")
			WebElement register_firstname;
			
			@FindBy(id = "middlename")
			WebElement register_middlename;
			
			@FindBy(id = "lastname")
			WebElement register_lastname;
			
			@FindBy(id = "emp_id")
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
			
			@FindBy(xpath= "//div[@id='resumevalidreg']/input")
			WebElement register_resumevalid;
			
			@FindBy(id= "resume")
			WebElement register_resume;
			
			@FindBy(id= "field_terms")
			WebElement register_field_terms;
			
			@FindBy(id= "registration_submit")
			WebElement register_submit;
			
			@FindBy(linkText= "Home")
			WebElement Home_Link;
	
			@FindBy(linkText = "Register")
			WebElement register_institute;
			
			@FindBy(css = "h2.margin-none")
			WebElement login_institute;
			
			@FindBy(id = "add_iec_member_emp_id")
			WebElement emp_id;
			
	
	
	public void CRe4_146_to_149() throws Exception {


		
		GlobalMethods.Admin_Login();
		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		Manage_IEC.click();
		
		WebElement manage_iec_comm = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[4]/ul/li[7]/a");
		manage_iec_comm.click();
		
		
		
		
		//creating ten members 
		for(int i=1;i<=10;i++)
		{
			
			FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
			Workbook wb = Workbook.getWorkbook(fi);
			
			Sheet r1 = wb.getSheet("Emails_Data");

			String frstname = r1.getCell(0, 4).getContents();
			String lstname = r1.getCell(1, 4).getContents();
			String dob = r1.getCell(2, 4).getContents();
			String email = r1.getCell(3, 4).getContents();
			String emp = r1.getCell(4, 4).getContents();
			String ph = r1.getCell(5, 4).getContents();
			
			Thread.sleep(4000);
			
			add_iec_member.click();
		
			Thread.sleep(1000);
			add_iec_firstname.sendKeys(frstname);
			Thread.sleep(1000);
			add_iec_lastname.sendKeys(lstname);
			Thread.sleep(1000);
			add_iec_dob.sendKeys(dob);
			Thread.sleep(1000);
			add_iec_mail.sendKeys(email);
			Thread.sleep(1000);
			emp_id.sendKeys(emp);
			Thread.sleep(1000);
			add_iec_contact_number.sendKeys(ph);
			Thread.sleep(1000);
		
			add_iec_button.click();
		
		
		}
		
		//creating ethic committee using above created memebers then mail will be delivered to the users
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
        Sheet r1 = wb.getSheet("Emails_Data");
		
		String title = r1.getCell(6, 4).getContents();
		String description = r1.getCell(6, 5).getContents();
		String info = r1.getCell(6, 6).getContents();
		String date = r1.getCell(6, 7).getContents();
		Thread.sleep(1000);
		
		WebElement Manage_IEC1 = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		Manage_IEC1.click();
		
		WebElement manage_ethic_committee = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_ethic_committee.click(); 
			
		WebElement ethic_comm_add = GWait.Wait_GetElementByLinkText("Add Ethics Committee");
		ethic_comm_add.click();
				
		
		
		add_ethic_title.sendKeys(title);
		add_ethic_desc.sendKeys(description);
		
		Select dropdown = new Select(add_ethic_comm);
		dropdown.selectByValue("1");
		
		add_ethic_info.sendKeys(info);
		
		add_ethic_date.sendKeys(date);
		//Select dropdown = new Select(add_ethic_info);
		//dropdown.selectByValue("1090");
		Select select1 = new Select(add_ethic_cp);
        select1.selectByVisibleText("Chairperson IEC");
       
        Select select2 = new Select(add_ethic_ms);
        select2.selectByVisibleText("Member Secretary");
        
        
       add_mem_check.click();
        
        
       add_mem_check.click();
        
       
        add_mem_check.click();
        
        
        add_mem_check.click();
        
       
        add_mem_check.click();
        
        
        add_mem_check.click();
        
       
        add_ethic_button.click();
        
        
        WebElement logoutt = GWait.Wait_GetElementByXpath("//span[3]/a");
		logoutt.click();
		
		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();
        
		GlobalMethods.MS_MemMail("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin","qualeetee602@gmail.com" ,"qa123456");
		
		
	}
	

}
