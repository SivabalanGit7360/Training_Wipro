package com.string.without.override.equals;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub''

		
		Employee emp1 = new Employee("E001", "jack", "manager",1000);
		Employee emp2 = new Employee("E001", "jack", "manager",1000);
		
		System.out.println("Using equals for comparing emp1 and emp2 - "+ emp1.equals(emp2));
		System.out.println("Using == for comparing emp1 and emp2 - "+ (emp1 == emp2));
	}

}
