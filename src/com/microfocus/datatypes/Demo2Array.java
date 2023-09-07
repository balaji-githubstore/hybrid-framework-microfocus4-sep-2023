package com.microfocus.datatypes;

public class Demo2Array {

	public static void main(String[] args) {
		
		//10,20,30,40,50
		
		int[] numbers=new int[5]; //5*32 bits 
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
//		numbers=new int[6];
		

		//red,green, yellow
		String[] colors=new String[3];
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		System.out.println(colors);
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		
		String[] colors1= {"red","yellow","blue","yellow"};
		System.out.println(colors1[3]);
		
	}
}
