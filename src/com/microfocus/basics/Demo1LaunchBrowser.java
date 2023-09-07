package com.microfocus.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		//get the url and print it
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		String pageSource= driver.getPageSource();
		System.out.println(pageSource);
		
		//verification
		driver.quit();
		
		
	}

}
