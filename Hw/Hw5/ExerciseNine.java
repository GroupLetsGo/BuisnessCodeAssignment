/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Enter a word.
* (pretend that you do not know the word.)
* Ask the user to guess the word.
* If the word is not the same, print “Wrong guess again”
* Your program should go back to the start of the while loop and ask the user to guess again.
**/

package Hw.Hw5;

import java.util.Scanner;

class ExerciseNine {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
    
        String word, guess;
        boolean login = false;

        System.out.println("Please enter any word");
        word = reader.nextLine();

        while(login == false){

        System.out.println("Please guess the word");
        guess = reader.nextLine();

        if (guess.equals(word)){
            System.out.println("You guessed the word!");
            login = true;
        }
        else {
            System.out.println("Invalid input");
        }
    }
        reader.close();
    }
}
