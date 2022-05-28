package com.at.Prospectmodule;


import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Allure;



public class ProspectsMemberActivity extends BaseClass {

	@FindBy(xpath = "//a[@title='Prospects']")
	WebElement prospectTab;

	@FindBy(xpath = "//button[@title='Import CSV']")
	WebElement importCSVButton;
	
	
	@FindBy(xpath="//button[@title='Import from CRM']")
	WebElement importCRMButton;
	
	@FindBy(name="reportFolderName")
	WebElement dropDownFolderMenu;
	
	@FindBy(xpath="//button[@title='Upload'and contains(text(),'Next')]")
	WebElement nextButton;
	
	@FindBy(xpath="//label[contains(text(),'Contacts')]//input[@name='crmReportName']")
	WebElement contactsCheckBox;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	WebElement tagdropDownMenu;
	
	@FindBy(xpath="//button[@title='Begin Import'and contains(text(),'Next')]")
	WebElement nextButton2;
	

	@FindBy(id = "csv_file_name")
	WebElement chooseFileTab;

	@FindBy(xpath = "//label[contains(text(),'Tag your list')]/parent::div//div[@class='input-group-append']/button")
	WebElement selectTagDropdown;

	@FindBy(name = "tagName")
	WebElement tagNameField;

	@FindBy(xpath = "//div[@class='dropdown-menu show']/button[contains(text(),'Upload03')]")
	WebElement dropdownValueSelection;

	@FindBy(xpath = "//button[@title='Upload']")
	WebElement uploadButton;

	@FindBy(xpath = "//button[@title='Save Changes' and contains(text(),'Save')]")
	WebElement saveButton_Prospect;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	WebElement closeButton;
	
	@FindBy(xpath = "//div[@id='Call Touch Saved Successfully']")
	WebElement touchSaveMsg;
	
	@FindBy(xpath="//a[contains(@href,'/prospects/list')]")
	WebElement prospectLink;
	
	@FindBy(xpath="(//a[contains(@href,'/prospects/list')])[2]")
	WebElement prospect1;
	
	@FindBy(xpath="(//a[contains(@href,'/prospects/list')])[4]")
	WebElement prospect2;
	
	@FindBy(xpath="(//a[contains(@href,'/prospects/list')])[6]")
	WebElement prospect3;
	
	@FindBy(xpath="(//a[contains(@href,'/prospects/list')])[8]")
	WebElement prospect4;
	
	
	@FindBy(xpath="//div[contains(@class,'content-section')]")
	List<WebElement> memberActivities;
	
	
	@FindBy(xpath="//span[@title='Back to list page']")
	WebElement backButton;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement searchBar;

	
	public ProspectsMemberActivity() {
		PageFactory.initElements(driver, this);
	}

	public void crmFileUpload() throws InterruptedException, IOException {
		Thread.sleep(9000);
		Actions ac=new Actions(driver);
		ac.click(prospectTab).build().perform();

		Thread.sleep(5000);
		Thread.sleep(6000);
		searchBar.sendKeys(prop.getProperty("TagName")); 
		Thread.sleep(15000);
		searchBar.sendKeys(Keys.ENTER); 
		searchBar.sendKeys(Keys.ENTER);
Thread.sleep(5000);
		ac.click(prospect1).build().perform();
		Thread.sleep(5000);

		List<WebElement> myElements = driver.findElements(By.xpath("//div[contains(@class,'content-section')]"));
		for(WebElement e : myElements) {
			System.out.println(e.getText());
			//Allure.addAttachment("Reports", e.getText());
		}
		Thread.sleep(6000);
		ac.click(backButton).build().perform();


		Thread.sleep(6000);
		ac.click(prospect2).build().perform(); 
		Thread.sleep(5000);

		List<WebElement> myElements1 = driver.findElements(By.xpath("//div[contains(@class,'content-section')]"));
		for(WebElement e : myElements1) {
			System.out.println(e.getText());
			//Allure.addAttachment("Reports", e.getText());
			
		}
		Thread.sleep(6000);
		ac.click(backButton).build().perform();
		Thread.sleep(6000);
		ac.click(prospect3).build().perform(); 
		Thread.sleep(5000);
		List<WebElement> myElements2 = driver.findElements(By.xpath("//div[contains(@class,'content-section')]"));
		for(WebElement e : myElements2) {
			System.out.println(e.getText());
			//Allure.addAttachment("Reports", e.getText());
		}
		Thread.sleep(6000);
		ac.click(backButton).build().perform();
		Thread.sleep(6000);

		ac.click(prospect4).build().perform();

		Thread.sleep(5000);
		List<WebElement> myElements3 = driver.findElements(By.xpath("//div[contains(@class,'content-section')]"));
		for(WebElement e : myElements3) {
			System.out.println(e.getText());
			Allure.addAttachment("Reports", e.getText());
		}
		Thread.sleep(6000);
		ac.click(backButton).build().perform();
		Thread.sleep(6000);





	}
}