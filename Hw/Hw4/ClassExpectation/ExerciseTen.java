/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for 5 marks (you must use a for loop) and output the highest mark.
**/

package Hw.Hw4.ClassExpectation;

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int mark;
        int max = 5;

        int high = 0;

        for(int i = 0; i <= max; i++){
            System.out.println("i: " + i);
            System.out.println("Enter a mark");
            mark = reader.nextInt();

            if (mark > high){
                high = mark;
            }
        }
        System.out.println("The highest of the marks is: " + high);
        reader.close();
    }
}
