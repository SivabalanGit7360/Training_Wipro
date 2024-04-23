package com;

public class RecurseSumArray {
	
	public static int SumArray(int[] numArray, int index){
		
		
		if(index == numArray.length) {
			return 0;
		}
		return numArray[index] + SumArray(numArray, index + 1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArray = {10,34,55,20};
		int sum = SumArray(numArray, 0);
		System.out.println("The sum of the array elements is : " +sum);
	}

}
