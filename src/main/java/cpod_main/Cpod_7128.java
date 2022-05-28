package cpod_main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.at.Baseclass.BaseClass;

public class Cpod_7128 extends BaseClass{
	
	@FindBy(xpath="//a[contains(text(),'My Lists')]")
	WebElement MyLists;
	
	@FindBy(id="listnamesearch")
	WebElement Search;
	
	@FindBy(id="searchlistbtn")
	WebElement SearchBtn;
	
	@FindBy(id="beginDialingSessionButton")
    WebElement Begindialing;
	
	@FindBy(id="btnContinueToSession")
	WebElement Continue;
	
	@FindBy(xpath="(//td[contains(@class,'my-list-checkbox')]//input)[1]")
	WebElement list;
	

	@FindBy(id="mysession_dialer_mode")
	WebElement Dialermode; 
	
	@FindBy(id="show_currentList_statistics")
	WebElement currentlist;
	
	@FindBy(id="CT_Totalrecords")
    WebElement totalprospects1;
	
	@FindBy(xpath="(//b)[last()]")
    WebElement	Prospects;
	
	public Cpod_7128(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 
	 public void listupload() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
		
			Actions action = new Actions(driver);
			action.moveToElement(MyLists).click().build().perform();
			Thread.sleep(3000);
			Search.sendKeys(prop.getProperty("listname"));
			
			action.moveToElement(SearchBtn).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(list).click().build().perform();
			action.moveToElement(Begindialing).click().build().perform();
			Thread.sleep(8000);
			String Prospectscount=Prospects.getText();
			
					    
			action.moveToElement(Continue).click().build().perform();
			Thread.sleep(8000);
			action.moveToElement(Dialermode).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(currentlist).click().build().perform();
			
			
			String text = totalprospects1.getText();
			Assert.assertTrue(Prospectscount.contains(text));		
			
	 }
	

}
