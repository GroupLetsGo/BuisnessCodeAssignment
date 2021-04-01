/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: You are investing money (principal) for a certain rate (%) for a number of years (time).  The program then calculates the interest you would earn.
* Recall:  I = P*R*T (if the user types 15%, then your formula must use 0.15)
* Prompt the user to enter the money they are investing, get the input and store it. Prompt and get the interest rate, the number of years they are investing their money as well. 
* Your program should output the interest earned in the years given and the total amount of money they will get back.
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseEight {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;

        System.out.println("This is a system that can calculate your interest and new money after the investemnt") ;

        System.out.println("What is the amount you are investing") ;
        int money = reader.nextInt() ;
        System.out.println("Please enter the interest rate in percents (Do not type the % sign) ") ;
        int interest = reader.nextInt() ;
        double real = 0.01*interest ;

        System.out.println("Please enter the number of years your will be investing") ;
        int time = reader.nextInt() ; 

        double profit = real*time*money ;

        System.out.println("Your interest in " + time + " years will be " + profit) ;
        System.out.println("Your total money over " + time + " years is " + ( money + profit)) ;

        reader.close() ;
        
    }
    
}
