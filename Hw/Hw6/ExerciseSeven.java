/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that asks for the user's name and gives the last character.
**/

package Hw.Hw6;

import java.util.Scanner;

class ExerciseSeven {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in your name");
        String name = reader.nextLine();
        System.out.println("Last character: ");
        lastLetter(name);
    }
    public static void lastLetter(String name){
        int len = name.length();
        int lastName = len - 1;
        System.out.println(name.charAt(lastName));
    }
}