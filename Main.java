package com.employee;

public class Main {

	public static void main(String[] args) {
		PayrollSystem payrollSystem=new PayrollSystem();
		FullTimeEmployee emp1=new FullTimeEmployee("Priya",1,94000);
		PartTimeEmployee emp2=new PartTimeEmployee("Dhiru",1,15,4000);
		
		payrollSystem.addEmployee(emp1);
		payrollSystem.addEmployee(emp2);
		System.out.println("Initial Employee Details: ");
		payrollSystem.displayEmployee();
		System.out.println("Removing Employee: ");
		payrollSystem.removeEmployee(1);
		System.out.println("Remaining Employee Details: ");
		payrollSystem.displayEmployee();
	}

}
