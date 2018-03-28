package Scenario;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GlobalMethod.GlobalMethods;
import GlobalMethod.GlobalWait;
import jxl.Sheet;
import jxl.Workbook;

/*
 * Check for the Institute Home page details after click on particular institute.
 */

public class TS_02A {

	public TS_02A() {
		PageFactory.initElements(GlobalMethods.driver, this);
	}

	GlobalWait GWait = new GlobalWait(GlobalMethods.driver);
	Actions action = new Actions(GlobalMethods.driver);

	@FindBy(xpath = "//a[contains(text(),'Manage Items')]")
	WebElement Manage_Items;

	@FindBy(css = "h2.margin-none")
	WebElement insthomeheading;

	@FindBy(css = "p")
	WebElement insthomeaddress;

	@FindBy(css = "div.col-sm-12.block > h3")
	WebElement instethic1;

	@FindBy(xpath = "//div[2]/div[2]/h3")
	WebElement instethic2;

	@FindBy(xpath = "//div[3]/h3")
	WebElement instethic3;

	@FindBy(xpath = "//div[4]/h3")
	WebElement instethic4;

	@FindBy(xpath = "//div[5]/h3")
	WebElement instethic5;

	@FindBy(xpath = "//div[6]")
	WebElement accreditaionhome;

	@FindBy(linkText = "SOPs")
	WebElement homesop;

	@FindBy(linkText = "Contact Us")
	WebElement homecont;

	@FindBy(linkText = "Feedback")
	WebElement homefeed;

	@FindBy(xpath = "//div[3]/div[2]/h3")
	WebElement homeiecnotf;

	@FindBy(xpath = "//div[3]/div[3]/h3")
	WebElement homeiecguide;

	@FindBy(linkText = "Register")
	WebElement homereg;

	@FindBy(id = "login_institute")
	WebElement homelogin;

	@FindBy(xpath = "//form/a")
	WebElement homeforgot;

	@FindBy(xpath = "//h3")
	WebElement homeabtcntnt;

	@FindBy(xpath = "//form[@id='manageethiccommittee']/div/p")
	WebElement removeid;

	@FindBy(linkText = "Manage IEC")
	WebElement ManageIEClink;

	@FindBy(linkText = "SOP")
	WebElement SOPlink;

	@FindBy(xpath = "//td[8]/a/span")
	WebElement ViewIcon;

	@FindBy(linkText = "Add SOP")
	WebElement AddSOPLink;

	@FindBy(id = "sop_title")
	WebElement TitleTextbox;

	@FindBy(id = "sop_version")
	WebElement VersionTextbox;

	@FindBy(xpath = "//div[3]/form/div[3]/div/div/div/input")
	WebElement DateEffectFromTextbox;

	@FindBy(id = "desc")
	WebElement DescriptionTextbox;

	@FindBy(id = "upload_sop")
	WebElement UploadSOPTextbox;

	@FindBy(xpath = "//p")
	WebElement AddSopAckmessage;

	@FindBy(id = "sopcreate")
	WebElement SOPSubmitButton;

	@FindBy(xpath = "//form[@id='soplist']/div/label")
	WebElement TitleLabelinEdit;

	@FindBy(xpath = "//form[@id='soplist']/div[2]/label")
	WebElement VersionLabelinEdit;

	@FindBy(xpath = "//form[@id='soplist']/div[3]/label")
	WebElement DateLabelinEdit;

	@FindBy(xpath = "//form[@id='soplist']/div[4]/label")
	WebElement DescriptionLabelinEdit;

	@FindBy(xpath = "//form[@id='soplist']/div[5]/label")
	WebElement Upload;

	// --Check for Institution Home details---//

	public void CRe4_12_14_15_21_23_24() throws Exception {

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);

		Sheet r1 = wb.getSheet("Institute_Creation1");

