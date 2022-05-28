package com.at.Templatemodule;


	




	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;

	import io.qameta.allure.Attachment;
	import io.qameta.allure.Step;

	public class Template_ReplyEmail extends BaseClass {
		@FindBy(xpath = "//span[contains(text(),'Templates')]")
		WebElement templatesTab;

		@FindBy(xpath= "//a[@title='Create new Template']")
		WebElement addTemplateButton;
		
		@FindBy(xpath="//input[@placeholder='Search']")
		WebElement searchBtn;

		
		@FindBy(xpath="//i[contains(@class,'clone')]")
		WebElement clonebutton;
		
		@FindBy(xpath="//input[@id='specific_group_of_users']")
		WebElement assignToTeams;
		
		@FindBy(xpath="//button[@title='Send test Email to a specific Email id']")
		WebElement sendTestEmailBtn;
		
		
		
		@FindBy(xpath="//div[contains(text(),'Select Tag')]")
		WebElement selectTagDropDown;

		@FindBy(xpath="//button[@value='Autoemail_01']")
		WebElement  tagNameAddBtn;

		@FindBy(xpath= "//input[@name='tagName']")
		WebElement tagNameAdded;

		@FindBy(xpath="//button[@value='Autocadence']")
		WebElement addTagName;
		
		@FindBy(xpath="(//button[@title='Save'])[1]")
		WebElement SaveBtn1;
		
		@FindBy(xpath="//tbody[@style='table-layout: fixed;']")
		WebElement layoutBtn;
		
		
		

		@FindBy(id = "add_email_template_category")
		WebElement selectCategory;

		@FindBy(xpath= "//input[@id='add_email_template_name']")
		WebElement emailTemplateName;

		@FindBy(xpath = "//input[@id='add_email_template_subject']")
		WebElement emailTemplateSubject;

		@FindBy(id="tiny-react_45708604921611225604503_ifr")
		WebElement frame;
		
		@FindBy(xpath="//input[@name='teams']")
		WebElement assignToTeamDropDown;
		
		@FindBy(xpath="//button[contains(text(),'QA Team')]")
		WebElement QATeam;
		
		@FindBy(xpath="//button[contains(text(),'Team B')]")
		WebElement TeamB;
		
		
		@FindBy(xpath="//body[@id='tinymce']")
		WebElement textArea;

		@FindBy(xpath="//button[@title='Mail Merge']")
		WebElement mailMerge;

		@FindBy(xpath="//div[@title='Prospects.First Name']")
		WebElement prospectFirstName;

		@FindBy(xpath="//div[@title='Prospects.Last Name']")
		WebElement prospectLastName;
		
		@FindBy(xpath="(//button[@class='dropdown-item'])[last()]")
		WebElement dropDownMenuItem;
		
		@FindBy(xpath="//button[@title='Insert/edit link']")
		WebElement insertLink;
		
		@FindBy(xpath="//input[@type='url']")
		WebElement urlTextArea;
		
		@FindBy(xpath="//label[contains(text(),'Text to display')]//following-sibling::input[@type='text']")
		WebElement textToDisplay;
		
		@FindBy(xpath="//label[contains(text(),'Title')]//following-sibling::input[@type='text']")
		WebElement titleToDisplay;
		
		@FindBy(xpath="(//button[@title='Save'])[3]")
		WebElement saveBtnLinkBtn;
		
		@FindBy(xpath = "//a[@title='Prospects']")
		WebElement prospectTab;
		
		
		@FindBy(xpath="//div[@class='Toastify_toast-body']")
		WebElement sendTestEmailLabel;
		
		@FindBy(xpath="//button[@id='insert_popover']")
		WebElement insertSnippetBtn;
		
		@FindBy(xpath="//h6[contains(text(),'UserName')]")
		WebElement userNameSnippet;
		
		@FindBy(xpath="//h6[contains(text(),'Italic')]")
		WebElement prodSnippet;
				
				@FindBy(xpath="//div[@class='Toastify-toast-body]")
				WebElement alertMessage;
				
		@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
		WebElement saveBtn;
		
		@FindBy(xpath="//input[@id='all_users']")
		WebElement publicCheckBox;

		@FindBy(xpath="//a[@title='Edit Template']")
		WebElement editTemplate;

		public Template_ReplyEmail() {
			PageFactory.initElements(driver, this);
		}

		public void clickOnTemplateTab() throws InterruptedException {
			
			
				Thread.sleep(7000);
			
			Actions ac2 =new Actions(driver);
			ac2.moveToElement(templatesTab).click().build().perform();
			
		}
		public static boolean isAlertPresent() {
			try {
				driver.switchTo().alert();
				return true;
			} catch (NoAlertPresentException ex) {
				return false;
			}
		}

		@Attachment
		public void createTemplate() throws InterruptedException, AWTException {
			
			Thread.sleep(3000);	
			if (isAlertPresent()) {
				Alert alerts = driver.switchTo().alert();
				alerts.accept();
				System.out.println("alert was present and accepted");

			} else { 
				System.out.println("No alert present"); 
			}

			Thread.sleep(3000);
			
			Actions ac=new Actions(driver);
			ac.moveToElement(addTemplateButton).click().build().perform();
			
			
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			
			  Actions action= new Actions(driver);
			  action.moveToElement(tagNameAdded).click().build().perform();
			  tagNameAdded.sendKeys(prop.getProperty("ReplyTemplate")); 
			  Thread.sleep(4000);
			  action.click(dropDownMenuItem).build().perform();
			 
			 
			
			action.moveToElement(selectCategory).click().build().perform();
		Thread.sleep(7000);
		
			Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);	
	    rob.keyPress(KeyEvent.VK_ENTER);
		
			Thread.sleep(7000);
			Actions name = new Actions(driver);
			name.moveToElement(emailTemplateName).click().build().perform();
			emailTemplateName.sendKeys(prop.getProperty("ReplyTemplate"));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			
			Actions subject = new Actions(driver);
			subject.moveToElement(emailTemplateSubject).click().build().perform();
			emailTemplateSubject.sendKeys("Automation {{User.First Name}}{{User.Last Name}}");
			Thread.sleep(7000);
			
			driver.switchTo().frame(0);
			
				Thread.sleep(5000);
			
			Actions textarea = new Actions(driver);
		
			textarea.moveToElement(textArea).click().build().perform();
					driver.switchTo().defaultContent();
			subject.moveToElement(mailMerge).click().build().perform();
			subject.moveToElement(prospectFirstName).click().build().perform();
		
			Thread.sleep(4000);
			
		
			driver.switchTo().frame(0);
			Thread.sleep(5000);
			
			textarea.moveToElement(textArea).click().build().perform();
			textArea.sendKeys(Keys.ENTER);
			
			textArea.sendKeys(" Hi ,We’ve expanded our B2B multi-channel sales engagement platform to help sellers select and personalize their communications");
			textArea.sendKeys(Keys.ENTER);
			driver.switchTo().defaultContent();
			Thread.sleep(7000);
			subject.moveToElement(insertLink).click().build().perform();
			urlTextArea.sendKeys("https://www.google.com/");
			titleToDisplay.sendKeys("Koncert");
			subject.moveToElement(saveBtnLinkBtn).click().build().perform();
			Thread.sleep(5000);
			JavascriptExecutor js2= (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,-1000)");			
			Thread.sleep(7000);
			
			Actions team=new Actions(driver);
			
			team.moveToElement(assignToTeams).click().build().perform();
			Thread.sleep(4000);
			team.moveToElement(assignToTeamDropDown).click().build().perform();
			//assignToTeamDropDown.click();
			Thread.sleep(5000);
		////button[text()='SALES')]
					String beforexpath="//button[text()='";
					String afterxpath=prop.getProperty("AssignToTeams");
					String colon="']";
					
							
										String assign2Teams=beforexpath+afterxpath+colon;
					
					WebElement assign=driver.findElement(By.xpath(assign2Teams));
					
			team.moveToElement(assign).click().build().perform();
			
			Thread.sleep(7000);
			

			
			Actions build1 = new Actions(driver);
			build1.moveToElement(SaveBtn1).click().release().build().perform();

			Thread.sleep(8000);
			if (isAlertPresent()) {
				Alert alerts = driver.switchTo().alert();
				alerts.accept();
				System.out.println("alert was present and accepted");

			} else { 
				System.out.println("No alert present"); 
			}

		}
	}














