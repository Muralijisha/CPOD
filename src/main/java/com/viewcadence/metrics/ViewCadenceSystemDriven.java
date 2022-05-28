package com.viewcadence.metrics;

import com.at.Baseclass.BaseClass;


	

	import java.util.List;

	import org.apache.xmlbeans.impl.soap.Text;
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

	import io.qameta.allure.Allure;
	public class ViewCadenceSystemDriven extends BaseClass {
	
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
		
		@FindBy(id = "outcome")
		WebElement callResult;
		
		@FindBy(xpath= "//button[@title='Save']")
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
		
		@FindBy(xpath="(//a[contains(@title,'Click to view the prospect')])[1]")
		WebElement prospectlink1;
		
		@FindBy(xpath="//div[@title='Log a Call/Task']")
		WebElement taskBtn;

		@FindBy(xpath="//span[@title='Back to list page']")
		WebElement backBtn;
		
		@FindBy(xpath="(//button[contains(text(),'Yes')])[2]")
		WebElement yesBtn;
		
		public ViewCadenceSystemDriven() {
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
				System.out.println("Metrics before the System driven action");
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
				
				
				prospectlink1.click();
				
				
				Thread.sleep(7000);
				
				taskBtn.click();
				Thread.sleep(7000);
				
				Select se1= new Select(callResult);
				se1.selectByVisibleText("Call Issue");
				Thread.sleep(8000);
				//callComments.sendKeys("Call Issue");
				//Thread.sleep(8000);
				saveButton.click();
				Thread.sleep(5000);
				yesBtn.click();
				Thread.sleep(15000);
				JavascriptExecutor js = (JavascriptExecutor) driver;
			       js.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(5000);
				backBtn.click();
				Thread.sleep(7000);
				prospectlink1.click();
				Thread.sleep(7000);
				taskBtn.click();
				Thread.sleep(7000);
				
				Select se2= new Select(callResult);
				se2.selectByVisibleText("Not Interested");
				
				Thread.sleep(8000);
				saveButton.click();
				Thread.sleep(5000);
				yesBtn.click();
				Thread.sleep(15000);
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
			       js1.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(5000);
				backBtn.click();
				Thread.sleep(6000);
				prospectlink1.click();
				Thread.sleep(7000);
				taskBtn.click();
				Thread.sleep(7000);
				
				Select se3= new Select(callResult);
				se3.selectByVisibleText("Qualified Lead");
				Thread.sleep(8000);
				//callComments.sendKeys("Qualified Lead");
				//Thread.sleep(8000);
				saveButton.click();
				Thread.sleep(5000);
				yesBtn.click();
				
				Thread.sleep(15000);
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
			       js2.executeScript("window.scrollBy(0,-500)", "");
				Thread.sleep(5000);
				backBtn.click();
				Thread.sleep(6000);
				
				
				

				/*After the System driven function*/
				
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
					Allure.addAttachment("FallThroughCount", fallThroughCount.get(i).getText());
					
				}
				System.out.println("EngagementScoreCount"+engagementScoreCount.getText());
				Allure.addAttachment("engagementScoreCount", engagementScoreCount.getText());
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		}
	}


