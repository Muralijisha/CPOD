package com.runner.newchecklist;

import org.testng.TestNG;

import com.qa.testfiles.CadenceWorkflowTest;
import com.qa.testfiles.CustomerPortalMyListsTest;
import com.qa.testfiles.EmailExecutionScheduleTest;
import com.qa.testfiles.EmailSettingsTest;
import com.qa.testfiles.ProspectsMemberActivityTest;
import com.qa.testfiles.ProspectsTest;
import com.qa.testfiles.SalesforceVerificationTest;
import com.qa.testfiles.TemplatesTest;
import com.qa.testfiles.ViewCadenceTest;
import com.qa.testfiles.ViewUserandSystemDrivenTest;
import com.qa.testfiles.WorkflowTest;
import com.qa.testfiles.WorkflowViewCadenceTest;
import com.viewcadence.metrics.ViewCadence;







public class Runnerclass {


	static TestNG testNg;

	public static void main(String[] args) {

		/*
		 * testNg=new TestNG(); testNg.setTestClasses(new Class[]
		 * {ViewCadenceTest.class}); testNg.run();
		 * 
		 * 
		 * testNg=new TestNG(); testNg.setTestClasses(new Class[]
		 * {WorkflowViewCadenceTest.class}); testNg.run();
		 * 
		 * 
		 * testNg=new TestNG(); testNg.setTestClasses(new Class[]
		 * {ViewUserandSystemDrivenTest.class}); testNg.run();
		 */
		
		
		testNg = new TestNG(); testNg.setTestClasses(new Class[]
				  {EmailExecutionScheduleTest.class}); testNg.run();
		
	
		/*
		 * testNg = new TestNG(); testNg.setTestClasses(new Class[]
		 * {EmailSettingsTest.class}); testNg.run();
		 * 
		  testNg = new TestNG(); testNg.setTestClasses(new Class[]
		  {EmailExecutionScheduleTest.class}); testNg.run();
		 * 
		 * 
		 * 
		 * testNg = new TestNG(); testNg.setTestClasses(new Class[]
		 * {TemplatesTest.class}); testNg.run();
		 * 
		 * 
		 * testNg = new TestNG(); testNg.setTestClasses(new Class[]
		 * {CadenceWorkflowTest.class}); testNg.run();
		 * 
		 * testNg = new TestNG(); testNg.setTestClasses(new Class[]
		 * {ProspectsTest.class}); testNg.run();
		 * 
		 * testNg = new TestNG(); testNg.setTestClasses(new Class[]
		 * {WorkflowTest.class}); testNg.run();
		 */
	  
	  //testNg = new TestNG(); testNg.setTestClasses(new Class[]
	  //{ProspectsMemberActivityTest.class}); testNg.run();
	 

				
				/*  testNg = new TestNG(); 
				  testNg.setTestClasses(new Class[] {
				  CustomerPortalMyListsTest.class});
				  
				  testNg.run();
				  
				  testNg = new TestNG(); testNg.setTestClasses(new Class[] {
				  SalesforceVerificationTest.class});
				  
				  testNg.run();*/
				 
				 
			 
}
}


