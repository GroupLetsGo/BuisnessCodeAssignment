/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: 
**/

package Hw.Hw4.Extra;

class ExerciseSix {
    public static void main(String[] args){
        int max = 10;
        int nextNum = 0;
        int j = 0;

        for (int i = 0; i < max; i++){
            for (int k = 0; k < i; k++);
            nextNum = j + i;
            System.out.print(j);
            System.out.print(" ");
        }
    }
}
