/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Do while loops
**/

package ClassNotes;

import java.util.Scanner;

class PatternPartTwo {
    public static void main(String[] args){
        // Your program must depend on the varibale called height
        
        int height;
        Scanner reader = new Scanner(System.in);

        do{
            System.out.println("How tall do you want your pyramid?");
            System.out.println("Type -1 to exit");
            height = reader.nextInt();  

        // i loop
        // This loop is responsible for printing the number of lines
        for (int i = 0; i < height; i++){
            // j loop
            // This j loop is responsible for the content with in each line
            for (int j = 0; j <= i; j++){
            System.out.print(j+1);
            System.out.print(" ");
            // System.out.print = print on one line
            // System.out.println = print on seperate lines
            }
            // Outside of the J loop
            System.out.println(); // This allows the next iteration to be on the next Line
            }
        }while (height > 0);
    }
}
