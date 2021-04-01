/*
* Date: 2021 March 26th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Create the method greatest, which gets three integers as parameters and then returns the greatest of them. If there are several parameters that are equally great, you can decide which one is returned. Printing should be done in the main program.
**/

package Hw.Hw6;

class ExerciseThree {
    public static void main(String[] args){
        int answer =  greatest(2, 7, 3);
    
        System.out.println("Greatest: " + answer);
    }
    public static int greatest(int number1, int number2, int number3) {
        if ((number1 > number2)&&(number1 > number3)){
            return number1;
        }
        else if ((number2 > number1)&&(number2 > number3)){
            return number2;
        }
        else{
            return number3;
        }
    }
}
