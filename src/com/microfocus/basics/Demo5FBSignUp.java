package com.microfocus.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		

		driver.findElement(By.linkText("Create new account")).click();
		
		//findElement-->check presence of element in 0.5s 
		driver.findElement(By.name("firstname")).sendKeys("john");
		//enter lastname as wick
		//enter password as pass123
		
		
		//19 Nov 2000
		
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("31");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Nov");
//		selectMonth.selectByValue("11");
//		selectMonth.selectByIndex(10);
		
		//select year as 2000
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByVisibleText("2000");
		
		//click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//click on submit
		
		
	}
}
