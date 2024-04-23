package com.inheritance;

public class BankAccount {
	

		
		protected String accountNumber;
		String holderName;
		protected double balance;
		//double minimumBalance=500.0d;

	
		// Constructor
		public BankAccount(String accountNumber, double balance) {
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		
		
	public void deposit(double amount) {
		
		balance += amount;
		System.out.println(amount + " deposited. Current balance: " + balance);
	}
	
			

	public void withDraw(double amount) {
		
		try {
			
			if(balance >= amount) {
			balance -= amount;
			System.out.println(amount+ " withdraw. Current balance: " + balance);
			
			
		
		}else {
			//System.out.println("Withdraw Not Processed");
			throw new CustomException("Withdraw Not Processed");
			
		}
		}
		catch(CustomException e) {
			System.out.println("From Custom Exception. Insufficient Balance");
		}
		
	}
	public void displayAccountInfo() {
		System.out.println("Account Number: "+ accountNumber);
		System.out.println("Balance: "+ balance);
		
	}

}
