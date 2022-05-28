package com.at.Prospectmodule;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;


public class Workflow extends BaseClass {

	@FindBy(xpath = "//a[@title='Prospects']")
	WebElement prospectTab;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBar;
	
	@FindBy(xpath = "//input[@name='filterName']")
	WebElement filterBar;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	WebElement checkbox_Prospects1;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	WebElement checkbox_Prospects2;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
	WebElement checkbox_Prospects3;

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")
	WebElement checkbox_Prospects4;



	@FindBy(xpath = "//button[contains(text(),'Action')]")
	WebElement actionButton;

	@FindBy(xpath = "//div[text()='Assign']")
	WebElement assignButton;

	@FindBy(xpath = "//a[@title='Cadence To-Do']")
	WebElement toDOButton;

	@FindBy(xpath = "//input[@name='cadence']/parent::div//div[@class='input-group-append']//button[@class='btn btn-secondary']")
	WebElement dropdown;

	@FindBy(xpath = "//div[@class='dropdown-menu show']/button")
	List<WebElement> ListDropdown;

	@FindBy(xpath = "(//div[@class='dropdown-menu show']/button)[1]")
	WebElement dropDownValue;

	@FindBy(xpath = "//input[@name='cadence']")
	WebElement assignSearchField;

	@FindBy(xpath = "//button[@class='text-white btn btn-green']")
	WebElement startCadenceButton;

	@FindBy(xpath = "//strong[contains(text(),'LinkedIn')]")
	WebElement linkedINButton_ToDO;
	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBoxLinkedIN;

	@FindBy(xpath = "//i[contains(@class,'text-linkedin')]")
	WebElement linkedINActionIcon;

	@FindBy(xpath = "//button[contains(text(),'Complete Touch')]")
	WebElement linkedINCompleteTouchButton;

	@FindBy(xpath = "//button[contains(text(),'Complete Touch')]")
	WebElement linkedINCompleteTouch;

	@FindBy(xpath = "//strong[contains(text(),'Social')]")
	WebElement socialButton_ToDO;

	@FindBy(xpath = "//i[contains(@class,'text-social')]")
	WebElement socialActionIcon;

	@FindBy(xpath = "//button[@title='Call']//i[@class='fa fa-phone-alt fa-stack-1x fa-inverse']")
	WebElement callIconInsideMemberActivity;

	@FindBy(xpath = "//button[contains(text(),'Complete Touch')]")
	WebElement socialCompleteTouchButton;

	@FindBy(xpath = "//button[contains(text(),'Complete Touch')]")
	WebElement socailCompleteTouch;

	@FindBy(xpath = "//textarea[@name='comments']")
	WebElement commentSection;

	@FindBy(xpath = "//strong[contains(text(),'Email')]")
	WebElement emailbuttonPendingcalls;

	@FindBy(xpath = "//i[contains(@class,'text-email')]")
	WebElement mailIcon;

	@FindBy(xpath = "//button[contains(text(),'Personalize Email')]")
	WebElement personalizeMailCompleteButton;

	@FindBy(xpath = "//button[@class='border-white border-top-0 border-left-0 border-bottom-0 ml-2 btn btn-primary']")
	WebElement sendButton;

	@FindBy(xpath = "//span[contains(text(),'Pending Calls')]")
	WebElement pendingcallsTab;
	
	
	@FindBy(xpath="//div[contains(text(),'Pending Calls')]")
	WebElement pendingcallsText;
	
	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBoxInPendingCalls;
	
	//created element by using index
	@FindBy(xpath="//div[@class='dropdown-menu show']//button[3]")
	WebElement searchBoxInPendingCallsDD;
	
	@FindBy(xpath="//i[contains(@class,'fa-phone')]")
	WebElement elementJustToClickOutside;
	
	

	@FindBy(xpath = "//input[@name='followupAll']")
	WebElement followUpsCall_All;

	@FindBy(xpath = "//i[contains(@class,'text-call')]")////i[@class='fas fa-phone-alt fa-stack-1x fa-sm text-call']
	WebElement callIcon;

	//@FindBy(id = "numberToCall")
	//WebElement numberInputField;
	
	
	
	@FindBy(id = "call_me_to_join_number")
	WebElement numberInputField;
	
	@FindBy(id="numberToCall")
	WebElement numberInputField1;

	@FindBy(id = "country_code_prefixed")
	WebElement prefixCode;
	
	@FindBy(xpath="(//button[@class='dropdown-toggle btn btn-secondary'])[1]")
	WebElement dropDownFollowUpBtn;
	
