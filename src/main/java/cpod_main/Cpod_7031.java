package cpod_main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cpod_7031 {

	@FindBy(xpath="//a[text()='My Dashboard']")
	WebElement Mydashboard;
	
	@FindBy(xpath="//a[text()='My Session']")
	WebElement Mysession;
	
	@FindBy(xpath="//a[text()='My Lists']")
	WebElement Mylists;
	
	@FindBy(xpath="//a[text()='My Reports']")
	WebElement Myreports;
	
	@FindBy(xpath="//a[text()='Remote Coach']")
	WebElement Remotecoach;
	
	@FindBy(xpath="//a[text()='Scheduler']")
	WebElement Scheduler;
	
	@FindBy(xpath="//a[text()='Settings']")
	WebElement Settings;
	
	@FindBy(xpath="//a[text()='Administration']")
	WebElement Administration;
	
	@FindBy(xpath="//p[contains(text(),'Calls will not go through if there are no caller ids.')]")
	WebElement Banner;
	
	
	public Cpod_7031(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 
	 public void Banner() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Actions action = new Actions(driver);
         action.moveToElement(Mydashboard).click().build().perform();    
         Thread.sleep(5000);
         String text = Banner.getText();
         Assert.assertTrue(text.contains("Warning!"));
         
        Thread.sleep(3000);
 		action.moveToElement(Mysession).click().build().perform();    
        Thread.sleep(5000);
        String text1 = Banner.getText();
        Assert.assertTrue(text1.contains("Warning!"));	 
        Thread.sleep(3000);
	    action.moveToElement(Mylists).click().build().perform();    
        Thread.sleep(5000);
        String text2 = Banner.getText();
        Assert.assertTrue(text2.contains("Warning!"));
        Thread.sleep(3000);
	    action.moveToElement(Myreports).click().build().perform();    
        Thread.sleep(5000);
        String text3 = Banner.getText();
        Assert.assertTrue(text3.contains("Warning!"));
        Thread.sleep(3000);
	    action.moveToElement(Remotecoach).click().build().perform();    
        Thread.sleep(5000);
        String text4 = Banner.getText();
        Assert.assertTrue(text4.contains("Warning!"));
        Thread.sleep(3000);
	    action.moveToElement(Scheduler).click().build().perform();    
        Thread.sleep(5000);
        String text5 = Banner.getText();
        Assert.assertTrue(text5.contains("Warning!"));
        Thread.sleep(3000);
	    action.moveToElement(Settings).click().build().perform();    
        Thread.sleep(5000);
        String text6 = Banner.getText();
        Assert.assertTrue(text6.contains("Warning!"));
        Thread.sleep(3000);
	    action.moveToElement(Administration).click().build().perform();    
        Thread.sleep(5000);
        String text7 = Banner.getText();
        Assert.assertTrue(text7.contains("Warning!"));	 
 		 
	 }

	
}
