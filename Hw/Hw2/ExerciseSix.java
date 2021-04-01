/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Write a program that will ask users to input 2 integers and then output the sum, difference, product, quotient and the remainder (remember to use / and %).
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseSix {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Input any two numbers and you will get their sum, difference, quotient, product, and the remainder") ;
        System.out.println("Insert the first number") ;
        int num1 = reader.nextInt() ;
        System.out.println("Insert the second number") ;
        int num2 = reader.nextInt() ;
        int sum = num1+num2 ;
        int difference = num1-num2 ;
        double quotient = 1.0*num1/num2 ;
        int product = num1*num2 ;
        double remainder = 1.0*num1%num2 ;
        System.out.println(num1 + "+" + num2 + "=" + sum) ;
        System.out.println(num1 + "-" + num2 + "=" + difference) ;
        System.out.println(num1 + "/" + num2 + "=" + quotient) ;
        System.out.println(num1 + "x" + num2 + "=" + product) ;
        System.out.println(num1 + "/" + num2 + " remainder is " + remainder) ;
    }
    
}
