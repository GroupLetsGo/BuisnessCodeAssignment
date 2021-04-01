/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for 5 numbers (you must use a for loop).  Output the sum of the 5 numbers. (hint: use an accumulator)
**/

package Hw.Hw4.ClassExpectation;

import java.util.Scanner;

class ExerciseEight {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int mark; 
        int max = 5; // Run 3 times
        int sum = 0; // Accumlator

        for (int i = 0; i < max; i++){
            System.out.println("i: " + (i+1));
            System.out.println("Type in a mark");
            mark = reader.nextInt();
            sum = sum + mark;
        } 
        System.out.println("The sum of the five marks are: " + sum);

    reader.close();
    }
}


