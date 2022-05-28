package com.at.Cadencemodule;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.AllureReportListener.TestAllureListener;
import com.at.Baseclass.BaseClass;



public class AutomailTouch extends BaseClass {

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

	@FindBy(xpath = "//button[contains(text(),'Select')]")
	WebElement selectButton_Template;

	@FindBy(id = "schedule_type")
	WebElement scheduleType;

	@FindBy(id = "touch_execution_schedule_Id")
	WebElement chooseSchedule;
	
	@FindBy(xpath="//button[@title=' Define Workflows']")
	WebElement editWorkflow;
	
	@FindBy(xpath="//button[@title='Back']")
	WebElement backButton;

	
	@FindBy(xpath="(//select[@name='action'])[3]")
	WebElement linkClickedSelect;
	
	 @FindBy(xpath="(//select[@name=\"action\"])[3]//option[@value='Move To Another Cadence']")	
	 WebElement linkMoveToAnotherCadence;
	 
	 @FindBy(xpath="(//input[@name='movedToMultiTouchId'])[3]")
	 WebElement selectCadence;

	@FindBy(xpath="//button[contains(@class,'text-break dropdown-item' )]")
	List<WebElement> listOfCadences; 

	@FindBy(xpath = "//button[@title='Save Email Touch']")
	WebElement savebutton_Automail;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okButton_Alert;

//	@FindBy(id = "//div[contains(text(),'Last 15 mins')]/parent::button[@class='overflow-hidden dropdown-toggle btn btn-secondary btn-block']")
//	WebElement dropdown;

	@FindBy(xpath = "//div[@id='']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="(//button[contains(@class,'text-break dropdown-item' )])[32]")
	WebElement Automation_Cadence_145;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	WebElement dropDownMenuShow;
	
	

	public AutomailTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createAutomailTouch() throws InterruptedException {
Thread.sleep(7000);
		addAutomailTouch.click();
		Thread.sleep(7000);
		waitTime.sendKeys("1");
		selectClassByValue(waitTimeUnit, "Mi");
		Thread.sleep(4000);
		  searchTemplateBox.sendKeys(prop.getProperty("EmailTemplate"));
		  searchBtn.click(); 
		  Thread.sleep(15000);
		  elementClickable(checkbox_Template);
		  doubleClick(selectButton_Template);
		  Thread.sleep(6000);
		selectClassByValue(scheduleType, "Send by execution schedule");
		selectClassByVisibleText(chooseSchedule, prop.getProperty("eesScheduleName"));
		Thread.sleep(5000);
		editWorkflow.click();
		Thread.sleep(4000);
		linkClickedSelect.click();
		Thread.sleep(4000);
		linkMoveToAnotherCadence.click();
		Thread.sleep(4000);
		
		 Actions select=new Actions(driver);
		 select.moveToElement(selectCadence).click().build().perform();
		// Thread.sleep(6000); selectCadence.sendKeys("Auto Email"); Thread.sleep(4000);
		 
		 selectCadence.sendKeys(prop.getProperty("CadenceName2"));
		 
		 
		 
		 
			Thread.sleep(2000);
			dropDownMenuShow.click();
			Thread.sleep(4000);
		Thread.sleep(4000);
		backButton.click();
		
		
		
		
		Thread.sleep(6000);
		doubleClick(savebutton_Automail);
		Thread.sleep(6000);


		TestAllureListener.saveTextLog("Auto Touch saved successfully");

	}

}