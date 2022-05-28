package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod_main.Cpod_6894;
import cpod_main.Cpod_7031;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_7031test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_7031 Follow;
	

	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_7031(driver);
	}
	
	
    @Test(priority=1)
    @Description("7031 - Dialers – Administration – Caller ids – Show a banner notification on the # of states that need to be mapped.")
    @Story("7031 - Banner")
    public void Banner() throws InterruptedException {
    	Follow.Banner();
    }
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
}

