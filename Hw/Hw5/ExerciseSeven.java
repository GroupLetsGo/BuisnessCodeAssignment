/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Print the integers from 1 to 10 and the sum.
**/

package Hw.Hw5;

class ExerciseSeven {
    public static void main(String[] args){

        int max = 10;
        int sum = 0; 
        int i = 0;

        while (i != max){
            i++;
            System.out.println("i: " + i);
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
