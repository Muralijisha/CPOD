
package cpod_testfiles;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod_main.Cpod_6894;
import io.qameta.allure.Description;
import io.qameta.allure.Story;



	public class Cpod_6894test extends BaseClass{
		LoginPage loginpage;
		HomePage homepage;
		Cpod_6894 Follow;
		

		
		
		@BeforeTest   
		public void setup() {
			initialization();
			loginpage = new LoginPage();
			homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
			Follow=new Cpod_6894(driver);
		}
		
	    @Test(priority=1)//6894
	    @Description("6894 - NA100 – Dialers – AAD/FD – Call me – It is not remembering the “country code” checkbox")
	    @Story("6894 - My Session")
	    public void FDremembering_and_AADremembering() throws InterruptedException {
	    	Follow.FDremembering();
	    	Follow.AADremembering();
	    }
		
		
		
		@AfterTest
		public void close() {
			driver.close();
		}
	}
