package com.assessment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score :");
		int score = sc.nextInt();
		

		if(score < 0 || score > 100)
		{
			System.out.println("Score must be between 0 to 100");
		}
		else if (score >= 90)
		{
			System.out.println("A Grade");
		}
		else if (score >= 80)
		{
			System.out.println("B Grade");
		}
		else if ( score >= 70)
		{
			System.out.println("C Grade");
		}
		else if ( score >= 60) {
			
			System.out.println("D Grade");
		}
		else {
			System.out.println("F Grade");
		}
	}

}
