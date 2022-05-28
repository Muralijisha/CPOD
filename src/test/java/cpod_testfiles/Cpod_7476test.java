package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod_main.Cpod_7476;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_7476test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_7476 Follow;
	

	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow = new Cpod_7476(driver);
	}
	@Test(priority=1)
	@Description("7476 - Administration – Remove the word “beta” from Parking Lot Rules/Parking Lot headers.")
	@Story("7476 - Administration - Parking Lot Rles")
	public void Parking_Lot_Name() throws InterruptedException {
		Follow.Parkinglot();
		
		
	}
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}
