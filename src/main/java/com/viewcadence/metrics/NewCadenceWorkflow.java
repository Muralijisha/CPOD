package com.viewcadence.metrics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.at.Baseclass.BaseClass;



public class NewCadenceWorkflow extends BaseClass {

	@FindBy(xpath = "//a[@title='Cadences']")
	WebElement cadencesTab;

	@FindBy(xpath = "//a[@title='Create new Cadence']")
	WebElement createNewCadenceButton;

	@FindBy(xpath = "//input[@id='name']")
	WebElement cadenceName;

	@FindBy(id = "description")
	WebElement descriptionField;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement saveBtn;

	@FindBy(id = "message_txt")
	WebElement cadenceSaveText;

	public NewCadenceWorkflow() {
		PageFactory.initElements(driver, this);
	}

	public void createNewCadence() throws Exception {
        try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebDriverWait wait = new WebDriverWait(driver,50);
        
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Cadences']")));
       Thread.sleep(6000);
		cadencesTab.click();
		explicitWait(driver, 120, createNewCadenceButton);
		Thread.sleep(8000);
		createNewCadenceButton.click();
		Thread.sleep(8000);
		cadenceName.sendKeys(prop.getProperty("ViewCadence"));
		Thread.sleep(8000);
		descriptionField.sendKeys("Automation Testing");
		Thread.sleep(8000);
		saveBtn.click();

	}
}
