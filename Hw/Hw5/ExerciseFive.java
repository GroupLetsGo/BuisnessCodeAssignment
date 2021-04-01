/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: 1-6.  Modify For1, For2, For3, For4, For5, and For6 (from the for loop assignment) so that a while loop is used.
**/

package Hw.Hw5;

import java.util.Scanner;

class ExerciseFive {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int max;
        int i = 0;
        String word;

        System.out.println("Please enter a word");
        word = reader.nextLine();
        System.out.println("How many times would you like to input it?");
        max = reader.nextInt();

        while(i != max){
        i++;
        System.out.println(word);
        }
        reader.close();
    }
}
