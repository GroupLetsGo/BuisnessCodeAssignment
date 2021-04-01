/*
* Date: 2021 Feburary 17th
* Name: William Wu
* Teacher: Mr.Ho
* Ask the user for the length and the width of a rectangle.  Print the area and the perimeter of the square. 
**/

package Hw.Hw2;

import java.util.Scanner ;

class ExerciseSeven {
   public static void main(String[] args) {
       System.out.println("Insert the width and length of any rectangle, the area and perimeter will be calculated.") ;
       Scanner reader = new Scanner(System.in) ;
       System.out.println("Insert the width please") ;
       int num1 = reader.nextInt() ;
       System.out.println("Insert the length please") ;
       int num2 = reader.nextInt() ;
       int perimeter = 2*num1 + 2*num2 ;
       int area = num1*num2 ;
       System.out.println("The perimeter of the rectangle is " + perimeter) ;
       System.out.println("The area of the rectangle is " + area) ;
   } 
}
