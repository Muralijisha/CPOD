package Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;

public class Addcsv extends BaseClass{
	
	@FindBy(xpath="//a[contains(text(),'My Lists')]")
	WebElement MyLists;
	
	@FindBy(xpath="//button[contains(text(),'Add Lists')]")
	WebElement Addlists;
	
	@FindBy(xpath="//a[contains(text(),'Add from CSV')]")
	WebElement Addfromcsv;
	
	@FindBy(id="uploader")
	WebElement Fileupload;
	
	@FindBy(id="uploadnextbtn_0")
	WebElement Next;
	
	@FindBy(id="calleridmode")
	WebElement Callerid;
	
	@FindBy(id="timezonecst")
	WebElement Cst;
	
	@FindBy(id="timezoneest")
	WebElement Est;
	
	@FindBy(id="timezonemst")
	WebElement Mst;
	
	@FindBy(id="timezonepst")
	WebElement Pst;
	
	@FindBy(id="uploadnextbtn_1")
	WebElement Next1;
	
	@FindBy(id="uploadnextbtn_2")
	WebElement Next2;
	
	@FindBy(id="uploadnextbtn_3")
	WebElement Next3;
	
	@FindBy(xpath="(//div[contains(@class,'btn btn-danger float-left')])[6]")
	WebElement Close;
	
	@FindBy(xpath="//div[contains(@class,'jconfirm-buttons')]//button[text()='OK']")
	WebElement Ok;
	
	@FindBy(id="listnamesearch")
	WebElement Search;
	
	@FindBy(id="searchlistbtn")
	WebElement SearchBtn;
	
	@FindBy(id="beginDialingSessionButton")
    WebElement Beginupload;
	
	@FindBy(id="btnContinueToSession")
	WebElement Continue;
	
	@FindBy(xpath="(//td[contains(@class,'my-list-checkbox')]//input)[1]")
	WebElement list;
	
	@FindBy(xpath="//div[contains(text(),'There is another list with the same name')]")
	WebElement popup;
	
	@FindBy(id="btnGroupDrop2")
	WebElement Action;
	
	@FindBy(id="liststodelete")
	WebElement Delete;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	WebElement ok;
	
	@FindBy(xpath="//div[contains(text(),'key 6 records (1).csv')]")
	WebElement Listverify;
	
	@FindBy(xpath="(//p[contains(text(),'No lists have been created yet.')])[1]")
	WebElement Nolist;
	
	
	
	
	
	public Addcsv(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 public void addlist() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	WebDriverWait wait = new WebDriverWait(driver,30);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
		
			Actions action = new Actions(driver);
			action.moveToElement(MyLists).click().build().perform();
			Thread.sleep(3000);
			
			action.moveToElement(Addlists).click().build().perform();
			Thread.sleep(3000);
			Addfromcsv.click();
			Fileupload.sendKeys(System.getProperty("user.dir")+"//Murali List.csv");
			Thread.sleep(3000);
			ok.click();
			Thread.sleep(3000);
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;   
			jse1.executeScript("scroll(0, 250)");
			Next.click();
			Thread.sleep(3000);
			WebElement dropdown = Callerid;
			Select drop = new Select(dropdown);
			drop.selectByVisibleText("Random");
			Thread.sleep(2000);
			Est.click();
			Cst.click();
			Mst.click();
			Pst.click();
			Thread.sleep(2000);
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;   
			jse2.executeScript("scroll(0, 250)");
			Next1.click();
			Thread.sleep(4000);
			JavascriptExecutor jse3 = (JavascriptExecutor)driver;   
			jse3.executeScript("scroll(0, 250)");
			Thread.sleep(2000);
			Next2.click();
			Thread.sleep(6000);
			
			Next3.click();
			Thread.sleep(2000);
			Close.click();
			Thread.sleep(5000);
        //    Search.sendKeys(prop.getProperty("listname"));
			
		//	action.moveToElement(SearchBtn).click().build().perform();
		//	Thread.sleep(3000);
		//	action.moveToElement(list).click().build().perform();
		//	action.moveToElement(Beginupload).click().build().perform();
		//	Thread.sleep(8000);
		//	action.moveToElement(Continue).click().build().perform();
		//	Thread.sleep(8000);
			
	 }
}