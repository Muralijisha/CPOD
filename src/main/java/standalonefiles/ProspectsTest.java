package standalonefiles;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.LoginPage.LoginPage1;

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

	public class ProspectsTest extends com.at.Baseclass.BaseClass {

		    com.at.LoginPage.LoginPage loginpage;
			com.at.LoginPage.HomePage homepage;
			Prospects prospect;

			public ProspectsTest() {
				super();
			}

			@BeforeMethod
			public void setUp() {
				initialization();
				loginpage = new com.at.LoginPage.LoginPage();
				homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
				prospect = new Prospects();
			}

			@Test(description = "< !")
			@Severity(SeverityLevel.CRITICAL)
			@Description(" Test Case Description :: !!!")
			@Story("#Story Name = *")
			public void uploadProspect() throws InterruptedException, IOException {
				prospect.csvFileUpload();
				Thread.sleep(6000);
			}
			
			  @AfterMethod public void tearDown() { driver.quit(); }
			 



		
		
		
	}




