package com.qa.testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.Cadencemodule.SalesforceVerification;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class SalesforceVerificationTest extends BaseClass {
	
	LoginPage loginpage;
	HomePage homepage;
	SalesforceVerification salesforceverify;
	
	public SalesforceVerificationTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initializationCP();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		salesforceverify = new SalesforceVerification();
		
	}

	@Test(priority = 1, description = "< Verify Activity in CRM!")
	@Severity(SeverityLevel.CRITICAL)
	@Description(" Test Case Description :: Verify Activity in CRM!!!")
	@Story("#Story Name : Verify Activity in CRM*")
	public void crmFileUploadTest() throws InterruptedException {

		salesforceverify.CRMVerification();
	}

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}






