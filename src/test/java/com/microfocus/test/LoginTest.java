package com.microfocus.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microfocus.base.AutomationWrapper;
import com.microfocus.page.LoginPage;
import com.microfocus.page.MainPage;
import com.microfocus.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider",groups = {"login","smoke"})
	public void validLoginTest(String username, String password, String expectedTitle) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		// wait for page load
		MainPage mainPage = new MainPage(driver);
		Assert.assertEquals(mainPage.getMainPageTitle(), expectedTitle);
	}

	@Test(dataProviderClass = DataUtils.class,dataProvider = "commonDataProvider",groups = {"login"})
	public void invalidLoginTest(String username,String password,String expectedError) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickOnLogin();

		String actualError = loginPage.getInvalidErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}
}
