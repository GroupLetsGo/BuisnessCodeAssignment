/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Modify the previous problem so that the line number is also printed.
**/

package Hw.Hw4.ClassExpectation;

import java.util.Scanner;

class ExerciseSix {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = reader.nextLine();
        System.out.println("Please tell me how many times you want to print this word");
        int times = reader.nextInt();
        for(int i = 0; i < times; i++){
        System.out.println(i+1 + "." + word);
    }
}
}