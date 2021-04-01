/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that asks for the user's name and prints it in reverse order. You do not need to create a separate method for this.
**/

package Hw.Hw6;

import java.util.Scanner;

class ExerciseTen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = reader.nextLine();
        printAllCharacters(name);
    }
    public static void printAllCharacters(String name){
        int len = name.length();
        for(int i = len - 1; i > -1; i--){
            System.out.println("character: " + name.charAt(i));
        }
    }
}
