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

import com.at.Baseclass.BaseClass;

public class Cpod_8139 extends BaseClass {
	
	@FindBy(xpath="//a[contains(text(),'My Lists')]")
	WebElement MyLists;
	
	@FindBy(id="listnamesearch")
	WebElement Search;
	
	@FindBy(id="searchlistbtn")
	WebElement SearchBtn;
	
	@FindBy(id="beginDialingSessionButton")
    WebElement Beginupload;
	
	@FindBy(id="btnContinueToSession")
	WebElement Continue;
	
	
	
	@FindBy(xpath="(//tr[contains(@class,'whiterow')])[1]")
	WebElement First;
	
	@FindBy(xpath="//div[contains(@class,'jconfirm-buttons')]//button[text()='OK']")
	WebElement Ok;
	
	@FindBy(xpath="//tr[@id=\"drdt1_activity_comments\"]//textarea[@class=\"form-control\"]")
	WebElement Comments;
	
	@FindBy(id="customerdetails_window_save")
	WebElement Save;
	
	@FindBy(xpath="(//img[contains(@id,'mySession_open_crm')])[position()=1]")
	WebElement Crm;
	
	@FindBy(xpath="//a[contains(@id,'tryLexDialogX')]")
	WebElement Crmclose;
	
	@FindBy(xpath="//div[contains(text(),'Test')]")
	WebElement Crmcomments;
	
	@FindBy(xpath="(//td[contains(@class,'my-list-checkbox')]//input)[1]")
	WebElement list;
	
	public Cpod_8139(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
 WebDriver driver;
	 
	 public void Crmcomments() throws InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       Actions action = new Actions(driver);
		   action.moveToElement(MyLists).click().build().perform();
		   Thread.sleep(3000);
		   Search.sendKeys(prop.getProperty("crmcommentlist"));
			action.moveToElement(SearchBtn).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(list).click().build().perform();
			Thread.sleep(3000);
			action.moveToElement(Beginupload).click().build().perform();
			Thread.sleep(8000);
			action.moveToElement(Continue).click().build().perform();
			Thread.sleep(8000);
			Actions act = new Actions(driver);
			act.doubleClick(First).perform();
			Thread.sleep(5000);
			
			WebDriverWait wait1 = new WebDriverWait(driver,30);
	        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id=\"drdt1_activity_comments\"]//textarea[@class=\"form-control\"]")));
		
			Comments.clear();
			action.sendKeys(Comments, "Test Call Comments").build().perform();
			action.moveToElement(Save).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(Ok).click().build().perform();
			Thread.sleep(3000);
			driver.navigate().refresh();
			Thread.sleep(3000);
			action.moveToElement(Crm).click().build().perform();
			Thread.sleep(5000);
			Set<String> windowHandles1 = driver.getWindowHandles();
		    List<String> list1 = new ArrayList<String>(windowHandles1);
		    driver.switchTo().window(list1.get(1));
			action.moveToElement(Crmclose).click().build().perform();
			Thread.sleep(3000);
			String text = Crmcomments.getText();
			Assert.assertEquals("Test Call Comments", text);
			
			
			
			
			
			
			
	 }
	
	
	
	

}
