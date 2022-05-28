package com.qa.testfiles;

import java.awt.AWTException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.Cadencemodule.TemplatePublic;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;
import com.at.Templatemodule.Template_AutoEmail;
import com.at.Templatemodule.Template_ReplyEmail;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TemplatesTest extends BaseClass {

	LoginPage loginpage;
	HomePage homepage;
	Template_AutoEmail  ts;
	Template_ReplyEmail tr;
	TemplatePublic tp;

	public TemplatesTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new LoginPage();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		ts = new Template_AutoEmail();
		tr = new Template_ReplyEmail();
		tp =new TemplatePublic();
	}

	@Test(description = "< Create Name and Subject Name for Template!")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Test Case Description :: Create schedule with customize time slot and save the created schedule and verifying the Success message generated!!!")
	@Story("#Story Name = Create a new Template*")
	public void createTemplateTest() throws InterruptedException, AWTException {
		Thread.sleep(9000);
		
		  ts.clickOnTemplateTab();
		  ts.createTemplate();
		 
		Thread.sleep(5000);
		tr.clickOnTemplateTab();
		tr.createTemplate();
		Thread.sleep(5000);
		//tp.clickOnTemplateTab();

	}
	
	
	
	  @AfterMethod public void tearDown() { driver.quit(); }
	 
	 
	 

}


