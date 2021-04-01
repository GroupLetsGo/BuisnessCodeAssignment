/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for a secret number.  Ask another user (assume that the user cannot see the secret number on the screen) for a number.  If the number matches the secret number, say “you got it” otherwise say “guess again”.  
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseFive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Please enter a secret number") ;
        int secret = reader.nextInt() ;
        System.out.println("Please guess the secret number") ;
        int guess = reader.nextInt() ;
        if (secret == guess) {
            System.out.println("You got it!") ;
        }
        else {
            System.out.println("Guess again") ;
        }
    }
}
