package com.viewcadence.metrics;

import java.util.List;

import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Allure;

public class ViewCadenceUserDriven extends BaseClass {
	
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

	@FindBy(xpath = "//button[contains(text(),'Assign')]")
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
	
	
	
	@FindBy(xpath = "//input[@placeholder='Select Cadences']")
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
	
	@FindBy(id = "call_result")
	WebElement callResult;
	
	@FindBy(xpath= "//button[@title='Save Changes']")
	WebElement saveButton;
	
	//button[@title='Save Changes']

	@FindBy(xpath = "//span[@class='fa-stack']//i[@class='fa fa-phone-alt fa-stack-1x fa-inverse']")
	WebElement callMeInMemberActivity;

	
	@FindBy(xpath="(//i[contains(@class,'fa-phone')])[7]")
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
	
	@FindBy(xpath = "//a[@title='Cadences']")
	WebElement cadencesTab;
	
	@FindBy(xpath="//input[@type='text'and @placeholder='Search']")
	WebElement searchCadence;
	
	@FindBy(xpath = "//span[@class='text-bold']")
	List<WebElement> prospectdueAndStats;

	@FindBy(xpath="(//a[@class='mr-2'])[1]")
	WebElement cadencelink;
	
	
	
	@FindBy(xpath="//button[@title='All Cadences']")
	WebElement allBtn;
	
	
	@FindBy(xpath = "//div[contains(@id,'total')]")
	WebElement totalCount;

	@FindBy(xpath = "//div[contains(@id,'active')]")
	WebElement activeCount;

	@FindBy(xpath = "//div[contains(@id,'paused')]")
	WebElement pausedCount;

	@FindBy(xpath = "//div[contains(@id,'fallThrough')]")
	List<WebElement> fallThroughCount;

	@FindBy(xpath="//div[contains(@id,'engagementScore')]")
	WebElement engagementScoreCount;

	@FindBy(xpath = "//a[@id='touches']")
	WebElement touchesTab;

	@FindBy(xpath = "//a[@id='overview']")
	WebElement overviewTab;

	