		String Instname = r1.getCell(1, 97).getContents();
		String address = r1.getCell(2, 97).getContents();
		String ethic1 = r1.getCell(3, 97).getContents();
		String ethic2 = r1.getCell(4, 97).getContents();
		String ethic3 = r1.getCell(5, 97).getContents();
		String ethic4 = r1.getCell(6, 97).getContents();
		String ethic5 = r1.getCell(7, 97).getContents();
		String accred = r1.getCell(8, 97).getContents();
		String soplink = r1.getCell(9, 97).getContents();
		String contactlink = r1.getCell(10, 97).getContents();
		String feedbacklink = r1.getCell(11, 97).getContents();
		String iecnotflink = r1.getCell(12, 97).getContents();
		String iecguidelink = r1.getCell(13, 97).getContents();
		String reglink = r1.getCell(14, 97).getContents();
		String loginlink = r1.getCell(15, 97).getContents();
		String forgotlink = r1.getCell(16, 97).getContents();

		String abtsftware = r1.getCell(17, 97).getContents();

		String TitTextboxExc1 = r1.getCell(26, 97).getContents();
		String VerTextboxExc1 = r1.getCell(27, 97).getContents();
		String DateExc1 = r1.getCell(28, 97).getContents();
		String DescriptionExc1 = r1.getCell(29, 97).getContents();
		String UploadExc1 = r1.getCell(30, 97).getContents();
		String SOPAckMessage1 = r1.getCell(31, 97).getContents();

		String tablefield1 = r1.getCell(32, 97).getContents();
		String tablefield2 = r1.getCell(33, 97).getContents();
		String tablefield3 = r1.getCell(34, 97).getContents();

		/*
		 * WebElement Manage_Items =
		 * GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[2]/a"
		 * ); Manage_Items.click();
		 */

		WebElement instclick = GWait.Wait_GetElementByLinkText("Research approval institute");
		instclick.click();

		Assert.assertEquals(insthomeheading.getText().trim(), Instname);

		Assert.assertEquals(insthomeaddress.getText().trim(), address);

		Assert.assertEquals(instethic1.getText().trim(), ethic1);

		Assert.assertEquals(instethic2.getText().trim(), ethic2);

		Assert.assertEquals(instethic3.getText().trim(), ethic3);

		Assert.assertEquals(instethic4.getText().trim(), ethic4);

		Assert.assertEquals(instethic5.getText().trim(), ethic5);

		String accredit = "Recognized / Accredited by:" + "\n" + accred;
		Assert.assertEquals(accreditaionhome.getText().trim(), accredit);

		Assert.assertEquals(homesop.getText().trim(), soplink);

		Assert.assertEquals(homecont.getText().trim(), contactlink);

		Assert.assertEquals(homefeed.getText().trim(), feedbacklink);

		Assert.assertEquals(homeiecnotf.getText().trim(), iecnotflink);

		Assert.assertEquals(homeiecguide.getText().trim(), iecguidelink);

		Assert.assertEquals(homereg.getText().trim(), reglink);

		Assert.assertEquals(homelogin.getText().trim(), loginlink);

		Assert.assertEquals(homeforgot.getText().trim(), forgotlink);

		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();

		Assert.assertEquals(homeabtcntnt.getText().trim(), abtsftware);

		// compare ethic member details on home page

		GlobalMethods.Admin_Login();

		WebElement Manage_IEC1 = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		Manage_IEC1.click();

		WebElement manage_iec_comm1 = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_iec_comm1.click();

		WebElement searchtext = GWait.Wait_GetElementByName("ethic_committee_name");
		searchtext.sendKeys(ethic1);

		WebElement search = GWait.Wait_GetElementByXpath("//input[@value='Search']");
		search.click();

		WebElement ethicone = GWait.Wait_GetElementByXpath("//td[3]");
		String ethicname = ethicone.getText();

		WebElement ethiconeview = GWait.Wait_GetElementByCSS("span.fa.fa-eye");
		ethiconeview.click();

		WebElement ethiconeeditcp = GWait.Wait_GetElementByXpath("//div[6]/div[2]/p");
		String cpname = ethiconeeditcp.getText();
		// String[] textfile = cpname.split("Email");
		System.out.println("10 " + cpname);

		WebElement ethiconeeditms = GWait.Wait_GetElementByXpath("//div[7]/div[2]/p");
		String msname = ethiconeeditms.getText();
		// System.out.println(msname);
		WebElement logoutt1 = GWait.Wait_GetElementByXpath("//span/a");
		logoutt1.click();

