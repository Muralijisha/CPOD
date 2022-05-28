package com.at.Settingsmodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Step;

public class EmailSettings extends BaseClass {

	@FindBy(xpath = "//a[contains(text(),'Email Settings')]")
	WebElement emailSettingsTab;
	

	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement settingsTab;

	@FindBy(id = "server_type")
	WebElement serverType;

	@FindBy(xpath = "//b[contains(text(),'Email Account')]")
	WebElement emailAccountLabel;

	@FindBy(id = "display_name")
	WebElement displayName;
	
	@FindBy(id = "email")
	WebElement emailAddress;

	
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
	WebElement saveBtn1;

	@FindBy(xpath = "//span[contains(text(),'Your Email Account is verified')]")
	WebElement sucessMsg;


	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	WebElement saveBtn2;

	public EmailSettings() {
		PageFactory.initElements(driver, this);
	}

	

	@Step("Login with username: {0} :")
	public void emailSettings(String emailField) throws InterruptedException {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver,30);
        
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Settings')]")));
		settingsTab.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions se1= new Actions(driver);
		
		se1.moveToElement(serverType).click();
		Thread.sleep(7000);
	 Select activityTab = new Select(serverType);
		activityTab.selectByVisibleText(prop.getProperty("servertype"));
				

			displayName.sendKeys((Keys.chord(Keys.CONTROL, "a", Keys.DELETE)));
			displayName.clear();
			displayName.sendKeys("Automation Key");
			emailAddress.sendKeys((Keys.chord(Keys.CONTROL, "a", Keys.DELETE)));
			
			emailAddress.clear();
			emailAddress.clear();
			emailAddress.clear();
			emailAddress.sendKeys(emailField);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			saveBtn1.click();
			Thread.sleep(3000);

		}

	

	public void emailCredential(String emailField) throws InterruptedException {
		emailAddress.clear();
		emailAddress.sendKeys(emailField);
		boolean visibility_saveBtn = saveBtn2.isDisplayed();
		System.out.println("The cancel button is visible" + visibility_saveBtn);

		if (visibility_saveBtn == false) {

			 JavascriptExecutor js = (JavascriptExecutor) driver; 
			 js.executeScript("arguments[0].scrollIntoView();", saveBtn2);
			saveBtn2.click();
		} else {
			saveBtn2.click();
			Thread.sleep(3000);
		}
	}
	

	@Step("Verify Email settings header label:")
	public boolean validateHeaderLabel() {
		return emailAccountLabel.isDisplayed();
	}

	@Step("Verify Email verification message:")
	public String validateSucessMsg() {
		return sucessMsg.getText();
	}
}
