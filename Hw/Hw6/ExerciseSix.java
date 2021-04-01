/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that asks for the user's name and gives the first character.
**/

package Hw.Hw6;

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your name");
        String name = reader.nextLine();
        System.out.println("First character: ");
        firstLetter(name);
    }
    public static void firstLetter(String name){
        System.out.println(name.charAt(0));
    }
}
