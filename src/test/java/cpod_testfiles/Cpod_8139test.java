


package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;


import cpod_main.Cpod_8139;
import io.qameta.allure.Description;
import io.qameta.allure.Story;


public class Cpod_8139test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_8139 Follow;
	
	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_8139(driver);
	}
	
	@Test
	@Description("8139 - Dialer – User updates the comments field and it is not writing back to SF")
	@Story("8139 - My Session")
    public void Crmcommentscheck() throws InterruptedException {
    	Follow.Crmcomments();
    }
	
	
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}
