/*
* Date: 2021 March 29th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Global and Local variables
**/

package ClassNotes;

class ErrorDetection {
    public static void main(String[] args){
        // Global Variable - A variable that can be accessed through out the entire class
        // Local Variable - A variable that can only be accessed in a particular method

        int num = 2;
        // This print 2
        System.out.println(num);
        // This print 2+3 = 5
        System.out.println(addsThree(num));
        // This prints out 2 and not 5, does not continue the method
        System.out.println(num);
    }
    public static int addsThree(int x){
        // x is a local variable that is only accessible within this method
        // x is a copy of the argument passed through the main (pass by value)
        // value of x will not be saved as code is progressing
        x = x + 3;
        return x;
    }
}
