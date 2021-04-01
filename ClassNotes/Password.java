/*
* Date: 2021 Feburary 24th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Verifies password and username using string comparison and *nesting
**/

package ClassNotes;

import java.util.Scanner ;

class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in) ;
        // Defin our username and password
        String correctUsername = "teacher" ;
        String correctPassword = "password" ;

        // Prompt Username and Password
        System.out.println("What is the username") ;
        // String username = "teacher" ;
        String username = reader.nextLine() ;
        System.out.println("What is the password") ;
        String password = reader.nextLine() ;

        System.out.println("Username: " + username) ;
        System.out.println("Password: " + password) ;

        // For a successful login, both the username AND password must be correct
        // Condition1: username is corecr
        // Condition2; pwd is correct
        /*
        * In java, string to string comparisons are not done using ==
        * Instead they use the .euqals() method
        *
        * So to compare two strings against each other, we follow the format
        * stringOne.equals(stringTwo)
        */
        if((username.equals(correctUsername)) && (password.equals(correctPassword))){
            System.out.println("Successful Login");
        }
        else {
            System.out.println("Unsuccessful");
        }
        /*
        if (username.equals(correctUsername)) {
            System.out.println("This is the correct username") ;
            // Nesting an if statement means to place the if statement WITHIN 
            // ANOTHER if statement
            if (password.equals(correctPassword)) {
                System.out.println("You have logged in") ;
            }
            else {
                System.out.println("The login is unseccessful") ;
            }
        }
        else {
            System.out.println("The login is unseccessful") ;
        }
        */


        System.out.println("The program ends") ;
        reader.close() ;
    }
}
