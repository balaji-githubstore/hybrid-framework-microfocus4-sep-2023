package com.microfocus.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver obj;
		String browser="edge";
		
		if(browser.equalsIgnoreCase("ch"))
		{
			obj=new ChromeDriver();
		}
		else
		{
			obj=new EdgeDriver();
		}
		
		
		obj.get("https://www.facebook.com/");

		String actualTitle=obj.getTitle();
		System.out.println(actualTitle);
		
		obj.quit();
		
	}

}
