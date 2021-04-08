package BuisnessCodeAssignment;


import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

// Throughout this project, the use of data structures are not permitted such as methods like .split and .toCharArray




import java.util.Scanner;
// More packages may be imported in the space below

class CustomerSystem{
    public static void main(String[] args, String[] validPostalCodes, int i) throws FileNotFoundException{
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
                enterCustomerInfo(reader, args, 0);
            }
            else if (userInput.equals(generateCustomerOption)) {
                // Only the line below may be editted based on the parameter list and how you design the method return
                generateCustomerDataFile(enterCustomerInfo(reader, validPostalCodes, i));
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
    public static String[] enterCustomerInfo(Scanner reader,String[] validPostalCodes, int j) throws FileNotFoundException {
        System.out.println("Please enter your first name.");
        String firstName = reader.nextLine();
        System.out.println("Please enter your last name.");
        String lastName = reader.nextLine();
        System.out.println("Please enter the city you live in.");
        String city = reader.nextLine();

        // Prompt the user to input the postal code
        String postalCode;
        do{
            System.out.println("Please enter your postal code.");
            postalCode = reader.nextLine();
        } while(!validatePostalCode(postalCode,validPostalCodes));  // check if postal code is valid

        String creditCardNumber;
        do{
            System.out.println("Please enter your credit card number.");
            creditCardNumber = reader.nextLine();
        }while (!validateCreditCard(creditCardNumber));    // check if credit card number is valid
        // Look for length, substring and then add comma where ever there isnt a substring
        int ID = uniqueID(j);

        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nCity: " + city + "\nPostal Code: " + postalCode + "\nCredit card number: " + creditCardNumber);
        return new String[] {firstName + "," + lastName + "," + uniqueID(j) + "," + city + "," + postalCode + "," + creditCardNumber};
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static String[] readPostalCodeFromFile(String filename)throws FileNotFoundException{
        String[] postalCodes = new String[0];
        int nLines = 0;
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line = br.readLine())!= null){
                nLines ++;
            }
            br.close();
            fr.close();

            nLines --;
            postalCodes = new String[nLines];
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            br.readLine();
            int i = 0;
            while((line = br.readLine())!= null){
                postalCodes[i] = line.substring(0,3);
                i++;
            }
            br.close();
            fr.close();
        }catch (Exception e){
            System.out.print(e);
        }
        return postalCodes;
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static boolean validatePostalCode(String postalCode,String[] validPostalCodes){

        // Check for the length of postal code
        int lenCode = postalCode.length();
        if (lenCode < 3){
            return false;
        }
        // Check if the simplified code is in the file
        for (String code:validPostalCodes) {
            if(code.equals(postalCode)){
                return true;
            }
        }
        return false;
    }
    /*
    * Description - Adds three to a number that is passed through it
    *
    * @param x -integer value from1 to 100
    * @return - A number three greater than the parameter

    // Adds three to a given number
    // Method names should be easy to understand
    // Methods that return things are know as 
    //    * Functional Methods : return a value back to main
    //        - Could be public static int/String/boolean/double, can output alot of things as well as inputing alot of things as parameter
    
    */
    public static boolean validateCreditCard(String creditCardNumber){

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
            for (int i = len; i > 0; i--){

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
                return true;
            }
            else{
                creditCardOrNot = false;
                System.out.println("This credit card is not a real one");
                return false;
            }
        }
        // If the credit card number is less than 9, then this card is fake to the program
        else{
            System.out.println("The card is fake");
            return false;
        }
    }
    
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static int uniqueID(int i) throws FileNotFoundException{ 

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

        // Setting up the first ID
        int j = 1;

        // If the value of the int variable in the text file is zero, the ID will be 1
        if(num == 0){
            // Created a PrintWriter instance to export to the text file in java
            PrintWriter out = new PrintWriter(fileName);
            out.println(j);
            // Closing the scanner
            out.close();
        }
        // If the value of the int on the text file is greater than 1, then the value of i will be subtracted from the num on the text file at the moment
        // and then add that difference to i to make sure i is the same value as the num on the text file
        else if (num > j){
            int diff = num - j;
            i = i + diff;

            // if the num on the textfile is the same as the i; the num that is getting printed, then i will add 1 to itself to ensure it is greater than all of the nums printed
            // to the textfile so far
            if (num == j);
            // Created a PrintWriter instance to export to the text file in java
            PrintWriter out = new PrintWriter(fileName);
            i++;
            out.println(j);
            // Closing the scanner
            out.close();
        }
        else if (num == j){
            // Created a PrintWriter instance to export to the text file in java
            PrintWriter out = new PrintWriter(fileName);
            i++;
            out.println(j);
            
            // Closing the scanner
            out.close();
        }
        return j;
    }
    
    public static void generateCustomerDataFile(String[] strings) throws FileNotFoundException{
        PrintWriter out = new PrintWriter("customerDataFile.csv");

        out.println(enterCustomerInfo(null, strings, 0));
        out.close();
    }
    
    /*******************************************************************
    *       ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY         *
    *******************************************************************/
}