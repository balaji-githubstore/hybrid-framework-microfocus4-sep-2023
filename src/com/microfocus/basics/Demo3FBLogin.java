package com.microfocus.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3FBLogin {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		
//		By loc= By.id("email");
//		WebElement element= driver.findElement(loc);
//		element.sendKeys("king12345@gmail.com");
		
		
		WebElement element= driver.findElement(By.id("email"));
		element.sendKeys("king12345@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("jack1234534534@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		//click on login
		driver.findElement(By.name("login")).click();
	}

}
