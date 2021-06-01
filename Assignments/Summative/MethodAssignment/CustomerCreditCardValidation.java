package Assignments.Summative.MethodAssignment;

import java.util.Scanner;

class CustomerCreditCardValidation {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        int evenDigit;
        int sumOdd = 0;
        int sumEvenDouble = 0;
        int sumEven = 0;
        
        boolean creditCardOrNot;

        System.out.print("please enter your credit card number: ");
        String creditCardNumber = reader.nextLine();

        // Check for length of credit card
        int len = creditCardNumber.length();

        // If credit card is 9 digits or greater it passed the first step
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
                    evenDigit = 2*i;

                    while(evenDigit > 0){
                        sumEvenDouble = sumEvenDouble + evenDigit%10;
                        evenDigit = evenDigit / 10;
                    }
                }
            }
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
        // If the credit card number is less than 9, then this card is fake
        else{
            System.out.println("The card is fake");
        }
    }
}


        