package com.casestudy1;

public class Motorcycle extends Vehicle{
	
	private double engineDisplacement;
	private boolean isHelmetProvided;

	public Motorcycle(String vehicleID, String make, String model, int year, double rentalRate, double engineDisplacement, boolean isHelmetProvided) {
		super(vehicleID, make, model, year, rentalRate);
		// TODO Auto-generated constructor stub
		
		this.engineDisplacement=engineDisplacement;
		this.isHelmetProvided=isHelmetProvided;
	}

	public double getEngineDisplacement() {
		return engineDisplacement;
	}

	public boolean isHelmetProvided() {
		return isHelmetProvided;
	}
	
	
	
	

}
