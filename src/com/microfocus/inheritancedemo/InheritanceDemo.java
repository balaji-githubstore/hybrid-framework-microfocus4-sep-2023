package com.microfocus.inheritancedemo;


class Father 
{
	public int fAge=60;
	
	public Father(int a)
	{
		System.out.println("father cons"+a);
	}
	
	public void fatherStyle()
	{
		System.out.println("father style!!");
	}
}

class Son extends Father
{
	public int sAge=20;
	
	public Son(int a,int b)
	{
		super(a);
		System.out.println("Son cons"+b);
	}
	
	public void sonStyle()
	{
		System.out.println("son style!!");
	}
}



public class InheritanceDemo {

	public static void main(String[] args) {
		
		Son s=new Son(60,20);

		System.out.println(s.fAge);
		System.out.println(s.sAge);
		
		s.fatherStyle();
		s.sonStyle();
	}

}
