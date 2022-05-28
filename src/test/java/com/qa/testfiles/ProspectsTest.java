package com.qa.testfiles;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.at.LoginPage.LoginPage1;
import com.at.Prospectmodule.Prospects;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


	
	

	import java.io.IOException;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	


	import io.qameta.allure.Description;
	import io.qameta.allure.Severity;
	import io.qameta.allure.SeverityLevel;
	import io.qameta.allure.Story;

	public class ProspectsTest extends BaseClass {

			LoginPage1 loginpage;
			HomePage homepage;
			Prospects prospect;

			public ProspectsTest() {
				super();
			}

			@BeforeMethod
			public void setUp() {
				initialization();
				loginpage= new LoginPage1();
				homepage = loginpage.login(prop.getProperty("username1"), prop.getProperty("password1"));
				prospect = new Prospects();
			}

			@Test(description = "< !")
			@Severity(SeverityLevel.CRITICAL)
			@Description(" Test Case Description :: !!!")
			@Story("#Story Name = *")
			public void uploadProspect() throws InterruptedException, IOException {
				prospect.crmFileUpload();
				Thread.sleep(6000);
			}
			
			
			  @AfterMethod public void tearDown() { driver.quit(); }
			 
			 



		
		
		
	}




