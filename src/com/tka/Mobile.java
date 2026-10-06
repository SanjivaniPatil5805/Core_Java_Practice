package com.tka;

public class Mobile {

	static int mobileId = 501;
	static String brand = "Samsung";
	static String model = "Galaxy S24";
	static String operatingSystem = "Android";
	static int ramGB = 8;
	static int storageGB = 256;
	static double price = 59999.0;
	static double screenSize;
	static int batteryCapacity;
	static int rearCameraMP = 50;
	static int frontCameraMP = 12;
	static String processor;
	static boolean is5GSupported;
	static String color;
	static int warrantyMonths = 12;

	public static void main(String args[]) {

		System.out.println("Mobile ID: " + mobileId);
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Operating System: " + operatingSystem);
		System.out.println("RAM: " + ramGB + " GB");
		System.out.println("Storage: " + storageGB + " GB");
		System.out.println("Price: " + price);
		System.out.println("Screen Size: " + screenSize);
		System.out.println("Battery: " + batteryCapacity + " mAh");
		System.out.println("Rear Camera: " + rearCameraMP + " MP");
		System.out.println("Front Camera: " + frontCameraMP + " MP");
		System.out.println("Processor: " + processor);
		System.out.println("5G Supported: " + is5GSupported);
		System.out.println("Color: " + color);
		System.out.println("Warranty: " + warrantyMonths + " months");

	}

}
