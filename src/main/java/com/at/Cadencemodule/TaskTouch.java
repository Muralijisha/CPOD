package com.at.Cadencemodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;

public class TaskTouch extends BaseClass {
	
	@FindBy(xpath = "//button[@title='Add a task touch']")
	WebElement addTaskTouch;

	@FindBy(id = "social_media_type")
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
	
	@FindBy(xpath="//input[@name='subject']")
	WebElement subjectName;
	
	@FindBy(xpath="//button[@title='Save Task Touch']")
	WebElement taskTouchSave;


	public TaskTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createNewCadence() {
	}

	public void createOtherTouch() throws InterruptedException {

		Thread.sleep(10000);
		explicitWait_Clickable(addTaskTouch);
		fluentWait(addTaskTouch);
		addTaskTouch.click();
		subjectName.sendKeys("TaskTouch_JAN");
		description.sendKeys(prop.getProperty("CadenceName1"));
		
		waitTime.sendKeys("0");
		selectClassByValue(waitTimeUnit, "Mi");
		maxWaitTime.sendKeys("1");
		selectClassByValue(maxWaitTimeUnit, "Da");
		taskTouchSave.click();
		Thread.sleep(5000);

		

	}
}


