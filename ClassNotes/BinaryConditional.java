/*
* Date: 2021 Feburary 24th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Using Else If to create a singular output
**/

package ClassNotes;

import java.util.Scanner ;

class BinaryConditional {
    public static void main(String[] args) {
        /*
        * We are going to create a program that tells us the letter grade based on what mark weget
        *
        * 80-100 --> A
        * 70-79 --> B
        * 60-69 --> C
        * 50-59 --> D
        * less than 50 --> F
        */

        // Initializing the Scanner
        Scanner reader = new Scanner(System.in) ;

        // Promp the user to input their mark
        System.out.println("What is your mark");
        int mark = reader.nextInt();
        System.out.println("The mark you inputted was: " + mark);


        //Checks for invalid value
        if (mark > 100) {
            System.out.println("You clearly hacked the system. Nice try.") ;
        }

        // Check to see if the user got an A
        else if (mark >= 80) {
            System.out.println("You got an A");
        }
        /*
        * An else if statment works both as an if statement and else statement
        * Like an else statement, when the most recent if statement executes, the else if 
        * Statement is skipped
        * When the previous if statement does NOT execute, java will then check the vondition of the
        * "else if" statement, making it act like an if statement
        */

        // Check to see if the user got an B
        else if (mark >= 70) {
            System.out.println("You got an B");
        }
        // Check to see if the user got an C
        else if (mark >= 60) {
            System.out.println("You got an C");
        }
        // Check to see if the user got an D
        else if (mark >= 50) {
            System.out.println("You got an D");
        }
        // Check to see if the user got an F
        else if (mark >= 0) {
            System.out.println("You got an F") ;
        }
        // Check for negative marks entered
        else {
            System.out.println("A negative mark is quite suspicious") ;
        }

        reader.close() ;
    }
}
