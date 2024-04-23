package com.casestudy1;

/*
 * 
 */
interface Rental{
	
	boolean checkAvailability();
	void reserve(String customerName, String startDate, String endDate);
	double calculateRentalCost(int days);
}

public class Vehicle implements Rental {
	
	private String vehicleID;
	private String make;
	private String model;
	private int year;
	private double rentalRate;
	
	public Vehicle(String vehicleID, String make, String model, int year, double rentalRate) {
		super();
		this.vehicleID = vehicleID;
		this.make = make;
		this.model = model;
		this.year = year;
		this.rentalRate = rentalRate;
	}
	
	
	//public boolean checkAvailability() {
		
		//return true;
		//write reservation logic
	//}
	
	


	public String getVehicleID() {
		return vehicleID;
	}


	public String getMake() {
		return make;
	}


	public String getModel() {
		return model;
	}


	public int getYear() {
		return year;
	}


	public double getRentalRate() {
		return rentalRate;
	}

	public boolean checkAvailability() {
		
		return true;
	}
	@Override
	public void reserve(String customerName, String startDate, String endDate) {
		
		System.out.println("Vehicle "+ vehicleID + " reserved for "+ customerName);
	}

	public double calculateRentalCost(int days) {
		
		return rentalRate * days;
	}


	

}
