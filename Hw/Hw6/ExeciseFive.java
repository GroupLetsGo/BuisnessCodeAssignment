/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that asks for the user's name and says how many characters the name contains.
**/

package Hw.Hw6;

import java.util.Scanner;

class ExeciseFive {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String word = reader.nextLine();
        System.out.println();
        int cal = nameLength(word);
        System.out.println("Number of characters: " + cal);
    }
    public static int nameLength(String word){
        int len = word.length();
        return len;
    }
}
