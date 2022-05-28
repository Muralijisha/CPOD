package com.viewcadence.metrics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;

public class ViewCadence extends BaseClass {

	@FindBy(xpath = "//div[contains(@id,'total')]")
	WebElement totalCount;

	@FindBy(xpath = "//div[contains(@id,'active')]")
	WebElement activeCount;

	@FindBy(xpath = "//div[contains(@id,'paused')]")
	WebElement pausedCount;
	
	@FindBy(xpath= "//div[contains(@id,'completed')]")
	WebElement completedCount;

	@FindBy(xpath = "//div[contains(@id,'fallThrough')]")
	WebElement fallThroughCount;

	@FindBy(xpath="//div[contains(@id,'engagementScore')]")
	WebElement engagementScoreCount;

	@FindBy(xpath = "//a[@id='touches']")
	WebElement touchesTab;

	@FindBy(xpath = "//a[@id='overview']")
	WebElement overviewTab;

	@FindBy(xpath = "//a[@id='prospect']")
	WebElement prospectTab;

	@FindBy(xpath = "//div[@id='message_txt']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="//a[@title='Edit cadences']")
	WebElement editCadences;
	
	@FindBy(id="all_users")
	WebElement publicCheckBox;
	
	@FindBy(xpath="//button[@title='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//a[@title='Cadences']")
	WebElement cadencesTab;
	
	@FindBy(xpath="(//a[@class='mr-2'])[1]")
	WebElement cadencelink;
	
	
	
	@FindBy(xpath="//button[@title='All Cadences']")
	WebElement allBtn;
	
	
	@FindBy(xpath="//input[@type='text'and @placeholder='Search']")
	WebElement searchCadence;
	
	
	@FindBy(xpath="//button[contains(text(),'Action')]")
	WebElement actionBtn;
	

	public ViewCadence() {
		PageFactory.initElements(driver, this);
	}

	public void createNewCadence() {
	}

	public void createOtherTouch() throws InterruptedException {
		
		cadencesTab.click();
		 Thread.sleep(5000);
		 allBtn.click();
		 Thread.sleep(5000);
		 
		 searchCadence.sendKeys(prop.getProperty("cadenceName1"));
		 searchCadence.sendKeys(Keys.ENTER);
		 
		 
		 String beforexpath="//a[@title=";
			
			String cadencename=prop.getProperty("cadenceName1");
			
			driver.findElement(By.xpath(beforexpath+cadencename)).click();
			
			

		Thread.sleep(10000);
		
		

	}
}
	
	
	

