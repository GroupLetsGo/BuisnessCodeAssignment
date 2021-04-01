/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for any number.  Print two times the number
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseFive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Input any number, the output will be doubled the number") ;
        int num = reader.nextInt() ;
        System.out.println("Two times the number is " + 2*num) ;
    }
}
