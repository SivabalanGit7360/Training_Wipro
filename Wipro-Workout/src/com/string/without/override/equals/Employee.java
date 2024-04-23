package com.string.without.override.equals;

public class Employee {
	
	private String empId;
	private String empName;
	private String empDesignation;
	private float empSalary;
	
	public Employee(String empId, String empName, String empDesignation, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return ((Employee) obj).empId.equals(this.empId);
	}
	
	
	
	
	
	
	
	

}
