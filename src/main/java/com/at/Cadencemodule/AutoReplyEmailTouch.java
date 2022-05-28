package com.at.Cadencemodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.AllureReportListener.TestAllureListener;
import com.at.Baseclass.BaseClass;



public class AutoReplyEmailTouch extends BaseClass {

	@FindBy(xpath = "//button[@title='Add an email touch']")
	WebElement addAutomailTouch;

	@FindBy(xpath = "//input[@name='timeToWaitAndExecute']")
	WebElement waitTime;

	@FindBy(name = "timeToWaitUnit")
	WebElement waitTimeUnit;

	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchBtn;

	@FindBy(xpath = "//div[@class='form-group']//div[@class='input-group']//input[@class='form-control']")
	WebElement searchTemplateBox;

	@FindBy(xpath = "//td[contains(text(),'Template Name')]/preceding-sibling::td//input")
	WebElement checkbox_Template;
	
	@FindBy(id="email_touch_type")
	WebElement replyemailSelect;
	
	

	@FindBy(xpath = "//button[contains(text(),'Select')]")
	WebElement selectButton_Template;

	@FindBy(id = "schedule_type")
	WebElement scheduleType;
	
	
	@FindBy(id = "touch_execution_schedule_Id")
	WebElement chooseSchedule;
	
	@FindBy(xpath="(//select[@name='action'])[7]")
	WebElement repliedCadence;
	
	@FindBy(xpath="//button[@title=' Define Workflows']")
	WebElement editWorkflow;
	
	@FindBy(xpath="//button[@title='Back']")
	WebElement backButton;

	
	@FindBy(xpath="(//select[@name='action'])[7]")
	WebElement replyClickedSelect;
	
	 @FindBy(xpath="(//select[@name=\"action\"])[7]//option[@value='Move To Another Cadence']")	
	 WebElement replyMoveToAnotherCadence;
	 
	 @FindBy(xpath="(//input[@name='movedToMultiTouchId'])[7]")
	 WebElement selectCadence;

	@FindBy(xpath="//button[contains(@class,'text-break dropdown-item' )]")
	List<WebElement> listOfCadences; 
	
	
	@FindBy(xpath = "//button[@title='Save Email Touch']")
	WebElement savebutton_Automail;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okButton_Alert;

//	@FindBy(id = "//div[contains(text(),'Last 15 mins')]/parent::button[@class='overflow-hidden dropdown-toggle btn btn-secondary btn-block']")
//	WebElement dropdown;

	
	@FindBy(xpath="(//button[contains(@class,'text-break dropdown-item' )])[30]")
	WebElement Automation_Cadence_145;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	WebElement dropDownMenuShow;
	
	@FindBy(id = "description")
	WebElement description;

	
	@FindBy(id = "time_to_complete")
	WebElement maxWaitTime;

	@FindBy(name = "timeToCompleteUnit")
	WebElement maxWaitTimeUnit;

	@FindBy(xpath = "//button[@title='Save Social Touch']")
	WebElement saveBtn_SocialTouch;

	@FindBy(xpath = "//div[@id='message_txt']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="//a[@title='Edit cadences']")
	WebElement editCadences;
	
	@FindBy(id="all_users")
	WebElement publicCheckBox;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveButton;
	
	
	

	public AutoReplyEmailTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createAutomailTouch() throws InterruptedException {
Thread.sleep(3000);
		addAutomailTouch.click();
		Thread.sleep(4000);
		waitTime.sendKeys("1");
		selectClassByValue(waitTimeUnit, "Mi");
		Thread.sleep(4000);
		  searchTemplateBox.sendKeys(prop.getProperty("ReplyTemplate"));
		  Thread.sleep(4000);
		  searchBtn.click(); 
		  Thread.sleep(15000);
		  elementClickable(checkbox_Template);
		  doubleClick(selectButton_Template);
		  Thread.sleep(6000);
		 selectClassByVisibleText(replyemailSelect,"Reply Email");
		  Thread.sleep(6000);
		selectClassByValue(scheduleType, "Send by execution schedule");
		selectClassByVisibleText(chooseSchedule, prop.getProperty("eesScheduleName"));
		Thread.sleep(6000);
		editWorkflow.click();
		Thread.sleep(4000);
		replyClickedSelect.click();
		Thread.sleep(4000);
		replyMoveToAnotherCadence.click();
		Thread.sleep(4000);
		
		 Actions select=new Actions(driver);
		 select.moveToElement(selectCadence).click().build().perform();
		// Thread.sleep(6000); selectCadence.sendKeys("Auto Email"); Thread.sleep(4000);
		 
		 
		// Thread.sleep(6000); selectCadence.sendKeys("Auto Email"); Thread.sleep(4000);
		 
		selectCadence.sendKeys(prop.getProperty("CadenceName2"));
		 
		 
		 
		 
		Thread.sleep(2000);
		dropDownMenuShow.click();
		Thread.sleep(4000);
		backButton.click();
		
		Thread.sleep(6000);
		
		doubleClick(savebutton_Automail);
		Thread.sleep(6000);
		

		TestAllureListener.saveTextLog("Auto Touch saved successfully");
		TestAllureListener.saveTextLog("Other Touch saved successfully");
		JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
		jsExecuter.executeScript("window.scrollTo(0,-500)");
	    Thread.sleep(7000);
	    Actions ac=new Actions(driver);
	    ac.moveToElement(editCadences).doubleClick().build().perform();
	    
		//editCadences.click();
		Thread.sleep(7000);
		ac.moveToElement(publicCheckBox).click().release().build().perform();
		//publicCheckBox.click();
		Thread.sleep(7000);
		saveButton.click();
		Thread.sleep(4000);

	}

	private void selectClassByVisibleText(WebElement replyemailSelect2, Object sleep) {
		// TODO Auto-generated method stub
		
	}

}