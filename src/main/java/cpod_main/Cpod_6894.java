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

public class Cpod_6894 extends BaseClass{
	
	@FindBy(id="mysession_dialer_mode")
	WebElement Dialermode;
	
	@FindBy(xpath="//a[text()='My Session']")
	WebElement Mysession;
	
	@FindBy(xpath="//div[contains(@class,'personal')]")
	WebElement Flow;
	
	@FindBy(xpath="//div[contains(@class,'team')]")
	WebElement Agent;
	
	@FindBy(xpath="//span[text()='Flow Dialer']")
	WebElement FD;
	
	@FindBy(xpath="//span[text()='Agent Assisted Dialer']")
	WebElement AAD;
	
	@FindBy(id="callme")
	WebElement Callme;
	
	@FindBy(id="numberToCall")
	WebElement Numbertocall;
	
	@FindBy(id="coutrycodeprefixed")
	WebElement Coutrycodeprefixed;
	
	@FindBy(xpath="//div[text()=' Call Now']")
	WebElement Callnow;
	
	@FindBy(xpath="//div[contains(@class,'jconfirm-buttons')]//button[text()='OK']")
	WebElement Ok;
	
	@FindBy(xpath="//a[text()='Settings']")
	WebElement Settings;
	
	@FindBy(xpath="//div[@id=\"callmesection1\"]//div[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	@FindBy(xpath="//div[contains(text(),'You are already in Flow Dialer Mode')]")
	WebElement FDscreen;
	
	public Cpod_6894(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 
	 public void FDremembering() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Session']")));
		
			Actions action = new Actions(driver);
			action.moveToElement(Mysession).click().build().perform();
			Thread.sleep(3000);
		
			if(Flow.isDisplayed())
			{
			    action.moveToElement(Callme).click().build().perform();
			    Thread.sleep(3000);
			    Numbertocall.clear();
			    Thread.sleep(3000);
			    Numbertocall.sendKeys(prop.getProperty("phonenumber"));
		//	    action.sendKeys(Numbertocall, "919176089970").build().perform();
			    boolean y = Coutrycodeprefixed.isSelected();
			    if(y == true)
			    {
			    	Coutrycodeprefixed.click();
			    }
			    Thread.sleep(3000);
			    action.moveToElement(Callnow).click().build().perform();
			    Thread.sleep(2000);
			    action.moveToElement(Ok).click().build().perform();
			    Thread.sleep(2000);
			    action.moveToElement(Coutrycodeprefixed).click().build().perform();
			    Thread.sleep(2000);
			    action.moveToElement(Callnow).click().build().perform();
			    Thread.sleep(25000);
			    
			    action.moveToElement(Settings).click().build().perform();
			    Thread.sleep(4000);
			    action.moveToElement(Mysession).click().build().perform();
			    Thread.sleep(4000);
			    action.moveToElement(Callme).click().build().perform();
			    Thread.sleep(3000);
			    boolean x = Coutrycodeprefixed.isSelected();
			    Assert.assertTrue(x);
			    Thread.sleep(3000);
			    action.moveToElement(Cancel).click().build().perform();
			    Thread.sleep(8000);
			}
			else{
				action.moveToElement(Dialermode).click().build().perform();
				Thread.sleep(2000);
				action.moveToElement(FD).click().build().perform();
				Thread.sleep(5000);
		    
		    action.moveToElement(Callme).click().build().perform();
		    Thread.sleep(3000);
		    Numbertocall.clear();
		    Thread.sleep(3000);
		    Numbertocall.sendKeys(prop.getProperty("phonenumber"));
		    boolean y = Coutrycodeprefixed.isSelected();
		    if(y == true)
		    {
		    	Coutrycodeprefixed.click();
		    }
		    Thread.sleep(3000);
		    action.moveToElement(Callnow).click().build().perform();
		    Thread.sleep(2000);
		    action.moveToElement(Ok).click().build().perform();
		    Thread.sleep(2000);
		    action.moveToElement(Coutrycodeprefixed).click().build().perform();
		    Thread.sleep(2000);
		    action.moveToElement(Callnow).click().build().perform();
		    Thread.sleep(25000);
		    
		    action.moveToElement(Settings).click().build().perform();
		    Thread.sleep(4000);
		    action.moveToElement(Mysession).click().build().perform();
		    Thread.sleep(4000);
		    action.moveToElement(Callme).click().build().perform();
		    Thread.sleep(3000);
		    boolean x = Coutrycodeprefixed.isSelected();
		    Assert.assertTrue(x);
		    Thread.sleep(3000);
		    action.moveToElement(Cancel).click().build().perform();
		    Thread.sleep(8000);
			}
	 }    
	 
		 public void AADremembering() throws InterruptedException {
			 Actions action = new Actions(driver);
			 action.moveToElement(Dialermode).click().build().perform();
				Thread.sleep(2000);
				action.moveToElement(AAD).click().build().perform();
				Thread.sleep(5000);
				action.moveToElement(Callme).click().build().perform();
			    Thread.sleep(3000);
			    Numbertocall.clear();
			    Thread.sleep(3000);
			    Numbertocall.sendKeys(prop.getProperty("phonenumber"));
			    boolean y = Coutrycodeprefixed.isSelected();
			    if(y == true)
			    {
			    	Coutrycodeprefixed.click();
			    }
			    Thread.sleep(3000);
			    action.moveToElement(Callnow).click().build().perform();
			    Thread.sleep(2000);
			    action.moveToElement(Ok).click().build().perform();
			    Thread.sleep(2000);
			    action.moveToElement(Coutrycodeprefixed).click().build().perform();
			    Thread.sleep(2000);
			    action.moveToElement(Callnow).click().build().perform();
			    Thread.sleep(25000);
			    
			    action.moveToElement(Settings).click().build().perform();
			    Thread.sleep(4000);
			    action.moveToElement(Mysession).click().build().perform();
			    Thread.sleep(4000);
			    action.moveToElement(Callme).click().build().perform();
			    Thread.sleep(3000);
			    boolean x = Coutrycodeprefixed.isSelected();
			    Assert.assertTrue(x);
			    Thread.sleep(3000);
			    action.moveToElement(Cancel).click().build().perform();
				
			 
		 }
		    
		    
			
	 }
	
	
	
	
	
	
	
	


