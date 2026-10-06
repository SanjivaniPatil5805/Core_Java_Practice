package com.tka;

public class Movie {

	static int movieId = 201;
	static String movieName = "3 Idiots";
	static String director = "Rajkumar Hirani";
	static String language;
	static int releaseYear = 2009;
	static double rating;
	static int durationMinutes;
	static String genre = "Comedy Drama";
	static double budgetCrores = 55.0;
	static double boxOfficeCrores;
	static String leadActor = "Aamir Khan";
	static String leadActress = "Kareena Kapoor";
	static String productionHouse = "Vinod Chopra Films";
	static boolean availableOnline = true;
	static int numberOfAwards;

	public static void main(String args[]) {

		System.out.println("Movie ID: " + movieId);
		System.out.println("Movie Name: " + movieName);
		System.out.println("Director: " + director);
		System.out.println("Language: " + language);
		System.out.println("Release Year: " + releaseYear);
		System.out.println("Rating: " + rating);
		System.out.println("Duration: " + durationMinutes + " minutes");
		System.out.println("Genre: " + genre);
		System.out.println("Budget: " + budgetCrores + " crores");
		System.out.println("Box Office: " + boxOfficeCrores + " crores");
		System.out.println("Lead Actor: " + leadActor);
		System.out.println("Lead Actress: " + leadActress);
		System.out.println("Production House: " + productionHouse);
		System.out.println("Available Online: " + availableOnline);
		System.out.println("Awards: " + numberOfAwards);

	}

}
