package com.day5assessment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Two Number :");
		
		int a = sc.nextInt();
		int b = sc.nextInt();		
		
		System.out.println("Select the Option : \n" +
							"1. Addition \n"+
							"2. Subraction \n"+
							"3. Multiplication \n"+
							"4. Division \n");
		
		int n= sc.nextInt();
		
		switch(n) {
		
		case 1:
			int addition = a+b;
			System.out.println(addition);
			break;
		case 2:
			int subraction = a-b;
			System.out.println(subraction);
			break;
		case 3:
			int multiplication = a*b;
			System.out.println(multiplication);
			break;
		case 4:
			int division = a+b;
			System.out.println(division);
			break;
		default:
			System.out.println("Please enter the correct choice :::");
			
		}
		
		

	}

}
