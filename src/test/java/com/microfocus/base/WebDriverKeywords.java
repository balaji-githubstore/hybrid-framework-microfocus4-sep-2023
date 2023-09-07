package com.microfocus.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeywords {

	private WebDriver driver;

	public WebDriverKeywords(WebDriver driver) {
		this.driver = driver;
	}

	public void clickByLocator(By locator) {
		driver.findElement(locator).click();
	}

	public void TypeByLocator(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
}
