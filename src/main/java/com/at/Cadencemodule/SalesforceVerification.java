package com.at.Cadencemodule;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Allure;

public class SalesforceVerification extends BaseClass {

	@FindBy(id = "navMySession1")
	WebElement mySession;

	@FindBy(xpath = "//*[@id='mySession_open_crm']")
	List<WebElement> crmImage;

	@FindBy(id = "tryLexDialog")
	WebElement windowBox;

	@FindBy(xpath = "(//*[@class='dialogClose'])[2]")
	WebElement adBox;

	Set<String> s = driver.getWindowHandles();

	@FindBy(xpath = "(//*[@class='listTitle'])[4]")
	WebElement activityHistoryLink;

	@FindBy(xpath = "//*[@class=' dataCell  ']")
	List<WebElement> activityHistory;
	
	@FindBy(xpath="(//img[@id='mySession_open_crm'])[2]")
	WebElement crmImage1;

	public SalesforceVerification() {
		PageFactory.initElements(driver, this);
	}

	public void CRMVerification() throws InterruptedException {
		String MainWindow = driver.getWindowHandle();
		String Childwindow = MainWindow;
		String ChildWindow1 = Childwindow;
		
		for (int i = 0; i < crmImage.size(); i++) {
			crmImage.get(i).click();
			Thread.sleep(3000);

			
			for (String Handle : driver.getWindowHandles()) {
				if (!Childwindow.equals(Handle)) {
					Childwindow = Handle;
					driver.switchTo().window(Childwindow);
					Thread.sleep(4000);
				}

			}

			boolean displayed = adBox.isDisplayed();

			if (displayed == true) {
				adBox.click();
				activityHistoryLink.click();

				for (int j = 0; j < activityHistory.size(); j++) {

					Allure.addAttachment("activityHistoryverification", activityHistory.get(j).getText());
					System.out.println(activityHistory.get(j).getText());
					Thread.sleep(8000);
					//driver.switchTo().window(MainWindow);

				}
				
			} 
			
		
			
			else {

				activityHistoryLink.click();

				for (int j = 0; j < activityHistory.size(); j++) {

					Allure.addAttachment("activityHistoryverification", activityHistory.get(j).getText());
					System.out.println(activityHistory.get(j).getText());
					Thread.sleep(6000);
					driver.switchTo().window(MainWindow);

				}
				
			}
		}
	}
}