	@FindBy(xpath = "//div[@id='message_txt']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="//a[@title='Edit cadences']")
	WebElement editCadences;
	
	@FindBy(id="all_users")
	WebElement publicCheckBox;
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	WebElement actionBtn;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement okBtn;
	
	@FindBy(xpath="//button[contains(text(),'Move to another Cadence')]")
	WebElement moveToAnotherCadence;
	
	@FindBy(xpath="//button[contains(text(),'Move to next touch')]")
	WebElement moveToNextTouch;
	
	
	@FindBy(xpath="//button[text()='Exit']")
	WebElement exitBtn;

	@FindBy(xpath="(//button[contains(text(),'Exit')])[3]")
	WebElement exitBtn2;
	
	@FindBy(xpath= "//div[contains(@id,'completed')]")
	WebElement completedCount;
	
	@FindBy(xpath="//a[@id='prospect']")
	WebElement prospectCadenceTab;
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	WebElement okBtnNextTouch;
	
	@FindBy(xpath="//button[@title='Fall Through Prospects']")
    WebElement prospectTabFallThroughBucket;
	

	
	public ViewCadenceUserDriven() {
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
	public void ViewCadenceMetrics() throws InterruptedException {
		
		
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver,50);
        
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Cadences']")));
	       Thread.sleep(7000);
		 cadencesTab.click();
		 Thread.sleep(5000);
		 allBtn.click();
		 Thread.sleep(5000);
		 
		 searchCadence.sendKeys(prop.getProperty("ViewCadence"));
		 searchCadence.sendKeys(Keys.ENTER);
		 
		 Thread.sleep(8000);
		 String beforexpath="//a[@title='";
			
			String cadencename=prop.getProperty("ViewCadence")+"']";
			
			
			
			System.out.println(cadencename);
			
			driver.findElement(By.xpath(beforexpath+cadencename)).click();
			
			Thread.sleep(7000);
			/*Before the user driven function*/
			
			overviewTab.click();
			Thread.sleep(5000);
			System.out.println("Metrics before the user driven action");
			System.out.println("Total Count"+totalCount.getText());
			Allure.addAttachment("TotalCount", totalCount.getText());
			System.out.println("Active Count"+activeCount.getText());
			Allure.addAttachment("ActiveCount", activeCount.getText());
			System.out.println("Paused Count"+pausedCount.getText());
			Allure.addAttachment("PausedCount", pausedCount.getText());
			System.out.println("CompletedCount"+completedCount.getText());
			Allure.addAttachment("CompletedCount", completedCount.getText());
			
			int count=fallThroughCount.size();
			
			for(int i=0;i<count;i++)
			{
				System.out.println("FallThrough Count");
				System.out.println(fallThroughCount.get(i).getText());
				Allure.addAttachment("FallThroughCount", fallThroughCount.get(i).getText());
				
			}
			System.out.println("EngagementScoreCount"+engagementScoreCount.getText());
			Allure.addAttachment("engagementScoreCount", engagementScoreCount.getText());
			
			
			
			Thread.sleep(6000);
			
			prospectCadenceTab.click();
			
			Thread.sleep(5000);
			
			
			
			
			Thread.sleep(7000);
			Actions build = new Actions(driver);
			build.moveToElement(checkbox_Prospects1).click().build().perform();
			Thread.sleep(5000);
			
			
			
			
			
			Thread.sleep(5000);
			actionButton.click();
			Thread.sleep(9000);
			moveToAnotherCadence.click();
			Thread.sleep(10000);
			dropdown.click();
			Thread.sleep(12000);
			assignSearchField.sendKeys(prop.getProperty("MoveToAnotherCadence"));
			Thread.sleep(4000);

			dropDownValue.click();
			Thread.sleep(5000);

			startCadenceButton.click();
			Thread.sleep(7000);
			okBtn.click();
			
			Thread.sleep(5000);
			
			build.moveToElement(checkbox_Prospects1).click().build().perform();
			Thread.sleep(5000);
			
			actionButton.click();
			Thread.sleep(9000);
			
			moveToNextTouch.click();
			Thread.sleep(5000);
			okBtnNextTouch.click();
			
			Thread.sleep(7000);
			build.moveToElement(checkbox_Prospects1).click().build().perform();
			Thread.sleep(5000);
			
			actionButton.click();
			Thread.sleep(9000);
			
			exitBtn.click();
			Thread.sleep(5000);
			exitBtn2.click();
			Thread.sleep(5000);
			
			
			
			/*After the user driven function*/
			
			overviewTab.click();
			Thread.sleep(5000);
			System.out.println("Metrics after the user driven action");
			System.out.println("Total Count"+totalCount.getText());
			Allure.addAttachment("TotalCount", totalCount.getText());
			System.out.println("Active Count"+activeCount.getText());
			Allure.addAttachment("ActiveCount", activeCount.getText());
			System.out.println("Paused Count"+pausedCount.getText());
			Allure.addAttachment("PausedCount", pausedCount.getText());
			System.out.println("CompletedCount"+completedCount.getText());
			Allure.addAttachment("CompletedCount", completedCount.getText());
			
			for(int i=0;i<count;i++)
			{
				System.out.println("FallThrough Count");
				System.out.println(fallThroughCount.get(i).getText());
				/*
				 * x=fallThroughCount.get(i).getText(); y=x; z=x+y;
				 */
				Allure.addAttachment("FallThroughCount", fallThroughCount.get(i).getText());
				
				
			}
			
			
			
			
			
			
			
			System.out.println("EngagementScoreCount"+engagementScoreCount.getText());
			Allure.addAttachment("engagementScoreCount", engagementScoreCount.getText());
			
	
			
		
			
		
	}
}
