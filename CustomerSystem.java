package BuisnessCodeAssignment;


import java.io.*;

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
        String[] validPostalCodes = readPostalCodeFromFile("postal_codes.csv");

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
    public static String[] enterCustomerInfo(Scanner reader,String[] validPostalCodes) {
        // Prompt the user to input the information
        System.out.println("Please enter your first name.");
        String firstname = reader.nextLine();
        System.out.println("Please enter your last name.");
        String lastname = reader.nextLine();
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
        System.out.println("First name: " + firstname + "\nLast name: " + lastname + "\nCity: " + city + "\nPostal Code: " + postalCode + "\nCredit card number: " + creditCardNumber);
        return new String[] {firstname,lastname,city,postalCode,creditCardNumber};
    }

    public static String[] readPostalCodeFromFile(String filename){
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
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static boolean validateCreditCard(String creditCardNumber){

        // Setting up the int I will use later
        int sumOdd = 0;
        int sumEvenDouble = 0;

        boolean creditCardOrNot = false;


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
        return creditCardOrNot;
    }
    /*
    * This method may be edited to achieve the task however you like.
    * The method may not nesessarily be a void return type
    * This method may also be broken down further depending on your algorithm
    */
    public static void unqiuePassword(String username) throws FileNotFoundException{ 
        File file = new File("../../ID.txt");

        String fileName = "ID.txt"; // 

        File textFile = new File(fileName);
        Scanner reader = new Scanner(textFile);

        int nextInt = reader.nextInt();
        int num = nextInt;

        reader.close();

        if (fileName.length() == 0){                                    // Cannot get the file to start with a zero
            PrintWriter out = new PrintWriter(fileName);
            int zero = 0;
            out.println(zero);
            out.close();
        }

        int i = 1;

        if(num == 0){
            PrintWriter out = new PrintWriter(fileName);
            out.println(i);
            System.out.println("Your ID is: " + i);
            out.close();
        }
        else if (num > i){
            int diff = num - i;
            i = i + diff;

            if (num == i);
            PrintWriter out = new PrintWriter(fileName);
            i++;
            out.println(i);
            System.out.println("Your ID is: " + i);
            out.close();
        }
        else if (num == i){
            PrintWriter out = new PrintWriter(fileName);
            i++;
            out.println(i);
            System.out.println("Your ID is: " + i);
            out.close();
        }
    }
    public static void generateCustomerDataFile(String username) throws FileNotFoundException{
        File file = new File("../../customerDataFile.csv");

        String fileName = "customerDataFile.csv";
        PrintWriter out = new PrintWriter(fileName);

        
        //  customor info & ID
        
        out.println(enterCustomerInfo(););
        out.println(unqiuePassword(username););
        out.close();
    }
    /*******************************************************************
    *       ADDITIONAL METHODS MAY BE ADDED BELOW IF NECESSARY         *
    *******************************************************************/
}