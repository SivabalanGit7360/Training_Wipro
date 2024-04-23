package com.stringdemo;

public class PalindromeEx {
	
	public static boolean isPalindrome(String name) {
		
		int len = name.length();
		
		for(int i=0; i < len / 2; i++) {
			
			if(name.charAt(i) != name.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "naman";
		
		System.out.println(name + " is palindrome: "+ isPalindrome(name));
	}

}
