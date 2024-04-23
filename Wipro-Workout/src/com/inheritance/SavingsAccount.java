package com.inheritance;

public class SavingsAccount extends BankAccount {

	
	double interestRate;
	
	public SavingsAccount(String accountNumber, double balance, double interestRate) {
		
		super(accountNumber, balance);
		this.interestRate = interestRate;
		
	}
	public void calculateInterest() {
		
		double interest = balance * interestRate / 100 ;
		deposit(interest);
		
	}
}
