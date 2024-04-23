package com.employee;

public class Employee {
	private int id;
	private String eName;
	private double salary;
	
	Employee(int id, String eName, double salary){
		
		this.id=id;
		this.eName=eName;
		this.salary=salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", eName=" + eName + ", salary=" + salary + "]";
	}

	
}
