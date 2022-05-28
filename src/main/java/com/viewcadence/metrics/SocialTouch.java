package com.viewcadence.metrics;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.AllureReportListener.TestAllureListener;
import com.at.Baseclass.BaseClass;

import io.qameta.allure.Allure;

public class SocialTouch extends BaseClass {

	@FindBy(xpath = "//button[@title='Add a social touch']")
	WebElement addSocialTouch;

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


	public SocialTouch() {
		PageFactory.initElements(driver, this);
	}

	public void createNewCadence() {
	}

	public void createOtherTouch() throws InterruptedException {

		Thread.sleep(10000);
		explicitWait_Clickable(addSocialTouch);
		fluentWait(addSocialTouch);
		addSocialTouch.click();
		selectClassByVisibleText(chooseNetworkType, "Google");
		description.sendKeys(prop.getProperty("cadenceName"));

		waitTime.sendKeys("0");
		selectClassByValue(waitTimeUnit, "Mi");
		maxWaitTime.sendKeys("1");
		selectClassByValue(maxWaitTimeUnit, "Da");
		saveBtn_SocialTouch.click();
		Thread.sleep(5000);

		

	}
}