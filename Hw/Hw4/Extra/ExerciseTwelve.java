/*
* Date: 2021 March 10th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Print the following pattern
* 1 
* 1 2 
* 1 2 3 
* 1 2 3 4 
* 1 2 3 4 5
**/

package Hw.Hw4.Extra;

class ExerciseTwelve {
    public static void main(String[] args){
        int rows = 5;

        String sym = "*";

        for (int i = 0; i <= rows-1 ; i++){
            for (int j = 0; j <= i; j++){ 
                System.out.print(sym + " "); 
                } 
                System.out.println(""); 
                } 
                
        for (int i = rows-1; i >= 0; i--){
            for(int j = 0; j <= i-1; j++){
                System.out.print(sym+ " ");
                }
                System.out.println("");
                }
                
        }
    }
