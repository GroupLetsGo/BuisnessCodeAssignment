/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Password = “happy”
Ask the user for a password.  If password is correct, output “you are logged in” if not, then output “incorrect password”
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseSeven {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Please enter the password");
        String typed = reader.nextLine();
        
        String password = "happy";
        
        if (password.equals(typed)){
            System.out.println("You are logged in");
        }
        else {
            System.out.println("Incorrect Password");
        }
    }
}
