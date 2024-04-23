package com;

public class BruteForceBubbleSort {
	
	public static void BubbleSort(int[] numArray) {
		//int j=0;
		for(int i=0; i < numArray.length - 1; i++) {
			
			for(int j = i + 1; j < numArray.length;j++) {
				
				if(numArray[i] > numArray[j]) {
					
					int temp = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = temp;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] numArray = {20,-10,45,25,-11,-3};
		
		//int bubbleSort = BubbleSort(numArray);
		
		System.out.println("Unsorted Array :");
		for(int nums : numArray){
			
			System.out.print(nums+",");
		}
		
		BubbleSort(numArray);
		
		System.out.println("\nSorted Array :");
		for(int nums : numArray){
			
			System.out.print(nums+",");
			
		}

	}

}
