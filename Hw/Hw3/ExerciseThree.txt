/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description:  Ask for a temperature.  State:
* >30		hot
* 20-30		comfortable
* 10-19 		cool
* <=9		cold
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseThree {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("What is the temperature?");
        int temp = reader.nextInt() ;
        if (temp > 30){
            System.out.println("Wow it is hot");
        }
        else if (temp >= 20 && temp <= 30){
            System.out.println("The temperature is comfortable today");
        }
        else if (temp >= 10 && temp <= 19){
            System.out.println("The temperature is cool today");
        }
        else if (temp <= 9){
            System.out.println("It is pretty cold");

            reader.close() ;
        }
    }
}
