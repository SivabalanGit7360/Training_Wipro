package com.casestudy1;

public class Car extends Vehicle{
	
	private int numSeats;
	private String fuelType;
	
	public Car(String vehicleID, String make, String model, int year, double rentalRate, int numSeats, String fuelType) {
		super(vehicleID, make, model, year, rentalRate);
	    
		this.numSeats=numSeats;
		this.fuelType=fuelType;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public String getFuelType() {
		return fuelType;
	}
	
	

	
	

	
}
