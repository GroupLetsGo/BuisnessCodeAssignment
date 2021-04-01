/*
* Date: 2021 Feb 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Conditional Loops with random number generator and password
**/

package ClassNotes;

import java.util.Scanner;

class WhileLoop {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        /*
        * For loops
        * Are used when we know the number of iterations our loop should run
        * We are expecting the code to finish after a certain number of times
        * For loops are almost always terminate
        *
        * While loops (conditional loops)
        * Are used when we do NOT know the number of iterations needed to finish the program
        * While loops require us to know the condition needed to exit out of the loop
        *
        * In java, a while loop has the structure
        * 
        * while (condition){
        *   Execute Code;
        * }
        *
        * Important: Make sure that the body of the while loop is able to change
        * the condition that the while loop has within it
        */

        String user, pwd;
        boolean login = false;
        String correctUser = "teacher";
        String correctPwd = "123";

        while (login == false){
        System.out.println("What is your username");
        user = reader.nextLine();
        System.out.println("What is your password");
        pwd = reader.nextLine();

        if (user.equals(correctUser) && pwd.equals(correctPwd)){
            System.out.println("You have logged in");
            login = true;
            //break;
        }
        else{
            System.out.println("Invalid Entry");
        }
    }
        reader.close();
    }
}


/*

        // Number Guessing Game
        int guess = -1;
        int answer = 5;

        while (guess != answer){
            System.out.println("Guess a number from 1 to 10");
            guess = reader.nextInt();
        }
        System.out.println("Outside of loop");
        

        reader.close();
    }
}

*/
