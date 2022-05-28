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

public class Cpod_7476 {
	
	@FindBy(xpath="//a[text()='Administration']")
	WebElement Administration;
	
	@FindBy(xpath="//a[text()='Parking Lot']")
	WebElement Parkinglot;
	
	@FindBy(xpath="//a[text()='Parking Lot Rules']")
	WebElement Parkinglotrules;
	
	public Cpod_7476(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 WebDriver driver;
		public void Parkinglot() throws InterruptedException {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
		
			Actions action = new Actions(driver);
			action.moveToElement(Administration).click().build().perform();
			Thread.sleep(3000);
			
			String text = Parkinglot.getText();
			Assert.assertEquals("Parking Lot", text);
			
			String text1 = Parkinglotrules.getText();
			Assert.assertEquals("Parking Lot Rules", text1);

	
		}
}
