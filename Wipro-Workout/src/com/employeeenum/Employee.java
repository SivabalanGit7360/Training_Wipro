package com.employeeenum;

enum EmployeeType{
	
	MANAGER,ENGINEER,SALESPERSON
}
public class Employee {
	
	
	
	private String eName;
	private EmployeeType type;
	
	public Employee(String eName, EmployeeType type) {
		
		this.eName=eName;
		this.type=type;
	}

	public EmployeeType getType() {
		return type;
	}

	public void performDuties() {
		
		switch(this.type) {
		
		case MANAGER:
			System.out.println(eName +" is managing the team");
			break;
			
		case ENGINEER:
			System.out.println(eName +" is coding");
			break;
			
		case SALESPERSON:
			System.out.println(eName +" is selling the product");
			break;
			
			default:
				System.out.println("Invalid employee type");
		}
	}
	

}
