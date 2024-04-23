package com.day5assessment;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = new int[10];
		
		for(int i=0;i<numArray.length;i++) {
			numArray[i] = i+1;
		}
		
		System.out.println("Original array:");
		printArray(numArray);
		
		System.out.println("\n Array in reverse :");
		printReverseArray(numArray);
		

	}
	
	public static void printArray(int[] arr) {
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printReverseArray(int[] arr) {
		
		for(int i=arr.length-1;i>=0;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
