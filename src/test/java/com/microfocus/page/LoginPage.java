package com.microfocus.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.microfocus.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords {

	private By usernameLocator=By.id("authUser");
	private By passwordLocator=By.id("clearPass");
	private By loginLocator=By.id("login-button");
	private By errorLocator=By.xpath("//p[contains(text(),'Invalid')]");
	
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterUsername(String username) {
		//driver.findElement(usernameLocator).sendKeys(username);
		super.typeByLocator(usernameLocator, username);
	}

	public void enterPassword(String password) {
		//driver.findElement(passwordLocator).sendKeys(password);
		super.typeByLocator(passwordLocator, password);
	}

	public void clickOnLogin() {
		//driver.findElement(loginLocator).click();
		super.clickByLocator(loginLocator);
	}

	public String getInvalidErrorMessage()
	{
		//return driver.findElement(errorLocator).getText();
		return super.getTextByLocator(errorLocator);
	}
	
	public String getUsernamePlaceholder()
	{
		return driver.findElement(usernameLocator).getAttribute("placeholder");
	}
}
