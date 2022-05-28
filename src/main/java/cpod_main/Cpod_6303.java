
package cpod_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
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

public class Cpod_6303 {
	
	@FindBy(xpath="//*[@id=\"socialicons\"]/li[3]/a/img")
	WebElement youtube;
	
	@FindBy(xpath="//*[@id=\"socialicons\"]/li[2]/a/img")
	WebElement twitter;
	
	@FindBy(xpath="//*[@id=\"socialicons\"]/li[4]/a/img")
	WebElement likedin;
	
	@FindBy(xpath="//*[@id=\"socialicons\"]/li[1]/a/img")
	WebElement facebook;
	
	@FindBy(xpath="//yt-formatted-string[contains(text(),'Koncert_com')]")
	WebElement youtubename;
	
	@FindBy(xpath="//span[contains(text(),'Koncert')]")
	WebElement twittername;
	
	@FindBy(xpath="//a[text()='My Session']")
	WebElement Mysession;
	
	public Cpod_6303(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 
	 public void Footer() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='My Session']")));
		
			Actions action = new Actions(driver);
			action.moveToElement(Mysession).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(youtube).click().build().perform();       //YOUTUBE
			Thread.sleep(2000);
			Set<String> windowHandles = driver.getWindowHandles();
		    List<String> list = new ArrayList<String>(windowHandles);
		    driver.switchTo().window(list.get(1));
		    Thread.sleep(3000);
		    String text = youtubename.getText();
			Assert.assertEquals("Koncert_com", text);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(list.get(0));
			
			
			Thread.sleep(4000);
			action.moveToElement(twitter).click().build().perform();       //Twitter
			Thread.sleep(2000);
			Set<String> windowHandles1 = driver.getWindowHandles();
		    List<String> list1 = new ArrayList<String>(windowHandles1);
		    driver.switchTo().window(list1.get(1));
		    Thread.sleep(3000);
		    String text1 = twittername.getText();
			Assert.assertEquals("Koncert", text1);
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(list.get(0));
			
			
			
			
		    
		    
	 }
}
