package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import Files.Addcsv;
import cpod_main.Cpod_7128;
import io.qameta.allure.Description;
import io.qameta.allure.Story;

public class Cpod_7128test extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_7128 Follow;
	Addcsv csv; 
	
	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_7128(driver);
		csv = new Addcsv(driver);
	}
	@Test(priority=1)//7128
	@Description("7128 - My Session - User reported that when uploading this list, it shows no data in My Session.")
	@Story("7128 - My Session")
	public void Listupload() throws InterruptedException {
		csv.addlist();
		Follow.listupload();
		
		
	}
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}
