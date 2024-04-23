package com.polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		
		Bank bank; // Creating a reference
		bank = new Bank();
		
		System.out.println("Other Bank Rate of Interest :" +bank.RateOfInterest());
		
		bank = new SBIBank();
		
		System.out.println("SBI Rate of Interest :" +bank.RateOfInterest());
		
       bank = new ICICIBank();
		
		System.out.println("ICICI Rate of Interest :" +bank.RateOfInterest());
		
		
		

	}

}
