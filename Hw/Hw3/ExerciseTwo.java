/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description:  Ask for a mark.  If the mark is >= 50 state “you passed”
* If the mark is <50 say “sorry you failed”. 
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseTwo {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Input your mark") ;
        int mark = reader.nextInt() ;
        if (mark >= 50 ) {
            System.out.println("You passed") ;
        }
        else {
            System.out.println("You failed") ;
        }
    }
}
