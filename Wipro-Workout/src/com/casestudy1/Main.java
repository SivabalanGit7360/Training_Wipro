package com.casestudy1;

public class Main {

	public static void main(String[] args) {
		
		//Vehicle vc = new Vehicle("121","2024 Make","NS200", 2023,2);
		Car car = new Car("T001","Tata","Altroz",2023,60.0,5,"Petrol");
		Truck truck = new Truck("T004", "Ford", "F-150", 2022, 75.0,2000.0, true);
		Motorcycle motorcycle = new Motorcycle("M002", "Harley Davidson","Street Glide",2021,15.0,60.7,false);
		
		car.reserve("Siva", "20/12/2023", "25/12/2023");
		double carRentalCost = car.calculateRentalCost(2);
		System.out.println("Car rental cost: $" + carRentalCost);
		System.out.println();
		
		System.out.println("***************************");
		truck.reserve("Rohit", "25/08/2024", "28/08/2024");
		double truckRentalCost = truck.calculateRentalCost(15);
		System.out.println("Truck rental cost: $" + truckRentalCost);
		
		System.out.println();
		
		System.out.println("***************************");
		motorcycle.reserve("Sam", "30/06/2024", "21/08/2024");
		double motorcycleRentalCost = truck.calculateRentalCost(7);
		System.out.println("MotorCycle rental cost: $" + motorcycleRentalCost);
		
		
		
	}

}
