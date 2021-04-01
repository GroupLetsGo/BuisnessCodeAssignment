/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create the method sum that calculates the sum of numbers the method receives as parameters.
* and place the method in the given program body
**/

package Hw.Hw6;

class ExerciseOne {
    public static void main(String[] args){
        int answer = sum(4, 3, 6, 1);
        
        System.out.println("sum: " + answer);

    }    
    public static int sum(int number1, int number2, int number3, int number4) {
        return number1 + number2 + number3 + number4;
    }
}
