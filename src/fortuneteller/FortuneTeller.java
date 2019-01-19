package fortuneteller;

import java.text.NumberFormat;
import java.util.Scanner;

public class FortuneTeller {
	/*
	 * This program tells its user's fortune based on inputs of the user's first
	 * name, last name, age,birth month,favorite color of the rainbow, and number of
	 * siblings. The output is the number of years the user has until retirement,
	 * the amount of money they will have in the bank, the location of their
	 * retirement/vacation home, and mode of transportation they will be using
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Fortune Teller!");
		System.out.println("Please answer the following questions to learn your fortune!");
		System.out.println("Type quit to quit at any time.");
		System.out.println("What is your name?");
		System.out.println("First?");
		Scanner input = new Scanner(System.in);
		String userFirstName = input.next();

		if (userFirstName.equalsIgnoreCase("quit")) {
			System.exit(0);
		}

		System.out.println("Last?");
		String userLastName = input.next();

		if (userLastName.equalsIgnoreCase("quit")) {
			System.exit(0);
		}

		System.out.println("Hello" + " " + userFirstName + " " + userLastName + "!");
		System.out.println("How many years old are you?");

		int userAge = 0;
		int userYearsUntilRetirement = 0;
		int numInvalidResponses = 1;

		while (userAge == 0) {

			if (input.hasNextInt()) {
				userAge = input.nextInt();
				if (userAge < 0) {
					if (numInvalidResponses >= 3) {
						System.out.println("Quit Messing Around!");
					}
					System.out.println("Please enter a  whole number value great than 0!");
					userAge = 0;
					numInvalidResponses++;
				}
			} else if (input.next().equalsIgnoreCase("quit")) {
				System.exit(0);
			} else if (!input.nextLine().equalsIgnoreCase("quit")) {
				if (numInvalidResponses > 3) {
					System.out.println("Quit Messing Around!");
				}
				System.out.println("Please enter a whole number value greater than 0!");
				numInvalidResponses++;
			}
		}

		if (userAge % 2 == 0)
			userYearsUntilRetirement = 70 - userAge;
		else
			userYearsUntilRetirement = 65 - userAge;
		System.out.println("What is the number of the month of your birth?");
		int userBirthMonth = 0;
		double userBankBalanceAtRetirement = 0;
		numInvalidResponses = 0;

		while (userBirthMonth == 0) {
			if (input.hasNextInt()) {
				userBirthMonth = input.nextInt();
				if (userBirthMonth < 1 || userBirthMonth > 12) {
					if (numInvalidResponses >= 3) {
						System.out.println("Quit Messing Around!");

					}
					System.out.println("Please enter a number representing your birth month from 1 to 12!");
					userBirthMonth = 0;
					numInvalidResponses++;
				}
			} else if (input.next().equalsIgnoreCase("quit")) {
				System.exit(0);
			} else if (!input.nextLine().equalsIgnoreCase("quit")) {
				if (numInvalidResponses >= 3)
					System.out.println("Quit Messing Around!");
				System.out.println("Please enter a number representing your birth month from 1 to 12!");
				numInvalidResponses++;
			}
		}

		if (1 <= userBirthMonth && userBirthMonth <= 4)
			userBankBalanceAtRetirement = 1234567.89 * userYearsUntilRetirement * userBirthMonth;
		else if (5 <= userBirthMonth && userBirthMonth <= 8)
			userBankBalanceAtRetirement = 9876543.21 * userYearsUntilRetirement / userBirthMonth;
		else if (9 <= userBirthMonth && userBirthMonth <= 12)
			userBankBalanceAtRetirement = 10000000.00 * userBirthMonth;
		else {
			userBankBalanceAtRetirement = 0;
		}

		System.out.println("What is your favorite ROYGBIV color? Type help for List of Colors");
		String userFavoriteRoygbivColor = input.next();

		if (userFirstName.equalsIgnoreCase("quit"))
			System.exit(0);

		while (userFavoriteRoygbivColor.equalsIgnoreCase("help")) {
			System.out.println("ROYGBIV stands for Red Orange Yellow Green Blue Indigo Violet");
			System.out.println("What is your favorite ROYGBIV color?");
			userFavoriteRoygbivColor = input.next();
		}
		String userTransportation = "";
		if (userFavoriteRoygbivColor.equalsIgnoreCase("red"))
			userTransportation = "Ferrari";
		else if (userFavoriteRoygbivColor.equalsIgnoreCase("orange"))
			userTransportation = "A.S.S. (Autonomous Space Ship)";
		else if (userFavoriteRoygbivColor.equalsIgnoreCase("yellow"))
			userTransportation = "Lamborghini";
		else if (userFavoriteRoygbivColor.equalsIgnoreCase("green"))
			userTransportation = "your own two feet";
		else if (userFavoriteRoygbivColor.equalsIgnoreCase("blue"))
			userTransportation = "yacht";
		else if (userFavoriteRoygbivColor.equalsIgnoreCase("indigo"))
			userTransportation = "private jet";
		else if (userFavoriteRoygbivColor.equalsIgnoreCase("violet"))
			userTransportation = "stealth aircraft";
		else {
			userTransportation = "magic carpet";
		}

		System.out.println("How many siblings do you have?");
		int userNumberSiblings = -1;
		numInvalidResponses = 1;

		while (userNumberSiblings == -1) {
			if (input.hasNextInt()) {
				userNumberSiblings = input.nextInt();
				if (userNumberSiblings < 0) {
					if (numInvalidResponses >= 3) {
						System.out.println("Quit Messing Around!");
					}
					System.out.println("Please enter a valid number of siblings (at least 0)!");
					userNumberSiblings = -1;
					numInvalidResponses++;
				}
			} else if (input.next().equalsIgnoreCase("quit")) {
				System.exit(0);
			} else if (!input.nextLine().equalsIgnoreCase("quit")) {
				if (numInvalidResponses >= 3)
					System.out.println("Quit Messing Around!");
				System.out.println("Please enter a valid number of siblings (at least 0)!");
				numInvalidResponses++;
			}
		}

		String userVacationHomeLocation;

		if (userNumberSiblings >= 4)
			userVacationHomeLocation = "Nice, France";
		else if (userNumberSiblings == 3)
			userVacationHomeLocation = "Dubai, United Arab Emirates";
		else if (userNumberSiblings == 2)
			userVacationHomeLocation = "Auckland, New Zealand";
		else if (userNumberSiblings == 1)
			userVacationHomeLocation = "Boracay, Philipines";
		else
			userVacationHomeLocation = "Private Island, Location Unknown";

		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		String bankBalString = formatter.format(userBankBalanceAtRetirement);
		System.out.println(userFirstName + " " + userLastName + " will retire in " + userYearsUntilRetirement
				+ " years with " + bankBalString + " in the bank, a vacation home in " + userVacationHomeLocation
				+ ", and travel by " + userTransportation + ".");

		input.close();

	}

}
