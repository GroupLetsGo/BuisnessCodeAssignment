/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Modify the previous problem so that the lowest mark is displayed.
**/

package Hw.Hw4.ClassExpectation;

import java.util.Scanner;

class ExerciseEleven {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int mark;
        int max = 5;

        int low = 101;

        for (int i = 0; i < max; i++){
            System.out.println("i: " + (i+1));
            System.out.println("Please enter a mark");
            mark = reader.nextInt();
            if (mark < low){
            low = mark;
        }
    }
    System.out.println("The lowest mark is: " + low);
    }
}
