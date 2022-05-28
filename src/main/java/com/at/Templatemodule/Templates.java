package com.at.Templatemodule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

public class Templates extends BaseClass {
	@FindBy(xpath = "//span[contains(text(),'Templates')]")
	WebElement templatesTab;

	@FindBy(xpath= "//a[@title='Create new Template']")
	WebElement addTemplateButton;

	@FindBy(xpath="//div[contains(text(),'Select Tag')]")
	WebElement selectTagDropDown;
	
	@FindBy(xpath= "//input[@name='tagName']")
	WebElement tagNameAdded;
	
	@FindBy(xpath="//button[@value='Autocadence']")
	WebElement addTagName;
		
	
	@FindBy(id = "add_email_template_category")
	WebElement selectCategory;

	@FindBy(xpath= "//input[@id='add_email_template_name']")
	WebElement emailTemplateName;
	
	@FindBy(xpath = "//input[@id='add_email_template_subject']")
	WebElement emailTemplateSubject;
	
	@FindBy(id="tiny-react_45708604921611225604503_ifr")
	WebElement frame;
	
	@FindBy(xpath="//body[@id='tinymce']")
    WebElement textArea;
	
	@FindBy(xpath="//button[@title='Mail Merge']")
	WebElement mailMerge;
			
	@FindBy(xpath="//div[@title='Prospects.First Name']")
	WebElement prospectFirstName;
	
	@FindBy(xpath="//div[@title='Prospects.Last Name']")
	WebElement prospectLastName;
	
	@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
	WebElement saveBtn;

	public Templates() {
		PageFactory.initElements(driver, this);
	}

public void clickOnTemplateTab() {
		
		templatesTab.click();
	}

	@Attachment
	public void createTemplate() throws InterruptedException {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		addTemplateButton.click();
		
		
try {
	Thread.sleep(9000);
} catch (InterruptedException e3) {
	// TODO Auto-generated catch block
	e3.printStackTrace();
}
Actions name = new Actions(driver);
name.moveToElement(emailTemplateName).click().build().perform();
		emailTemplateName.sendKeys(prop.getProperty("templateName"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		Actions subject = new Actions(driver);
		subject.moveToElement(emailTemplateSubject).click().build().perform();
		emailTemplateSubject.sendKeys("Automation {{User.First Name}}{{User.Last Name}}");
		
		
		
		
		driver.switchTo().frame(0);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Actions textarea = new Actions(driver);
		textarea.moveToElement(textArea).click().build().perform();
		textArea.sendKeys("Hi {{Prospects.First Name}} {{Prospects.Last Name}} ,"
				
				+ "As you know, we love to get feedback. After all, a strong relationship is based on good communication"
			
				+ "For that reason, we would be super happy if you could fill in our survey!\r\n"
			
				+ "");
		driver.switchTo().defaultContent();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		/*
		 * Actions actions = new Actions(driver); // Scroll Down using Actions class
		 * actions.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(2000);
		 * actions.sendKeys(Keys.ARROW_DOWN).perform(); Thread.sleep(2000);
		 * actions.sendKeys(Keys.ARROW_DOWN).perform();
		 */
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		     
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions build = new Actions(driver);
		build.moveToElement(saveBtn).doubleClick().release().build().perform();
		//saveBtn.click();
		Thread.sleep(2000);
		}
		}
		
    		
            
		
		





