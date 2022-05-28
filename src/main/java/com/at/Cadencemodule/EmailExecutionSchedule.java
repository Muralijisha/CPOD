package com.at.Cadencemodule;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



import io.qameta.allure.Step;

public class EmailExecutionSchedule extends com.at.Baseclass.BaseClass {

	

	@FindBy(xpath = "//a[contains(text(),'Email Execution Schedule')]")
	WebElement emailScheduleTab;

	@FindBy(xpath = "//a[contains(text(),'Touch Outcomes')]")
	WebElement touchOutcomesTab;
	
	@FindBy(xpath = "//a[contains(text(),'Notifications')]")
	WebElement notificationTab;
	
	
	@FindBy(xpath = "//a[contains(text(),'Sync Field Mapping')]")
	WebElement syncFieldMappingTab;
	
	@FindBy(xpath = "//a[contains(text(),'CRM Sync Settings')]")
	WebElement CRMSyncSettingsTab;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Transfer Ownership')]")
	WebElement TransferOwnershipTab;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement settingsTab;
	
	@FindBy(id = "clone_selected_schedule-btnInnerEl")
	WebElement cloneBtn;

	@FindBy(xpath="//button[@title='Select Users']")
	WebElement selectUserDropDownMenu;
	
	@FindBy(xpath="//button[contains(text(),'All')]//parent::div[@class='dropdown-menu']")
	WebElement selectUsersBtn;

	@FindBy(id = "delete_selected_schedule-btnEl")
	WebElement deleteBtn;

	@FindBy(xpath = "//i[@title='Add Schedule']")
	WebElement addScheduleBtn;

	@FindBy(xpath = "//div//button[@id='btn_danger']")
	WebElement cancelBtn;

	@FindBy(xpath= "//input[@name='name']")
	WebElement scheduleNamefield;

	@FindBy(xpath = "//select[@name='timezone']")
	WebElement timeZoneDropdown;
	
	@FindBy(id="include_week_ends")
	WebElement weekendCheckBox;
	
	@FindBy(xpath="//div[@class='day Monday']//div")
	List<WebElement> mondayBtn;

	@FindBy(xpath= "//h3[contains(text(),'Tuesday')]/child::i")
	WebElement tuesdayBtn;

	@FindBy(xpath = "//h3[contains(text(),'Wednesday')]/child::i")
	WebElement wednesdayBtn;

	@FindBy(xpath= "//h3[contains(text(),'Thursday')]/child::i")
	WebElement thrusdayBtn;

	@FindBy(xpath = "//h3[contains(text(),'Friday')]/child::i")
	WebElement fridayBtn;
	
	@FindBy(xpath = "//h3[contains(text(),'Saturday')]/child::i")
	WebElement saturdayBtn;
	
	@FindBy(xpath = "//h3[contains(text(),'Sunday')]/child::i")
	WebElement sundayBtn; 

	@FindBy(xpath = "//button[contains(text(),'Save & Close')]")
	WebElement save_closeBtn;

	@FindBy(xpath = "//div[@id='message_txt' and text()='Touch execution schedule saved successfully']")
	WebElement successMsg;

	public EmailExecutionSchedule() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * @Step("Clicking on email schedule tab:") public void
	 * clickOnEmailScheduleTab() { settingsTab.click(); try { Thread.sleep(9000); }
	 * catch (InterruptedException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } Actions build = new Actions(driver);
	 * build.moveToElement(emailScheduleTab).doubleClick().build().perform(); }
	 */

	
	
	@Step("Create schedule with customized timeslot:")
	public void createSchedule() throws InterruptedException  {
		
		settingsTab.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions build1 = new Actions(driver);
		build1.moveToElement( touchOutcomesTab).doubleClick().build().perform();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions build2 = new Actions(driver);
		build2.moveToElement( notificationTab).doubleClick().build().perform();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions build3 = new Actions(driver);
		build3.moveToElement( syncFieldMappingTab).doubleClick().build().perform();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions build4 = new Actions(driver);
		build4.moveToElement(CRMSyncSettingsTab ).doubleClick().build().perform();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions build5= new Actions(driver);
		build5.moveToElement(TransferOwnershipTab ).doubleClick().build().perform();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Actions build6 = new Actions(driver);
		build6.moveToElement(emailScheduleTab).doubleClick().build().perform();
	
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		Actions build7 = new Actions(driver);
		build7.moveToElement(addScheduleBtn).click().build().perform();
		
//		Random random = new Random();
//		int random_Number = random.nextInt(10000);
		scheduleNamefield.sendKeys(prop.getProperty("eesScheduleName"));

		Select timeZoneTab = new Select(timeZoneDropdown);
		timeZoneTab.selectByVisibleText("EST - Eastern Standard Time");
		weekendCheckBox.click();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				List<WebElement> slotSelection = driver.findElements(By.xpath("//div[@class='day Monday']//div"));
				for (int i = 0; i <= 47; i++) {
					slotSelection.get(i).click();
				}

				
			

			explicitWait(driver, 20, tuesdayBtn);
			tuesdayBtn.click();
			wednesdayBtn.click();

			thrusdayBtn.click();
			fridayBtn.click();
			saturdayBtn.click();
			sundayBtn.click();
			explicitWait(driver, 20, save_closeBtn);

			save_closeBtn.click();
			Thread.sleep(4000);
			
		} 

		

	

	

}
