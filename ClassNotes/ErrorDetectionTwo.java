/*
* Date: 2021 March 29th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Detecting Errors using Try and Catch as well as finally
**/

package ClassNotes;

public class ErrorDetectionTwo {
    public static void main(String[] args){
        // try and catch allow you to catch error before having it to end the code from error
        // Works like: if and else 

        // Methods only return ONE value/thing
        // Methods end when we hit a return command
        //    if we are in a loop, it exits the method
        try{
            // Create a run time error
            int a = 6; // Add scanner here 
            int b = 0; // Add scanner here
            System.out.println("Divide " + a + " by " + b);
            System.out.println(a/b);
            // Normally cant divide an integer by 0, but by using try and Catch you can divide it
            System.out.println("End of Try block");
            // return
        }
        catch (java.lang.ArithmeticException e){
            // Arithmetic Error will cause this below print
            System.out.println("PLease do not divide by zero");
            // return

        }
        catch (Exception e){
            // e represents a specific error message
            // Error that is not Arithmetic will cause this below print
            System.out.println("Generic error message");
            System.out.println(e);
            // return
        }    
        // Finally can only exsist when there is a try and catch
        finally {
            // This code will ALWAYS run after the try-catch
            // finally ALWAYS executes
            // finally is a good place to do clean up (closing scanner)
            // Avoid placing returns into a finally block
            // the return for methods triumphs everything
            System.out.println("Code in finally block");
            // return
        }
    }
}
