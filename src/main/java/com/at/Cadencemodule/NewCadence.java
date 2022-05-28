package com.at.Cadencemodule;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;



public class NewCadence extends BaseClass {

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

	public NewCadence() {
		PageFactory.initElements(driver, this);
	}

	public void createNewCadence() throws InterruptedException {
        Thread.sleep(4000);
		cadencesTab.click();
		explicitWait(driver, 120, createNewCadenceButton);
		createNewCadenceButton.click();
		cadenceName.sendKeys(prop.getProperty("CadenceName1"));
		descriptionField.sendKeys("Automation Testing");
		saveBtn.click();
		Thread.sleep(3000);

	}
}
