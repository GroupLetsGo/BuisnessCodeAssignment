/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for 3 marks (you must use a for loop) and output the average of the three marks.
**/

package Hw.Hw4.ClassExpectation;

import java.util.Scanner;

class ExeciseNine {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int mark; 
        int max = 3; // Run 3 times
        int sum = 0; // Accumlator

        int min = 1000; // Any mark is guarenteed to be lower than this starting value

        for (int i = 0; i < max; i++){
            System.out.println("i: " + i);
            System.out.println("Type a mark");
            mark = reader.nextInt();
            sum = sum + mark;
            // Find the total of the numbers between 0 and 5

            if (mark < min){
                min = mark;
            }
        }
        double avg = 1.0*sum/max;
        System.out.println("The average is " + avg);
        reader.close();
    }
}

