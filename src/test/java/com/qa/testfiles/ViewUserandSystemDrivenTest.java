package com.qa.testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.Cadencemodule.AutoReplyEmailTouch;
import com.at.Cadencemodule.AutomailTouch;
import com.at.Cadencemodule.CallTouch;
import com.at.Cadencemodule.CallTouch_PD;
import com.at.Cadencemodule.LinkedInTouch;
import com.at.Cadencemodule.NewCadenceWorkflow;
import com.at.Cadencemodule.PersonalizeMailTouch;
import com.at.Cadencemodule.PersonalizeReplyEMailTouch;
import com.at.Cadencemodule.SocialTouch;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.viewcadence.metrics.ViewCadenceSystemDriven;
import com.viewcadence.metrics.ViewCadenceUserDriven;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class ViewUserandSystemDrivenTest extends BaseClass{

	LoginPage loginpage;
	HomePage homepage;
	ViewCadenceUserDriven userdriven;
	ViewCadenceSystemDriven systemdriven;
	
	
	
	public ViewUserandSystemDrivenTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		userdriven = new ViewCadenceUserDriven();
		systemdriven = new ViewCadenceSystemDriven();
		

	}

	@Test(description = "<Cadence Creation  !")
	@Severity(SeverityLevel.CRITICAL)
	@Description(" Test Case Description :: !!!")
	@Story("#Story Name = *")
	public void cadenceCreationTest() throws Exception {
        Thread.sleep(6000);
        userdriven.ViewCadenceMetrics();
       systemdriven.ViewCadenceMetrics();
      
		

		 
	}


	
	 @AfterMethod public void tearDown() { driver.quit(); }
	  
	 

}

	
	
	

