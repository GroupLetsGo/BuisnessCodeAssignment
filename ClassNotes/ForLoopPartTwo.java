/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Using counters and counted loops
**/

package ClassNotes;

class ForLoopPartTwo {
    public static void main(String[] args){
        /*
        * Counted Loop: For loop
        * A counted loop executes a body of code a specific number of times
        * 
        * In Java, the general format of a for loop is:
        *
        * for(incrementingVariable; condition; incrementingValue) {
        *      // incrementingVariable is a counter
        *      // condition: Tells the loop when to end
        *      // incrementingValue is the amount the counter increases by
        *       Execute Code;
        * }
        */

        // Print hello world ten times
        int maxNum = 100;
        for (int i = 0; i < maxNum; i++){
            System.out.println("Hello World");
            System.out.println("This is iteration number: " + i);
        }
        System.out.println("Outside of Loop");






    }
}
