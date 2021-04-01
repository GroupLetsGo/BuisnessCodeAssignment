/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Same as #7 but you also print the average of all the integers.
**/

package Hw.Hw5;

class ExerciseEight {
    public static void main(String[] args){

        int max = 10;
        int sum = 0; 
        int i = 0;

        while (i != max){
            i++;
            System.out.println("i: " + i);
            sum = sum + i;
        }
        double avg = 1.0*sum/max;
        System.out.println("The sum is " + sum);
        System.out.println("The average is: " + avg);
    }
}
