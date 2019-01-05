import java.text.NumberFormat;
import java.util.Scanner;

public class FortuneTeller {
/* This program tells its user's fortune based on inputs of the user's first name, last name,
 * age,birth month,favorite color of the rainbow, and number of siblings. The output is the 
 * number of years the user has until retirement, the amount of money they will have in the bank,
 * the location of their retirement/vacation home, and mode of transportation they will be using*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
    
    System.out.println("Welcome to Fortune Teller!"); 
    System.out.println("Please answer the following questions to learn your fortune!"); 
    System.out.println("Type quit to quit at any time.");
    System.out.println("What is your name?"); 
    System.out.println("First?"); 
    Scanner input= new Scanner(System.in);
    String userFirstName = input.next(); 
    
    if(userFirstName.equalsIgnoreCase("quit")) System.exit(0); 
    
    System.out.println("Last?"); 
    String userLastName = input.next(); 
    
    if(userLastName.equalsIgnoreCase("quit")) System.exit(0); 
    
    System.out.println("Hello" +" "+userFirstName+" "+userLastName+"!"); 
    System.out.println("How many years old are you?"); 
    String userAgeString = input.next(); 
    int userAge = 0;
    int userYearsUntilRetirement = 0;
    
    if(userAgeString.equalsIgnoreCase("quit")) System.exit(0);
    else userAge=Integer.parseInt(userAgeString);

    if(userAge%2 == 0) userYearsUntilRetirement = 70 - userAge;
    else userYearsUntilRetirement = 65 - userAge; 
    
    System.out.println("What is the number of the month of your birth?"); 
    String userBirthMonthString = input.next(); 
    int userBirthMonth = 0;
    double userBankBalanceAtRetirement = 0;
    
    if(userBirthMonthString.equalsIgnoreCase("quit")) System.exit(0);
    else userBirthMonth=Integer.parseInt(userBirthMonthString);
    
    if(1 <= userBirthMonth && userBirthMonth <= 4)  userBankBalanceAtRetirement = 1234567.89*userYearsUntilRetirement*userBirthMonth;
    else if(5 <= userBirthMonth && userBirthMonth<= 8) userBankBalanceAtRetirement = 9876543.21*userYearsUntilRetirement/userBirthMonth; 
    else if (9 <= userBirthMonth && userBirthMonth<= 12) userBankBalanceAtRetirement = 10000000.00*userBirthMonth;
    else { userBankBalanceAtRetirement = 0;} 
    
    System.out.println("What is your favorite ROYGBIV color? Type help for List of Colors"); 
    String userFavoriteRoygbivColor = input.next(); 
    
    if(userFirstName.equalsIgnoreCase("quit")) System.exit(0);
    
    while (userFavoriteRoygbivColor.equalsIgnoreCase("help"))  
    {
    	System.out.println("ROYGBIV stands for Red Orang Yellow Green Blue Indigo Violet"); 
    	System.out.println("What is your favorite ROYGBIV color?"); 
        userFavoriteRoygbivColor =input.next();
    }
    String userTransportation = "";
    if (userFavoriteRoygbivColor.equalsIgnoreCase("red")) userTransportation = "Ferrari"; 
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("orange")) userTransportation = "A.S.S. (Autonomous Space Ship)"; 
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("yellow")) userTransportation = "Lamborgini";   
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("green"))  userTransportation = "your own two feet"; 
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("blue"))   userTransportation = "yacht"; 
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("indigo")) userTransportation = "private jet";  
    else if (userFavoriteRoygbivColor.equalsIgnoreCase("violet")) userTransportation = "stealth aircraft"; 
    else {userTransportation = "magic carpet";} 
    
    System.out.println("How many siblings do you have?"); 
    String userNumberSiblingsString = input.next();
    int userNumberSiblings = 0;
    
    if(userNumberSiblingsString.equalsIgnoreCase("quit")) System.exit(0);
    else userNumberSiblings=Integer.parseInt(userNumberSiblingsString);
    
    String userVacationHomeLocation;
    
    if(userNumberSiblings >= 4) userVacationHomeLocation = "Nice, France"; 
    else if(userNumberSiblings == 3)userVacationHomeLocation = "Dubai, United Arab Emirates"; 
    else if(userNumberSiblings == 2)userVacationHomeLocation = "Auckland, New Zealand"; 
    else if(userNumberSiblings == 1)userVacationHomeLocation = "Boracay, Philipines"; 
    else userVacationHomeLocation = "Private Island, Location Unknown"; 
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(); 
    String bankBalString = formatter.format(userBankBalanceAtRetirement); 
    System.out.println(userFirstName + " " + userLastName + " will retire in " + userYearsUntilRetirement + " years with " 
    + bankBalString + " in the bank, a vacation home in " + userVacationHomeLocation + ", and travel by " + userTransportation + ".");
    
    
   
	}

}
