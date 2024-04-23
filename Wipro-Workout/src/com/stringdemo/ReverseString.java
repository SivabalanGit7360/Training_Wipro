package com.stringdemo;

public class ReverseString {
	
	
		
	

	public static void main(String[] args) {
		
		String originalString = "Welcome";
		
		String reverseString = "";
		
		for(int i = originalString.length() - 1; i>=0 ;i--) {
			
			reverseString = reverseString + originalString.charAt(i);
			//System.out.print(reverseString);
			
		}
		
		//String str = StringReverse(originalString);
		
		System.out.println(originalString);
		System.out.println(reverseString);
		
		
		
		
		
		

		
	}

	

}
