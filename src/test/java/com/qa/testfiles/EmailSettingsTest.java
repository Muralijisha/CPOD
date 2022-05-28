package com.qa.testfiles;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.at.Settingsmodule.EmailSettings;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


public class EmailSettingsTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	EmailSettings emailSettings;

	public EmailSettingsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		emailSettings = new EmailSettings();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@Test(priority = 1, description = "< Verifying the email settings!")
	@Severity(SeverityLevel.CRITICAL)
	@Description(" Test Case Description ::Verifying the emails !!!")
	@Story("#Story Name : Verifying the emails *")
	public void emailSettingsTest() throws InterruptedException  {
		//Assert.assertTrue(emailSettings.validateHeaderLabel(), "Email header lable is missing");
		emailSettings.emailSettings(prop.getProperty("email"));
				
		String flag = emailSettings.validateSucessMsg();
		System.out.println(flag);
		Thread.sleep(6000);
//		Assert.assertEquals(flag, "Your mail saved successfully", "Email is not saved successfully or Invalid credentials!");
	}

	
	
	  @AfterMethod public void tearDown() { driver.quit(); }
	 
	 

}
