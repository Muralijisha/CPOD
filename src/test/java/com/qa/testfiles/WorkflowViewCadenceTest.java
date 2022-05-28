package com.qa.testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.at.LoginPage.LoginPage1;
import com.at.Prospectmodule.Workflow;
import com.viewcadence.metrics.WorkflowViewCadence;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class WorkflowViewCadenceTest extends BaseClass{

	LoginPage loginpage;
	HomePage homepage;
	WorkflowViewCadence wf;
	public WorkflowViewCadenceTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		wf = new WorkflowViewCadence();
		
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
