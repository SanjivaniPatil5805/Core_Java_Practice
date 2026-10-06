package com.tka;

public class Hospital {

	static int hospitalId = 101;
	static String hospitalName = "City Care Hospital";
	static String location = "Pune";
	static int totalDoctors = 35;
	static int totalNurses;
	static int numberOfDepartments = 12;
	static String hospitalType;
	static int establishedYear = 2005;
	static double consultaionFee;
	static double roomCharges = 25000.00;
	static int totalBeds;
	static int availableBeds = 45;
	static boolean emergencyAvailable = true;
	static long emergencyNumber;
	static double pharmacyRevenue = 150000.50;
	
	public static void main(String args[]) {
		
		System.out.println("Hospital ID = "+hospitalId);
		System.out.println("Hospital Name = "+hospitalName);
		System.out.println("Hospital Location = "+location);
		System.out.println("Number Of Departments = "+numberOfDepartments);
		System.out.println("Hospital Type = "+hospitalType);
		System.out.println("Established Year = "+establishedYear);
		System.out.println("Total Doctors = "+totalDoctors);
		System.out.println("Total Nurses = "+totalNurses);
		System.out.println("Consultaion Fees = "+consultaionFee);
		System.out.println("Room Charges = "+roomCharges);
		System.out.println("Total Beds = "+totalBeds);
		System.out.println("Available Beds = "+availableBeds);
		System.out.println("Pharmacy Revenue = "+pharmacyRevenue);
		System.out.println("Emergency Available = "+emergencyAvailable);
		System.out.println("Emergency Number = "+emergencyNumber);
		
	}

}
