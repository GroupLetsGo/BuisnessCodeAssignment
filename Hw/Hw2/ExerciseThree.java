/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for their name and age.  Output their response.
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseThree {
    public static void main(String[] args ) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("What is your name") ;
        String name = reader.nextLine() ;
        System.out.println("What is your age") ;
        String age = reader.nextLine() ;
        System.out.println("You are " + name + " and you are " + age + " years old.") ;
    }
}
