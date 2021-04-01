/*
* Date: 2021 March 7th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Using counters and counted loops
**/

package ClassNotes;

class ForLoop {
    public static void main(String[] args){
        // Operations on the right of the equal sign are done before we save the data into the variable
        // Called count
        int count = 0;
        System.out.println("Count: " + count);

        // The value of count is zero
        // Once we add 1 to the original value, this NEW value is saved as count
        count = count +1;
        System.out.println("Count: " + count);

        count += 1;
        System.out.println("Count: " + count);

        // To add exactly one
        count++;
        System.out.println("Count: " + count);
    }
}
