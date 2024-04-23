package com.assessmentday6;

public class PerformLinerSearch {
	
	public static int LinerSearch(int numArray, int target) {
		
		for(int i=0; i<numArray.length;i++) {
			
			if(numArray[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {2,8,9,5,4,3};
		int target = 9;
		
		int index = LinearSearch(numArray, target);
		
		if(index != 1) {
			System.out.println("The element " +target + "is found at index " + index + " . ");
		}
		else {
			System.out.println("The element " +target + "is not found int the array" );
		}
		

	}

}
