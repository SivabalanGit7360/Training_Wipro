package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		//Example of ArrayIndexOutOfBoundsException
		
		int[] array = {1,2,3};
		System.out.println(array[0]); //Accessing index out of bounds
		
		//Example of ArithmeticException
		
		int result = 10 / 0; //Division by zero
		
		// Example of NullPointerException
		
		String str = null;
		System.out.println(str.length()); // Accessing length of null string
		
		} 
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds Exception occured : "+e.getMessage());
		}
		catch(ArithmeticException e) { 
			System.out.println("Arithmetic Exception occured : "+e.getMessage());
		}
		catch(NullPointerException e) { 
			System.out.println("Null Pointer Exception occured : "+e.getMessage());
		}
		finally {
			
			System.out.println("Finally block executed");
		}
	
	}

}
