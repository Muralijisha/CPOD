package CLMaster;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.Baseclass.BaseClass;



public class SalesforceCustomerPortal extends BaseClass {
	@FindBy(id = "navMyLists")
	WebElement myList;

	@FindBy(id = "listssubnavs")
	WebElement addList;

	@FindBy(id = "addListSection")
	WebElement addCRMBtn;

	@FindBy(id = "folderName")
	WebElement folderDropDown;

	@FindBy(xpath = "//*[@id='folderName']//option")
	List<WebElement> folderDropDownMenu;

	@FindBy(id = "reportName")
	WebElement reportDropDownMenu;

	@FindBy(id = "reportName")
	WebElement reportNameMenu;

	@FindBy(id = "listName")
	WebElement SaveAsBtn;

	@FindBy(id = "uploader")
	WebElement chooseFile;

	@FindBy(id = "uploadnextbtn_0")
	WebElement nextBtn;

	@FindBy(xpath = "//div[@id='mappedCallerIdGroup']/./preceding-sibling::div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix ui-draggable-handle']/button/span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	WebElement closeAlert;

	@FindBy(id = "calleridmode")
	WebElement callerIDMode;

	@FindBy(id = "//select[@id='calleridmode']/option[contains(text(),'Custom')]")
	WebElement custom;

	@FindBy(id = "allCalleridvalue")
	WebElement all;

	@FindBy(xpath = "//*[@id='reportName']/option[text()='All Contact']")
	WebElement all_Contact;

	@FindBy(xpath = "//div[@id='DivCallerIdList']/./preceding-sibling::div[@class='ui-dialog-titlebar ui-corner-all ui-widget-header ui-helper-clearfix ui-draggable-handle']/button/span[@class='ui-button-icon ui-icon ui-icon-closethick']")
	WebElement closeAlert2;

	@FindBy(id = "timezoneest")
	WebElement timeZone_EST;

	@FindBy(id = "timezonecst")
	WebElement timeZone_CST;

	@FindBy(id = "timezonemst")
	WebElement timeZone_MST;

	@FindBy(id = "timezonepst")
	WebElement timeZone_PST;

	@FindBy(id = "uploadnextbtn_1")
	WebElement nextBtn2;

	@FindBy(id = "uploadnextbtn_2")
	WebElement nextBtn3;

	@FindBy(id = "uploadclose_btn")
	WebElement closeBtn;

	@FindBy(id="listnamesearch")
	WebElement searchbar;
	
	@FindBy(id="searchlistbtn")
	WebElement searchicon;
	
	@FindBy(xpath="//div[contains(text(),'Upload')]/parent::td/./preceding-sibling::td/input")
	WebElement checkBoxUploadList;

	@FindBy(id = "menu_cadences-btnIconEl")
	WebElement cadencesTab;

	@FindBy(id = "navMySession1")
	WebElement mySession;

	@FindBy(xpath = "//li[@id='navMultitouchHome']//a[contains(text(),'TruCadence')]")
	WebElement trucadenceTab;

	@FindBy(id = "user-account-title")
	WebElement userAccountBtn;

	@FindBy(id = "navMyLists")
	WebElement myList1;

	@FindBy(xpath = "//*[@name='listtodelete']")
	List<WebElement> checkbox;

	@FindBy(xpath = "//div[contains(text(),'Upload')]/parent::td/./preceding-sibling::td/input")
	WebElement checkBox_UploadList;

	@FindBy(xpath = "//*[@class='my-list-listname1']")
	List<WebElement> listOfNames;

	@FindBy(id = "beginDialingSessionButton")
	WebElement beginUploadBtn;

	@FindBy(id = "mysession_dialer_mode")
	WebElement dialerMode;

	@FindBy(id = "pd-btn")
	WebElement personalDialerBtn;

	@FindBy(id = "td-btn")
	WebElement teamDialerBtn;

	@FindBy(id = "btnContinueToSession")
	WebElement continueBtn;

	@FindBy(id = "numberToCall")
	WebElement numberInputField;

	@FindBy(id = "callme")
	WebElement callMe;
	
	@FindBy(id = "calleridmode")
	WebElement callerIDBtn;

	@FindBy(id = "coutrycodeprefixed")
	WebElement countryCodeCheckBox;

	@FindBy(xpath = "//*[@id='callmesection1']/font/div/div[contains(text(),' Call Now')]")
	WebElement callNow;
	
	@FindBy(xpath = "(//*[@class='ui-button-icon ui-icon ui-icon-closethick'])[2]")
	WebElement alertBoxCloseBtn;
	
	@FindBy(xpath="(//span[@class='ui-button-icon ui-icon ui-icon-closethick'])[3]")
	WebElement alertBox;
	
	
	@FindBy(id = "sessionstartbutton")
	WebElement startSessionBtn;

	@FindBy(id = "setSessionFromBegin")
	WebElement startSessionFromBeginning;

	@FindBy(id = "submit_button")
	WebElement beginDiallingBtn;

	@FindBy(id = "pcdHangupButton")
	WebElement HangUpBtn;

	@FindBy(xpath = "//*[@class='tdControl']")
	WebElement callResultBtn;

	@FindBy(id = "completed_activity_screencall_disposition")
	WebElement callDispositionBtn;

	@FindBy(xpath = "//td[@class='tdControl']/textarea[@id='completed_activity_screencall_comments']")
	WebElement comments;

	@FindBy(id = "savendialnxtconctbtn")
	WebElement dialNextContactBtn;

	@FindBy(id = "esavenholdbtn")
	WebElement closeBtn2;

	@FindBy(xpath = "//button[contains(text(),'Close') and @class='rbutton btn btn-danger']")
	WebElement closeBtn1;

	@FindBy(xpath = "//li[@id='sessionend']//img[@class='btn']")
	WebElement endSession;

	@FindBy(xpath = "//div[contains(text(),'0000000000000000000000000000z')]/parent::td/parent::tr//td[@class='my-list-delete']/span")
	WebElement archive;
	
	@FindBy(xpath="//button[@id='esavenholdbtn']")
	WebElement closeandholdBtn;
	

	public SalesforceCustomerPortal() {
		PageFactory.initElements(driver, this);
	}

	public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	public void uploadCRMFile_MyList() throws InterruptedException {

		myList.click();
		addList.click();
		addCRMBtn.click();
		Thread.sleep(6000);
		folderDropDown.click();

		for (int i = 0; i < folderDropDownMenu.size(); i++) {
			if (folderDropDownMenu.get(i).getText().contains(prop.getProperty("Reports"))) {
				System.out.println(folderDropDownMenu.get(i).getText());
				folderDropDownMenu.get(i).click();
				break;
			} else {
				JavascriptExecutor js0 = (JavascriptExecutor) driver;
				js0.executeScript("window.scrollBy(0,350)", "");
				folderDropDownMenu.get(i).click();
			}

		}

		reportDropDownMenu.click();
		Select se1 = new Select(reportNameMenu);
		se1.selectByVisibleText(prop.getProperty("ReportName"));

	

		
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.moveToElement(SaveAsBtn).click();
		
		SaveAsBtn.clear();
		
		SaveAsBtn.sendKeys(prop.getProperty("saveAsFileName"));
		nextBtn.click();

		Thread.sleep(3000);
		if(alertBoxCloseBtn.isDisplayed())
		{
		alertBoxCloseBtn.click();
		}
		Select callerID = new Select(callerIDBtn);
		callerID.selectByVisibleText("Random");
		Thread.sleep(3000);
		timeZone_EST.click();
		timeZone_CST.click();
		timeZone_MST.click();
		timeZone_PST.click();
		Thread.sleep(2000);
		nextBtn2.click();
		Thread.sleep(2000);
		closeBtn.click();
		myList.click();
		/*
		 * for (int i = 0; i < listOfNames.size(); i++) { if
		 * (listOfNames.get(i).getText().equals(prop.getProperty("saveAsFileName"))) {
		 * listOfNames.get(i).click(); break; }
		 * 
		 * Thread.sleep(3000);
		 * 
		 * }
		 */
		Thread.sleep(5000);
		searchbar.sendKeys(prop.getProperty("saveAsFileName"));
		searchicon.click();
		Thread.sleep(5000);
		checkBoxUploadList.click();

		Actions acs=new Actions(driver);
		beginUploadBtn.click();
		Thread.sleep(8000);
		acs.moveToElement(continueBtn).click().build().perform();
		Thread.sleep(4000);
		dialerMode.click();
		Thread.sleep(4000);
		personalDialerBtn.click();

		if (isAlertPresent()) {
			Alert alerts = driver.switchTo().alert();
			alerts.accept();
			System.out.println("alert was present and accepted");

		}
		else {
			System.out.println("No alert present");
		}
		callMe.click();
		Thread.sleep(3000);
		numberInputField.clear();
		numberInputField.clear();
		numberInputField.sendKeys(prop.getProperty("phonenumber"));
		countryCodeCheckBox.click();
		callNow.click();
		Thread.sleep(30000);
		startSessionBtn.click();
		Thread.sleep(6000);
		/*
		 * if(alertBox.isDisplayed()) { alertBox.click(); }
		 */
Thread.sleep(4000);
		
		Select callerID1 = new Select(callerIDMode);
		callerID1.selectByVisibleText("Random");
		
		
		startSessionFromBeginning.click();
		beginDiallingBtn.click();
		explicitWait(driver, 60, HangUpBtn);
		HangUpBtn.click();

		Select calldisposition = new Select(callDispositionBtn);
		calldisposition.selectByVisibleText("Qualified Lead");
		dialNextContactBtn.click();

		Thread.sleep(10000);
		HangUpBtn.click();

		Select calldisposition2 = new Select(callDispositionBtn);
		calldisposition2.selectByVisibleText("Meeting Scheduled");
		dialNextContactBtn.click();

		Thread.sleep(10000);
		HangUpBtn.click();

		Select calldisposition3 = new Select(callDispositionBtn);
		calldisposition3.selectByVisibleText("Not Interested");
		dialNextContactBtn.click();

		Thread.sleep(10000);
		HangUpBtn.click();

		Select calldisposition4 = new Select(callDispositionBtn);
		calldisposition4.selectByVisibleText("Not a Decision Maker");

		Thread.sleep(3000);
		comments.sendKeys("Done");
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,1000)");

		closeandholdBtn.click();
		Thread.sleep(4000);
		endSession.click();
		
		Thread.sleep(8000);

	}

}

