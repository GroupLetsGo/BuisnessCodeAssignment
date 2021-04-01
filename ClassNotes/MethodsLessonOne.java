/*
* Date: 2021 March 24 2021
* Name: William Wu
* Teacher: Mr.Ho
* Descriptino: Creating subprograms in Java
**/

package ClassNotes;

class MethodsLessonOne {
    public static void main(String[] args){
        // Creat a program that adds three to a number
        int num = 5;
        System.out.println("First print " + num);

        num = num + 3; // or num += 3
        System.out.println("Second print " + num);

        // Call the addThree method
        // When we were calling the addThree method, it was past the 5 and 8, so 8 enters as x and adds 3 to become 11
        System.out.println(addThree(num));

        helloWorld(3); // Calling the helloWorld method
        System.out.println();
        // OUTPUT = RETURN
        // Methods can be called unlimited times, is reusable
        helloWorld(10);
    }    
    /*
    * Description - Adds three to a number that is passed through it
    *
    * @param x -integer value from1 to 100
    * @return - A number three greater than the parameter

    // Adds three to a given number
    // Method names should be easy to understand
    // Methods that return things are know as 
    //    * Functional Methods : return a value back to main
    //        - Could be public static int/String/boolean/double, can output alot of things as well as inputing alot of things as parameter
    
    */
    public static int addThree(int x){
        return x + 3;
    }

    // Example of a void method that prints hello world x number of times
    // This is an example of 
    //    Procedural Methods: Have no returns and therefore have a void "output data type"
    public static void helloWorld(int x){
        for (int i = 0; i < x; i++){
            System.out.println("Hello World");
        }
    }

    // Methods are done outside of the main

    /*
    * A method is a subprogram meant to be reused or shorten the code WITHIN the MAIN
    * A method should be specific and only complete/do one thing
    * A method for the nim game could be the rows input or checking for invalide input
    * IT CANNOT BE BOTH
    * 
    * The purpose of methods is to...
    *       1) Reusibility
    *       2) Shorten the main or make the main less complicated
    *       3) Dividing up the problem/program (for multiple people)
    * 
    * In java, a method follows this structure:
    * 
    * public static outputDataType methodName(dataType parameter){
    *     Execute code;
    *     return output; // Not all methods return a value
    * }
    */
}
