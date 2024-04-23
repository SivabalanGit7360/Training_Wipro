package com.day5assessment;

import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for swap :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		swapTwoVariables(a,b);
	}
	
	static void swapTwoVariables(int a, int b) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a+","+b);
	}

}
