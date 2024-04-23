package com.stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Alex"; //Constant pool
		s.concat(" Martin"); // Concat method appends the string at the end
		System.out.println(s.concat(" Martin"));
		System.out.println(s); // Will print Alex beacuse Strings are immutable objects
		
		
		
		// String Comparision
		
		String s1 = "Apples";
		String s2 = "Apples";
		String s3 = new String("Apples");
		String s4 = "Saurav";
		
		System.out.println(s1.equals(s2)); //m true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // false
		
		
		// By using == operator

		
		// Stringbuilder and buffer
		
		StringBuilder builder = new StringBuilder("hello ");
		builder.append("java wit string builder");
		System.out.println(builder);
		
		StringBuffer buffer = new StringBuffer("hello ");
		buffer.append("java wit string buffer");
		System.out.println(buffer);
	}

}
