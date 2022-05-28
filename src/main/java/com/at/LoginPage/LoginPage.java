package com.at.LoginPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.at.Baseclass.BaseClass;

import io.qameta.allure.Step;

public class LoginPage extends BaseClass {

	HomePage homepage;

	

	@FindBy(id = "btn_salesforce")
	WebElement signInWithSalesforce;

	@FindBy(id = "username")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "Login")
	WebElement loginBtn;

	@FindBy(xpath = "//span[contains(text(),'Settings')]")
	WebElement settingsTab;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@Step("Login with username: {0}, password: {1} step :")
	public HomePage login(String un, String pwd) {


		signInWithSalesforce.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		jsExecutor_ClickElement(loginBtn);

		//settingsTab.click();

		return new HomePage();
	}

}
