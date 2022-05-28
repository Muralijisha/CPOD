package com.qa.testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage1;
import com.at.Prospectmodule.Workflow;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class WorkflowTest  extends BaseClass{
	LoginPage1 loginpage;
	HomePage homepage;
	Workflow wf;
	public WorkflowTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage1();
		loginpage.login(prop.getProperty("username1"), prop.getProperty("password1"));
		wf = new Workflow();
		
	}

	@Test(description = "< Create Workflow of all touches!")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description :: Creating Worflow of all touches!!!")
	@Story("#Story Name = Workflow of all touches*")
	public void createWorkflowTest() throws InterruptedException
	{
		Thread.sleep(3000);
		wf.CadenceWorkflow();
		Thread.sleep(5000);

	}
	
	
	
	  @AfterMethod public void tearDown() { driver.quit(); }
	 
	 
	 
}


