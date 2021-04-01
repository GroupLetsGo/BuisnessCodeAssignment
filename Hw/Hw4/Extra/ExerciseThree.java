/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: 
**/

package Hw.Hw4.Extra;

import java.util.Scanner;

class ExerciseThree {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = reader.nextInt();

        int count = 0;

        for (;num != 0; num /= 10, count++) {
        }
    
        System.out.println("The number of digits is: " + (count));
        }
}