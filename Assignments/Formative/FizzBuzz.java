/*
* Date: 2021 March 15th
* Name: William Wu
* Teacher: Mr.Ho
* Description: Fizz Buzz game formative assignment
**/

package Assignments.Formative;

class FizzBuzz {
    public static void main(String[] args){

        int times = 15;

        for (int i = 1; i <= times; i++){

            if (((i%2) == 0) && ((i%5) == 0)){
                System.out.println("fizzbuzz");
            }
            else if ((i%2) == 0){
                System.out.println("fizz");
            }
            else if ((i%5) == 0){
                System.out.println("buzz");
            }
            else if ((i%7) == 0) {
                System.out.println("wizz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