	@FindBy(xpath="//button[@class='dropdown-item active']")
	WebElement FollowUp_All;


	@FindBy(xpath = "//button[@title='Call me']")
	WebElement callmeButton;

	@FindBy(xpath = "//button[@class='btn btn-primary' and contains(text(),'Yes')]")
	WebElement yesButton;
	
	@FindBy(xpath = "//button[contains(text(),'Leave VM')]/parent::div/parent::div/parent::div/parent::div/child::div/span/child::i[contains(@class,'fa-phone')]")
	WebElement redIconButton;
	
	@FindBy(xpath="(//i[contains(@class,'fa-inverse')])[2]")
	WebElement redIcon;
	
	@FindBy(id = "call_result")
	WebElement callResult;
	
	@FindBy(xpath= "//button[@title='Save Changes']")
	WebElement saveButton;
	
	//button[@title='Save Changes']

	@FindBy(xpath = "//span[@class='fa-stack']//i[@class='fa fa-phone-alt fa-stack-1x fa-inverse']")
	WebElement callMeInMemberActivity;

	
	@FindBy(xpath="(//i[contains(@class,'fa fa-phone')])[2]")
	WebElement phoneicon;
	
	
	@FindBy(id="pending_calls_pd")
	WebElement flowDialerCheckBox;
	
	@FindBy(id="call_comments")
	WebElement callComments;
	
	@FindBy(xpath="//span[contains(@class,'text-bold')]")
	WebElement startPowerDialing;
	
	@FindBy(xpath="//button[contains(text(),'Proceed')]")
	WebElement proceedBtn;
	
	@FindBy(id = "mysession_dialer_mode")
	WebElement dialerMode;

	@FindBy(id = "pd-btn")
	WebElement personalDialerBtn;

	@FindBy(id = "td-btn")
	WebElement teamDialerBtn;

	@FindBy(id = "btnContinueToSession")
	WebElement continueBtn;


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
	
	
	@FindBy(id = "calleridmode")
	WebElement callerIDMode;
	
	@FindBy(xpath="//li[@id='nav_cadence_home']")
	WebElement cadenceBtn;
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchBox;
	
	@FindBy(id="pending_calls_cd")
	WebElement clickDialerCheckBox;
	
	@FindBy(xpath="(//button[contains(text(),'Yes')])[2]")
    WebElement YesBtn;
	
	@FindBy(xpath="//a[@name='backtolist']")
	WebElement backBtn;
	
	@FindBy(xpath="//strong[contains(text(),'Task')]")
	WebElement taskTab;
	
	@FindBy(xpath="//i[contains(@class,'text-task')]")
	WebElement taskIcon;
	
	@FindBy(xpath="//button[contains(text(),'Complete')]")
	WebElement taskCompleteTouch;
	
	@FindBy(id="coutrycodeprefixed")
	WebElement prefixCode1;
	
	@FindBy(xpath="//button[@title='Start search']")
	WebElement searchIcon;
	
	
	
	public Workflow() {
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
	public void CadenceWorkflow() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,60);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Prospects']")));

		prospectTab.click();
		Thread.sleep(6000);
		searchBar.sendKeys(prop.getProperty("TagName")); 
		Thread.sleep(15000);
		searchBar.sendKeys(Keys.ENTER); 
		searchBar.sendKeys(Keys.ENTER);


		/*
		 * Thread.sleep(6000); Actions builder = new Actions(driver);
		 * builder.sendKeys(Keys.ENTER);
		 */
		Thread.sleep(7000);
		Actions build = new Actions(driver);
		build.moveToElement(checkbox_Prospects1).click().build().perform();
		Thread.sleep(5000);
		
		
		  build.moveToElement(checkbox_Prospects2).click().build().perform();
		  Thread.sleep(5000);
		  build.moveToElement(checkbox_Prospects3).click().build().perform();
		  Thread.sleep(5000);
		  build.moveToElement(checkbox_Prospects4).click().build().perform();
		  
		 

		//checkbox_Prospects.click();
		Thread.sleep(5000);
		actionButton.click();
		Thread.sleep(9000);
		assignButton.click();
		Thread.sleep(10000);
		dropdown.click();
		Thread.sleep(12000);
		assignSearchField.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(7000);

		//dropDownValue.click();
		// String beforexpath="//a[@title='";
			
		//	String cadencename=prop.getProperty("ViewCadence")+"']";
			
		
		String beforexpath="//button[text()='";
		String afterxpath=prop.getProperty("CadenceName1")+"']";
		
