/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Given number from user, calculate the sum of all number between 1 and given number
**/

package Hw.Hw4.Extra;

import java.util.Scanner;

class ExerciseTwo {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = reader.nextInt();
    
        int count = 0;
        int sum = 0; 

        for (;num != 0; num /= 10, ++count) {
            sum = sum + count;    
        }
        
        System.out.println("The sum from 1 to" + num + " is : " + (sum));
        }
}