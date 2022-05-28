
package com.at.LoginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;


public class HomePage extends BaseClass {

	@FindBy(xpath= "//a[@title='Dashboard']")
	WebElement headerLabel;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomepageTitle() {
		return driver.getTitle();
	}
}
