package com.microfocus.page;

import org.openqa.selenium.WebDriver;

import com.microfocus.base.WebDriverKeywords;
/**
 * MainPage contains all webelement to handle menu and common elements
 */
public class MainPage extends WebDriverKeywords {
	
	private WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}

	public String getMainPageTitle()
	{
		return driver.getTitle();
	}
	
//	public void clickOnPatientMenu()
//	{
//		
//	}
//	
//	public void clickOnMessagesMenu()
//	{
//		
//	}
}
