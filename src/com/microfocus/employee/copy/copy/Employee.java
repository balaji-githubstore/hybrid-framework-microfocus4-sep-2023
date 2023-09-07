package com.microfocus.employee.copy.copy;

public class Employee {
	
	private int id;
	public String name;
	public double salary;
	public String performance;
	public static String companyName;
	private static int counter=101;
	
	public Employee()
	{
		System.out.println("Browser launch");
		System.out.println("object created");
		System.out.println("---------------------------");
	}
	public Employee(int empId)
	{
		id=empId;
		System.out.println("Browser launch");
		System.out.println("object created");
		System.out.println("---------------------------");
	}
	
	public Employee(int empId,String name)
	{
		id=empId;
		System.out.println("Browser launch");
		System.out.println("object created");
		System.out.println("---------------------------");
	}
	
	public Employee(String name,int empId)
	{
		id=empId;
		System.out.println("Browser launch");
		System.out.println("object created");
		System.out.println("---------------------------");
	}
	
	public Employee(double sal)
	{
		System.out.println("Browser launch");
		System.out.println("object created");
		System.out.println("---------------------------");
	}
	
	
	public void printEmployeeDetail()
	{
		//int id=0;
		
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
	
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee();
		return e;
	}
}
