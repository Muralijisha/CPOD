package standalonefiles;


import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.Baseclass.BaseClass;



public class Prospects extends BaseClass {

	@FindBy(xpath = "//a[@title='Prospects']")
	WebElement prospectTab;

	@FindBy(xpath = "//button[@title='Import CSV']")
	WebElement importCSVButton;
	
	
	@FindBy(xpath="//button[@title='Import from CRM']")
	WebElement importCRMButton;
	
	@FindBy(name="reportFolderName")
	WebElement dropDownFolderMenu;
	
	@FindBy(xpath="//button[@title='Upload'and contains(text(),'Next')]")
	WebElement nextButton;
	
	@FindBy(xpath="//label[contains(text(),'Contacts')]//input[@name='crmReportName']")
	WebElement contactsCheckBox;
	
	@FindBy(xpath="//div[@class='dropdown-menu show']")
	WebElement tagdropDownMenu;
	
	@FindBy(xpath="//button[@title='Begin Import'and contains(text(),'Next')]")
	WebElement nextButton2;
	

	@FindBy(id = "csv_file_name")
	WebElement chooseFileTab;

	@FindBy(xpath = "//label[contains(text(),'Tag your list')]/parent::div//div[@class='input-group-append']/button")
	WebElement selectTagDropdown;

	@FindBy(name = "tagName")
	WebElement tagNameField;

	@FindBy(xpath = "//div[@class='dropdown-menu show']/button[contains(text(),'Upload03')]")
	WebElement dropdownValueSelection;

	@FindBy(xpath = "//button[@title='Upload']")
	WebElement uploadButton;

	@FindBy(xpath = "//button[@title='Save Changes' and contains(text(),'Save')]")
	WebElement saveButton_Prospect;

	@FindBy(xpath = "//span[@aria-hidden='true']")
	WebElement closeButton;
	
	@FindBy(xpath = "//div[@id='Call Touch Saved Successfully']")
	WebElement touchSaveMsg;

	
	public Prospects() {
		PageFactory.initElements(driver, this);
	}

	public void csvFileUpload() throws InterruptedException, IOException {
		Thread.sleep(3000);
		prospectTab.click();
		importCRMButton.click();
		
		Thread.sleep(9000);
		Select se1= new Select(dropDownFolderMenu);
		se1.selectByVisibleText("Private Reports");
		
		nextButton.click();
		
		Thread.sleep(8000);
			System.out.println("checkbox is clicked");
			Actions actions = new Actions(driver);
			actions.moveToElement(contactsCheckBox);
			actions.perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executeScript("window.scrollBy(0,600)");
			js.executeScript("arguments[0].scrollIntoView(true);", contactsCheckBox);
			 Thread.sleep(6000);
			actions.click(contactsCheckBox).build().perform();
		Thread.sleep(6000);
		
		 actions.click(tagNameField).build().perform();
		 tagNameField.sendKeys("Upload03");
		 Thread.sleep(3000);
		 actions.click(tagdropDownMenu).build().perform();
		 Thread.sleep(3000);
		 nextButton2.click();
		 Thread.sleep(6000);
		 closeButton.click();
		 Thread.sleep(7000);
		
	}
}