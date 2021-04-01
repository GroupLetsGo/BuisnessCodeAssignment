/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create the method least, which returns the least of the numbers given as parameters. If the parameters are equal, you can decide which one is returned.
**/

package Hw.Hw6;

class ExerciseTwo {
    public static void main(String[] args){
        int answer =  least(2, 7);
        
        System.out.println("Least: " + answer);
    }
    public static int least(int number1, int number2) {
        if (number1 > number2){
            return number2;
        }
        else{
            return number1;
        }
    }    
}
