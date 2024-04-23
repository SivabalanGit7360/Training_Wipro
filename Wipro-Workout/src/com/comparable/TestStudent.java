package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student (101, "Rupa", 80) );
		al.add(new Student (106, "Ginni", 27) );
		al.add(new Student (105, "Martin", 25) );
		
		Collections.sort(al);
		for(Student st : al) {
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
		}

	}

}
