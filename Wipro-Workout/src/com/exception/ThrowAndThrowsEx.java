package com.exception;

import java.io.IOException;

public class ThrowAndThrowsEx {
	
	public static void checkAge(int age) throws ArithmeticException{
		
		if(age < 18) {
			
			throw new ArithmeticException("Underage person cannot be processed!");
		}else {
			
			System.out.println("Age is valid");
		}
	}
	
	public static void readFile() throws IOException {
		
		throw new IOException("File not found");
	}

	public static void main(String[] args) {
	
		try {
			
			checkAge(15);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
		
		try {
			
			readFile();
		}
		catch (IOException e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
