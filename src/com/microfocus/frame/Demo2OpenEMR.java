package com.microfocus.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2OpenEMR {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.openemr.io/b/openemr"); 
		
		//enter username as admin
		driver.findElement(By.id("authUser")).sendKeys("admin");
		//enter password as pass
		driver.findElement(By.cssSelector("#clearPass")).sendKeys("pass");
		//click on login
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		//click on messages menu
		driver.findElement(By.xpath("//div[text()='Messages']")).click();

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='msg']")));
		//click on add new 
		driver.findElement(By.partialLinkText("Add New")).click();
		
		//Type "Hello everyone" in the textarea 
		driver.findElement(By.id("note")).sendKeys("hello");
		
		//switch to main html
		driver.switchTo().defaultContent();
		
		
	}
}
