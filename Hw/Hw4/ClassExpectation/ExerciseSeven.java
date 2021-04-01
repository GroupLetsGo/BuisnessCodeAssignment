/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for an integer at which to start counting.  Ask the user for an integer at which to stop counting.  Count from start up to stop by 1s.
**/

package Hw.Hw4.ClassExpectation;

import java.util.Scanner;

class ExerciseSeven {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("At what integer would you like to start counting");
        int start = reader.nextInt();
        System.out.println("At what integer would you like to stop counting");
        int end = reader.nextInt();
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }
    }
}
