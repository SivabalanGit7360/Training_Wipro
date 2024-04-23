package com.employee2;

public class UseEmployee {

	public static void main(String[] args) {
		
		final double AverageSalary=98779d;
		
		Employee[] empObjects = new Employee[5];
		
		empObjects[0] = new Employee("Siva", 3455f);
		empObjects[1] = new Employee("Gopi", 7332f);
		empObjects[2] = new Employee("Rohit", 5453f);
		empObjects[3] = new Employee("Tilak", 2567f);
		
		System.out.println("Employee Object 1: "+empObjects[0]);
		System.out.println("Employee Object 2: "+empObjects[1]);
		System.out.println("Employee Object 3: "+empObjects[2]);
		System.out.println("Employee Object 4: "+empObjects[3]);
	}

}
