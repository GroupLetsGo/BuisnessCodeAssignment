/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Reverse a given integer number
**/

package Hw.Hw4.Extra;

import java.util.Scanner;

class ExerciseNine {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a integer");
        int num = reader.nextInt();

        do{
            System.out.print(num%10);
            num = num/10;
        } while (num > 0);

        reader.close();
    }
}
