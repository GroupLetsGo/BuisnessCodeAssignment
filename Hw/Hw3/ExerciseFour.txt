/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description:  Ask the user for a number.  If it is 66 say “you got it” otherwise say “guess again”
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseFour {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in) ;
        System.out.println("Enter a number") ;
        int num = reader.nextInt() ;
        if (num == 66) {
            System.out.println("You got the number!") ;
        }
        else {
            System.out.println("Guess again") ;
        }
    }
}
