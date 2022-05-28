package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import Files.Addcsv;
import cpod_main.Cpod_6978;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_6978test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_6978 Follow;
	Addcsv csv;

	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_6978(driver);
		csv=new Addcsv(driver);
	}
	@Test(priority=1)
	@Description("6978 - My List - Managers can delete their user's lists, but they cannot Archive them")
	@Story("6978 - My Lists")
	public void TeamList_Archieve() throws InterruptedException {
		csv.addlist();
		Follow.archieve();
		
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}