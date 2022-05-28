package com.at.Cadencemodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.at.Baseclass.BaseClass;



	
	public  class VerificationProspectsModule extends BaseClass {

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
		WebElement searchBox1;
		
		@FindBy(id="pending_calls_cd")
		WebElement clickDialerCheckBox;
		
		@FindBy(xpath="(//button[contains(text(),'Yes')])[2]")
	    WebElement YesBtn;
		
		@FindBy(xpath="//a[@name='backtolist']")
		WebElement backBtn;
		
		
		@FindBy(xpath="//button[@title='Import from CRM']")
		WebElement crmBtn;
		
		@FindBy(xpath="//button[@title='Import from CSV']")
		WebElement csvBtn;
		
		@FindBy(xpath="//a[text()='Log a Call']")
		WebElement logaCall;
		
		@FindBy(xpath="(//i[contains(@class,'fa-sort-down')])[5]")
		WebElement dropDownMenu;
		
		@FindBy(xpath="//input[@placeholder='Search']")
		WebElement searchBox;
		
		@FindBy(xpath="//div[text()='Assign']")
		WebElement Assign;
		
		@FindBy(xpath="//td[text()='Name']//i")
		WebElement sortBy;
		
		@FindBy(xpath="//div[text()='Assign All']")
		WebElement assignAll;
		
		@FindBy(xpath="//div[text()='Delete All']")
		WebElement deleteAll;
		
		@FindBy(xpath="(//table[@id='prospects-table']//tr[1])[2]")
		WebElement lastTouchedDate;
		
		@FindBy(xpath="//div[@class='col' and contains(text(),'Pause')]")
		WebElement pauseBtn;
		
		@FindBy(xpath="//div[@class='col' and contains(text(),'Resume')]")
		WebElement resumeBtn;
		
		@FindBy(xpath="//button[text()='Resume']")
		WebElement resume;
		
		@FindBy(xpath="//div[@class='col' and contains(text(),'Exit')]")
		WebElement exitBtn;
		
		@FindBy(xpath="//div[@class='col' and contains(text(),'Delete')]")
		WebElement deleteBtn;
		
		@FindBy(xpath="//button[@title='Save Changes']")
		WebElement saveBtn;
		
		@FindBy(xpath="//button[text()='Delete']")
		WebElement deleteBtnn;
		
		
				@FindBy(xpath="//button[text()='Exit']")
				WebElement saveexitBtn;
				
				@FindBy(xpath="//table//td[text()='Name']//i[contains(@class,'fa-arrow-up')]")
				WebElement nameArrowUp;
				
				@FindBy(xpath="(//a[contains(@href,'/prospects/list/')])[1]")
				WebElement prospect1;
				
				@FindBy(xpath="((//span[@class='text-break'])[1]//a)[1]")
				WebElement prospect1Text1;
				
				@FindBy(xpath="//div[contains(@class,'font-italic')]")
				WebElement LastTouchedItems;
				
				@FindBy(xpath="//button[text()='OK']")
				WebElement assignAllOkBtn;
		
		
		
		public VerificationProspectsModule() {
			PageFactory.initElements(driver, this);
		}

		public boolean isAlertPresent() {
			try {
				driver.switchTo().alert();
				return true;
			} catch (NoAlertPresentException ex) {
				return false;
			}
		}
		public void ViewCadenceMetrics() throws InterruptedException {
			Thread.sleep(9000);
			Actions ac=new Actions(driver);
			ac.moveToElement(prospectTab).click().build().perform();
			
			
			Thread.sleep(10000);
			Assert.assertEquals( crmBtn.isEnabled(),true);
			
			Thread.sleep(8000);
			Actions as=new Actions(driver);
			as.moveToElement(dropDownMenu).click().build().perform();
			
			Thread.sleep(9000);
			
			Assert.assertEquals(csvBtn.isEnabled(), true);
			

			
			//Entering the text
			searchBox.sendKeys("My name is toey");
			
			//validating text entered or not?
			
			String attribute = searchBox.getAttribute("value");
			
			System.out.println("Entered value:"+attribute);
			
			if(attribute.contains("My name is toey"))
			{
				System.out.println("Exact Data Entered");
			}
			
			else
			{
				System.out.println("Data not entered");
			}
			
			// search propect with tagName
			
			
		Thread.sleep(7000);
		searchBox.clear();
	searchBox.sendKeys(prop.getProperty("TagName"));
	Thread.sleep(15000);
	searchBar.sendKeys(Keys.ENTER); 
	searchBar.sendKeys(Keys.ENTER);
	
	
	Thread.sleep(7000);
	Actions buildpros = new Actions(driver);
	buildpros.moveToElement( prospect1).click().build().perform();
	Thread.sleep(5000);
	
String lastToucheddate=LastTouchedItems.getText();
System.out.println("Verifying last touched date"+lastToucheddate);
Thread.sleep(9000);
Actions ac3=new Actions(driver);
ac3.moveToElement(prospectTab).click().build().perform();
Thread.sleep(7000);
Actions arrowup= new Actions(driver);
arrowup.moveToElement(nameArrowUp).click().build().perform();
System.out.println("Sorting");
		}
/*String textprospect = prospect1.getText();
//char[] ch=textprospect.toCharArray();    
for (int i = 0; i != textprospect.length(); ++i)  
	  if (!Character.isLetter(textprospect.charAt(i))) {
         System.out.println("The prospect is in sorting order");
      /*
  
		
	
		

		Actions arrowup= new Actions(driver);
		arrowup.moveToElement(nameArrowUp).click().build().perform();
		}
		/*String textprospect1 = prospect1.getText();
		//char[] ch=textprospect.toCharArray();    
		for (int j = 0; j != textprospect1.length(); ++j)  
			  if (!Character.isLetter(textprospect.charAt(j))) {
		         System.out.println("The prospect is in sorting order");
		      }
		  
				
				}*/

		public void assigningprospecttocadence() throws InterruptedException
		{
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
			
			Thread.sleep(5000);
			actionButton.click();
			Thread.sleep(9000);
			assignButton.click();
			Thread.sleep(10000);
			dropdown.click();
			Thread.sleep(12000);
			assignSearchField.sendKeys(prop.getProperty("ProspectCadenceName1"));
			Thread.sleep(7000);

			//dropDownValue.click();
			// String beforexpath="//a[@title='";
				
			//	String cadencename=prop.getProperty("ViewCadence")+"']";
				
			
			String beforexpath="//button[text()='";
			String afterxpath=prop.getProperty("ProspectCadenceName1")+"']";
			
				driver.findElement(By.xpath(beforexpath+afterxpath)).click();
			
			
	Thread.sleep(6000);
			startCadenceButton.click();

			WebDriverWait wait1 = new WebDriverWait(driver,60);

			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Prospects']")));

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
			 build.moveToElement(checkbox_Prospects2).click().build().perform();
			  Thread.sleep(5000);
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			actionButton.click();
			Thread.sleep(9000);
			assignButton.click();
			Thread.sleep(10000);
			dropdown.click();
			Thread.sleep(12000);
			assignSearchField.sendKeys(prop.getProperty("ProspectCadenceName2"));
			Thread.sleep(7000);

			//dropDownValue.click();
			// String beforexpath="//a[@title='";
				
			//	String cadencename=prop.getProperty("ViewCadence")+"']";
				
			
			String beforexpathh="//button[text()='";
			String afterxpathh=prop.getProperty("ProspectCadenceName2")+"']";
			
			driver.findElement(By.xpath(beforexpathh+afterxpathh)).click();
			
			
	Thread.sleep(6000);
			startCadenceButton.click();
			
			Thread.sleep(10000);
			
			Thread.sleep(5000);
			actionButton.click();
			Thread.sleep(9000);
			Actions as= new Actions(driver);
			as.moveToElement(assignAll).click().build().perform();
			Thread.sleep(5000);
			as.moveToElement(assignAllOkBtn).click().build().perform();
			Thread.sleep(10000);
			dropdown.click();
			Thread.sleep(12000);
			assignSearchField.sendKeys(prop.getProperty("ProspectCadenceName3"));
			Thread.sleep(7000);

			//dropDownValue.click();
			// String beforexpath="//a[@title='";
				
			//	String cadencename=prop.getProperty("ViewCadence")+"']";
				
			
			String beforexpatha="//button[text()='";
			String afterxpatha=prop.getProperty("ProspectCadenceName3")+"']";
			
			driver.findElement(By.xpath(beforexpatha+afterxpatha)).click();
			
			
	Thread.sleep(6000);
			startCadenceButton.click();
			
			Thread.sleep(10000);
			
			
			
		}
		
		public void pause_resume_exit_delete() throws InterruptedException
		{
			WebDriverWait wait1 = new WebDriverWait(driver,60);

			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Prospects']")));

			prospectTab.click();
			Thread.sleep(6000);
			searchBar.sendKeys(prop.getProperty("TagName")); 
			Thread.sleep(15000);
			searchBar.sendKeys(Keys.ENTER); 
			searchBar.sendKeys(Keys.ENTER);


			Thread.sleep(7000);
			Actions build3=new Actions(driver);
			 build3.moveToElement(checkbox_Prospects1).click().build().perform();
			  Thread.sleep(5000);
			Thread.sleep(5000);
			
			Thread.sleep(5000);
			actionButton.click();
			Thread.sleep(9000);
		pauseBtn.click();
		Thread.sleep(8000);
         saveBtn.click();
         Thread.sleep(9000);
         Actions build4=new Actions(driver);
		 build4.moveToElement(checkbox_Prospects1).click().build().perform();
		  Thread.sleep(5000);
		
		Thread.sleep(5000);
		actionButton.click();
		Thread.sleep(9000);
          resumeBtn.click();
	Thread.sleep(8000);
     resume.click();
     Thread.sleep(9000);
     
     
     Actions build6=new Actions(driver);
     WebElement exit=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
     build6.moveToElement(exit).click().build().perform();
     
     
         
     
	Thread.sleep(5000);
	actionButton.click();
	Thread.sleep(9000);
     exitBtn.click();
     Thread.sleep(9000);
     saveexitBtn.click();
     Thread.sleep(8000);
     
     
     
     WebDriverWait wait3 = new WebDriverWait(driver,60);

		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Prospects']")));

		prospectTab.click();
		Thread.sleep(6000);
		searchBar.sendKeys(prop.getProperty("ProspectTagName")); 
		Thread.sleep(15000);
		searchBar.sendKeys(Keys.ENTER); 
		searchBar.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		WebElement del=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		Actions build7=new Actions(driver);
		 build7.moveToElement(del).click().build().perform();
		  Thread.sleep(5000);
		
		Thread.sleep(5000);
		actionButton.click();
		Thread.sleep(9000);
	     deleteBtn.click();
	     Thread.sleep(9000);
	     deleteBtnn.click();
	     Thread.sleep(8000);
		}
	}

