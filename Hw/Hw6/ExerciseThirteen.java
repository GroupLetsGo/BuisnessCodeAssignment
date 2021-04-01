/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create a program that asks the user for two words. Then the program tells if the second word is included in the first word. Use String method indexOf in your program.
**/

package Hw.Hw6;

import java.util.Scanner;

class ExerciseThirteen {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String firstWord = reader.nextLine();
        System.out.print("Type the second word: ");
        String secondWord = reader.nextLine();
        System.out.println(checkString(firstWord, secondWord));
    }
    public static boolean checkString(String parent, String child){
        // search of if child is in parent
        int index = parent.indexOf(child);

        if (index >= 0){
            return true;
        }
        else{
            return false;
        }
    }
}
