package com.employee2;

public class Employee {
	
	static int no = 100;

	private int empNo;
	private String Name;
	private float Salary;
	
	public Employee(String name, float salary) {
		
		super();
		this.empNo=no++;
		Name=name;
		Salary=salary;
	}
	
	public void showData() {
		System.out.println(empNo +" : "+Name +" : "+ Salary);
	}

	public static int getNo() {
		return no;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return Name;
	}

	public float getSalary() {
		return Salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	
}
