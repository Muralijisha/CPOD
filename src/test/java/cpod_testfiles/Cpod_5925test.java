
package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;


import cpod_main.Cpod_5925;
import io.qameta.allure.Description;
import io.qameta.allure.Story;


public class Cpod_5925test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_5925 Follow;
	
	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_5925(driver);
	}
	@Test(priority=1)
	@Description("5925 - My Lists – In 11.0, Rename it as Koncert Followups (Not Due) and Koncert Followups (Past Due)")
	@Story("5925 - My Lists")
	public void Koncert_not_and_past_due() throws InterruptedException {
		Follow.notdue();
		Follow.pastdue();
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}
