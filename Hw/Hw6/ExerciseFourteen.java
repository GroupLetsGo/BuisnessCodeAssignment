/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create the method reverse that puts the given string in reversed order. Use the following program body for the method:
**/

package Hw.Hw6;

import java.util.Scanner;

class ExerciseFourteen {
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