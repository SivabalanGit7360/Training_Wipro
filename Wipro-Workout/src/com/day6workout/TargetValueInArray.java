package com.day6workout;

import java.util.Scanner;

public class TargetValueInArray {

	public static void main(String[] args) {
		
		//int numArray[] = {1,2,7,5,4,3,9,12};
		
		//tagert = 9 ,7+2 = 9
		
		/* int target=9;
		
		int sum=0;
		
		for(int i=0;i<numArray.length;i++) {
			
			if((numArray[i]+numArray[i+1]) == target) {
				
				
				System.out.println("Target get");
			}
			}
			*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter the value :");
		for(int i=0; i<num; i++) {
		
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target number :");
		int target=sc.nextInt();
		int j=0;
		for(int i=0; i<num;i++) {
			for(j=j+1; j<num; j++) {
				
				if(arr[i]+arr[j] == target)
					System.out.println(arr[i]+" "+arr[j]);
			}
		}
		}

	}


