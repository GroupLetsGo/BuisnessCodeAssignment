/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that asks for the user's name and gives its first, second and third characters separately. If the name length is less than three, the program prints nothing. You do not need to create methods in this exercise.
**/

package Hw.Hw6;

import java.util.Scanner;

class ExerciseEight {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = reader.nextLine();
        firstThree(name);
    }
    public static void firstThree(String name){
        int len = name.length();
        if (len >= 3){
            for (int i = 0; i < 3; i++){
                System.out.println("character: " + name.charAt(i));
            }
        }
        else{
            System.out.println();
        }
    }
}
