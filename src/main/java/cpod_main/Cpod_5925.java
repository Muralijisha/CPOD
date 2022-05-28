
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
import org.testng.annotations.Listeners;

import com.at.AllureReportListener.TestAllureListener;

@Listeners({TestAllureListener.class})
public class Cpod_5925 {
	
	@FindBy(xpath="//a[contains(text(),'My Lists')]")
	WebElement MyLists;
	
	@FindBy(id="listnamesearch")
	WebElement Search;
	
	@FindBy(id="searchlistbtn")
	WebElement SearchBtn;
	
	@FindBy(xpath="//div[contains(text(),'Koncert Follow Ups (Not due)')]")
	WebElement Notdue;
	
	@FindBy(xpath="//div[contains(text(),'Koncert Follow Ups (Past due)')]")
	WebElement Pastdue;
	

	
	public Cpod_5925(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	public void notdue() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
	
        
		Actions action = new Actions(driver);
		action.moveToElement(MyLists).click().build().perform();
		Thread.sleep(3000);
		action.sendKeys(Search, "Follow Ups (Not due)").build().perform();
		action.moveToElement(SearchBtn).click().build().perform();
		//SearchBtn.click();
		Thread.sleep(3000);
		
		String text = Notdue.getText();
		Assert.assertEquals("Koncert Follow Ups (Not due)", text);
		
		
	}
	public void pastdue() throws InterruptedException {
		Thread.sleep(3000);
		Search.clear();
		Actions action = new Actions(driver);
		action.sendKeys(Search, "Follow Ups (Past due)").build().perform();
		action.moveToElement(SearchBtn).click().build().perform();
		
		Thread.sleep(3000);
		String text = Pastdue.getText();
		Assert.assertEquals("Koncert Follow Ups (Past due)", text);
	}
	
	
	
	

}