		driver.findElement(By.xpath(beforexpath+afterxpath)).click();
		
		
		
		/*
		 * for (int i = 0; i < ListDropdown.size(); i++) { if
		 * (ListDropdown.get(i).getText().contains(prop.getProperty("cadenceName"))) {
		 * System.out.println(ListDropdown.get(i).getText());
		 * ListDropdown.get(i).click();
		 * 
		 * break; } }
		 */
Thread.sleep(6000);
		startCadenceButton.click();


	Thread.sleep(200000);

	


	// Personalize Mail Thread.sleep(9000); toDOButton.click();
		//Thread.sleep(100000);
		toDOButton.click(); 
		Thread.sleep(3000);
		build.moveToElement(emailbuttonPendingcalls).click().build().perform();
		Thread.sleep(4000);
		searchBoxLinkedIN.sendKeys(prop.getProperty("CadenceName1"));
		
		searchBoxLinkedIN.sendKeys(Keys.ENTER); 
		Thread.sleep(6000);





		mailIcon.click();

		Thread.sleep(6000);
		sendButton.click();
		Thread.sleep(6000);
		mailIcon.click();

		Thread.sleep(6000); 
		sendButton.click();
		Thread.sleep(6000);

		mailIcon.click();

		Thread.sleep(6000); 
		sendButton.click(); 
		Thread.sleep(6000);
		mailIcon.click();

		Thread.sleep(6000); 
		sendButton.click(); 
		Thread.sleep(6000);
		//personalizeMailCompleteButton.click();

		Thread.sleep(400000); 
		
		toDOButton.click(); 
		Thread.sleep(6000);
		emailbuttonPendingcalls.click(); 
		Thread.sleep(4000);
		searchBoxLinkedIN.sendKeys(prop.getProperty("CadenceName1"));
		searchBoxLinkedIN.sendKeys(Keys.ENTER); 
		Thread.sleep(60000);
		prospectTab.click();
		toDOButton.click(); 
		Thread.sleep(3000);
		emailbuttonPendingcalls.click(); 
		Thread.sleep(4000);
		searchBoxLinkedIN.sendKeys(prop.getProperty("CadenceName1"));
		searchBoxLinkedIN.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		mailIcon.click();

		Thread.sleep(6000);
		sendButton.click();
		Thread.sleep(6000);
		mailIcon.click();

		Thread.sleep(6000); 
		sendButton.click();
		Thread.sleep(6000);

		mailIcon.click();

		Thread.sleep(6000); 
		sendButton.click(); 
		Thread.sleep(6000);
		mailIcon.click();

		Thread.sleep(6000); 
		sendButton.click(); 
		Thread.sleep(6000);


