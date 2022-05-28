package com.qa.testfiles;




	

	import java.io.IOException;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.Cadencemodule.AutoReplyEmailTouch;
import com.at.Cadencemodule.AutomailTouch;

import com.at.Cadencemodule.CallTouch_PD;
import com.at.Cadencemodule.LinkedInTouch;

import com.at.Cadencemodule.PersonalizeMailTouch;
import com.at.Cadencemodule.PersonalizeReplyEMailTouch;
import com.at.Cadencemodule.SocialTouch;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.viewcadence.metrics.CallTouch;
import com.viewcadence.metrics.NewCadenceWorkflow;

import io.qameta.allure.Description;
	import io.qameta.allure.Severity;
	import io.qameta.allure.SeverityLevel;
	import io.qameta.allure.Story;

	public class ViewCadenceTest extends BaseClass {

		LoginPage loginpage;
		HomePage homepage;
		AutomailTouch automailtouch;
		AutoReplyEmailTouch replyemail;
		CallTouch calltouch;
		CallTouch_PD pd;
		SocialTouch socialtouch;
		PersonalizeMailTouch personalizemail;
		PersonalizeReplyEMailTouch personalreplyemail;
		LinkedInTouch linkedIntouch;
		NewCadenceWorkflow newcadenceworkflow;

		public ViewCadenceTest() {
			super();
		}

		@BeforeMethod
		public void setUp() {
			initialization();
			loginpage = new LoginPage();
			homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			automailtouch = new AutomailTouch();
			replyemail =new AutoReplyEmailTouch();
			newcadenceworkflow = new NewCadenceWorkflow();
			personalizemail = new PersonalizeMailTouch();
			personalreplyemail= new PersonalizeReplyEMailTouch();
			linkedIntouch = new LinkedInTouch();
			socialtouch = new SocialTouch();
			calltouch = new CallTouch();
			pd= new CallTouch_PD();

		}

		@Test(description = "<Cadence Creation  !")
		@Severity(SeverityLevel.CRITICAL)
		@Description(" Test Case Description :: !!!")
		@Story("#Story Name = *")
		public void cadenceCreationTest() throws Exception {
            Thread.sleep(6000);
			newcadenceworkflow.createNewCadence();
			//personalizemail.createPersonalizeMailTouch();
			//personalreplyemail.createPersonalizeMailTouch();
			Thread.sleep(3000);
			calltouch.createCallTouch();
			Thread.sleep(5000);
			socialtouch.createOtherTouch();
			
	
			 
		}


		
		 @AfterMethod public void tearDown() { driver.quit(); }
		  
		 

	}





