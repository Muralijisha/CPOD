package com.at.Cadencemodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.AllureReportListener.TestAllureListener;
import com.at.Baseclass.BaseClass;



public class LinkedInTouch extends BaseClass {

	@FindBy(xpath = "//button[@title='Add a linkedin touch']")
	WebElement addLinkedInTouch;

	@FindBy(id = "linkedIn_type")
	WebElement chooseNetworkType;

	@FindBy(id = "description")
	WebElement description;

	@FindBy(id = "time_to_wait_and_execute")
	WebElement waitTime;

	@FindBy(name = "timeToWaitUnit")
	WebElement waitTimeUnit;

	@FindBy(id = "time_to_complete")
	WebElement maxWaitTime;

	@FindBy(name = "timeToCompleteUnit")
	WebElement maxWaitTimeUnit;

	@FindBy(xpath = "//button[@title='Save LinkedIn Touch']")
	WebElement saveBtn_LinkedIN;

	@FindBy(xpath = "//div[@id='message_txt']")
	WebElement touchSaveMsg;

	public LinkedInTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createLinkedlnTouch() throws InterruptedException {

		Thread.sleep(10000);
		explicitWait_Clickable(addLinkedInTouch);
		fluentWait(addLinkedInTouch);
		addLinkedInTouch.click();
		selectClass(chooseNetworkType, "InMail");
		description.sendKeys(prop.getProperty("cadenceName1"));
		
		waitTime.sendKeys("0");
		selectClass(waitTimeUnit, "Mi");
		maxWaitTime.sendKeys("1");
		selectClass(maxWaitTimeUnit, "Da");
		saveBtn_LinkedIN.click();

		TestAllureListener.saveTextLog("Linkedin Touch saved successfully");

	}

	public void selectClass(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

}
