package com.employeework;

public class Employee {

	private int id;
	private String eName;
	private double salary;
	//static String company="Wipro";
	
	public Employee(int id, String eName, double salary) {
		
		super();
		this.id = id;
		this.eName = eName;
		this.salary = salary;
	}
	
	public Employee(int id, String eNmae) {
		
		super();
		this.id=id;
		this.eName=eName;
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
	
	void display() {
		System.out.println(" Id: "+id+ "Name: "+eName+"Salary: " +salary);
	}
}
