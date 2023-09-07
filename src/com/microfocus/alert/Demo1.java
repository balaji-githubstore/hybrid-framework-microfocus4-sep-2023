package com.microfocus.alert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://nasscom.in/nasscom-membership"); 
		
		//click on calculate fee
		driver.findElement(By.id("calculate-fee")).click();
		
		//wait for alert to be present - explicit wait
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		
		
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		
		driver.switchTo().alert().accept();
		
		driver.quit();
		
	}
}
