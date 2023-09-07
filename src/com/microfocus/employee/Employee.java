package com.microfocus.employee;

public class Employee {
	
	private int id;
	public String name;
	public double salary;
	public String performance;
	public static String companyName;
	private static int counter=101;
	
//	public Employee()
//	{
//		id=counter;
//		counter++;
//	}
	
	public Employee(int empId)
	{
		id=empId;
		System.out.println("Browser launch");
		System.out.println("object created");
	}
	
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee(1);
		return e;
	}
	
	
	public void printEmployeeDetail()
	{
		int id=0;
		
		System.out.println("Employee Id: "+this.id);
		System.out.println("Employee Name: "+this.name);
		System.out.println(salary);
		System.out.println(performance);
		System.out.println(Employee.companyName);
		System.out.println("-------------------------------");
	}
	
	
	public static void printEmployeeId(Employee x)
	{
		System.out.println(x.id);
	}
	
}
