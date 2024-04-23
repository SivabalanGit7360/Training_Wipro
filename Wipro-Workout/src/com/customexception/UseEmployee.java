package com.customexception;

public class UseEmployee {

	public static void main(String[] args) {
		
		Employee employee = new Employee(101,"Gopi",8760.7f);
		
		try {
			
			if(employee.getSalary() < 10000) {
				
				throw new InvalidSalaryException("Salary is not valid ");
			}
			else {
				System.out.println("Welcome to vote");
			}
		}
		catch(InvalidSalaryException e) {
			System.out.println("Salary Cannot be Considered");
		}
		

	}

}
