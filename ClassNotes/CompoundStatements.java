/*
* Date: 2021 Feb 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Having selection statements with multiple conditions
**/

package ClassNotes;

class CompoundStatements {
    public static void main(String[] args) {
        /*
        * Compound statements have multiple conditions
        * Depending on the type of statement, the conbination will determine whether the
        * statement executes
        *
        * In Java, AND statements are: &&
        * In Java, OR statements are:  ||
        * 
        * if ( (condition 1) && (condition 2) ) {
        *   // BOTH condition1 and condition2 must be true for this code to execute
        *   Execute Code;
        * }
        * if (  (condition1) || (condition2)  ){
        *   // Either condition1 needs to be true or condition2 needs to be true
        *   // For this code to execute
        *   Execute Code;
        * }
        */



        // Creat a number guessing game for numbers between 1 to 10
        int answer = 6;
        int guess = 7;
        System.out.println("You guessed: " + guess);

        // Removing invalide guesses
            // Condition1: when the numbers are greater than 10
            // Condition2: guess is less than 1 
            if ( (guess > 10 ) || (guess < 1) ){
                System.out.println("Invalid number");
        }
        // Considsering guesses that are too large or too small
        // Condition1; guess is greater than ans
        // Condition2; guess is less than ans
        else if (    (guess > answer) || (guess < answer)     ) {
            System.out.println("This guess is not correct") ;
        }
        // Getting the correct guess
        else {
            System.out.println("This is correct");
        }
    }
}
