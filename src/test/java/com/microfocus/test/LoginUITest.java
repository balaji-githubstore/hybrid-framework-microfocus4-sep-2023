package com.microfocus.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.microfocus.base.AutomationWrapper;
import com.microfocus.page.LoginPage;


public class LoginUITest extends AutomationWrapper {

	@Test(groups = {"smoke2","UI","smoke"})
	public void validateTitleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}

	@Test(groups = "UI")
	public void applicationDescriptionTest() {
		
		String actualValue=driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualValue, 
				"The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}
	
	@Test(groups = "UI")
	public void validatePlaceholderTest()
	{
		LoginPage loginPage=new LoginPage(driver);
		Assert.assertEquals(loginPage.getUsernamePlaceholder(), "Username");
	}
}













