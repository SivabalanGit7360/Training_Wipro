package com.inheritance;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sa = new SavingsAccount("SANO3424", 20.0, 7.0);
		
		//sa.displayAccountInfo();
		//sa.deposit(600.0);
		//sa.withDraw(330);
		//sa.calculateInterest();
		//sa.displayAccountInfo();
		
		System.out.println("Initial Savings Account Information:");
		sa.displayAccountInfo();
		
		//deposit and withdraw
		
		sa.deposit(60.0);
		sa.withDraw(100.0);
		
		//calculate interest
		
		System.out.println("\nCalculating Interest...:");
		sa.calculateInterest();
		
		//display final account information
		System.out.println("Final Savings Account Information:");
		sa.displayAccountInfo();
		
	}

}
