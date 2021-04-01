/*
* Date: 2021 Feb 19th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Take in user Inputs and output them
**/

package ClassNotes ;
// Use a package called scanner in order for the program to take in user inputs
// Import statements must be done outside of our class
import java.util.Scanner ;
// W/o this, scanner cannot operate
class UserInputs {
    public static void main(String[] args) {
        // Initialize the scanner before using it
        // Your program only needs one scanner

        Scanner reader = new Scanner(System.in) ;

        int x = 10 ;
        // One equal sign assigns the value to a variable name
        int y = 4 ;
        //Booleans ; true or false, one or zero, yes or no
        boolean on = true;
        boolean off = false;

        // Boolean comparison
        System.out.println("Is " + x + " greater than " + y + "?") ;
        System.out.println(x>y) ;
        System.out.println("Is " + x + " less than " + y + "?") ;
        System.out.println(x<y) ;
        System.out.println("Is " + x + " exactly equal to " + y + "?") ;
        // Two equal signs is a comparison and checks whether the values are the same
        System.out.println(x==y) ;
        System.out.println("Is " + x + " Not equal to " + y + "?") ;
        // The exclamtaion mark means NOT in programming
        System.out.println(x!=y) ;
    }
}























        
        int x = 10 ;

        int y = 4;
        
        System.out.println("The sum of " + x + "and" + y + "is" + (x+y));
        System.out.println("The difference of " + x + "and" + y + "is" + (x-y));
        System.out.println("The product of " + x + "and" + y + "is" + (x*y));
        System.out.println("The quotient of " + x + "and" + y + "is" + (1.0*x/y));
        // Modulus: Determines the remainder of a divison
        System.out.println("The remainder of " + x + "divided by" + y + "is" + (x%y));
    }
}




















        /*
        *A string output program
        * */
        // dataType variableName = value;
        // Prompt the user to enter their name      
        System.out.println("What is your name") ;
        Scanner reader = new Scanner(System.in) ;
        // Save the user's input under a String variable called name
        String name = reader.nextLine() ;

        //Prompt the user to input their age
        System.out.println("How old are you") ;
        int age = reader.nextInt() ;

        System.out.println("Welcome " + name) ; 
        System.out.println("This year you are " + age + "years old") ;
        System.out.println("Next year you are " + (age + 1) + "years old") ;
        // If want to do math with age, u need to use BEDMAS, put brackets

        reader.close() ;
    }
    
}

