/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that prints the first part of a word. The program asks the user for the word and the length of the first part. Use the substring method in your program.
**/

package Hw.Hw6;

import java.util.Scanner;

class ExerciseEleven {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length fo the first part: ");
        int wordLength = reader.nextInt();
        String newString = word.substring(0, wordLength);
        System.out.println("Result: " + newString);
    }
}
