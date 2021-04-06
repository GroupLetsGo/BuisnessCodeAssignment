package Assignments.Summative.MethodAssignment;

import java.util.Scanner;

class CustomerCreditCardValidation {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int sumOdd = 0;
        int sumEvenDouble = 0;
        int oddDigit;
        int evenDigit;
        int sumEven = 0;
        boolean creditCardOrNot;

        System.out.print("please enter your credit card number: ");
        String creditCardNumber = reader.nextLine();

        // Check for length of credit card
        int len = creditCardNumber.length();

        // If credit card is 9 digits or greater it passed the first step
        if (len >= 9){
            // Converts the credit card STRING number to INT number
            int mathCCN = Integer.parseInt(creditCardNumber);

            // Sets credit card number in reverse order
            // i represents the reversed card number
            for(int i = len; i > 0; i--){
                // If the reversed number is odd
                
                if (i%2 != 0){
                    oddDigit = i;
                    sumOdd = sumOdd + oddDigit;
                }
                
                // If the reversed number is even
                else{
                    evenDigit = i;
                    sumEven = sumEven + evenDigit;
                    int doubleI = 2*evenDigit;

                    while (doubleI > 0) {
                        sumEvenDouble = sumEvenDouble + doubleI % 10;
                        doubleI = doubleI / 10;
                    }   
                    
                    if (sumEvenDouble % 10 == 0){
                        creditCardOrNot = true;
                    }
                    else{
                        creditCardOrNot = false;
                    }
                }
            }
            if (creditCardOrNot = true){
                System.out.println("True");
            }
            else if (creditCardOrNot = false){
                System.out.println("False");
            }
        }
        else{
            // reinput
        }
    }
}