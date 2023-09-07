package com.microfocus.employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee.companyName = "Microfocus";

		Employee emp1 = new Employee(101);
		Employee emp2 = new Employee(102);
		Employee emp3 = new Employee(103);
		Employee emp4= Employee.getEmployeeInstance();

		//emp1.id = 1001;
		emp1.name = "Saul";
		emp1.salary = 9000;
		emp1.performance = "A";

		// load 2nd object with (1002,kim,5000,B,Microfocus)

		//emp2.id = 1002;
		emp2.name = "Kim";
		emp2.salary = 5000;
		emp2.performance = "B";

		emp2.printEmployeeDetail();

		emp1.printEmployeeDetail();

		emp3.printEmployeeDetail();
		
		
		
		emp4.printEmployeeDetail();
		
		
		Employee.printEmployeeId(emp1);

	}

}
