package com;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int employeeNo, employeeAge;
		double employeeSalary,bonusSalary=25;
		String employeeName;
		
		System.out.println("Enter the Employee No :");
		employeeNo = sc.nextInt();
		
		System.out.println("Enter the Employee Name :");
		employeeName = sc.next();
		
		System.out.println("Enter the Employee Age :");
		employeeAge = sc.nextInt();
		
		System.out.println("Enter the Employee Salary :");
		employeeSalary = sc.nextDouble();
		
		bonusSalary = employeeSalary + bonusSalary;
		
		System.out.println(employeeNo);
		System.out.println(employeeName);
		System.out.println(employeeAge);
		System.out.println(bonusSalary);
		
		
	
		

	}
	

}
