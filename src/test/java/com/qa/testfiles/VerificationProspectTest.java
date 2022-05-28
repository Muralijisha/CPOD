package com.qa.testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.Cadencemodule.VerificationProspectsModule;

import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage1;
import com.at.Prospectmodule.Workflow;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class VerificationProspectTest extends BaseClass {
	LoginPage1 loginpage;
	HomePage homepage;
	VerificationProspectsModule vpm;
	
	public VerificationProspectTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage1();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	vpm = new VerificationProspectsModule ();
		
	}

	@Test(description = "< Create Workflow of all touches!")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description :: Creating Worflow of all touches!!!")
	@Story("#Story Name = Workflow of all touches*")
	public void createWorkflowTest() throws InterruptedException
	{
		Thread.sleep(3000);
		vpm.ViewCadenceMetrics();
        vpm.assigningprospecttocadence();
        vpm.pause_resume_exit_delete();
        
		Thread.sleep(5000);

	}
	
	
	
	 // @AfterMethod public void tearDown() { driver.quit(); }
	 
	 
	 
}


