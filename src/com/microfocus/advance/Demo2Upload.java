package com.microfocus.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	public static void main(String[] args) {
		
		
		File file=new File("files/Balaji-Profile_2023_1.pdf");
		
		
		
		String filePath=file.getAbsolutePath();
		System.out.println(filePath);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://smallpdf.com/pdf-to-word"); 
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(filePath);

	}
	
}
