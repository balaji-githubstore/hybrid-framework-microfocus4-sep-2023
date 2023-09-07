package com.microfocus.datatypes;

public class Demo1Datatypes {
	
	public static void main(String[] args) {
		
		byte a=100; //a is registered for byte. //8 bits of memory
		
		short b=100; //16 bits of memory 
		
		int c=100; //32 bits of memory 
		
		long d=100L;//64 bits 
		
		//byte --> 1000*8 = 8000 bits of memory 
		//int -->1000*32 =32000 bits of memory 
		
		float e=1.123456789F; //32 bits
		
		double f=1.123456789;//64 bits
		
		char letter='8'; //16 bits
		
		boolean check=true;
		
		String myName="Balaji"; //6 * 16 bits 
		
	
		double result= c+f;
		System.out.println(result);
		
		int radius=5;
		
		//calcualte area of circle - pi= 3.14 and print it
		
		double res= 3.14*radius*radius;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(e);
		System.out.println(f);
		System.out.println(myName);
		
		System.out.println(myName.toUpperCase());
		System.out.println(myName.charAt(2));

		System.out.println("The result is "+res);
		
		System.out.println(1.2);
	}

}
