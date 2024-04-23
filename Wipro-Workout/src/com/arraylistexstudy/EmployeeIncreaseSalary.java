package com.arraylistexstudy;

import java.util.ArrayList;

public class EmployeeIncreaseSalary {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		
		employees.add(new Employee(121,"Gopi",24000.0f));
		employees.add(new Employee(124,"Raj",22000.0f));
		
		// increase salary
		for(Employee employee : employees ) {
			
			float SalaryIncrease = ( employee).getSalary() * 0.1f;
			
			employee.setSalary(employee.getSalary() + SalaryIncrease);
		}

		// display value
		
		System.out.println("Employee after increase salary :");
		
		for(Employee employee : employees) {
			
			System.out.println(employee);
		}
	}

}
