package com.assessment;

import java.util.Scanner;

public class TicketPricing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		System.out.println("Enter the type of movie");
		String movieType = sc.next();
		double ticketPrice = calculateTicketPrice(age, movieType);
		
		if(ticketPrice != -1) {
			System.out.println("Ticket Price: $" + ticketPrice);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
	}
	
	public static double calculateTicketPrice(int age, String movieType) {
		double ticketPrice = -1;
		
		if(movieType.equalsIgnoreCase("regular")) {
			
			if(age < 18) {
				ticketPrice = 8.0;
			}
			else {
				ticketPrice = 12.0;
			}
		}
		else if (movieType.equalsIgnoreCase("3D")) {
			
			if(age < 18) {
				ticketPrice = 10.0;
			}else {
				
				ticketPrice = 15.0;
			}
		}
		return ticketPrice;
	}

}
