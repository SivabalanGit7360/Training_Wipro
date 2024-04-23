package com.casestudy1;

public class Truck extends Vehicle{
	private double cargoCapacity;
	private boolean isRentedWithDriver;
	
	public Truck(String vehicleID, String make, String model, int year, double rentalRate, double cargoCapacity, boolean isRentedWithDriver) {
		super(vehicleID, make, model, year, rentalRate);
		
		this.cargoCapacity=cargoCapacity;
		this.isRentedWithDriver=isRentedWithDriver;
		
		// TODO Auto-generated constructor stub
	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public boolean isRentedWithDriver() {
		return isRentedWithDriver;
	}
	
	public double calculateRentalCost(int days) {
		
		return super.calculateRentalCost(days) + (isRentedWithDriver ? 50.0 * days : 0);
	}
	
	
	
	

}
