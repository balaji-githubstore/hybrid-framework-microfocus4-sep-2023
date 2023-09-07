package com.microfocus.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * no need to work on demo
 */
public class ZDemo1Test  {
	
	@DataProvider
	public String[][] validData()
	{
		String[][] data= new String[3][2];
		//i-->number of test case
		//j-->number of parameters 
		
		data[0][0]="saul";
		data[0][1]="saul123";
		
		data[1][0]="kim";
		data[1][1]="kim123";
		
		data[2][0]="ken";
		data[2][1]="ken123";
//		String[][] data= {{"saul","saul123"},{"kim","kim123"},{"ken","ken123"}};
		return data;
	}
	
	@Test(dataProvider = "validData")
	public void validLogin(String username,String password)
	{
		System.out.println("hello"+username+password);
	}

}
