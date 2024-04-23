package com.arraylistexstudy;

public class Employee {


	private int empNo;
	private String eName;
	private float salary;
	
	public Employee(int empNo, String eName, float salary) {
		super();
		this.empNo = empNo;
		this.eName = eName;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String geteName() {
		return eName;
	}

	public float getSalary() {
		return salary;
	}
	

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", eName=" + eName + ", salary=" + salary + "]";
	}



}
