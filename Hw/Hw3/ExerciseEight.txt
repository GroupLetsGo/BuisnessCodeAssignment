/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask the user for two marks between 0 and 100.  Output the higher mark.
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseEight {
    public static void main(String[] agrs) {
        Scanner reader = new Scanner(System.in) ;
        System.out.println("Please enter two marks between 0 to 100") ;
        System.out.println("Please enter the first mark") ;
        int markone = reader.nextInt() ;
        System.out.println("Please enter the second mark") ;
        int marktwo = reader.nextInt() ;
        if (markone > marktwo) {
            System.out.println("The higher mark of the two is " + markone) ;
        }
        else if (markone < marktwo) {
            System.out.println("The higher mark of the two is " + marktwo) ;
        }
        else if (markone == marktwo) {
            System.out.println("The two marks are the same") ;

            reader.close() ;
        }

    }
}
