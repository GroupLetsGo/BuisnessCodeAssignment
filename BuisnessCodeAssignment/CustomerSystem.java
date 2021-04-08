package BuisnessCodeAssignment;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Throughout this project, the use of data structures are not permitted such as methods like .split and .toCharArray




import java.util.Scanner;
// More packages may be imported in the space below

class CustomerSystem{
    public static void main(String[] args){
        // Please do not edit any of these variables
        Scanner reader = new Scanner(System.in);
        String userInput, enterCustomerOption, generateCustomerOption, exitCondition;
        enterCustomerOption = "1";
        generateCustomerOption = "2";
        exitCondition = "9";

        // More variables for the main may be declared in the space below


        do{
            printMenu();                                    // Printing out the main menu
            userInput = reader.nextLine();                  // User selection from the menu

            if (userInput.equals(enterCustomerOption)){
                // Only the line below may be editted based on the parameter list and how you design the method return
		        // Any necessary variables may be added to this if section, but nowhere else in the code
                enterCustomerInfo();
            }
            else if (userInput.equals(generateCustomerOption)) {
                // Only the line below may be editted based on the parameter list and how you design the method return
                generateCustomerDataFile();
            }
            else{
                System.out.println("Please type in a valid option (A number from 1-9)");
            }

        } while (!userInput.equals(exitCondition));         // Exits once the user types 
        
        reader.close();
        System.out.println("Program Terminated");
    }
    public static void printMenu(){
        System.out.println("Customer and Sales System\n"
        .concat("1. Enter Customer Information\n")
        .concat("2. Generate Customer data file\n")
        .concat("3. Report on total Sales (Not done in this part)\n")
        .concat("4. Check for fraud in sales data (Not done in this part)\n")
        .concat("9. Quit\n")
        .concat("Enter menu option (1-9)\n")
        );
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void enterCustomerInfo() {
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void validatePostalCode(){
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void validateCreditCard(String creditCardNumber){

        // Setting up the int I will use later
        int sumOdd = 0;
        int sumEvenDouble = 0;

        boolean creditCardOrNot;


        // Check for the lengh of credit card
        int len = creditCardNumber.length();

        // If the credit card number is greater than or equal to 9, it might be real
        // goes onto the next varification steps
        if (len >= 9){
            // Convert the string creditCardNumber to an actual number stored in int
            int mathCreditCardNumber = Integer.parseInt(creditCardNumber);

            // Reverse the credit card number
            for (int i = len; i >0; i--){

                // If the reversed credit card num is an odd number
                // The code will take all of the odd numbers and add them together
                if (i%2 != 0){
                    int oddDigit = i;
                    sumOdd = sumOdd + oddDigit;
                }

                // If the reversed credit card num is an even number 
                // The code will double all of the even numbers
                else{
                    int evenDigit = 2*i;

                    // If the code is a double digit or above, the two digits are added together into a one digit number
                    while(evenDigit > 0){
                        sumEvenDouble = sumEvenDouble + evenDigit%10;
                        evenDigit = evenDigit / 10;
                    }
                }
            }
            // The final check for credit card, if the sum of all odd num and sum of all the doubled even num is divisble by 10, it is real, if not, then it is fake
            int sumOddEven = sumOdd + sumEvenDouble;

            if (sumOddEven % 10 == 0){
                creditCardOrNot = true;
                System.out.println("The credit card is a validated real credit card");
            }
            else{
                creditCardOrNot = false;
                System.out.println("This credit card is not a real one");
            }
        }
        // If the credit card number is less than 9, then this card is fake to the program
        else{
            System.out.println("The card is fake");
        }
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void unqiuePassword(String username) throws FileNotFoundException{ 
        
        

        String fileName = "ID.txt"; // The name of the text file that we will save to ensure an unique ID
        // Creat a file instance to reference the text file in java
        File textFile = new File(fileName);
        // Created a scanner instance to read the text file in java
        Scanner reader = new Scanner(textFile);

        // Reads the line on the file and store the int on the line
        int nextInt = reader.nextInt();
        int num = nextInt;

        // Closing the scanner
        reader.close();

        

        // To have the text file start off with a int value 0 and keep going from there 
        if (fileName.length() == 0){                                    // Cannot get the file to start with a zero
            PrintWriter out = new PrintWriter(fileName);                // Might just delete
            int zero = 0;
            out.println(zero);
            // Closing the scanner
            out.close();
        }

        // Setting up the first ID
        int i = 1;

        // If the value of the int variable in the text file is zero, the ID will be 1
        if(num == 0){
            // Created a PrintWriter instance to export to the text file in java
            PrintWriter out = new PrintWriter(fileName);
            out.println(i);
            System.out.println("Your ID is: " + i);
            // Closing the scanner
            out.close();
        }
        // If the value of the int on the text file is greater than 1, then the value of i will be subtracted from the num on the text file at the moment
        // and then add that difference to i to make sure i is the same value as the num on the text file
        else if (num > i){
            int diff = num - i;
            i = i + diff;

            // if the num on the textfile is the same as the i; the num that is getting printed, then i will add 1 to itself to ensure it is greater than all of the nums printed
            // to the textfile so far
            if (num == i);
            // Created a PrintWriter instance to export to the text file in java
            PrintWriter out = new PrintWriter(fileName);
            i++;
            out.println(i);
            System.out.println("Your ID is: " + i);
            // Closing the scanner
            out.close();
        }
        else if (num == i){
            // Created a PrintWriter instance to export to the text file in java
            PrintWriter out = new PrintWriter(fileName);
            i++;
            out.println(i);
            System.out.println("Your ID is: " + i);
            // Closing the scanner
            out.close();
        }
    }
    public static void generateCustomerDataFile(String username) throws FileNotFoundException{
        File file = new File("../../customerDataFile.csv");
        PrintWriter out = new PrintWriter("customerDataFile.csv");

        out.println(enterCustomerInfo(););
        out.close();
    }
    /*******************************************************************
    *       ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY         *
    *******************************************************************/
}