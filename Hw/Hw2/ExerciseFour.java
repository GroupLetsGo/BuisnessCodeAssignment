/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Write a program that asks the user for two numbers.  Add them together and print the result.
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseFour {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Insert the first number") ;
        int num1 = reader.nextInt();
        System.out.println("Insert the second numebr") ;
        int num2 = reader.nextInt() ;
        int sum = num1 + num2 ;
        System.out.println("The sum of the two numbers is " + sum) ;

    }
    
}