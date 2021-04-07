package BuisnessCodeAssignment;

import java.io.FileNotFoundException;

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
    public static void generateCustomerDataFile(String username) throws FileNotFoundException{ 
        
    }
    /*******************************************************************
    *       ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY         *
    *******************************************************************/
}