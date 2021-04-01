/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: 
**/

package Hw.Hw4.Extra;

class ExerciseFour {
    public static void main(String[] args){
        int rows = 5;
        String sym = "*";

        for (int i = rows-1; i > -1; i--){
            for (int j = 0; j <= i; j++){
            System.out.print(sym + " ");
            System.out.print(" ");
            }
            System.out.println(); 
        }
    }
}
