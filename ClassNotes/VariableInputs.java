/*
* Date: 2021 Feb 17th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Creat Variables and Taking User Inputs
**/

package ClassNotes;

class VariableInputs {
    public static void main(String[] args) {
        /*
        * When programming, data is stored in memory within something called a Variable
        * A Variable has 3 characters: Name, value, and a datatype
        * A data type determines the properties the variable has
        * 
        * To declare a Variable, we follow the format :
        * dataType variableName = value;
        *
        **/

        /*
        * Data Type |   Description                             |   Examples
        * String    |   A collection of characters              | "Brid", "word"
        *               A string is always between a set of " " | "100 Donald Sim Ave."
        * Integers  |   Any Whole Number                        | -10, 0, 5, 1999
        * Doubles   |   Any real number (decimal)               | 3.14, 1.0
        **/

        System.out.println("Hello World") ;

        // Creat a String Variable called greet
        // It's value is going to be Hello World

        String greet = "Hello World" ;
        String name = "Student" ;
        // Tell the computer to access it's memory and print out the value stored in the variable called greet
        System.out.println("Printing out a String variable") ;
        System.out.println(greet+name) ;
        // This greet doesnt not need these -> ""
        // When you add a string, you put the strings together

        // Creat an integer value called num
        // It's value is 10
        int num = 10;
        int num2 = 15;
        System.out.println("Printing out an integer variable") ;
        System.out.println(num+num2) ;
        // When you add a integer, you add the numbers together

        System.out.println("Operation with Integers") ;
        System.out.println(num-num2) ;
        System.out.println(num*num2) ;

        // In Java, the division of an integers with another integer outputs an integer 
        System.out.println(num/num2) ;
        System.out.println(num2/num) ;
        
        // Create two double variables 
        double a = 10.0;
        double b = 15.0;

        System.out.println("Math with Doubles") ;
        System.out.println(a/b);
        System.out.println(b/a);

        // To do math with integers and get a double as a result, we need to convert
        // Multiplication and Division of integers with doubles output doubles

        double ans = 1.0*num/num2;
        System.out.println("The answer is " + ans) ;



    }
}
