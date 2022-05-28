package com.qa.testfiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.at.Baseclass.BaseClass;
import com.at.LoginPage.HomePage;
import com.at.LoginPage.LoginPage;

import cpod.CL_Follow_Up;


public class CL_Follow_UpTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	CL_Follow_Up Follow;
	
//	public CL_Follow_UpTest() {
//		super();
//	}
	
	
	@BeforeMethod   
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		Follow=new CL_Follow_Up(driver);
	}
	@Test(priority=1)//5925
	public void notdue() throws InterruptedException {
		Follow.notdue();
		
		
	}
	
	@Test(priority=2)
		public void pastdue() throws InterruptedException {
		Follow.pastdue();
	}
	
    @Test(priority=3)//8124
    public void beginupload() throws InterruptedException {
    	Follow.beginupload();
    }
	
	
	
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}
