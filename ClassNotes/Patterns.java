/*
* Date: 2021 Feburary 24th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Nesting loops
**/

package ClassNotes;

import java.util.Scanner;

class Patterns {
    public static void main(String[] args){
        // Your program must depend on the variable called height
        Scanner reader = new Scanner(System.in);
        int height;
        String symb = "*";

        System.out.println("How may lines of this patter below would you like to print?");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***...");
        System.out.println("Please enter...");
        height = reader.nextInt();
        
        // i loop
        // This loop is responsible for printing the number of lines
        for (int i = 0; i < height; i++){
            System.out.println("i: " + (i+1));
            // j loop
            // This j loop is responsible for the content with in each line

            for (int j = 0; j <= i; j++){
            System.out.print(symb);
            System.out.print(" ");
            
            // System.out.print = print on one line
            // System.out.println = print on seperate lines
            }
            
            // Outside of the J loop
            System.out.println(); // This allows the next iteration to be on the next Line
        }
    }
}