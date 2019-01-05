import java.text.NumberFormat;
import java.util.Scanner;

public class FortuneTeller {
/* This program tells its user's fortune based on inputs of the user's first name, last name,
 * age,birth month,favorite color of the rainbow, and number of siblings. The output is the 
 * number of years the user has until retirement, the amount of money they will have in the bank,
 * the location of their retirement/vacation home, and mode of transportation they will be using*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String userFirstName; 
    String userLastName; 
    String userFavoriteRoygbivColor; 
    String userVacationHomeLocation; 
    String userTransportation = ""; 
    int    userAge = 0;
    int    userBirthMonth = 0; 
    int    userNumberSiblings = 0; 
    int    userYearsUntilRetirement; //number of years till user retires
    double userBankBalanceAtRetirement; //users bank balance at retirement
    
    Scanner in= new Scanner(System.in);
    
    System.out.println("Welcome to Fortune Teller!"); //prints the text in quotes 
    System.out.println("Please answer the following questions to learn your fortune!"); //prints the text in quotes
    System.out.println("Type quit to quit at any time.");
    System.out.println("What is your name?"); //prints the text in quotes
    System.out.println("First?"); //prints the text in quotes
    userFirstName = in.next(); //reads user input into the string fName
    
    if(userFirstName.equalsIgnoreCase("quit")) {System.exit(0);} //quits program if user enters quit 
    
    System.out.println("Last?"); //prints the text in quotes
    userLastName = in.next(); //reads user input into the string lName 
    
    if(userLastName.equalsIgnoreCase("quit")) {System.exit(0);} //quits program if user enters quit 
    
    System.out.println("Hello" +" "+userFirstName+" "+userLastName+"!"); //prints the text in quotes and stated variables
    System.out.println("How many years old are you?"); //prints the text in quotes
    String userAgeString = in.next(); //reads user input into the string ageS
    
    if(userAgeString.equalsIgnoreCase("quit")) {System.exit(0);}
    else {userAge=Integer.parseInt(userAgeString);}

    if(userAge%2 == 0) {userYearsUntilRetirement = 70 - userAge;} //calculates years until retirement for odd age
    else{userYearsUntilRetirement = 65 - userAge;} //calculates years until retirement for even age
    
    System.out.println("What is the number of the month of your birth?"); //prints the text in quotes
    String userBirthMonthString = in.next(); //reads user input into the string bMonS
    
    if(userBirthMonthString.equalsIgnoreCase("quit")) {System.exit(0);}
    else {userBirthMonth=Integer.parseInt(userBirthMonthString);}
    
    if(1 <= userBirthMonth && userBirthMonth <= 4) { userBankBalanceAtRetirement = 1234567.89*userYearsUntilRetirement*userBirthMonth;} //calculates a bankBal for birth months 1 to 4
    else if(5 <= userBirthMonth && userBirthMonth<= 8) { userBankBalanceAtRetirement = 9876543.21*userYearsUntilRetirement/userBirthMonth;} //calculates a bankBal for birth months 5 to 8
    else if (9 <= userBirthMonth && userBirthMonth<= 12) {userBankBalanceAtRetirement = 10000000.00*userBirthMonth;} //calculates a bankBal for birth months 9 to 12
    else { userBankBalanceAtRetirement = 0;} //sets bank bal to 0 if anything but 1 to 12 is entered
    
    System.out.println("What is your favorite ROYGBIV color? Type help for List of Colors"); //prints the text in quotes
    userFavoriteRoygbivColor = in.next(); //reads user input into string fvrColor
    
    if(userFirstName.equalsIgnoreCase("quit")) {System.exit(0);}
    
    while (userFavoriteRoygbivColor.equalsIgnoreCase("help")) //executes code in brackets any time user enters help for their favorite color 
    {
    	System.out.println("ROYGBIV stands for Red Orang Yellow Green Blue Indigo Violet"); //prints the text in quotes
    	System.out.println("What is your favorite ROYGBIV color?"); //prints the text in quotes
    	userFavoriteRoygbivColor =in.next();
    }
    if (userFavoriteRoygbivColor.equalsIgnoreCase("red")) {userTransportation = "Ferrari";} //sets mode of transportation if user enters red 
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("orange")) {userTransportation = "A.S.S. (Autonomous Space Ship)";} //sets mode of transportation if user enters orange
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("yellow")) {userTransportation = "Lamborgini";} //sets mode of transportation if user yellow  
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("green")) {userTransportation = "your own two feet";} //sets mode of transportation if user enters green
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("blue")) {userTransportation = "yacht";} //sets mode of transportation if user enters blue
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("indigo")) {userTransportation = "private jet"; } //sets mode of transportation if user enters indigo
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("violet")) {userTransportation = "stealth aircraft";} //sets mode of transportation if user enters violet
    else {userTransportation = "magic carpet";} //sets mode of transportation if user enters something besides help or the colors of the rainbow
    
    System.out.println("How many siblings do you have?"); //prints the text in quotes 
    String userNumberSiblingsString = in.next(); //reads user input into string numSibS
    
    if(userNumberSiblingsString.equalsIgnoreCase("quit")) {System.exit(0);}
    else {userNumberSiblings=Integer.parseInt(userNumberSiblingsString);}
    
    if(userNumberSiblings >= 4) {userVacationHomeLocation = "Nice, France";} //sets vacation home location for if the user has 4 or more siblings 
    else if(userNumberSiblings == 3){userVacationHomeLocation = "Dubai, United Arab Emirates";} //sets vacation home location for if the user has 3 siblings
    else if(userNumberSiblings == 2){userVacationHomeLocation = "Auckland, New Zealand";} //sets vacation home location for if the user has 2 siblings
    else if(userNumberSiblings == 1){userVacationHomeLocation = "Boracay, Philipines";} //sets vacation home location for if the user has 1 siblings
    else{userVacationHomeLocation = "Private Island, Location Unknown";} //sets vacation home location for if the user has 0 or negative siblings
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(); //defines the method formatter for class NumberFormat
    String bankBalString = formatter.format(userBankBalanceAtRetirement); //uses the method formatter to format the users bank balance into dollars
    System.out.println(userFirstName + " " + userLastName + " will retire in " + userYearsUntilRetirement + " years with " 
    + bankBalString + " in the bank, a vacation home in " + userVacationHomeLocation + ", and travel by " + userTransportation + ".");
    
    
   
	}

}
