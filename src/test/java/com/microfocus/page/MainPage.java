package com.microfocus.page;

import org.openqa.selenium.WebDriver;
/**
 * MainPage contains all webelement to handle menu and common elements
 */
public class MainPage {
	
	private WebDriver driver;
	
	public MainPage(WebDriver driver)
	{
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
