package com.stringdemo;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcdrfgggfd";
		
		String s1 = "";
		
		for(int i=0; i<str.length();i++) {
			
			if(!s1.contains(str.charAt(i)+""))
				s1 +=str.charAt(i);
		}
		
		System.out.println(s1);

	}

}
