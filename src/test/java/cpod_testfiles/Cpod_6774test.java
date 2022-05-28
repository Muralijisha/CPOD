package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import Files.Addcsv;

import cpod_main.Cpod_6774;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_6774test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_6774 Follow;
	
	

	
	
	@BeforeMethod   
	public void setup() {
		
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_6774(driver);
		
		
	}
	@Test(priority=1)//6304
	@Description("6774 - Dialers – Add from Cadence – It is supposed to show as “My Cadences” (radio icon) and field label should be “Cadences”")
	@Story("6774 - My Lists")
	public void Mycadence() throws InterruptedException {
		
		Follow.cadence();
		
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}