		WebElement cpdetails = GWait.Wait_GetElementByXpath("//div[2]/div/div/div");
		String homecp = cpdetails.getText();
		
//		System.out.println("Test text"+homecp);
		
		String[] text1 = homecp.split(" ");
		System.out.println("1"+text1[0]);
		System.out.println("2"+text1[1]);

		WebElement msdetails = GWait.Wait_GetElementByXpath("//div[2]/div/div[2]/div");
		String homems = msdetails.getText();

		String textfile1 = homecp.substring(3);

		// System.out.println(textfile1);

		String[] finalStr = textfile1.split(" ");
		System.out.println(finalStr);

		System.out.println("Test1 "+finalStr[0]);
		System.out.println("Test2 "+finalStr[1]);

		String cphome = finalStr[0] +" " + finalStr[1];
		
		String  string= cphome.substring(0, cphome.length() - 6);
		System.out.println("21 " + string);
//		System.out.println("20 " + cphome);
		Assert.assertEquals(string, cpname);

		WebElement logo1 = GWait.Wait_GetElementByCSS("img");
		logo1.click();
		// compare ethic member details on home page
		GlobalMethods.Admin_Login();

		WebElement Manage_IEC = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		Manage_IEC.click();

		WebElement manage_iec_comm = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_iec_comm.click();

		WebElement remove1 = GWait.Wait_GetElementByCSS("span.fa.fa-remove");
		remove1.click();

		Thread.sleep(1000);
		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// deactivated.");

		WebElement remove2 = GWait.Wait_GetElementByCSS("span.fa.fa-remove");
		remove2.click();

		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// deactivated.");

		WebElement remove3 = GWait.Wait_GetElementByCSS("span.fa.fa-remove");
		remove3.click();

		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// deactivated.");

		WebElement remove4 = GWait.Wait_GetElementByCSS("span.fa.fa-remove");
		remove4.click();

		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// deactivated.");

		WebElement remove5 = GWait.Wait_GetElementByCSS("span.fa.fa-remove");
		remove5.click();

		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// deactivated.");

		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

		String accredit1 = "Recognized / Accredited by:" + "\n" + accred;
		Assert.assertEquals(homeaccr.getText().trim(), accredit1);

		WebElement logo11 = GWait.Wait_GetElementByCSS("img");
		logo11.click();

		GlobalMethods.Admin_Login();

		WebElement Manage_IEC11 = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		Manage_IEC11.click();

		WebElement manage_iec_comm11 = GWait.Wait_GetElementByLinkText("Manage Ethics Committee");
		manage_iec_comm11.click();

		WebElement add1 = GWait.Wait_GetElementByCSS("span.fa.fa-check");
		add1.click();

		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// activated.");

		WebElement add2 = GWait.Wait_GetElementByCSS("span.fa.fa-check");
		add2.click();
		Thread.sleep(1000);
		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// activated.");

		WebElement add3 = GWait.Wait_GetElementByCSS("span.fa.fa-check");
		add3.click();
		Thread.sleep(1000);
		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// activated.");

		WebElement add4 = GWait.Wait_GetElementByCSS("span.fa.fa-check");
		add4.click();
		Thread.sleep(1000);
		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// activated.");

		WebElement add5 = GWait.Wait_GetElementByCSS("span.fa.fa-check");
		add5.click();
		Thread.sleep(1000);
		// Assert.assertEquals(removeid.getText().trim(), "Ethics committee is
		// activated.");

		WebElement Manage_IEC2 = GWait.Wait_GetElementByXpath("//a[contains(text(),'Manage IEC')]");
		Manage_IEC2.click();

		WebElement SOPlink = GWait.Wait_GetElementByLinkText("SOP");
		SOPlink.click();

		WebElement AddSOPLink = GWait.Wait_GetElementByLinkText("Add SOP");
		AddSOPLink.click();

		WebElement TitleTextbox = GWait.Wait_GetElementById("sop_title");
		TitleTextbox.sendKeys(TitTextboxExc1);

