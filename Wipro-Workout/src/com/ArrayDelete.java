package com;

import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		
		System.out.println("Enter the 5 Number :");
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i=0;i<=4;i++) {
			
			num[i] = sc.nextInt();
			
		}
		for(int j=0;j<num.length;j++) {
			
			System.out.print(num[j]);
			
		}
		
		
		

	}

}
