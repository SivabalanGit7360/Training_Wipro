package com;

public class Average {

	public static void main(String[] args) {
		
		int [] numsArray = {10,20,30,40,50};
		float x = FindAverage(numsArray);
		System.out.println(x);
		

	}
	
	public static float FindAverage(int [] numsArray) {
		
		int total=0;
		float average = 0;
		
		for(int i=0;i<numsArray.length;i++) {
			
			total += numsArray[i];
			average = total/5;
			
		}
		return average;
	}
	

}
