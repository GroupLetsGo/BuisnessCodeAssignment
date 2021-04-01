/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for the number of times to print the word Hello 
(between 1 and 5).  Then print the following on separate lines:   
If the user entered 1, print Hello once
If the user entered 2, print Hello twice
If the user entered 3, print Hello three times  …

SAMPLE RUN:
Enter a number: 2
Hello
Hello
**/

package Hw.Hw3;

import java.util.Scanner;

class ExerciseTen {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Pick a number between (1-5) for the number of times the system will print the word 'Hello' ") ;
        int num = reader.nextInt() ;
        if (num == 1) {
            System.out.println("Hello") ;
        }
        else if (num == 2) {
            System.out.println("Hello") ;
            System.out.println("Hello") ;
        }
        else if (num == 3) {
            System.out.println("Hello") ;
            System.out.println("Hello") ;
            System.out.println("Hello") ;
        }
        else if (num == 4) {
            System.out.println("Hello") ;
            System.out.println("Hello") ;
            System.out.println("Hello") ;
            System.out.println("Hello") ;
        }
        else if (num == 5) {
            System.out.println("Hello") ;
            System.out.println("Hello") ;
            System.out.println("Hello") ;
            System.out.println("Hello") ;
            System.out.println("Hello") ;
        }
    }
}
