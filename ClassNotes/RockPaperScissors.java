/*
* Date: 2021 March 1st
* Name: William Wu
* Teacher: Mr.Ho
* Description: Diagnose and debug problems involving 
**/

package ClassNotes;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        /*
        * Syntax Errors: An error that causes the program not to run or compile
        * This is often caused by a missing symbol like a semi colon, missing bracket, incorrect capitlization
        * spelling error, etc...
        * Syntax errors are often spotted by the compiler and will raise an error message
        *
        * To fix a syntax error: Follow the error message of the compiler
        * Look at lies above and below the error message to spot missing brackets or quotes
        * If all else fails, read your code line by line
        *
        * To "avoid" syntax errors:
        * Compile and run frequently
        */

        /*
        * Logic Error: The program runs, but outputs the wrong result
        * The error will not cause issues compiling, but often this is a result of an incorrect equation
        * caculation, comparison, or logical operator
        *
        * To find and fix a logic error: Run the program immediatly after a new few feature is created
        * YOu must test for all cases exhaustively and comphrehensively (Scenario analysis/ Unit testing)
        * When the computer plays rock/paper/scissors
        * Also need to test invalid input and the extremas (max/mins)
        */

        /*
        * Run Time Error: An error that occurs mid execution of the program due to some interal process
        * Example would be divison by zero
        *
        * num1 = reader.nextInt() // 5
        * num2 = reader.nextInt() // 0
        *
        * System.out.println("num1/num2") // this print statement errors out because we cannot divide by zero
        *
        * To address run time error, we will need a lesson that we will cover in the future
        * In the mean time,  we will likelyt just put additional if statements to reject these potential outcomes
        */

        // Set user and computer plays
        String user = "rock";
        String comp = "paper";

        // Ties
        if(user.equals(comp)){
            System.out.println("Tie.");
        }
        // Loses
        else if (user.equals("rock") && comp.equals("paper")){
            System.out.println("Lose!");
        }
        // Wins
        else{
            System.out.println("Win");

        reader.close();
        }
    }
    
}