		VersionTextbox.sendKeys(VerTextboxExc1);
		DateEffectFromTextbox.sendKeys(DateExc1);
		Thread.sleep(2000);
		DescriptionTextbox.sendKeys(DescriptionExc1);
		UploadSOPTextbox.sendKeys(UploadExc1);
		SOPSubmitButton.click();
		Thread.sleep(5000);
		Assert.assertEquals(AddSopAckmessage.getText(), SOPAckMessage1);
		Thread.sleep(5000);
		ViewIcon.click();

		WebElement logoutt11 = GWait.Wait_GetElementByXpath("//span/a");
		logoutt11.click();

		/*
		 * WebElement logo2 = GWait.Wait_GetElementByCSS("img"); logo2.click();
		 */

		WebElement soplinkhome = GWait.Wait_GetElementByLinkText("SOPs");
		soplinkhome.click();

		Assert.assertEquals(tabletitlesop.getText(), tablefield1);

		Assert.assertEquals(tablecreatesop.getText(), tablefield2);

		Assert.assertEquals(tableactionsop.getText(), tablefield3);

		GlobalMethods.AcceptDoenloadPopup();

	}

	@FindBy(xpath = "//th[2]/a/span[2]")
	WebElement tabletitlesop;

	@FindBy(xpath = "//th[3]/a/span[2]")
	WebElement tablecreatesop;

	@FindBy(xpath = "//th[4]/span")
	WebElement tableactionsop;

	public void CRe4_18_22_26_29_13() throws Exception {

		GlobalMethods.Super_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		String Institute_Title_1 = r1.getCell(18, 97).getContents();
		String Address_1 = r1.getCell(19, 97).getContents();
		String DCGI_Registration_Number_1 = r1.getCell(20, 97).getContents();
		String DCGI_Registration_Letter_Upload_attachment_1 = r1.getCell(21, 97).getContents();
		String Accreditation_1 = r1.getCell(22, 97).getContents();
		String Accrediation_Attachment_1 = r1.getCell(23, 97).getContents();
		String Institute_Logo_1 = r1.getCell(24, 97).getContents();
		String[] array = Institute_Logo_1.split("C:/Selenium_Files/Create Docs/");
		System.out.println(array[1]);

		String InstCreationAck = r1.getCell(25, 97).getContents();

		WebElement Manage_Items = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[2]/a");
		Manage_Items.click();

		WebElement Insts = GWait.Wait_GetElementByXpath("html/body/div[3]/div/div[2]/ul/li[2]/ul/li[1]/a");
		Insts.click();

		WebElement createins = GWait.Wait_GetElementByXpath("//*[@id='accordion']/li[2]/div/a");
		createins.click();

		Inst_Title.sendKeys(Institute_Title_1);
		Adds.sendKeys(Address_1);
		DCGI_Reg_Numr.sendKeys(DCGI_Registration_Number_1);
		DCGI_Reg_Letter_Upload_attachmnt.sendKeys(DCGI_Registration_Letter_Upload_attachment_1);
		Accredn.sendKeys(Accreditation_1);

		WebElement Accredn_Attachmnt = GWait.Wait_GetElementById("acc_attach");
		Accredn_Attachmnt.sendKeys(Accrediation_Attachment_1);
		Ins_Logo.sendKeys(Institute_Logo_1);

		WebElement Create_button = GWait.Wait_GetElementByXpath("//*[@id='createinstitute']/div[8]/div/input");
		Create_button.click();

		WebElement logoutt = GWait.Wait_GetElementByXpath("//span[3]/a");
		logoutt.click();
		// GlobalMethods.Logout();

		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();

		WebElement instclick = GWait.Wait_GetElementByLinkText(Institute_Title_1);
		instclick.click();

		WebElement imagetext = GWait.Wait_GetElementByCSS(".logo_size");
		String textfile = imagetext.getAttribute("src").substring(62);
		System.out.println(textfile);
		String[] finalStr = textfile.split("_");

		System.out.println(finalStr[0] + ".jpg");

		String accredit = "Recognized / Accredited by:" + "\n" + Accreditation_1;
		Assert.assertEquals(homeaccr.getText().trim(), accredit);

		String XPath = "//div[3]/div[2]/h3";
		Boolean iselementpresent = GlobalMethods.driver.findElements(By.xpath(XPath)).size() != 0;
		if (iselementpresent == true) {
			System.out.print("exists");
		} else {
			System.out.print("not exists");
		}

		String XPath1 = "//div[3]/div[3]/h3";
		Boolean iselementpresent1 = GlobalMethods.driver.findElements(By.xpath(XPath1)).size() != 0;
		if (iselementpresent1 == true) {
			System.out.print("exists");
		} else {
			System.out.print("not exists");
		}

		WebElement soplinkhome = GWait.Wait_GetElementByLinkText("SOPs");
		soplinkhome.click();

		Thread.sleep(2000);
		Assert.assertEquals(nodata.getText().trim(), "No records found");

	}

	// ---Check for IEC Notifications on institution page--//

	public void CRe4_25_27() throws Exception {

		GlobalMethods.MS_Login();

		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		for (int i = 1; i <= 5; i++) {

			String announce_title = r1.getCell(35, 97).getContents();
			String announce_desc = r1.getCell(36, 97).getContents();
			String announce_file = r1.getCell(37, 97).getContents();
			String announce_date = r1.getCell(38, 97).getContents();
			String announce_acknowledge = r1.getCell(39, 97).getContents();

			Thread.sleep(1000);

			WebElement Link_Announcements = GWait.Wait_GetElementByLinkText("Announcements");
			Link_Announcements.click();

			WebElement manage_add_announcement = GWait.Wait_GetElementByLinkText("Add Announcement");
			manage_add_announcement.click();

			WebElement manage_add_announcement_title = GWait.Wait_GetElementById("add_announcement_title");

			manage_add_announcement_title.sendKeys(announce_title);
			manage_add_announcement_description.sendKeys(announce_desc);
			Thread.sleep(2000);
			manage_add_announcement_notification_date.sendKeys(announce_date);
			manage_add_announcement_notification_file_1.sendKeys(announce_file);
			Thread.sleep(2000);

			manage_add_announcement_notification_details.click();
		}

		WebElement logoutt = GWait.Wait_GetElementByXpath("//span[3]/a");
		logoutt.click();

		String announce_title = r1.getCell(35, 97).getContents();

		Assert.assertEquals(homenotfone.getText().trim(), announce_title);

		Assert.assertEquals(homenotftwo.getText().trim(), announce_title);

		Assert.assertEquals(homenotfthree.getText().trim(), announce_title);

		Assert.assertEquals(homenotffour.getText().trim(), announce_title);

		Assert.assertEquals(homenotffive.getText().trim(), announce_title);

		String xpath = "//li[2]/a/span";
		WebElement imgElement = GlobalMethods.driver.findElement(By.xpath(xpath));
		try {
			imgElement.click();
			System.out.println("true");
		} catch (Exception e) {
			System.out.println("false");
		}

		WebElement logo = GWait.Wait_GetElementByCSS("img");
		logo.click();

	}

	public void CRe4_28_30() throws Exception {
		GlobalMethods.Admin_Login();
		FileInputStream fi = new FileInputStream("C:\\Selenium_Files\\Create4_v2\\CReATE4_Data.xls");
		Workbook wb = Workbook.getWorkbook(fi);
		Sheet r1 = wb.getSheet("Institute_Creation1");

		for (int i = 1; i <= 5; i++) {

			String ExternalTitle = r1.getCell(40, 97).getContents();
			String ExternalLink = r1.getCell(41, 97).getContents();
			String ExternalDescription = r1.getCell(42, 97).getContents();
			String ExtrnalLinkAckMsg = r1.getCell(43, 97).getContents();

			WebElement ManageIECLink = GWait.Wait_GetElementByLinkText("Manage IEC");
			ManageIECLink.click();

			WebElement ExternalLinks = GWait.Wait_GetElementByLinkText("External Links");
			ExternalLinks.click();

			WebElement CreateExternalLink = GWait.Wait_GetElementByLinkText("Create External links");
			CreateExternalLink.click();

			WebElement ExternalTitleTxtbx = GWait.Wait_GetElementById("ex_title");

			ExternalTitleTxtbx.sendKeys(ExternalTitle);
			ExternalLinkTxtbx.sendKeys(ExternalLink);
			ExternalDescriptionTxtbx.sendKeys(ExternalDescription);
			Submit.click();
		}
		WebElement logoutt = GWait.Wait_GetElementByXpath("//span/a");
		logoutt.click();

		String ExternalTitle = r1.getCell(40, 97).getContents();

		Assert.assertEquals(homeextlnk.getText().trim(), ExternalTitle);

		Assert.assertEquals(homeextlnk2.getText().trim(), ExternalTitle);

		Assert.assertEquals(homeextlnk3.getText().trim(), ExternalTitle);

		Assert.assertEquals(homeextlnk4.getText().trim(), ExternalTitle);

		Assert.assertEquals(homeextlnk5.getText().trim(), ExternalTitle);

	}

	@FindBy(xpath = "//li/a[2]")
	WebElement homeextlnk;

	@FindBy(xpath = "//li[2]/a[2]")
	WebElement homeextlnk2;

	@FindBy(xpath = "//li[3]/a[2]")
	WebElement homeextlnk3;

	@FindBy(xpath = "//li[4]/a[2]")
	WebElement homeextlnk4;

	@FindBy(xpath = "//li[5]/a[2]")
	WebElement homeextlnk5;

	@FindBy(id = "ex_title")
	WebElement ExternalTitleTxtbx;

	@FindBy(id = "ex_link")
	WebElement ExternalLinkTxtbx;

	@FindBy(id = "ex_desc")
	WebElement ExternalDescriptionTxtbx;

	@FindBy(xpath = "html/body/div[4]/div[1]/div/div[2]/div[3]/div[1]/p")
	WebElement ExternalLinkAckMsg;

	@FindBy(xpath = ".//*[@id='externallinks']/div[5]/div/input")
	WebElement Submit;

	@FindBy(xpath = "//td/span")
	WebElement nodata;

	@FindBy(xpath = "//div/div/div/div[2]/div")
	WebElement homeaccr;

	@FindBy(xpath = "//*[@id='accordion']/li[2]/div/a")
	WebElement createins;

	@FindBy(id = "inst_name")
	WebElement Inst_Title;

	@FindBy(id = "inst_address")
	WebElement Adds;

	@FindBy(id = "cgi_des")
	WebElement DCGI_Reg_Numr;

	@FindBy(id = "cgi_attach")
	WebElement DCGI_Reg_Letter_Upload_attachmnt;

	@FindBy(xpath = "//input[@value='Create']")
	WebElement CreateButton;

	@FindBy(xpath = "//form[@id='createinstitute']/div[8]/div/button")
	WebElement Backbutton;

	@FindBy(id = "accrediation_desc")
	WebElement Accredn;

	@FindBy(id = "acc_attach")
	WebElement Accredn_Attachmnt;

	@FindBy(id = "inst_logo")
	WebElement Ins_Logo;

	@FindBy(xpath = "//*[@id='createinstitute']/div[8]/div/input")
	WebElement Create_button;

	@FindBy(id = "add_announcement_title")
	WebElement manage_add_announcement_title;

	@FindBy(id = "add_announcement_description")
	WebElement manage_add_announcement_description;

	@FindBy(id = "add_announcement_notification_date")
	WebElement manage_add_announcement_notification_date;

	@FindBy(id = "add_announcement_notification_file_1")
	WebElement manage_add_announcement_notification_file_1;

	@FindBy(id = "add_more_announcement_button")
	WebElement manage_add_more_announcement_button;

	@FindBy(id = "add_announcement_notification_details")
	WebElement manage_add_announcement_notification_details;

	@FindBy(xpath = "//form[@id='manageannouncementlist']/div/p")
	WebElement manage_acknowledge;

	@FindBy(css = "a > span")
	WebElement homenotfone;

	@FindBy(xpath = "//li[2]/a/span")
	WebElement homenotftwo;

	@FindBy(xpath = "//li[3]/a/span")
	WebElement homenotfthree;

	@FindBy(xpath = "//li[4]/a/span")
	WebElement homenotffour;

	@FindBy(xpath = "//li[5]/a/span")
	WebElement homenotffive;

	public void CRe4_16() throws Exception {
		System.out.println("Later we will check this feature");
	}
}
