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

public class Cpod_6304 {

	@FindBy(xpath="//a[contains(text(),'My Lists')]")
	WebElement MyLists;
	
	@FindBy(id="btnGroupDrop1")
    WebElement Addlist;
	
	@FindBy(xpath="//a[text()='Add from Cadence']")
    WebElement Addfromcadence;
	
	@FindBy(id="trupendingcall")
    WebElement Mypendingcalls;
	
	@FindBy(id="cadenceListName")
    WebElement Listname;
	
	@FindBy(xpath="//label[text()='My Cadences']")
	WebElement Mycadence;
	
	@FindBy(id="cadenceListName")
	WebElement Saveas;
	
	public Cpod_6304(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 public void cadence() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
		
			Actions action = new Actions(driver);
			action.moveToElement(MyLists).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(Addlist).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(Addfromcadence).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(Mypendingcalls).click().build().perform();
			Thread.sleep(3000);
			String text = Saveas.getAttribute("id");
			Assert.assertTrue(text.contains("cadence"));
	 }
	
	
	
	
	
}
