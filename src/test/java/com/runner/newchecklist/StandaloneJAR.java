package com.runner.newchecklist;
import org.testng.TestNG;

import com.qa.testfiles.CadenceWorkflowTest;
import com.qa.testfiles.CustomerPortalMyListsTest;
import com.qa.testfiles.EmailExecutionScheduleTest;
import com.qa.testfiles.EmailSettingsTest;
import com.qa.testfiles.ProspectsMemberActivityTest;

import com.qa.testfiles.SalesforceVerificationTest;
import com.qa.testfiles.TemplatesTest;
import com.qa.testfiles.ViewCadenceTest;
import com.qa.testfiles.ViewUserandSystemDrivenTest;
import com.qa.testfiles.WorkflowTest;
import com.qa.testfiles.WorkflowViewCadenceTest;
import com.viewcadence.metrics.ViewCadence;

import cpod_testfiles.Cpod_5925test;
import standalonefiles.ProspectsTest;







public class StandaloneJAR {
	static TestNG testNg;

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		testNg = new TestNG(); 
		testNg.setTestClasses(new Class[]
				{Cpod_5925test.class}); 
		testNg.run();

				testNg = new TestNG();
				testNg.setTestClasses(new Class[] {EmailExecutionScheduleTest.class});
				testNg.run();



				testNg = new TestNG(); 
				testNg.setTestClasses(new Class[]
				{TemplatesTest.class}); 
				testNg.run();


				testNg = new TestNG(); testNg.setTestClasses(new Class[]
				{CadenceWorkflowTest.class}); 
				testNg.run();
				
				testNg = new TestNG();
				testNg.setTestClasses(new Class[]
				{ProspectsTest.class});
				testNg.run();

				testNg = new TestNG(); testNg.setTestClasses(new Class[]
				{WorkflowTest.class}); 
				testNg.run();


				testNg = new TestNG(); testNg.setTestClasses(new Class[]
				{ProspectsMemberActivityTest.class}); 
				testNg.run();
			

				
	}

}
