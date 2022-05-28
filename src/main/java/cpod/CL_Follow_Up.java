package cpod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CL_Follow_Up {
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
	
	@FindBy(id="check_14763")
	WebElement first;
	
	@FindBy(id="check_12482")
	WebElement second;
	
    @FindBy(id="check_14903")
	WebElement third;
	
    @FindBy(id="check_13449")
	WebElement fourth;
    
    @FindBy(id="beginDialingSessionButton")
    WebElement Begindialing;
    
    @FindBy(xpath="//button[text()='OK']")
    WebElement ok;
    
    @FindBy(id="proceedUploadBtn")
    WebElement proceed;
    
    @FindBy(xpath="//b[text()='102']")
    WebElement totalprospects;
    
    @FindBy(xpath="//*[local-name()='svg']//*[local-name()='path' and @d='M400 32H48C21.5 32 0 53.5 0 80v352c0 26.5 21.5 48 48 48h352c26.5 0 48-21.5 48-48V80c0-26.5-21.5-48-48-48zM240 320h-48v48c0 8.8-7.2 16-16 16h-32c-8.8 0-16-7.2-16-16V144c0-8.8 7.2-16 16-16h96c52.9 0 96 43.1 96 96s-43.1 96-96 96zm0-128h-48v64h48c17.6 0 32-14.4 32-32s-14.4-32-32-32z']")
	WebElement parking;
    
	
	public CL_Follow_Up(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	 WebDriver driver;
	public void notdue() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,30);
        
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'My Lists')]")));
		MyLists.click();
	//	Actions List = new Actions(driver);
	//	List.moveToElement(MyLists).click().build().perform();
		Thread.sleep(3000);
		Search.sendKeys("Koncert Follow Ups (Not due)");
		SearchBtn.click();
		Thread.sleep(3000);
		String text = Notdue.getText();
		Assert.assertEquals("Koncert Follow Ups (Not due)", text);
		
		
	}
	public void pastdue() throws InterruptedException {
		Thread.sleep(5000);
		Search.sendKeys("Koncert Follow Ups (Past due)");
		SearchBtn.click();
		Thread.sleep(3000);
		String text = Pastdue.getText();
		Assert.assertEquals("Koncert Follow Ups (Past due)", text);
	}
	
	public void beginupload() throws InterruptedException {
		MyLists.click();
		//Search.clear();
		Search.sendKeys("key four");
		SearchBtn.click();
		first.click();
		
		Search.clear();
		Search.sendKeys("contact 0608");
		SearchBtn.click();
		second.click();
		
		Search.clear();
		Search.sendKeys("contacts(56)");
		SearchBtn.click();
		third.click();
		
		Search.clear();
		Search.sendKeys("lead report");
		SearchBtn.click();
		fourth.click();
		Begindialing.click();
		Thread.sleep(3000);
		ok.click();
		Thread.sleep(3000);
		proceed.click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='102']")));
	    String text = totalprospects.getText();
		Assert.assertEquals("102", text);
		
		
		
		
		
		
		
	}
	
	
	

}
