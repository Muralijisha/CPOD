package com.at.Cadencemodule;

import java.util.List;

import javax.swing.JScrollBar;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.AllureReportListener.TestAllureListener;
import com.at.Baseclass.BaseClass;


public class PersonalizeMailTouch extends BaseClass {

	@FindBy(xpath = "//button[@title='Add an email touch']")
	WebElement addPersonalizeMailTouch;

	@FindBy(xpath = "//input[@name='timeToWaitAndExecute']")
	WebElement waitTime;

	@FindBy(name = "timeToWaitUnit")
	WebElement waitTimeUnit;

	@FindBy(xpath = "//button[@class='btn btn-outline-secondary']")
	WebElement searchTemplateBtn;

	@FindBy(xpath = "//div[@class='form-group']//div[@class='input-group']//input[@class='form-control']")
	WebElement searchTemplateBox;

	@FindBy(xpath = "//td[contains(text(),'Template Name')]/preceding-sibling::td//input")
	WebElement checkbox_Template;

	@FindBy(xpath = "//button[contains(text(),'Select')]")
	WebElement selectButton_Template;

	@FindBy(xpath = "//input[@id='preview_email_flag']")
	WebElement checkBox_PersonalizeMailBeforeSend;

	@FindBy(id = "time_to_complete")
	WebElement maxWaitTime;

	@FindBy(name = "timeToCompleteUnit")
	WebElement maxWaitTimeUnit;
	
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

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement savebutton_personalizemail;
	
	@FindBy(xpath = "//i[@class='fa fa-search']")
	WebElement searchBtn;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okButton_Alert;

	@FindBy(xpath = "//div[@id='message_txt']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="(//button[contains(@class,'text-break dropdown-item' )])[32]")
	WebElement Automation_Cadence_145;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	WebElement dropDownMenuShow;

	public PersonalizeMailTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createPersonalizeMailTouch() throws InterruptedException {

		Thread.sleep(15000);
		explicitWait_Clickable(addPersonalizeMailTouch);
		fluentWait(addPersonalizeMailTouch);
		addPersonalizeMailTouch.click();
		Thread.sleep(7000);
		waitTime.sendKeys("2");
		selectClassByValue(waitTimeUnit, "Mi");
		
		/*
		 * searchTemplateBox.sendKeys(prop.getProperty("templateName"));
		 * searchTemplateBtn.click(); Thread.sleep(30000);
		 * elementClickable(checkbox_Template); selectButton_Template.click();
		 */
		Thread.sleep(4000);
		searchTemplateBox.sendKeys(prop.getProperty("EmailTemplate"));
		Thread.sleep(4000);
		searchBtn.click();
		Thread.sleep(9000);
		checkbox_Template.click();
		Thread.sleep(9000);
		selectButton_Template.click();
		Thread.sleep(9000);
		checkBox_PersonalizeMailBeforeSend.click();
		maxWaitTime.sendKeys("1");
		selectClassByValue(maxWaitTimeUnit, "Da");
		Thread.sleep(3000);
		explicitWait(driver, 60, savebutton_personalizemail);
		//jsExecutor_ClickElement(savebutton_personalizemail);
		//jsExecutor_ClickElement(savebutton_personalizemail);
		
		Thread.sleep(9000);
		editWorkflow.click();
		Thread.sleep(9000);
		linkClickedSelect.click();
		Thread.sleep(7000);
		linkMoveToAnotherCadence.click();
		Thread.sleep(7000);
		
		 Actions select=new Actions(driver);
		 select.moveToElement(selectCadence).click().build().perform();
		// Thread.sleep(6000); selectCadence.sendKeys("Auto Email"); Thread.sleep(4000);
		 
		selectCadence.sendKeys(prop.getProperty("CadenceName2"));
		
		Thread.sleep(2000);
		dropDownMenuShow.click();
		Thread.sleep(4000);
		backButton.click();
		
		savebutton_personalizemail.click();
		
		

		TestAllureListener.saveTextLog("Personalize mail Touch saved successfully");
//		return touchSaveMsg.getText();
	}

}