		// Call Touch // Call Touch
		Thread.sleep(50000);
		pendingcallsTab.click();
		Thread.sleep(6000);
		pendingcallsTab.click();
		Thread.sleep(20000);
		prospectTab.click();
		Thread.sleep(13000);
		pendingcallsTab.click();
		Thread.sleep(19000);
		prospectTab.click();
		Thread.sleep(10000);
		pendingcallsTab.click();
		Thread.sleep(10000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
	searchBoxInPendingCalls.sendKeys(Keys.ENTER);
		
		

		//searchBoxInPendingCallsDD.click();
		//pendingcallsText.click();
		//pendingcallsText.sendKeys(Keys.ENTER);
		//	elementJustToClickOutside.click();
		
		Thread.sleep(40000);
		prospectTab.click();
		Thread.sleep(12000);
		pendingcallsTab.click();
		Thread.sleep(9000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(3000);
		Actions ne= new Actions(driver);
		ne.moveToElement(searchIcon).click().build().perform();
		//searchBoxInPendingCalls.sendKeys(Keys.ENTER);
		//pendingcallsText.click();
		Thread.sleep(10000);
		//clickDialerCheckBox.click();
		Thread.sleep(10000);
		dropDownFollowUpBtn.click();
		FollowUp_All.click();
Thread.sleep(20000);
		callIcon.click();
		Thread.sleep(30000);
		//callMeInMemberActivity.click();

		// boolean booleanValue = numberInputField.isDisplayed(); if (booleanValue ==
		// true) { numberInputField.sendKeys("919790212113"); prefixCode.click();
		// callmeButton.click(); Thread.sleep(20000); yesButton.click(); } else {

		// callIconInsideMemberActivity.click();
		phoneicon.click();
		Thread.sleep(7000);
		numberInputField.clear();
		numberInputField.sendKeys(prop.getProperty("phonenumber"));
		Thread.sleep(6000);
		if(!prefixCode.isSelected())
		{
			prefixCode.click();
		}
		Thread.sleep(4000);
		callmeButton.click();
		Thread.sleep(30000);
		//yesButton.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,500)");	
		//Thread.sleep(10000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//				js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		redIcon.click();
		//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)");

		Thread.sleep(10000);
		Select se = new Select(callResult);
		se.selectByVisibleText(prop.getProperty("CallResult"));
		Thread.sleep(8000);
		saveButton.click();
		Thread.sleep(10000);

		//2 nd loop
		Thread.sleep(9000);
		pendingcallsTab.click();
		Thread.sleep(6000);
		pendingcallsTab.click();
		Thread.sleep(4000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(3000);
		Actions ne1= new Actions(driver);
		ne1.moveToElement(searchIcon).click().build().perform();
		
		//searchBoxInPendingCalls.sendKeys(Keys.ENTER);

		//searchBoxInPendingCallsDD.click();
		//pendingcallsText.click();
		//pendingcallsText.sendKeys(Keys.ENTER);
		//	elementJustToClickOutside.click();

		Thread.sleep(3000);
		//clickDialerCheckBox.click();
		Thread.sleep(6000);
		dropDownFollowUpBtn.click();
		FollowUp_All.click();

		callIcon.click();
		Thread.sleep(7000);
		
		redIcon.click();
		//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
		//js2.executeScript("window.scrollBy(0,400)");

		Thread.sleep(10000);
		Select se1 = new Select(callResult);
		se1.selectByVisibleText(prop.getProperty("CallResult"));
		Thread.sleep(8000);
		saveButton.click();
		Thread.sleep(10000);

		//3rd loop

		Thread.sleep(9000);
		pendingcallsTab.click();
		Thread.sleep(6000);
		pendingcallsTab.click();
		Thread.sleep(4000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(3000);
		Actions ne3= new Actions(driver);
		ne3.moveToElement(searchIcon).click().build().perform();
		//searchBoxInPendingCalls.sendKeys(Keys.ENTER);

		//searchBoxInPendingCallsDD.click();
		//pendingcallsText.click();
		//pendingcallsText.sendKeys(Keys.ENTER);
		//	elementJustToClickOutside.click();
		Thread.sleep(3000);
		//clickDialerCheckBox.click();

		Thread.sleep(6000);
		dropDownFollowUpBtn.click();
		FollowUp_All.click();

		callIcon.click();
		Thread.sleep(7000);
		
		redIcon.click();
		

		Thread.sleep(10000);
		Select se2 = new Select(callResult);
		se2.selectByVisibleText(prop.getProperty("CallResult"));
		Thread.sleep(8000);
		callComments.sendKeys("calltouchOther");
		Thread.sleep(8000);
		saveButton.click();
		Thread.sleep(10000);



		//4th loop
		Thread.sleep(9000);
		pendingcallsTab.click();
		Thread.sleep(6000);
		pendingcallsTab.click();
		Thread.sleep(4000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(3000);
		Actions ne4= new Actions(driver);
		ne4.moveToElement(searchIcon).click().build().perform();

		//searchBoxInPendingCallsDD.click();
		//pendingcallsText.click();
		//pendingcallsText.sendKeys(Keys.ENTER);
		//	elementJustToClickOutside.click();

		Thread.sleep(3000);
		//clickDialerCheckBox.click();
		Thread.sleep(6000);
		dropDownFollowUpBtn.click();
		FollowUp_All.click();

		callIcon.click();
		Thread.sleep(7000);
		
		redIcon.click();
		//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
		

		Thread.sleep(10000);
		Select se4= new Select(callResult);
		se4.selectByVisibleText(prop.getProperty("CallResultforLastProspect"));
		Thread.sleep(8000);
		callComments.sendKeys("Qualified lead");
		Thread.sleep(8000);
		saveButton.click();
		Thread.sleep(10000);
		//end of the 4th loop

		//Loop 1 of flow dialer

		Thread.sleep(50000);
		pendingcallsTab.click();
		Thread.sleep(6000);
		pendingcallsTab.click();
		Thread.sleep(15000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(3000);
		Actions ne5= new Actions(driver);
		ne5.moveToElement(searchIcon).click().build().perform();
        Thread.sleep(5000);
		
		//pendingcallsText.click();
	
		Thread.sleep(20000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Prospects']")));
		prospectTab.click();
		Thread.sleep(9000);
		pendingcallsTab.click();
		Thread.sleep(15000);
		searchBoxInPendingCalls.sendKeys(prop.getProperty("CadenceName1"));
		searchBoxInPendingCalls.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
		
		//pendingcallsText.click();
		Thread.sleep(3000);
		
		flowDialerCheckBox.click();

		Thread.sleep(6000);
		dropDownFollowUpBtn.click();
		FollowUp_All.click();
		
		startPowerDialing.click();
		Thread.sleep(3000);
		proceedBtn.click();

		Thread.sleep(20000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    Thread.sleep(15000);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mysession_dialer_mode")));
		 dialerMode.click();
		  Thread.sleep(4000);
		 personalDialerBtn.click();
		  
		  if (isAlertPresent()) {
			  Alert alerts = driver.switchTo().alert();
		  alerts.accept();
		  System.out.println("alert was present and accepted");
		  
		  } else { 
			  System.out.println("No alert present"); 
			  }
		 
		Thread.sleep(9000);
		callMe.click();
		
		Thread.sleep(6000);
		numberInputField1.clear();
		numberInputField1.clear();
		numberInputField1.sendKeys(prop.getProperty("phonenumber"));
		Thread.sleep(6000);
		
		if(!prefixCode1.isSelected())
		{
			prefixCode1.click();
		}
		
		Thread.sleep(9000);
		
		Actions acs=new Actions(driver);
		acs.moveToElement(callNow).click().build().perform();
		
		
		
		
		Thread.sleep(30000);
		startSessionBtn.click();
		Thread.sleep(9000);
		/*
		 * if(alertBox.isDisplayed()) { alertBox.click(); }
		 */
Thread.sleep(4000);
		
Select callerID1 = new Select(callerIDMode);
callerID1.selectByVisibleText("Random");

Thread.sleep(9000);
startSessionFromBeginning.click();
Thread.sleep(9000);
beginDiallingBtn.click();
Thread.sleep(20000);
explicitWait(driver, 90, HangUpBtn);
HangUpBtn.click();
Thread.sleep(10000);

Select calldisposition = new Select(callDispositionBtn);
calldisposition.selectByVisibleText("Qualified Lead");

Thread.sleep(10000);
JavascriptExecutor js2 = (JavascriptExecutor) driver;
js2.executeScript("window.scrollBy(0,1000)");
Thread.sleep(5000);
closeandholdBtn.click();
Thread.sleep(15000);
Actions end =new Actions(driver);
end.moveToElement(endSession).click().build().perform();

Thread.sleep(8000);

        
        Thread.sleep(10000);
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(9000);

		// LinkedIN Touch
		Thread.sleep(20000); 
		toDOButton.click();
		Thread.sleep(10000);
		linkedINButton_ToDO.click();

		Thread.sleep(4000);
		searchBoxLinkedIN.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(6000); 
		searchBoxLinkedIN.sendKeys(Keys.ENTER);
		Thread.sleep(6000); 
		//Actions builder1 = new Actions(driver);
		//builder1.sendKeys(Keys.ENTER); searchBoxLinkedIN.sendKeys(Keys.ENTER);
		//Thread.sleep(6000);

		linkedINActionIcon.click(); 
		Thread.sleep(5000);
		linkedINCompleteTouchButton.click(); 
		Thread.sleep(4000);
		
		


		// Social Touch 
		Thread.sleep(20000); 
		toDOButton.click();
		Thread.sleep(5000);
		socialButton_ToDO.click();
		Thread.sleep(4000);
		searchBoxLinkedIN.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(6000); 
		searchBoxLinkedIN.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		socialActionIcon.click(); 
		Thread.sleep(5000);
		commentSection.sendKeys("Automation Testing"); 
		Thread.sleep(4000);
		socailCompleteTouch.click();
		
		//Task Touch
		
		Thread.sleep(20000); 
		toDOButton.click();
		Thread.sleep(5000);
		taskTab.click();
		Thread.sleep(4000);
		searchBoxLinkedIN.sendKeys(prop.getProperty("CadenceName1"));
		Thread.sleep(6000); 
		searchBoxLinkedIN.sendKeys(Keys.ENTER);
		Thread.sleep(6000);
		taskIcon.click(); 
		Thread.sleep(5000);
		commentSection.sendKeys("Automation Testing"); 
		Thread.sleep(4000);
		taskCompleteTouch.click();
		
		
		
		Thread.sleep(400000);


	}
}



