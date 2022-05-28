package First_Run;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;


import Files.Delete_csv;

public class RunTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Delete_csv csv;
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		csv = new Delete_csv(driver);

}
	
	@Test
	public void Run() throws InterruptedException {
		csv.addlist();
	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
}