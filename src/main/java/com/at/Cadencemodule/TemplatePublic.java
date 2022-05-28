package com.at.Cadencemodule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;

public class TemplatePublic extends BaseClass{
	
	
		@FindBy(xpath = "//span[contains(text(),'Templates')]")
		WebElement templatesTab;

		@FindBy(xpath= "//a[@title='Create new Template']")
		WebElement addTemplateButton;

		@FindBy(xpath="//div[contains(text(),'Select Tag')]")
		WebElement selectTagDropDown;

		@FindBy(xpath="//button[contains(text(),'Autoemail_01')]")
		WebElement  tagNameAddBtn;

		@FindBy(xpath= "//input[@name='tagName']")
		WebElement tagNameAdded;
		
		@FindBy(xpath="(//button[@class='dropdown-item'])[last()]")
		WebElement dropDownMenuItem;

		@FindBy(xpath="//button[@value='Autocadence']")
		WebElement addTagName;
		
		@FindBy(xpath="//input[@id='all_users']")
		WebElement publicCheckBox;

		@FindBy(id = "add_email_template_category")
		WebElement selectCategory;
		
		@FindBy(xpath="//select[@id='add_email_template_category']//option[contains(text(),'inbound')]")
		WebElement inboundDropDown;

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
		
		@FindBy(xpath="//button[@id='insert_popover']")
		WebElement insertSnippetBtn;
		
		@FindBy(xpath="//h6[contains(text(),'UserName')]")
		WebElement userNameSnippet;
		
		@FindBy(xpath="//h6[contains(text(),'Italic')]")
		WebElement prodSnippet;
		
		@FindBy(xpath="//input[@placeholder='Search']")
		WebElement searchBtn;

		@FindBy(xpath="//tbody[@style='table-layout: fixed;']")
		WebElement layoutBtn;
		
		
				
				
				
		@FindBy(xpath = "(//button[contains(text(),'Save')])[2]")
		WebElement saveBtn;
		
		@FindBy(xpath = "(//button[contains(text(),'Save')])[1]")
		WebElement saveBtn1;
		
		
		@FindBy(xpath="//i[contains(@class,'fa-pencil')]")
		WebElement editTemplate;
		

		public TemplatePublic() {
			PageFactory.initElements(driver, this);
		}

		public void clickOnTemplateTab() throws InterruptedException {
			Actions ac1=new Actions(driver);
			ac1.moveToElement(templatesTab).click().build().perform();
			Thread.sleep(8000);
			searchBtn.sendKeys(prop.getProperty("EmailTemplate"));
			Thread.sleep(5000);
			layoutBtn.click();
			Thread.sleep(2000);
			editTemplate.click();
			Actions action1=new Actions(driver);
			action1.moveToElement(publicCheckBox).click().build().perform();
				Thread.sleep(6000);
				Actions build = new Actions(driver);
			build.moveToElement(saveBtn).click().build().perform();
			
			
			
			
			  
			  
			  
			
		}

}
