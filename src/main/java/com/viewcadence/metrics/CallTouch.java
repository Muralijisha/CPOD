package com.viewcadence.metrics;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.Baseclass.BaseClass;



public class CallTouch extends BaseClass {

	@FindBy(xpath = "//button[@title='Add a call touch']")
	WebElement addCallTouch;

	@FindBy(name = "cdDialer")
	WebElement checkboxClickDialer;

	
	@FindBy(id = "time_to_wait_and_execute")
	WebElement waitTime;

	@FindBy(name = "timeToWaitUnit")
	WebElement waitTimeUnit;

	@FindBy(id = "time_to_complete")
	WebElement maxWaitTime;

	@FindBy(name = "timeToCompleteUnit")
	WebElement maxWaitTimeUnit;
	
	@FindBy(xpath="//button[@title=' Edit Workflows']")
	WebElement editWorkflows;

	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveButton_CallTouch;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement okButton_Alert;

	@FindBy(xpath = "//div[@id='Call Touch Saved Successfully']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="//button[@title=' Define Workflows']")
	WebElement editWorkflow;
	
	@FindBy(xpath="//button[@title='Back']")
	WebElement backButton;

	
	@FindBy(xpath="(//select[@name='action'])[7]")
	WebElement replyClickedSelect;
	
	@FindBy(xpath="(//select[@name='action'])[1]")
	WebElement exitCadence;
	
	
	 @FindBy(xpath="(//select[@name=\"action\"])[7]//option[@value='Move To Another Cadence']")	
	 WebElement replyMoveToAnotherCadence;
	 
	 @FindBy(xpath="(//select[@name=\"action\"])[1]//option[@value='Exit Cadence']")
	 WebElement exitCadenceSelect;
	 
	 
	 
	 
	 @FindBy(xpath="(//input[@name='movedToMultiTouchId'])[7]")
	 WebElement selectCadence;

	@FindBy(xpath="//button[contains(@class,'text-break dropdown-item' )]")
	List<WebElement> listOfCadences; 
	
	@FindBy(xpath="(//button[contains(@class,'text-break dropdown-item' )])[32]")
	WebElement Automation_Cadence_145;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	WebElement dropDownMenuShow;

	public CallTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createCallTouch() throws InterruptedException {

		Thread.sleep(15000);
		explicitWait_Clickable(addCallTouch);
		fluentWait(addCallTouch);
		addCallTouch.click();
		checkboxClickDialer.click();
        Thread.sleep(2000);
		waitTime.sendKeys("1");
		selectClass(waitTimeUnit, "Mi");
		maxWaitTime.sendKeys("1");
		selectClass(maxWaitTimeUnit, "Da");
		//Thread.sleep(4000);
		Thread.sleep(6000);
		editWorkflow.click();
		Thread.sleep(4000);
        exitCadence.click();
		Thread.sleep(4000);
		exitCadenceSelect.click();
		
		Thread.sleep(4000);
		replyClickedSelect.click();
		Thread.sleep(4000);
		replyMoveToAnotherCadence.click();
		Thread.sleep(4000);
		
		 Actions select=new Actions(driver);
		 select.moveToElement(selectCadence).click().build().perform();
		// Thread.sleep(6000); selectCadence.sendKeys("Auto Email"); Thread.sleep(4000);
		 
		 selectCadence.sendKeys("Auto Email");
			
			Thread.sleep(2000);
			dropDownMenuShow.click();
	
		 

			Thread.sleep(4000);
			
			
			backButton.click();
		Thread.sleep(3000);
		saveButton_CallTouch.click();
		Thread.sleep(4000);
		//saveButton_CallTouch.click();
		//okButton_Alert.click();

	}

	public void selectClass(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

}
