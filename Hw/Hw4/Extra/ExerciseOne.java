/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Print the following pattern
* 1 
* 1 2 
* 1 2 3 
* 1 2 3 4 
* 1 2 3 4 5
**/

package Hw.Hw4.Extra;

import java.util.Scanner;

class ExerciseOne {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int height;

        System.out.println("How may lines of this patter below would you like to print?");
        System.out.println("1");
        System.out.println("1 2");
        System.out.println("1 2 3...");
        height = reader.nextInt();

        for (int i = 0; i < height; i++){
            for (int j = 0; j <= i; j++){
            System.out.print(j+1);
            System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}