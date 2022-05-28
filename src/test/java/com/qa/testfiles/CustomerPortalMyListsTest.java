package com.qa.testfiles;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.Cadencemodule.SalesforceCustomerPortal;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CustomerPortalMyListsTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	SalesforceCustomerPortal mylists;

	public CustomerPortalMyListsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initializationCP();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		mylists = new SalesforceCustomerPortal();
		
	}

	@Test(priority = 1, description = "< Upload prospects and assign it to particular user!")
	@Severity(SeverityLevel.CRITICAL)
	@Description(" Test Case Description :: Upload prospects and assign it to particular user!!!")
	@Story("#Story Name : Upload prospects to user*")
	public void csvFileUploadTest() throws InterruptedException {
		
		mylists.uploadCRMFile_MyList();
	}
	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}