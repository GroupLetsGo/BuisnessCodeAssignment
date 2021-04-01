/*
* Date: 2021 March 2nd
* Name: William Wu
* Teacher: Mr.Ho
* Description: Gender game formative assignment
**/

package Assignments.Formative;

import java.util.Scanner;

class GenderGame {
    public static void main(String[] args){
        // Declaring all necessary variables
        Scanner reader = new Scanner(System.in);

        // Prompt user to input values
        System.out.println("What is your gender (M or F): ");
        String gender = reader.nextLine() ;
        System.out.println("What is your first name");
        String firstName = reader.nextLine();
        System.out.println("What is your last name");
        String lastName = reader.nextLine();
        System.out.println("What is your age");
        int age = reader.nextInt();
        // Additional Note: Scanner has a tendency of skipping the next prompt when we are not using 
        // reader.nextLine(). To solve this, we add a reader.nextLine(); that the program can skip instead
        reader.nextLine();

        // Determines if we need a honorific for Mrs. or Ms
        if ((gender.equals("F") && (age >= 20))){
            System.out.println("Are you married " + firstName + "? (y or n)?");
            String marriage = reader.nextLine();
            if (marriage.equals("y")){
                System.out.println("Then I shall call you Mrs." + lastName);
            }
            else if (marriage.equals("n")){
                System.out.println("Then I shall call you Ms." + lastName);
            }
            else {
                System.out.println("Invalid input");
            }
        }
        // Determines if we need a honorific for Mr
        else if ((gender.equals("M") && (age >= 20))){
            System.out.println("Are you married " + firstName + "? (y or n)?");
            String malage = reader.nextLine();
            if (malage.equals("y")){
                System.out.println("Then I shall call you Mr." + lastName);
            }
            else if (malage.equals("n")){
                System.out.println("Then I shall call you " + firstName + " " + lastName);
            }
            else {
                System.out.println("Invalid input");
            }
        } 
        
        // All other cases
        else {
            System.out.println(firstName + " " + lastName);

            reader.close();
        }

    }
    
}
