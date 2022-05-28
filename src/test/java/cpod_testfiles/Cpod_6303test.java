package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod_main.Cpod_6303;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_6303test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_6303 Follow;
	

	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_6303(driver);
	}
	
    @Test(priority=1)//6303
    @Description("6303 - My Session – All Footer links are pointed to connectleader")
    @Story("6303 - My Session")
    public void Footer_Name() throws InterruptedException {
    	Follow.Footer();
    }
	
	
	
	@AfterMethod
	public void close() {
		
		driver.close();
	}
}


	
	
	
	
	


