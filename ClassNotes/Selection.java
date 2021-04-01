/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Creating a program that can make decisions
**/

package ClassNotes;

import java.util.Scanner ;

class Selection {
    public static void main(String [] args) {
        /*
        * Question: If statement
        * Condition: Boolean comparison
        * Outcome: The code inside the {}
        *
        * An if statement executes when the condition is true
        * When the condition is not true, the code inside the {} is skipped
        * if (condition) {
        *       Execute Code;
        * }
        * Else statements are executed when the most recent if statement does not execute  
        * Else statemnets are skipped when the most recent if statment is executed
        * Else statements work like the word "otherwise" in the english language
        * Else statements do NOT have conditions
        * else {
        *      Execute code    
        * }
        */ 

        int age = 16 ;
        // What code is inside this if statement
        System.out.println("You are " + age + " years old") ;

        //Allows the user to drive if they are over the age of 16 or over
        if (age >= 16) {
            System.out.println("You are old enough to drive") ;
        }
        else {
            System.out.println("You are too young to drive") ;
        }

        System.out.println("End of Program") ;
    }
}
