package com.inheritanceex2;

public class PermanetEmployee extends TemporaryEmployee {
	
	int employeeNo;
	String employeeName;
	double employeeSalary;

	PermanetEmployee(int employeeNo, String employeeName, double employeeSalary) {
		
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public void PerBouns() {
		
		System.out.println("Hello this is Perbouns");
		
		employeeSalary=employeeSalary*0.20;
		System.out.println(employeeSalary);

	
	}
	

}
