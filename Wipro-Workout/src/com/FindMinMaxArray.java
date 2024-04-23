package com;

import java.util.Scanner;

public class FindMinMaxArray {

	public static void main(String[] args) {
		
		
		
		int num[] = {30,35,12,10,7};
		
		
		
		int min = num[0];
		int max = num[0];
		
		for(int i = 1; i < num.length;i++) {
			
			if(num[i] > max)
				max = num[i];
			else if(num[i] < min)
				min = num[i];
		}
		System.out.println("Minimum no is: " + min);
		System.out.println("Maximum no is: " + max);

	}

}
