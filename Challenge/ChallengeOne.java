/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: First turn print a random num between 75-100. Second run, print a random number between 5-70
* Between each run the program should not be edited
**/

package Challenge ;

import java.util.Random ;
import java.util.Scanner ;

class ChallengeOne {
    public static void main(String[] args) {
        
        //initialize random
        Random rand = new Random() ;
        // Initialize Scanner
        Scanner reader = new Scanner(System.in) ;
        // Generate a number from 0 to 100
        // min is 75
        // int min = 75;
        System.out.println("What is the minimum?") ;
        int min = reader.nextInt() ;
        // max is 100
        // int max = 100;
        System.out.println("What is the max?") ;
        int max = reader.nextInt() ;

        // Hardcoding is when values in your code are fixed
        // 25 and 75 are hardcoded values in this line of code
        int randNum = rand.nextInt(max-min) + min ;
        // Just minus max by min and put the answer as the max        
        
        System.out.println("A random number between the given range is " + randNum) ;
        reader.close() ;
    }
}
