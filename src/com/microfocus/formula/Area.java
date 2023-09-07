package com.microfocus.formula;

public class Area {
	
	public static double areaOfCircle(int r) {
		double a=3.14 * r * r;
		return a;
	}

	public double areaOfRectangle(double length, double width) {
		return length * width;
	}

	//area of triangle
	public static double areaOfTriangle(double base,double height)
	{
		return (base*height)/2;
	}
	
	public String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	public static void quit()
	{
		
	}
	
}
