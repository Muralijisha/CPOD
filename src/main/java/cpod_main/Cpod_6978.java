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

public class Cpod_6978 extends BaseClass{
	
	
	@FindBy(xpath="//a[contains(text(),'My Lists')]")
	WebElement MyLists;
	
	@FindBy(xpath="//a[contains(text(),'Teams List')]")
	WebElement TeamLists;
	
	@FindBy(xpath="(//td[contains(@class,'my-team-list-delete text-center')])[1]")
	WebElement Archievelist;
	
	@FindBy(xpath="//div[contains(@class,'jconfirm-buttons')]//button[text()='OK']")
	WebElement Ok;
	
	@FindBy(xpath="//button[contains(@id,'btnGroupDrop2')]")
	WebElement Actions;
	
	@FindBy(xpath="//a[contains(text(),'Archived Lists')]")
	WebElement Archievedlists;
	
	@FindBy(id="listnamesearch")
	WebElement Search;
	
	@FindBy(id="searchlistbtn")
	WebElement SearchBtn;
	
	@FindBy(xpath="(//td[contains(@class,'my-list-checkbox')])[1]")
	WebElement listtounarchieve;
	
	@FindBy(id="listtounarchive")
	WebElement Unarchieve;
	
	@FindBy(xpath="//td[contains(text(),'Murali List.csv')]")
	WebElement Verify;
	
	@FindBy(id="beginDialingSessionButton")
    WebElement Beginupload;
	
	@FindBy(id="btnContinueToSession")
	WebElement Continue;
	
	@FindBy(xpath="(//td[contains(@class,'my-list-checkbox')]//input)[1]")
	WebElement list;
	
	
	
	@FindBy(xpath="(//tr[contains(@class,'whiterow')])[1]")
	WebElement First;
	
	public Cpod_6978(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	public void archieve() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
	
		Actions action = new Actions(driver);
		action.moveToElement(MyLists).click().build().perform();
		Thread.sleep(5000);
		Search.sendKeys(prop.getProperty("crmcommentlist"));
		action.moveToElement(SearchBtn).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(list).click().build().perform();
		Thread.sleep(3000);
		action.moveToElement(Beginupload).click().build().perform();
		Thread.sleep(8000);
		action.moveToElement(Continue).click().build().perform();
		Thread.sleep(8000);
		action.moveToElement(MyLists).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(TeamLists).click().build().perform();
		Thread.sleep(2000);
		Search.sendKeys(prop.getProperty("listname"));
		action.moveToElement(SearchBtn).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(Archievelist).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(Ok).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(Ok).click().build().perform();
		Thread.sleep(5000);
		action.moveToElement(Actions).click().build().perform();
		Thread.sleep(2000);
		action.moveToElement(Archievedlists).click().build().perform();
		Thread.sleep(2000);
		Search.sendKeys(prop.getProperty("listname"));
		Thread.sleep(1000);
		action.moveToElement(SearchBtn).click().build().perform();
		Thread.sleep(1000);
		action.moveToElement(listtounarchieve).click().build().perform();
		Thread.sleep(1000);
		action.moveToElement(Unarchieve).click().build().perform();
		Thread.sleep(1000);
		action.moveToElement(Ok).click().build().perform();
		
		Thread.sleep(5000);
		action.moveToElement(TeamLists).click().build().perform();
		Search.sendKeys(prop.getProperty("listname"));
		action.moveToElement(SearchBtn).click().build().perform();
		Thread.sleep(3000);
	//	String list = prop.getProperty("listname");
		String text = Verify.getText();
		Assert.assertTrue(text.contains("Murali List"));
		}

	
}

	
	


