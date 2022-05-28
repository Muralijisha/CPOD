package com.qa.testfiles;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.at.Settingsmodule.EmailExecutionSchedule;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class EmailExecutionScheduleTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	EmailExecutionSchedule ees;

	public EmailExecutionScheduleTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ees = new EmailExecutionSchedule();
		
	}

	

	@Test(description = "< Create schedule and time slot, save the created schedule!")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description :: Create schedule with customize time slot and save the created schedule and verifying the Success message generated!!!")
	@Story("#Story Name = Create a new schedule*")
	public void createScheduleTest() throws InterruptedException  {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ees.clickOnEmailScheduleTab();
		
		ees.createSchedule() ;
		Thread.sleep(6000);
		
		
	}

	
	  @AfterMethod() public void tearDown() { driver.quit(); }
	 

}
