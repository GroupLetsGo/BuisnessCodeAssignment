/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for their first name and last name.  Print Hello firstname lastname! How are you?
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseNine {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Please give me your first and last name, dont forget the space in between") ;
        String name = reader.nextLine() ;
        System.out.println("Hello " + name + ", how are you?!") ;
    }
    
}
