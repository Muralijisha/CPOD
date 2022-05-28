package Files;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.Baseclass.BaseClass;

public class Delete_csv extends BaseClass{

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
	
	
	public Delete_csv(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	 public void addlist() throws InterruptedException {
		 Actions action = new Actions(driver);
			action.moveToElement(MyLists).click().build().perform();
			Thread.sleep(3000);
			Addlists.click();
			Addfromcsv.click();
			Fileupload.sendKeys(prop.getProperty("file"));
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
			Thread.sleep(5000);
	 }
}
