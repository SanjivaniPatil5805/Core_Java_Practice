package com.tka;

public class Flight {

	static int flightId = 301;
	static String flightNumber = "AI202";
	static String airlineName = "Air India";
	static String source = "Pune";
	static String destination = "Delhi";
	static String departureTime = "09:30 AM";
	static String arrivalTime = "11:45 AM";
	static int totalSeats;
	static int availableSeats = 45;
	static double ticketPrice = 6500.0;
	static double baggageAllowanceKG;
	static String aircraftType;
	static boolean mealAvailable;
	static int flightDurationMinutes;
	static String flightStatus = "Scheduled";

	public static void main(String args[]) {

		System.out.println("Flight ID: " + flightId);
		System.out.println("Flight Number: " + flightNumber);
		System.out.println("Airline: " + airlineName);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("Departure: " + departureTime);
		System.out.println("Arrival: " + arrivalTime);
		System.out.println("Total Seats: " + totalSeats);
		System.out.println("Available Seats: " + availableSeats);
		System.out.println("Ticket Price: " + ticketPrice);
		System.out.println("Baggage Allowance: " + baggageAllowanceKG + " kg");
		System.out.println("Aircraft: " + aircraftType);
		System.out.println("Meal Available: " + mealAvailable);
		System.out.println("Duration: " + flightDurationMinutes + " minutes");
		System.out.println("Flight Status: " + flightStatus);

	}

}
