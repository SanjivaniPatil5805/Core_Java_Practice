package com.tka;

public class Car {

	static String carBrand = "Maruti Suzuki";
	static String carModel = "Swift";
	static String registrationNumber = "MH12AB1234";
	static int manufacturingYear = 2024;
	static String fuelType = "Petrol";
	static int seatingCapacity;
	static int numberOfDoors;
	static double price = 750000.00;
	static double mileage;
	static String carColor = "White";
	static int engineCC = 1197;
	static String transmissionType;
	static boolean airConditioner;
	static int maximumSpeed = 180;
	static int fuelTankCapacity = 37;

	public static void main(String args[]) {

		System.out.println("Car Brand = " + carBrand);
		System.out.println("Car Model = " + carModel);
		System.out.println("Registration Number = " + registrationNumber);
		System.out.println("Manufacturing Year = " + manufacturingYear);
		System.out.println("Fuel Type = " + fuelType);
		System.out.println("Seating Capacity = " + seatingCapacity);
		System.out.println("Color = " + carColor);
		System.out.println("Doors = " + numberOfDoors);
		System.out.println("Price = " + price);
		System.out.println("Mileage = " + mileage);
		System.out.println("Engine CC = " + engineCC);
		System.out.println("Transmission = " + transmissionType);
		System.out.println("Maximum Speed = " + maximumSpeed);
		System.out.println("Fuel Tank Capacity = " + fuelTankCapacity);
		System.out.println("Air Conditioner = " + airConditioner);

	}
}
