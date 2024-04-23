package com.comparable;

public class Student implements Comparable<Student>{

	int rollNo;
	String name;
	public int age;
	
	Student(int rollNo,String name, int age){
		
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Student student) {
		
		if(age==student.age)
			return 0;
		else if(age>student.age)
			return -1;
		else
			return 1;
	}

}
