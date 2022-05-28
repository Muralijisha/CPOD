
package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod_main.Cpod_6304;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_6304test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_6304 Follow;
	

	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_6304(driver);
	}
	@Test(priority=1)//6304
	@Description("6304 - My Lists - When importing a list from Cadence, the Save your list as should change to Cadence - (list name)")
	@Story("6304 - My Lists")
	public void Cadence_name() throws InterruptedException {
		Follow.cadence();
		
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}
