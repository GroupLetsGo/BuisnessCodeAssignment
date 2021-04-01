/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for a number between 1 and 10.  If the value is larger than or equal to 5, then output the words “You won!”.
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseOne {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Please enter a number between 1 and 10") ;
        int num = reader.nextInt() ;
            if (num >= 5) {
                System.out.println("You won") ;
            }
            else {
                System.out.println("You lost") ;
            }
    }
}
