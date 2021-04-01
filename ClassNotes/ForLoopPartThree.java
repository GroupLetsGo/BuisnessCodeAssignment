/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Using Jump Statements when Looping
**/

package ClassNotes;

import java.util.Scanner;

class ForLoopPartThree {
    public static void main(String[] args){
        int max = 10;

        for (int i =0; i <= max; i++){ 
            
                // Print all even number between 0 and 10
                if (i%2 != 0){ // Modulus finds the remainder. Anything prefectly divisible by 2 is even and has no R
                continue; // continue skips this iteration and moves on to the next iteration
            }
            // Down herem we have some sort of code that we only need to execute on even runs
            System.out.println("i: " + i);
        }
    }
}

/*

int max = 5;

for (int i = max; i >= 0; i--){
    System.out.println(i);
}
// To show here is the outside of loop, not loop anymore
System.out.println("Outside of Loop");

*/

/*

    Scanner reader = new Scanner(System.in);
        int mark; 
        int max = 3; // Run 3 times
        int sum = 0; // Accumlator

        int min = 1000; // Any mark is guarenteed to be lower than this starting value

        for (int i = 0; i < max; i++){
            System.out.println("i: " + i);
            System.out.println("Type in a mark");
            mark = reader.nextInt();
            sum = sum + mark;
            // Find the total of the numbers between 0 and 5

            if (mark < min){
                min = mark;
            }
        }
        System.out.println("The lowest mark was " + min);
        double avg = 1.0*sum/max;
        System.out.println("The average is " + avg);
        // To show here is the outside of loop, not loop anymore
        System.out.println("Outside of Loop");
        reader.close();

*/

/*

int max = 10;
        for (int i = 0; i <= max; i++){
            // Print statement must be above break if you want this print statement
            // to work
            System.out.println("i: " + i);
            // Have the code exit when i is 5
            if (i == 5){
                System.out.println("Terminated at 5");
                break;    // Break will exit out of the current loop
                // Code loops ten times but exits out of loop at 5 times
            }
        }
        System.out.println("Outside of loop");

*/