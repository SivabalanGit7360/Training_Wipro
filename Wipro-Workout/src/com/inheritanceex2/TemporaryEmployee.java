package com.inheritanceex2;

public class TemporaryEmployee extends Employee {
	
	int employeeNo;
	String emlpoyeeName;
	double employeeSalary;
	
	
	
	public void TempBouns() {
		System.out.println("Hello this is Tempbouns");
		
		employeeSalary=employeeSalary*0.10;
		System.out.println(employeeSalary);
		
	}
	
	
	
	

}
