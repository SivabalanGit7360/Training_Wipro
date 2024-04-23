package com;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
		
		int num[][] = {{2,3,4,5,6},
				{12,34,2,7,5},
				{3,4,9,0,1},
				{44,56,12,21,78},
				{3,8,9,6,5}};
		
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0; j<num[i].length;j++) {
				
				sum += num[i][j];
			}
		}
		System.out.println("Sum of array is " +sum);
		
		

	}

}
