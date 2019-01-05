import java.text.NumberFormat;
import java.util.Scanner;

public class FortuneTeller {
/* This program tells its user's fortune based on inputs of the user's first name, last name,
 * age,birth month,favorite color of the rainbow, and number of siblings. The output is the 
 * number of years the user has until retirement, the amount of money they will have in the bank,
 * the location of their retirement/vacation home, and mode of transportation they will be using*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String fName; // user's first name
    String lName; // user's last name 
    String fvrColor; // user's favorite color of the rainbow
    String vcHmLoc; // location of user's vacation home
    String trans = ""; //type of transport user will have 
    int age = 0;// user's age
    int bMon = 0; // user's birth month 
    int numSib = 0; // user's number of siblings
    int yrsToRet; //number of years till user retires
    double bankBal; //users bank balance at retirement
    
    Scanner in= new Scanner(System.in);
    
    System.out.println("Welcome to Fortune Teller!"); //prints the text in quotes 
    System.out.println("Please answer the following questions to learn your fortune!"); //prints the text in quotes
    System.out.println("Type quit to quit at any time.");
    System.out.println("What is your name?"); //prints the text in quotes
    System.out.println("First?"); //prints the text in quotes
    fName = in.next(); //reads user input into the string fName
    
    if(fName.equalsIgnoreCase("quit")) {System.exit(0);} //quits program if user enters quit 
    
    System.out.println("Last?"); //prints the text in quotes
    lName = in.next(); //reads user input into the string lName 
    
    if(lName.equalsIgnoreCase("quit")) {System.exit(0);} //quits program if user enters quit 
    
    System.out.println("Hello" +" "+fName+" "+lName+"!"); //prints the text in quotes and stated variables
    System.out.println("How many years old are you?"); //prints the text in quotes
    String ageS = in.next(); //reads user input into the string ageS
    
    if(ageS.equalsIgnoreCase("quit")) {System.exit(0);}
    else {age=Integer.parseInt(ageS);}

    if(age%2 == 0) {yrsToRet = 70 - age;} //calculates years until retirement for odd age
    else{yrsToRet = 65 - age;} //calculates years until retirement for even age
    
    System.out.println("What is the number of the month of your birth?"); //prints the text in quotes
    String bMonS = in.next(); //reads user input into the string bMonS
    
    if(bMonS.equalsIgnoreCase("quit")) {System.exit(0);}
    else {bMon=Integer.parseInt(bMonS);}
    
    if(1 <= bMon && bMon <= 4) { bankBal = 1234567.89*yrsToRet*bMon;} //calculates a bankBal for birth months 1 to 4
    else if(5 <= bMon && bMon<= 8) { bankBal = 9876543.21*yrsToRet/bMon;} //calculates a bankBal for birth months 5 to 8
    else if (9 <= bMon && bMon<= 12) {bankBal = 10000000.00*bMon;} //calculates a bankBal for birth months 9 to 12
    else { bankBal = 0;} //sets bank bal to 0 if anything but 1 to 12 is entered
    
    System.out.println("What is your favorite ROYGBIV color? Type help for List of Colors"); //prints the text in quotes
    fvrColor = in.next(); //reads user input into string fvrColor
    
    if(fName.equalsIgnoreCase("quit")) {System.exit(0);}
    
    while (fvrColor.equalsIgnoreCase("help")) //executes code in brackets any time user enters help for their favorite color 
    {
    	System.out.println("ROYGBIV stands for Red Orang Yellow Green Blue Indigo Violet"); //prints the text in quotes
    	System.out.println("What is your favorite ROYGBIV color?"); //prints the text in quotes
    	fvrColor =in.next();
    }
    if (fvrColor.equalsIgnoreCase("red")) {trans = "Ferrari";} //sets mode of transportation if user enters red 
    else if (fvrColor.equalsIgnoreCase("orange")) {trans = "A.S.S. (Autonomous Space Ship)";} //sets mode of transportation if user enters orange
    else if (fvrColor.equalsIgnoreCase("yellow")) {trans = "Lamborgini";} //sets mode of transportation if user yellow  
    else if (fvrColor.equalsIgnoreCase("green")) {trans = "your own two feet";} //sets mode of transportation if user enters green
    else if (fvrColor.equalsIgnoreCase("blue")) {trans = "yacht";} //sets mode of transportation if user enters blue
    else if (fvrColor.equalsIgnoreCase("indigo")) {trans = "private jet"; } //sets mode of transportation if user enters indigo
    else if (fvrColor.equalsIgnoreCase("violet")) {trans = "stealth aircraft";} //sets mode of transportation if user enters violet
    else {trans = "magic carpet";} //sets mode of transportation if user enters something besides help or the colors of the rainbow
    
    System.out.println("How many siblings do you have?"); //prints the text in quotes 
    String numSibS = in.next(); //reads user input into string numSibS
    
    if(numSibS.equalsIgnoreCase("quit")) {System.exit(0);}
    else {numSib=Integer.parseInt(numSibS);}
    
    if(numSib >= 4) {vcHmLoc = "Nice, France";} //sets vacation home location for if the user has 4 or more siblings 
    else if(numSib == 3){vcHmLoc = "Dubai, United Arab Emirates";} //sets vacation home location for if the user has 3 siblings
    else if(numSib == 2){vcHmLoc = "Auckland, New Zealand";} //sets vacation home location for if the user has 2 siblings
    else if(numSib == 1){vcHmLoc = "Boracay, Philipines";} //sets vacation home location for if the user has 1 siblings
    else{vcHmLoc = "Private Island, Location Unknown";} //sets vacation home location for if the user has 0 or negative siblings
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(); //defines the method formatter for class NumberFormat
    String bankBalString = formatter.format(bankBal); //uses the method formatter to format the users bank balance into dollars
    System.out.println(fName + " " + lName + " will retire in " + yrsToRet + " years with " 
    + bankBalString + " in the bank, a vacation home in " + vcHmLoc + ", and travel by " + trans + ".");
    
    
   
	}

}
