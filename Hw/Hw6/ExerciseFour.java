/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create the method average, which calculates the average of the numbers it gets as parameters. Inside the method you should use the method sum as a helper!
**/

package Hw.Hw6;

class ExerciseFour {
    public static void main(String[] args){
        double answer = average(4, 3, 6, 1);
    
        System.out.println("average: " + answer);
    }
    public static double sum(int number1, int number2, int number3, int number4){
        return number1 + number2 + number3 + number4;
    }
    public static double average(int number1, int number2, int number3, int number4){
        double avg = sum(number1, number2, number3, number4) / 4;
        return avg;
    }
}