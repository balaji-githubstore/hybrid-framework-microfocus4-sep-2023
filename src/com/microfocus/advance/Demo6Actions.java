package com.microfocus.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6Actions {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://phptravels.net/"); 
		
		
		driver.findElement(By.xpath("//strong[normalize-space()='Select City']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("maa");
		driver.findElement(By.xpath("//button[text()='MAA']")).click();
		
//		Actions actions=new Actions(driver);
//		actions.pause(1000).sendKeys(Keys.ENTER).perform();
		
		//approach 1
		driver.findElement(By.id("departure")).clear();
		driver.findElement(By.id("departure")).sendKeys("04-11-2023");
		
		//approach 2 - automate the calendar
		
		//approach 3 - javascript
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#departure').value='14-11-2023'");
		
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File file= ts.getScreenshotAs(OutputType.FILE);
		
		file.renameTo(new File("error.png"));
	}

}
