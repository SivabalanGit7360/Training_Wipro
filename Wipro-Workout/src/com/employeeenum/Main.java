package com.employeeenum;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Siva",EmployeeType.MANAGER);
		Employee emp2 = new Employee("Gopi",EmployeeType.ENGINEER);
		Employee emp3 = new Employee("Krishna",EmployeeType.SALESPERSON);
		
		emp1.performDuties();
		emp2.performDuties();
		emp3.performDuties();

	}

}
