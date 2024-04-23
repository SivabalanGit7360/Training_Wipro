package com.employeework;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "Gopi", 20000);
		//Employee emp1 = new Employee(2, "Siva", 10000);
		//Employee emp2 = new Employee(3, "Krishna", 30000);
		
		switch(emp.geteName()) {
		
		case "Gopi":  
			System.out.println("Gopi ID: " +emp.getId()+" Name is : "+emp.geteName()+" Salary is = "+emp.getSalary());
			break;
			
		case "Siva":
			System.out.println("Siva ID: " +emp.getId());
			break;
			
		case "Krishna":
			System.out.println("Krishna ID: " +emp.getId());
			break;
			
			default:
				System.out.println("Employee not found");
		}

	}

}
