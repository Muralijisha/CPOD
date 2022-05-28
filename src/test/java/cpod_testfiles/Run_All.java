package cpod_testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod_main.Cpod_5925;
import cpod_main.Cpod_6232;
import cpod_main.Cpod_6774;
import cpod_main.Cpod_6894;
import cpod_main.Cpod_6978;
import cpod_main.Cpod_6997;

public class Run_All extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	Cpod_6774 Follow;
	Cpod_5925 Follow1;
	Cpod_6232 Follow2;
	Cpod_6894 Follow3;
	Cpod_6978 Follow4;
	Cpod_6997 Follow5;
	

	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new Cpod_6774(driver);
		Follow1=new Cpod_5925(driver);
		Follow2=new Cpod_6232(driver);
		Follow3=new Cpod_6894(driver);
		Follow4=new Cpod_6978(driver);
		Follow5=new Cpod_6997(driver);
	}
	@Test(priority=1)//6774
	public void Mycadence_name() throws InterruptedException {
		Follow.cadence();
		
		}
	
	@Test(priority=2)//5925
	public void Follow_up_name() throws InterruptedException {
		Follow1.notdue();
		Follow1.pastdue();
		
		}
	
	@Test(priority=3)//6232
	public void Addtocadence_name() throws InterruptedException {
    	Follow2.Addtocadence();
    	
    }
	
	@Test(priority=4)//6894
	public void FDremembering_and_AADremembering_check() throws InterruptedException {
    	Follow3.FDremembering();
    	Follow3.AADremembering();
    	
    }
	
	@Test(priority=5)//6978
	public void TeamList_Archieve() throws InterruptedException {
    	Follow4.archieve();
    	
    	
    }
	
	@Test(priority=6)//6997
	public void ParkingLot() throws InterruptedException {
    	Follow5.parkinglot();
    	
    }
	
	
	
	@AfterMethod
	public void Tear_down() {
		driver.close();
	}

	
	

}
