package com.microfocus.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://nasscom.in/about-us/contact-us"); 
		
		Actions actions=new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']"))).perform();
		
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Become a Member']"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();

	}

}