package com.microfocus.methods;

import com.microfocus.formula.Area;

public class Demo1 {

	
	public static void main(String[] args) {

		//int radius=10;
		
		double result = Area.areaOfCircle(20);
		System.out.println(result);

		result = Area.areaOfCircle(30);
		System.out.println(result);
		
		Area obj=new Area(); //allocation memory for all non-static variable,methods
		

		double output = obj.areaOfRectangle(10, 10);
		System.out.println(output);
		
		System.out.println(Area.areaOfCircle(40));
		
		
		output=Area.areaOfTriangle(25, 1);
		System.out.println(output);
		
		
		String name=obj.getAuthorName();
		System.out.println(name);
		
		System.out.println(obj.getAuthorName());
		
		Area.quit();
	}

}
