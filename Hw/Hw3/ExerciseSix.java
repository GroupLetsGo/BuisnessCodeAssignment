/*
* Date: 2021 Feburary 23th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Ask for a mark (out of 100).  Give the following output:
	75-100	Great
	50-74		Pass
	0-49		Fail
	Other		Invalid
**/

package Hw.Hw3;

import java.util.Scanner ;

class ExerciseSix {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in) ;
		System.out.println("What is your mark?");
		int mark = reader.nextInt() ;
		if (mark >= 75 && mark >= 100 ){
				System.out.println("Great");
		}
		else if (mark >= 74 && mark <= 50){
			System.out.println("You passed");
		}
		else if (mark >= 0 && mark <= 49){
			System.out.println("You failed");
		}
			reader.close() ;
			}
    }
