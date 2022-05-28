package com.at.Settingsmodule;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class EmailExecutionSchedule extends BaseClass {

	

	@FindBy(xpath = "//a[contains(text(),'Email Execution Schedule')]")
	WebElement emailScheduleTab;

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
	
	
	@FindBy(xpath="(//i[contains(@class,'sort-down')]//parent::button[@type='button'])[3]")
	WebElement dropDownToSelectUsers;
	
	@FindBy(xpath="(//button[@class='dropdown-item'])[6]")
	WebElement selectAll;
	
	
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

	@Step("Clicking on email schedule tab:")
	public void clickOnEmailScheduleTab() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver,30);
        
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Settings')]")));
		settingsTab.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions build = new Actions(driver);
		build.moveToElement(emailScheduleTab).click().build().perform();
	}

	
	
	@Step("Create schedule with customized timeslot:")
	public void createSchedule() throws InterruptedException  {
		Thread.sleep(5000);
		Actions build1 = new Actions(driver);
		build1.moveToElement(addScheduleBtn).click().build().perform();
		
//		Random random = new Random();
//		int random_Number = random.nextInt(10000);
		Thread.sleep(8000);
		scheduleNamefield.sendKeys(prop.getProperty("eesScheduleName"));

		Select timeZoneTab = new Select(timeZoneDropdown);
		timeZoneTab.selectByVisibleText("EST - Eastern Standard Time");
		Thread.sleep(3000);
		dropDownToSelectUsers.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		dropDownToSelectUsers.click();
		Thread.sleep(3000);
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
			
			Thread.sleep(4000);
			if(save_closeBtn.isDisplayed())
			{
				
				System.out.println("Save&Close Button is working!!!");
				Allure.addAttachment("SaveandcloseBtn", "SaveandcloseBtnisselected" );
				
			}
			else
			{
				
				System.out.println("Save&Close Button is not working!!!");
				Allure.addAttachment("SaveandcloseBtn", "SaveandcloseBtnisnotselected" );
				
			}
			
			explicitWait(driver, 20, save_closeBtn);

			save_closeBtn.click();
			Thread.sleep(4000);
			
			
		} 

		

	

	

}
